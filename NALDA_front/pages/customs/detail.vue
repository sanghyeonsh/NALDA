<template>
  <div class="customs-input-container">
    <custom-navs></custom-navs>
    <div class="customform-wrap">
      <div class="customform-main-container">
        <div class="customform-container">
          <div class="title-container">
            <div class="title-items">
              <v-app id="info-btn">
                <v-btn
                  class="mx-2 mb-5"
                  fab
                  dark
                  medium
                  color="#778899"
                  @click="openAttentions"
                >
                  <v-icon large dark>mdi-information-outline</v-icon>
                </v-btn>
              </v-app>
              <div class="customform-title">여행자 휴대품 신고서</div>
              <b-button
                class="next-page"
                variant="info"
                @click="$router.push('/customs/complete')"
                >다음 페이지</b-button
              >
            </div>
          </div>
          <div class="declaration-detail-wrap">
            <div class="alcohols-perfume-cigarette">
              <h5>
                ▶주류ㆍ향수ㆍ담배
                <small
                  >(면세범위가 초과되는 경우에는 전체 반입량을 적습니다.)</small
                >
              </h5>
              <table class="apc-table-wrap">
                <tr id="alcohols">
                  <td>주류</td>
                  <td colspan="3">
                    <input
                      v-model="alcoholsInfo.num"
                      class="alcohols"
                      type="text"
                      name="cnt"
                    />병,
                    <input
                      v-model="alcoholsInfo.liter"
                      class="alcohols"
                      type="text"
                      name="alcohols"
                    />ℓ,
                    <input
                      v-model="alcoholsInfo.dollar"
                      class="alcohols"
                      type="text"
                      name="alcohols"
                    />$
                  </td>
                </tr>
                <tr id="perfume-cigarette">
                  <td>담배</td>
                  <td>
                    <input
                      v-model="cigarette"
                      class="cigarette"
                      type="text"
                      name="cigarette"
                    />갑(20개비 기준)
                  </td>
                  <td>향수</td>
                  <td>
                    <input
                      v-model="perfumes"
                      class="perfume"
                      type="text"
                      name="perfume"
                    />㎖
                  </td>
                </tr>
              </table>
            </div>
            <div class="etc-exceed-wrap">
              <h5>▶그 밖의 면세범위 (US $600) 초과 물품</h5>
              <table class="etc-exceed-table">
                <thead>
                  <td>품명</td>
                  <td>수(증)량</td>
                  <td>금액</td>
                </thead>
                <tr>
                  <td>
                    <input
                      v-model="etcExceed1.name"
                      class="goods-name"
                      type="text"
                    />
                  </td>
                  <td>
                    <input
                      v-model="etcExceed1.num"
                      class="goods-cnt"
                      type="text"
                    />
                  </td>
                  <td>
                    <input
                      v-model="etcExceed1.amount"
                      class="goods-price"
                      type="text"
                    />
                  </td>
                </tr>
                <tr>
                  <td>
                    <input
                      v-model="etcExceed2.name"
                      class="goods-name"
                      type="text"
                    />
                  </td>
                  <td>
                    <input
                      v-model="etcExceed2.num"
                      class="goods-cnt"
                      type="text"
                    />
                  </td>
                  <td>
                    <input
                      v-model="etcExceed2.amount"
                      class="goods-price"
                      type="text"
                    />
                  </td>
                </tr>
                <tr>
                  <td>
                    <input
                      v-model="etcExceed3.name"
                      class="goods-name"
                      type="text"
                    />
                  </td>
                  <td>
                    <input
                      v-model="etcExceed3.num"
                      class="goods-cnt"
                      type="text"
                    />
                  </td>
                  <td>
                    <input
                      v-model="etcExceed3.amount"
                      class="goods-price"
                      type="text"
                    />
                  </td>
                </tr>
                <tr>
                  <td>
                    <input
                      v-model="etcExceed4.name"
                      class="goods-name"
                      type="text"
                    />
                  </td>
                  <td>
                    <input
                      v-model="etcExceed4.num"
                      class="goods-cnt"
                      type="text"
                    />
                  </td>
                  <td>
                    <input
                      v-model="etcExceed4.amount"
                      class="goods-price"
                      type="text"
                    />
                  </td>
                </tr>
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>
    <attentions ref="attentions"></attentions>
  </div>
</template>

<script>
import { mapMutations, mapState } from 'vuex'
import CustomNavs from '../../components/CustomNavs.vue'
import attentions from '../../components/attentions.vue'

