<template>
  <div class="mycustom-container">
    <user-navs></user-navs>
    <div class="custom-declaration-wrap">
      <div class="mycustom-subindex-item">
        <h4>세관신고서 목록</h4>
        <div class="mycustom-subindex-bluebox">
          <!-- <div class="overflow-auto"> -->
          <v-data-table
            id="my-table"
            :items="listTable"
            :headers="headers"
            :loading="loading"
            loading-text="Loading... Please wait"
            :items-per-page="perPage"
            :page="currentPage"
            hide-default-footer
            class="elevation-1"
            small
            @click:row="customDetail"
          ></v-data-table>
          <v-pagination
            v-model="currentPage"
            :length="pageCount"
            :total-visivle="totalVisible"
            circle
          >
          </v-pagination>
          <!-- </div> -->
        </div>
      </div>
    </div>

    <b-modal id="check-modal" size="xl" hide-footer centered>
      <template #modal-title> 상세 정보 </template>
      <v-expansion-panels inset>
        <v-expansion-panel>
          <v-expansion-panel-header>
            <div>항공 편명</div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div class="panel-content">{{ declaration.flightNum }}</div>
          </v-expansion-panel-content>
        </v-expansion-panel>
        <v-expansion-panel>
          <v-expansion-panel-header>
            <div>날짜</div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div class="panel-content">{{ declaration.date }}</div>
          </v-expansion-panel-content>
        </v-expansion-panel>
        <v-expansion-panel>
          <v-expansion-panel-header>
            <div>목적</div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div class="panel-content">{{ declaration.purposeTravel }}</div>
          </v-expansion-panel-content>
        </v-expansion-panel>
        <v-expansion-panel>
          <v-expansion-panel-header>
            <div>동반가족수</div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div class="panel-content">{{ declaration.accompany }}</div>
          </v-expansion-panel-content>
        </v-expansion-panel>
        <v-expansion-panel>
          <v-expansion-panel-header>
            <div>여행기간</div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div class="panel-content">{{ declaration.travelPeriod }}</div>
          </v-expansion-panel-content>
        </v-expansion-panel>
        <v-expansion-panel>
          <v-expansion-panel-header>
            <div>대한민국 이전에 방문한 국가</div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div
              v-for="(item, idx) in declaration.visitedCountries"
              :key="idx"
              class="panel-content"
            >
              {{ item.countryName }}
            </div>
          </v-expansion-panel-content>
        </v-expansion-panel>
        <v-expansion-panel>
          <v-expansion-panel-header>
            <div>
              해외(국내외 면세점 포함)에서
              <b>취득(구입, 기증, 선물 포함)</b>한 면세범위 초과
            </div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div class="panel-content">
              초과 여부 : {{ declaration.dutyfreeExceed }}
            </div>
            <div class="panel-content">
              총금액 : 약 {{ declaration.dutyfreeExceedValue }} $
            </div>
          </v-expansion-panel-content>
        </v-expansion-panel>
        <v-expansion-panel>
          <v-expansion-panel-header>
            <div>
              <b>FTA 협정국가</b>의 원산지 물품으로 <b>특혜관세</b>를
              적용받으려는 물품
            </div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div class="panel-content">
              여부 : {{ declaration.preferentialTariff }}
            </div>
          </v-expansion-panel-content>
        </v-expansion-panel>
        <v-expansion-panel>
          <v-expansion-panel-header>
            <div>
              미화로 환산하여
              <b>$10,000을 초과하는 지급수단</b> <br />(원화ㆍ달러화 등
              법정통화, 자기앞수표, 여행자수표, 및 그 밖의 유가증권)
            </div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div class="panel-content">
              여부 : {{ declaration.paymentExceed }}
            </div>
            <div class="panel-content">
              총금액 : 약 {{ declaration.paymentExceedValue }} $
            </div>
          </v-expansion-panel-content>
        </v-expansion-panel>
        <v-expansion-panel>
          <v-expansion-panel-header>
            <div>
              총포류, 도검류, 마약류 및
              <b>헌법질서ㆍ공공의 안녕질서ㆍ풍속을 해치는 물품</b> 등
              <b>반입이 금지되거나 제한되는 물품</b>
            </div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div class="panel-content">
              여부 : {{ declaration.prohibitGoods }}
            </div>
          </v-expansion-panel-content>
        </v-expansion-panel>
        <v-expansion-panel>
          <v-expansion-panel-header>
            <div>
              동물, 식물, 육가공품 등
              <b>검역대상물품</b> 또는 가축전염병발생국의
              <b>축산농가 방문</b>
            </div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div class="panel-content">
              여부 : {{ declaration.livestockVisited }}
            </div>
          </v-expansion-panel-content>
        </v-expansion-panel>
        <v-expansion-panel>
          <v-expansion-panel-header>
            <div>
              <b>판매용 물품, 업무용 물품(샘플 등)</b>, 다른 사람의 부탁으로
              <b>반입한 물품, 예치 또는 일시수출입 물품</b>
            </div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div class="panel-content">여부 : {{ declaration.salesGoods }}</div>
          </v-expansion-panel-content>
        </v-expansion-panel>
        <v-expansion-panel>
          <v-expansion-panel-header>
            <div>여행자 휴대품 신고서</div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div class="panel-content">
              주류 : {{ declaration.alcohols.num }}병 &nbsp;
              {{ declaration.alcohols.liter }}리터 &nbsp;
              {{ declaration.alcohols.dollar }}$
            </div>
            <div class="panel-content">
              담배 : {{ declaration.cigarette }} 갑
            </div>
            <div class="panel-content">
              향수 : {{ declaration.perfumes }} ㎖
            </div>
            <div class="panel-content">
              ▶그 밖의 면세범위 (US $600) 초과 물품
            </div>
            <div v-for="(item, idx) in declaration.etcExceeds" :key="idx">
              <div class="panel-content">
                &emsp;&emsp;&emsp;&emsp; 품명 : {{ item.name }} &nbsp; 수(증)량
                : {{ item.num }} &nbsp; 금액 : {{ item.amount }}$
              </div>
            </div>
          </v-expansion-panel-content>
        </v-expansion-panel>
      </v-expansion-panels>
      <b-button class="mt-3" block @click="$bvModal.hide('check-modal')"
        >Close Me</b-button
      >
    </b-modal>
  </div>
