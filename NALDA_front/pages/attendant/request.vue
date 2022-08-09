<template>
  <div class="request-container">
    <b-tabs content-class="mt-3" fill>
      <b-tab title="미완료" active>
        <div class="request-uncomplete-wrap">
          <h4>uncomplete</h4>
          <p class="mt-3">Current Page: {{ currentPage }}</p>
          <div class="umcomplete-table-wrap">
            <b-table
              hover
              :items="items"
              :fields="fields"
              :per-page="perPage"
              :current-page="currentPage"
              small
              responsive="sm"
            >
              <template #cell(요청상세보기)="row">
                <b-button
                  size="sm"
                  class="mr-2"
                  @click="row.toggleDetails"
                >요청{{ row.detailsShowing ? '닫기' : '보기'}}</b-button>
              </template>

              <template #row-details="row">
                <b-card>
                  <h5>request detail</h5>
                  <b-row class="mb-2">
                    <b-col sm="3" class="text-sm-right">
                      <b>요청사항:</b>
                    </b-col>
                    <b-col>{{ row.item.요청사항 }}</b-col>
                  </b-row>
                  <b-row class="mb-2">
                    <b-col sm="3" class="text-sm-right">
                      <b>처리현황:</b>
                    </b-col>
                    <b-col>{{ row.item.처리현황 }}</b-col>
                  </b-row>
                  <b-button class="complete-btn" variant="info">완료</b-button>
                </b-card>
              </template>
            </b-table>
          </div>
          <b-pagination
            v-model="currentPage"
            :total-rows="rows"
            :per-page="perPage"
            size="sm"
            align="center"
            class="mt-4"
          ></b-pagination>
        </div>
      </b-tab>
      <b-tab title="완료">
        <div class="request-complete-wrap">
          <h4>complete</h4>
        </div>
      </b-tab>
    </b-tabs>
    <button @click="check">test</button>
  </div>
</template>

<script>
export default {
  name: 'AttendantRequest',
  data() {
    return {
      fields: [
        {
          key: '좌석',
          sortable: false,
        },
        {
          key: '분류',
          sortable: true,
        },
        // {
        //   key: '요청사항',
        //   sortable: false,
        // },
        {
          key: '요청시각',
          sortable: true,
        },
        // {
        //   key: '상태',
        //   sortable: true,
        // },
        {
          key: '요청상세보기',
          sortable: false,
        },
      ],
      perPage: 3,
      currentPage: 1,
      items: [
        {
          좌석: 'A08',
          분류: '의료',
          요청사항: '두통',
          요청시각: '2022.07.28 01:37',
          처리현황: false,
          승객등급: 'economy',
        },
        {
          좌석: 'B37',
          분류: '의료',
          요청사항: '두통',
          요청시각: '2022.07.28 01:37',
          처리현황: false,
          승객등급: 'economy',
        },
        {
          좌석: 'B37',
          분류: '의료',
          요청사항: '두통',
          요청시각: '2022.07.28 01:37',
          처리현황: false,
          승객등급: 'economy',
        },
        {
          좌석: 'B37',
          분류: '의료',
          요청사항: '두통',
          요청시각: '2022.07.28 01:37',
          처리현황: false,
          승객등급: 'economy',
        },
        {
          좌석: 'B37',
          분류: '의료',
          요청사항: '두통',
          요청시각: '2022.07.28 01:37',
          처리현황: false,
          승객등급: 'economy',
        },
        {
          좌석: 'B37',
          분류: '의료',
          요청사항: '두통',
          요청시각: '2022.07.28 01:37',
          처리현황: false,
          승객등급: 'economy',
        },
      ],
      status: true,
      testtest: {
        번호: '',
        좌석: '',
      },
      testarr: [],
    }
  },
  computed: {
    rows() {
      return this.items.length
    },
  },
  methods: {
    check() {
      for (let i = 0; i < 10; i++) {
        this.testtest.번호 = i
        this.testtest.좌석 = 'A' + i
        if (i === 3) console.log(this.testtest)
        this.testarr.push(this.testtest)
      }
    },
  },
}
</script>

<style scoped>
.request-container {
  height: 70vh;
  padding: 3%;
}

.umcomplete-table-wrap {
  z-index: -1;
}

.complete-btn {
  float: right;
}

.request-complete-wrap,
.request-uncomplete-wrap {
}
</style>