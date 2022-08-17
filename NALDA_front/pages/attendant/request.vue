<template>
  <div class="request-container">
    <div class="request-wrap">
      <div class="request-uncomplete-wrap">
        <div class="title">
          <h4 @click="test">대기</h4>
        </div>
        <div class="overflow-auto">
          <div class="mt-3">
            <div class="request-table-wrap">
              <b-table
                id="request-table-transition"
                class="request-items-wrap"
                hover
                :items="ordersObject"
                :per-page="perPage"
                :current-page="requestCurrentPage"
                :fields="fields"
                small
                :tbody-transition-props="transProps"
                @row-clicked="showDetail"
              ></b-table>
              <b-pagination
                v-model="requestCurrentPage"
                :total-rows="reqeustrows"
                :per-page="perPage"
                first-number
                last-number
                size="sm"
              ></b-pagination>
            </div>
          </div>
        </div>
        <div class="request-complete-wrap">
          <h4>완료</h4>
          <div class="overflow-auto">
            <div class="mt-3">
              <div class="completed-table-wrap">
                <b-table
                  class="completed-items-wrap"
                  hover
                  :items="completeObject"
                  :per-page="perPage"
                  :fields="completefields"
                  :current-page="completedCurrentPage"
                  small
                  @row-clicked="showDetail"
                ></b-table>
                <b-pagination
                  v-model="completedCurrentPage"
                  :total-rows="completedrows"
                  :per-page="perPage"
                  first-number
                  last-number
                  size="sm"
                ></b-pagination>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="request-details-wrap">
      <h4>세부사항</h4>
      <div class="overflow-auto">
        <div class="mt-3">
          <div class="request-table-wrap">
            <b-table
              ref="selectableTable"
              class="detail-items-wrap"
              :items="details"
              :fields="detailsfields"
              :per-page="perPagedetails"
              multi
              selectable
              :current-page="detailCurrentPage"
              @row-selected="onRowSelected"
            >
              <template #cell(선택)="{ rowSelected }">
                <template v-if="rowSelected">
                  <span aria-hidden="true">☑️</span>
                  <span class="sr-only">Selected</span>
                </template>
                <template v-else>
                  <span aria-hidden="true">⬜️</span>
                  <span class="sr-only">Not selected</span>
                </template>
              </template>
            </b-table>
            <div class="checked-num">
              선택된 요청사항:
              {{ selecteditems.length }}
            </div>
            <div class="request-check-wrap">
              <div class="button-wrap">
                <b-button @click="selectAllRows">전체선택</b-button>
                <b-button @click="clearSelected">전체선택해제</b-button>
                <b-button variant="info" @click="completeRequest(selecteditems)">완료처리</b-button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions, mapGetters } from 'vuex'
export default {
  name: 'AttendantRequest',
  data() {
    return {
      transProps: {
        // Transition name
        name: 'flip-list',
      },
      rows: null,
      perPagedetails: 8,
      perPage: 4,
      requestCurrentPage: 1,
      completedCurrentPage: 1,
      detailCurrentPage: 1,
      items: this.request,
      fields: [
        {
          key: '좌석',
          sortable: false,
        },
        {
          key: '분류',
          sortable: true,
        },
        {
          key: '요청사항',
          sortable: false,
        },
        {
          key: '요청시각',
          sortable: true,
        },
        {
          key: '상태',
          sortable: true,
        },
      ],
      request: [],
      completed: [],
      details: [],
      detailsfields: ['선택', '좌석', '분류', '요청사항', '수량', '상태'],
      completefields: [
        {
          key: '좌석',
          sortable: false,
        },
        {
          key: '분류',
          sortable: true,
        },
        {
          key: '요청사항',
          sortable: false,
        },
        {
          key: '완료시각',
          sortable: true,
        },
        {
          key: '상태',
          sortable: true,
        },
      ],
      selecteditems: [],
    }
  },
  computed: {
    ...mapGetters('attendant', ['ordersObject', 'completeObject']),
    reqeustrows() {
      return this.ordersObject.length
    },
    completedrows() {
      return this.completeObject.length
    },
    detailsrows() {
      return this.details.length
    },
    ...mapState('attendant', ['ordersList']),
    ...mapState('user', ['loginMember', 'flightNum']),
  },
  created() {
    this.getListOrders(this.flightNum)
  },
  methods: {
    ...mapActions('attendant', ['getListOrders', 'updateOrderStatus']),
    showDetail(item) {
      this.details = []
      console.log(item)
      for (let i = 0; i < item.주문상세.length; i++) {
        const orderDetail = {
          id: item.id,
          좌석: item.좌석,
          분류: item.주문상세[i].orderCode,
          요청사항: item.주문상세[i].orderName,
          수량: item.주문상세[i].cnt,
          상태: item.상태,
        }
        this.details.push(orderDetail)
      }
    },
    onRowSelected(items) {
      this.selecteditems = items
    },
    selectAllRows() {
      this.$refs.selectableTable.selectAllRows()
    },
    clearSelected() {
      this.$refs.selectableTable.clearSelected()
    },
    completeRequest(items) {
      for (let i = 0; i < items.length; i++) {
        items[i].상태 = 'DONE'
      }
      // 선택된 아이템 상태가 DONE인 갯수 비교
      let count = 0
      for (let i = 0; i < this.details.length; i++) {
        if (this.details[i].상태 === 'DONE') {
          count++
        }
      }

      // 갯수가 세부사항 갯수와 같은경우 실제요청 상태값 바꾸기
      if (count === this.details.length && count !== 0) {
        console.log(this.details[0].id)
        const promise = new Promise((resolve, reject) => {
          resolve()
        })
        promise.then(async () => {
          await this.updateOrderStatus(this.details[0].id)
          await this.getListOrders(this.flightNum)
          this.details = []
        })
      }
    },
    test() {
      console.log(this.ordersObject)
    },
  },
}
</script>

<style scoped>
:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-background-blue-color: #45a9c8;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
  --nalda-navy-color: #1b2f40;
}
.request-container {
  height: 85vh;
  display: flex;
  justify-content: space-between;
  background-color: rgba(239, 239, 239, 0.511);
  padding: 5%;
}

.request-complete-wrap,
.request-uncomplete-wrap {
  display: flex;
  flex-direction: column;
}

.completed-table-wrap,
.request-table-wrap {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
h4 {
  width: 80%;
  margin-left: 3%;
}
.table {
  height: 100%;
  width: 95%;
  color: #1b2f40;
  text-align: center;
  table-layout: fixed;
  font-size: 0.8em;
}

th,
td {
  padding: 0.3rem;
}

table#request-table-transition .flip-list-move {
  transition: transform 1s;
}

.checked-num {
  width: 95%;
  font-size: smaller;
  display: flex;
  justify-content: flex-start;
}
.request-check-wrap {
  width: 95%;
  display: flex;
  justify-content: flex-end;
  margin-top: 1%;
  margin-bottom: 1%;
}
</style>