export default {
  name: 'CustomsDetail',
  components: { CustomNavs, attentions },
  beforeRouteLeave(to, from, next) {
    this.MODIFY_ALCOHOLS(this.alcoholsInfo)
    this.MODIFY_CIGARETTE(this.cigarette)
    this.MODIFY_PERFUMES(this.perfumes)
    const etcExceed = []
    if (
      this.etcExceed1.name !== '' &&
      this.etcExceed1.num !== '' &&
      this.etcExceed1.amount !== ''
    )
      etcExceed.push(this.etcExceed1)
    if (
      this.etcExceed2.name !== '' &&
      this.etcExceed2.num !== '' &&
      this.etcExceed2.amount !== ''
    )
      etcExceed.push(this.etcExceed2)
    if (
      this.etcExceed3.name !== '' &&
      this.etcExceed3.num !== '' &&
      this.etcExceed3.amount !== ''
    )
      etcExceed.push(this.etcExceed3)
    if (
      this.etcExceed4.name !== '' &&
      this.etcExceed4.num !== '' &&
      this.etcExceed4.amount !== ''
    )
      etcExceed.push(this.etcExceed4)
    this.MODIFY_ETCEXCEEDS(etcExceed)

    next()
  },
  data() {
    return {
      alcoholsInfo: {
        num: '',
        liter: '',
        dollar: '',
      },
      cigarette: '',
      perfumes: '',
      etcExceed1: {
        name: '',
        num: '',
        amount: '',
      },
      etcExceed2: {
        name: '',
        num: '',
        amount: '',
      },
      etcExceed3: {
        name: '',
        num: '',
        amount: '',
      },
      etcExceed4: {
        name: '',
        num: '',
        amount: '',
      },
    }
  },
  computed: {
    ...mapState('customdeclaration', ['declaration']),
  },
  created() {
    this.declaration.alcohols &&
      (this.alcoholsInfo = JSON.parse(
        JSON.stringify(this.declaration.alcohols)
      ))
    if (this.declaration.cigarette !== '')
      this.cigarette = this.declaration.cigarette
    if (this.declaration.perfumes !== '')
      this.perfumes = this.declaration.perfumes
    this.declaration.etcExceeds[0] &&
      (this.etcExceed1 = JSON.parse(
        JSON.stringify(this.declaration.etcExceeds[0])
      ))
    this.declaration.etcExceeds[1] &&
      (this.etcExceed2 = JSON.parse(
        JSON.stringify(this.declaration.etcExceeds[1])
      ))
    this.declaration.etcExceeds[2] &&
      (this.etcExceed3 = JSON.parse(
        JSON.stringify(this.declaration.etcExceeds[2])
      ))
    this.declaration.etcExceeds[3] &&
      (this.etcExceed4 = JSON.parse(
        JSON.stringify(this.declaration.etcExceeds[3])
      ))
  },
  methods: {
    ...mapMutations('customdeclaration', [
      'MODIFY_ALCOHOLS',
      'MODIFY_CIGARETTE',
      'MODIFY_PERFUMES',
      'MODIFY_ETCEXCEEDS',
    ]),
    openAttentions() {
      this.$refs.attentions.toggle()
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
.next-page[data-v-27638d97] {
  width: 15%;
  height: 50%;
  margin-bottom: 2%;
}
.title-items {
  width: 100%;
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.title-container {
  display: flex;
  justify-content: space-between;
}
.customs-input-container {
  background-color: rgba(239, 239, 239, 0.511);
  width: 100%;
  height: 85vh;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
}
.customform-main-container {
  width: 90%;
  height: auto;
  padding: 3%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.customform-wrap {
  height: auto;
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.customform-container {
  background-color: white;
  width: 100%;
  height: 80%;
  padding: 2%;
  border: solid 2px #104b69;
  box-shadow: 10px 10px 15px rgba(15, 61, 107, 0.1);
  transition: all 0.3s ease 0s;
  display: flex;
  flex-direction: column;
}
.customform-title {
  font-size: xx-large;
  font-weight: bolder;
  text-align: center;
  color: #004568;
  margin-bottom: 3%;
}
/* declaration-detail-wrap CSS */

table {
  width: 100%;
  height: 100%;
}

table tr,
td {
  padding: 2px;
  border: 1px solid #444444;
}

.declaration-detail-wrap {
  border: solid 1.4px black;
  display: flex;
  padding: 2%;
  flex-direction: column;
}

/* apc table wrap CSS */

.alcohols-perfume-cigarette h5 {
  margin-bottom: 1.5%;
}
.apc-table-wrap {
  padding: 2%;
  text-align: center;
  width: 100%;
}

#alcohols input {
  width: 22%;
  margin-left: 2%;
  margin-right: 2%;
  border-left: none;
  border-right: none;
  border-top: none;
  outline: none;
}

#perfume-cigarette input {
  width: 40%;
  margin-left: 3%;
  margin-right: 3%;
  border-left: none;
  border-right: none;
  border-top: none;
  outline: none;
}

/* etc exceed wrap CSS */
.etc-exceed-wrap h5 {
  margin-top: 1.5%;
  margin-bottom: 1.5%;
}

.etc-exceed-table {
  text-align: center;
  width: 100%;
}

.etc-exceed-wrap input {
  width: 80%;
  border: none;
  outline: none;
}

.next-page {
  width: 15%;
  height: 5vh;
  margin-bottom: 3%;
}
.next-btn-wrap {
  margin-top: 2%;
  display: flex;
  flex-direction: row;
  align-content: flex-end;
}
:deep(.v-application--wrap) {
  min-height: fit-content;
}
</style>
