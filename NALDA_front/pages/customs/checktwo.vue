<template>
  <div class="customs-input-container">
    <custom-navs></custom-navs>
    <div class="customform-wrap">
      <div class="customform-main-container">
        <div class="customform-container">
          <div class="title-container">
            <div class="title-items">
              <div class="customform-title">여행자 휴대품 신고서</div>
              <b-button
                class="next-page"
                variant="info"
                @click="$router.push('/customs/detail')"
                >다음 페이지</b-button
              >
            </div>
          </div>
          <div class="to-declaration-wrap">
            <div>
              <h4>세 관 신 고 사 항</h4>
            </div>
            <div>─ 아래 질문의 해당 □ 에 "✓" 표시 하시기 바랍니다 ─</div>
          </div>
          <div></div>
          <div class="check-exceed-wrap">
            <table class="check-exceed-table">
              <tr>
                <td class="details" rowspan="2">
                  4. 총포류, 도검류, 마약류 및
                  <b>헌법질서ㆍ공공의 안녕질서ㆍ풍속을 해치는 물품</b> 등
                  <b>반입이 금지되거나 제한되는 물품(뒷면 2 참조)</b>
                </td>
                <td id="yorn">있음</td>
                <td id="yorn">없음</td>
              </tr>
              <tr>
                <td id="ckbox">
                  <input
                    id="box4-1"
                    v-model="prohibitGoods"
                    name="bangoodsck"
                    type="radio"
                    value="Y"
                  />
                  <label for="box4-1"></label>
                </td>
                <td id="ckbox">
                  <input
                    id="box4-2"
                    v-model="prohibitGoods"
                    name="bangoodsck"
                    type="radio"
                    value="N"
                  />
                  <label for="box4-2"></label>
                </td>
              </tr>
              <tr>
                <td class="details" rowspan="2">
                  5. 동물, 식물, 육가공품 등
                  <b>검역대상물품</b> 또는 가축전염병발생국의
                  <b>축산농가 방문</b>
                  <br />※축산농가 방문자는 <b>검역본부에</b> 신고하시기
                  바랍니다.
                </td>
                <td id="yorn">있음</td>
                <td id="yorn">없음</td>
              </tr>
              <tr>
                <td id="ckbox">
                  <input
                    id="box5-1"
                    v-model="livestockVisited"
                    name="livestockck"
                    type="radio"
                    value="Y"
                  />
                  <label for="box5-1"></label>
                </td>
                <td id="ckbox">
                  <input
                    id="box5-2"
                    v-model="livestockVisited"
                    name="livestockck"
                    type="radio"
                    value="N"
                  />
                  <label for="box5-2"></label>
                </td>
              </tr>
              <tr>
                <td class="details" rowspan="2">
                  6.
                  <b>판매용 물품, 업무용 물품(샘플 등)</b>, 다른 사람의 부탁으로
                  <b>반입한 물품, 예치 또는 일시수출입 물품</b>
                </td>
                <td id="yorn">있음</td>
                <td id="yorn">없음</td>
              </tr>
              <tr>
                <td id="ckbox">
                  <input
                    id="box6-1"
                    v-model="salesGoods"
                    name="salesgoodsck"
                    type="radio"
                    value="Y"
                  />
                  <label for="box6-1"></label>
                </td>
                <td id="ckbox">
                  <input
                    id="box6-2"
                    v-model="salesGoods"
                    name="salesgoodsck"
                    type="radio"
                    value="N"
                  />
                  <label for="box6-2"></label>
                </td>
              </tr>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState, mapMutations } from 'vuex'
import CustomNavs from '../../components/CustomNavs.vue'

export default {
  name: 'CustomsChecktwo',
  components: { CustomNavs },
  beforeRouteLeave(to, from, next) {
    this.MODIFY_PROHIBITGOODS(this.prohibitGoods)
    this.MODIFY_LIVESTOCKVISITED(this.livestockVisited)
    this.MODIFY_SALESGOODS(this.salesGoods)
    next()
  },
  data() {
    return {
      prohibitGoods: '',
      livestockVisited: '',
      salesGoods: '',
    }
  },
  computed: {
    ...mapState('customdeclaration', ['declaration']),
  },
  created() {
    if (this.declaration.prohibitGoods !== '')
      this.prohibitGoods = this.declaration.prohibitGoods
    if (this.declaration.livestockVisited !== '')
      this.livestockVisited = this.declaration.livestockVisited
    if (this.declaration.salesGoods !== '')
      this.salesGoods = this.declaration.salesGoods
  },
  methods: {
    ...mapMutations('customdeclaration', [
      'MODIFY_PROHIBITGOODS',
      'MODIFY_LIVESTOCKVISITED',
      'MODIFY_SALESGOODS',
    ]),
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

:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
}

* {
  margin: 0;
  padding: 0;
  font-family: 'twayfly';
}

.next-page {
  width: 20%;
  height: 60%;
  margin-bottom: 2%;
}

.title-items {
  width: 75%;
  display: flex;
  justify-content: space-around;
  align-items: center;
}
.title-container {
  display: flex;
  justify-content: end;
}

.customs-input-container {
  width: 100%;
  height: 70vh;
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
.custom-info-wrap {
  padding: 3%;
  width: 100%;
  height: 75%;
  background-color: #dadada;
  border-radius: 4px;
}

.to-declaration-wrap {
  text-align: center;
  padding: 1%;
  background-color: #ffeab2;
  box-shadow: 10px 10px 15px rgba(107, 81, 15, 0.1);
  border-radius: 4px;
}

table tr,
td {
  padding: 10px;
  border: 1px solid #444444;
}

/* y or no */
.check-exceed-wrap {
  margin-top: 2%;
  padding: 1%;
  background-color: #c7eafb;
  box-shadow: 10px 10px 15px rgba(26, 128, 153, 0.1);
  border-radius: 4px;
}

.check-exceed-table {
  width: 100%;
  border: 1px solid #444444;
  border-collapse: collapse;
  padding-top: 3%;
  padding-bottom: 3%;
  background-color: #c7eafb;
  border-style: hidden;
}
/* .visit-country-num {
  outline: none;
  border-top: none;
  border-left: none;
  border-right: none
} */

.details {
  width: 70%;
}
.check-exceed-table input {
  background-color: #c7eafb;
  outline: none;
  border-top: none;
  border-left: none;
  border-right: none;
  width: 30%;
}

#yorn {
  text-align: center;
}
#ckbox {
  text-align: center;
}

/* check box design CSS */
input[id='box4-1'] + label,
input[id='box4-2'] + label,
input[id='box5-1'] + label,
input[id='box5-2'] + label,
input[id='box6-1'] + label,
input[id='box6-2'] + label {
  display: inline-block;
  width: 20px;
  height: 20px;
  border: 2px solid #bcbcbc;
  cursor: pointer;
}

input[id='box4-1']:checked + label,
input[id='box4-2']:checked + label,
input[id='box5-1']:checked + label,
input[id='box5-2']:checked + label,
input[id='box6-1']:checked + label,
input[id='box6-2']:checked + label {
  background-color: #206e95;
}

input[id='box4-1'],
input[id='box4-2'],
input[id='box5-1'],
input[id='box5-2'],
input[id='box6-1'],
input[id='box6-2'] {
  display: none;
}
</style>