</template>

<script>
import { mapState, mapActions, mapGetters } from 'vuex'
import UserNavs from '../../components/UserNavs.vue'
export default {
  name: 'MyCustom',
  components: { UserNavs },
  data() {
    return {
      perPage: 5,
      currentPage: 1,
      loading: true,
      totalVisible: 10,
      headers: [
        { text: 'ID', align: 'center', sortable: false, value: 'ID' },
        { text: '목적', align: 'center', sortable: false, value: '목적' },
        { text: '편명', align: 'center', sortable: false, value: '편명' },
        { text: '날짜', align: 'center', sortable: false, value: '날짜' },
      ],
      declaration: {
        alcohols: {},
      },
    }
  },
  computed: {
    ...mapGetters('customdeclaration', ['listTable']),
    ...mapState('user', ['loginMember']),
    ...mapState('customdeclaration', [
      'declarationList',
      'selectedDeclaration',
    ]),
    rows() {
      return this.listTable.length
    },
    pageCount() {
      return this.listTable.length % this.perPage === 0
        ? parseInt(this.listTable.length / this.perPage)
        : parseInt(this.listTable.length / this.perPage + 1)
    },
  },
  created() {
    this.getDeclarationList(this.loginMember.username)
  },
  methods: {
    ...mapActions('customdeclaration', [
      'getDeclarationList',
      'getOneDeclaration',
    ]),
    customDetail(event, { item }) {
      const promise = new Promise((resolve, reject) => {
        resolve()
      })
      promise.then(async () => {
        await this.getOneDeclaration(item.ID)
        this.declaration = this.selectedDeclaration
        this.$bvModal.show('check-modal')
      })
    },
  },
}
</script>

<style scoped>
@font-face {
  font-family: 'twayfly';
  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_tway@1.0/twayfly.woff')
    format('woff');
  font-weight: normal;
  font-style: normal;
}

* {
  margin: 0;
  padding: 0;
  font-family: 'twayfly';
}
.panel-content {
  font-size: x-large;
}
.countries-card {
  display: flex;
}

.d-block {
  font-size: 30px;
}

.elevation-1 {
  width: 100%;
}
.mycustom-container {
  width: 100%;
  height: 70vh;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  /* background-color: orange; */
}

ol,
ul {
  list-style: none;
  padding-left: 0;
}

.pagination {
  justify-content: center;
}
.custom-declaration-wrap {
  height: 100%;
  width: 100%;
  display: flex;
  /* flex-direction: column; */
  justify-content: center;
  align-items: center;
}

.mycustom-subindex-item {
  height: 75%;
  width: 80%;
  /* display: flex; */
  /* flex-direction: column;
  justify-content: center;
  align-items: center; */
}
.mycustom-subindex-item h4 {
  text-align: right;
}

.mycustom-subindex-bluebox {
  /* width: 80%; */
  width: 100%;
  height: 100%;
  padding: 2% 6% 2% 6%;
  border-radius: 12px;
  box-shadow: 17px 17px 29px 0 rgb(0 164 73 / 8%);
  border: solid 1px #24919b;
  background-color: #fff;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  box-sizing: border-box;
  text-align: center;
}

.overflow-auto {
  width: 100%;
  height: 100%;
  /* margin: 2%; */
  text-align: center;
}

.page-item .page-link {
  color: #0f374b;
}

.page-item.active .page-link {
  background-color: var(--nalda-blue-color);
}

#my-table {
  color: #0f374b;
  cursor: pointer;
}
</style>
