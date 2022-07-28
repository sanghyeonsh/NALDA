<template>
  <div class="request-container">
    <div class="request-wrap">
      <div class="request-uncomplete-wrap">
        <div class="title">
          <h4>uncomplete</h4>
        </div>
        <div class="overflow-auto">
          <div class="mt-3">
            <div class="request-table-wrap">
              <b-table
                id="request-table-transition"
                class="request-items-wrap"
                hover
                :items="requestItems"
                :per-page="perPage"
                :current-page="requestCurrentPage"
                :fields="fields"
                small
                :tbody-transition-props="transProps"
                @row-clicked="showDetail"
              >
              </b-table>
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
          <h4>completed</h4>
          <div class="overflow-auto">
            <div class="mt-3">
              <div class="completed-table-wrap">
                <b-table
                  class="completed-items-wrap"
                  hover
                  :items="completed"
                  :per-page="perPage"
                  :current-page="completedCurrentPage"
                  small
                  @row-clicked="showDetail"
                >
                </b-table>
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
      <h4>request detail</h4>
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
                  <span aria-hidden="true">✔</span>
                  <span class="sr-only">Selected</span>
                </template>
                <template v-else>
                  <span aria-hidden="true">&nbsp;</span>
                  <span class="sr-only">Not selected</span>
                </template>
              </template>
            </b-table>
            <div class="request-check-wrap">
              <div class="checked-list">
                체크된 요청사항:
                {{ selecteditems.length }}
              </div>
              <div class="button-wrap">
                <b-button @click="selectAllRows">전체선택</b-button>
                <b-button @click="clearSelected">전체선택해제</b-button>
                <b-button variant="info" @click="completeRequest(selecteditems)"
                  >완료</b-button
                >
              </div>
            </div>
            <b-pagination
              v-model="detailCurrentPage"
              :total-rows="detailsrows"
              :per-page="perPagedetails"
              first-number
              last-number
              size="sm"
            ></b-pagination>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'AttendantRequestTest',
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
      items: this.requestItems,
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
      requestItems: [
        {
          좌석: 'B37',
          분류: '의료',
          요청사항: '두통',
          요청시각: '01:37',
          상태: '미완료',
        },
        {
          좌석: 'A08',
          분류: '간식 및 음료',
          요청사항: '나쵸',
          요청시각: '01:35',
          상태: '미완료',
        },
        {
          좌석: 'A08',
          분류: '간식 및 음료',
          요청사항: '나쵸',
          요청시각: '02:40',
          상태: '미완료',
        },
        {
          좌석: 'A08',
          분류: '간식 및 음료',
          요청사항: '나쵸',
          요청시각: '01:37',
          상태: '미완료',
        },
        {
          좌석: 'A08',
          분류: '간식 및 음료',
          요청사항: '나쵸',
          요청시각: '01:37',
          상태: '미완료',
        },
        {
          좌석: 'A08',
          분류: '간식 및 음료',
          요청사항: '나쵸',
          요청시각: '01:37',
          상태: '미완료',
        },
        {
          좌석: 'A08',
          분류: '간식 및 음료',
          요청사항: '나쵸',
          요청시각: '01:37',
          상태: '미완료',
        },
        {
          좌석: 'A08',
          분류: '간식 및 음료',
          요청사항: '나쵸',
          요청시각: '03:37',
          상태: '미완료',
        },
        {
          좌석: 'A08',
          분류: '간식 및 음료',
          요청사항: '나쵸',
          요청시각: '05:37',
          상태: '미완료',
        },
        {
          좌석: 'A08',
          분류: '간식 및 음료',
          요청사항: '나쵸',
          요청시각: '05:37',
          상태: '미완료',
        },
        {
          좌석: 'A08',
          분류: '간식 및 음료',
          요청사항: '나쵸',
          요청시각: '05:37',
          상태: '미완료',
        },
      ],
      completed: [
        {
          좌석: 'D29',
          분류: '간식 및 음료',
          요청사항: '나쵸',
          요청시각: '01:37',
          완료시각: '03:44',
        },
        {
          좌석: 'C03',
          분류: '의료',
          요청사항: '두통',
          요청시각: '01:37',
          완료시각: '01:36',
        },
      ],
      details: [
        {
          선택: '',
          좌석: 'A08',
          분류: '간식 및 음료',
          요청사항: '나쵸',
          요청시각: '01:37',
        },
      ],
      detailsfields: ['선택', '좌석', '분류', '요청사항', '요청시각'],
      selecteditems: 0,
    }
  },
  computed: {
    reqeustrows() {
      return this.rows
    },
    completedrows() {
      return this.completed.length
    },
    detailsrows() {
      return this.details.length
    },
  },
  created() {
    console.log(this.requestItems.length % 4)
    console.log(3 - (this.requestItems.length % 4))
    // if (this.requestItems.length % 4 !== 0) {
    //   // this.rows = Math.floor(this.requestItems.length/4)*4 + (4-(this.requestItems.length%4))
    //   for (let i = 0; i < 4 - (this.requestItems.length % 4); i++) {
    //     console.log('푸쉬')
    //     this.requestItems.push({
    //       좌석: '좌석',
    //       분류: '분류',
    //       요청사항: '요청',
    //       요청시각: '시각',
    //       상태: '상태',
    //     })
    //   }
    // }
    this.rows = this.requestItems.length
    console.log(this.rows)
    console.log(this.requestItems)
    return this.rows
  },
  methods: {
    // setRows() {
    //   if(this.requestItems.length%3 !== 0) {
    //       this.requestItems.length = Math.floor(this.requestItems.length/3)*3 + (4-(this.requestItems.length%3))
    //       for(let i = 0; i < (3-(this.requestItems.length%3)); i++) {
    //       this.requestItems.push({좌석: "좌석", 분류: "분류", 요청사항: "요청", 요청시각: "시각", 상태: "상태"})
    //       }
    //   }
    //   return this.requestItems.length
    // }
    showDetail(item) {
      // this.details = []
      if (item.상태 !== null && item.상태 === '미완료') {
        this.details.push(item)
      } else {
        this.details.push(item)
      }
    },
    onRowSelected(items) {
      this.selecteditems = items
    },
    selectAllRows() {
      this.$refs.selectableTable.selectAllRows()
    },
    completeRequest(items) {
      console.log(items[1])
      for (let i = 0; i < items.length; i++) {
        const completeItem = {
          좌석: this.items[i].좌석,
          분류: this.items[i].분류,
          요청사항: this.items[i].요청사항,
          요청시각: this.items[i].요청시각,
          완료시각: Date.getTime(),
        }
        this.completed.push(completeItem)
      }
    },
    clearSelected() {},
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
  height: 70vh;
  display: flex;
  justify-content: space-between;
  padding: 2%;
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

.request-check-wrap {
  width: 95%;
  display: flex;
  justify-content: space-between;
  margin-top: 1%;
  margin-bottom: 1%;
}
</style>
