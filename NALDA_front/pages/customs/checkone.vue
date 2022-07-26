<template>
  <div class="customs-input-container">
    <div class="customs-nav">
      <custom-navs></custom-navs>
    </div>
    <div class="customform-wrap">
      <div class="customform-main-container">
        <div class="customform-container">
          <div class="customform-title">여행자 휴대품 신고서</div>
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
                  1. 해외(국내외 면세점 포함)에서
                  <b>취득(구입, 기증, 선물 포함)</b>한 면세범위 초과
                  <b>물품(뒷면 1참조)</b>
                  [총금액: 약
                  <input type="text" /> ]
                  <br />
                  <b style="color: red;">*면세범위 초과물품을 자진신고하시면 관세의 30%(15만원 한도 초과)가 감면됩니다.</b>
                </td>
                <td id="yorn">있음</td>
                <td id="yorn">없음</td>
              </tr>
              <tr>
                <td id="ckbox">
                  <input id="box1-1" type="checkbox" value="dutyfreeck" />
                  <label for="box1-1"></label>
                </td>
                <td id="ckbox">
                  <input id="box1-2" type="checkbox" value="dutyfreeck" />
                  <label for="box1-2"></label>
                </td>
              </tr>
              <tr>
                <td class="details" rowspan="2">
                  2.
                  <b>FTA 협정국가</b>의 원산지 물품으로
                  <b>특혜관세</b>를 적용받으려는 물품
                </td>
                <td id="yorn">있음</td>
                <td id="yorn">없음</td>
              </tr>
              <tr>
                <td id="ckbox">
                  <input id="box2-1" type="checkbox" value="FTAck" />
                  <label for="box2-1"></label>
                </td>
                <td id="ckbox">
                  <input id="box2-2" type="checkbox" value="FTAck" />
                  <label for="box2-2"></label>
                </td>
              </tr>
              <tr>
                <td class="details" rowspan="2">
                  3. 미화로 환산하여
                  <b>$10,000을 초과하는 지급수단</b> (원화ㆍ달러화 등 법정통화, 자기앞수표, 여행자수표, 및 그 밖의 유가증권)
                  <br />[총금액: 약
                  <input type="text" /> ]
                </td>
                <td id="yorn">있음</td>
                <td id="yorn">없음</td>
              </tr>
              <tr>
                <td id="ckbox">
                  <input id="box3-1" type="checkbox" value="paymentck" />
                  <label for="box3-1"></label>
                </td>
                <td id="ckbox">
                  <input id="box3-2" type="checkbox" value="paymentck" />
                  <label for="box3-2"></label>
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
import CustomNavs from '../../components/CustomNavs.vue'

export default {
  name: 'CustomsCheckone',
  components: { CustomNavs },
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

.customs-input-container {
  width: 100%;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-between;
}
.customform-main-container {
  width: 100%;
  height: 100%;
  padding: 3%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.customform-wrap {
  height: 100%;
  width: 80%;
  display: flex;
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
input[id='box1-1'] + label,
input[id='box1-2'] + label,
input[id='box2-1'] + label,
input[id='box2-2'] + label,
input[id='box3-1'] + label,
input[id='box3-2'] + label {
  display: inline-block;
  width: 20px;
  height: 20px;
  border: 2px solid #bcbcbc;
  cursor: pointer;
}

input[id='box1-1']:checked + label,
input[id='box1-2']:checked + label,
input[id='box2-1']:checked + label,
input[id='box2-2']:checked + label,
input[id='box3-1']:checked + label,
input[id='box3-2']:checked + label {
  background-color: #206e95;
}

input[id='box1-1'],
input[id='box1-2'],
input[id='box2-1'],
input[id='box2-2'],
input[id='box3-1'],
input[id='box3-2'] {
  display: none;
}
</style>