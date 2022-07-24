<template>
  <div class="customs-input-container">
    <div class="customs-nav">
      <custom-navs></custom-navs>
    </div>
    <div class="customform-wrap">
      <div class="customform-main-container">
        <div class="customform-container">
          <div class="customform-title">여행자 휴대품 신고서</div>
          <div class="custom-info-wrap">
            <table class="custom-info-table">
              <tr>
                <td id="col-name">성명</td>
                <td colspan="3">
                  <input v-model="lastName" type="text" placeholder="성을 입력해주세요." />
                  <input v-model="middleName" type="text" placeholder="middle name을 입력해주세요." />
                  <input v-model="firstName" type="text" placeholder="이름을 입력해주세요." />
                </td>
              </tr>
              <tr>
                <!-- 첫번째 줄 시작 -->
                <td id="col-name">생년월일</td>
                <td>
                  <input v-model="date" type="date" />
                </td>
                <td id="col-name">여권번호</td>
                <td>
                  <input v-model="passportNum" type="text" placeholder="여권번호를 입력해주세요." />
                </td>
              </tr>
              <!-- 첫번째 줄 끝 -->
              <tr>
                <!-- 두번째 줄 시작 -->
                <td id="col-name">직업</td>
                <td>
                  <input v-model="job" type="text" placeholder="직업을 입력해주세요." />
                </td>
                <td id="col-name">여행기간</td>
                <td>
                  <input v-model="travelPeriod" type="text" placeholder="여행기간을 입력해주세요." /> (일)
                </td>
              </tr>
              <!-- 두번째 줄 끝 -->
              <tr>
                <td id="col-name">여행목적</td>
                <td colspan="3">
                  <div class="chkboxes-wrap">
                    <input
                      v-model="travelPurpose"
                      id="chkbox1"
                      type="checkbox"
                      value="travel"
                      checked
                    />
                    <label for="chkbox1"></label>
                    여행
                    <input id="chkbox2" type="checkbox" value="business" />
                    <label for="chkbox2"></label>
                    사업
                    <input id="chkbox3" type="checkbox" value="visitfamily" />
                    <label for="chkbox3"></label>
                    친지방문
                    <input id="chkbox4" type="checkbox" value="public" />
                    <label for="chkbox4"></label>
                    공무
                    <input id="chkbox5" type="checkbox" value="etc" />
                    <label for="chkbox5"></label>
                    기타
                  </div>
                </td>
              </tr>
              <tr>
                <td id="col-name">항공편명</td>
                <td>
                  <input v-model="flightNum" type="text" placeholder="항공편을 입력해주세요." />
                </td>
                <td id="col-name">동반가족수</td>
                <td>
                  <input v-model="famillyNum" class="family-num" type="text" placeholder="00" /> 명
                </td>
              </tr>
              <tr>
                <td colspan="4">
                  대한민국에 입국하기전 방문했던 국가 (총
                  <input
                    v-model="countryNum"
                    class="visit-country-num"
                    type="text"
                    placeholder="방문했던 국가 총 수"
                  /> 개국)
                  <br />
                  <div class="visited-countries">
                    <div>
                      1.
                      <input class="visited-country-name" type="text" placeholder="국가명" />
                    </div>
                    <div>
                      2.
                      <input class="visited-country-name" type="text" placeholder="국가명" />
                    </div>
                    <div>
                      3.
                      <input class="visited-country-name" type="text" placeholder="국가명" />
                    </div>
                  </div>
                </td>
              </tr>
              <tr>
                <td id="col-name">국내주소</td>
                <td colspan="3">
                  <input type="text" placeholder="주소를 입력해주세요." />
                </td>
              </tr>
              <tr>
                <td id="col-name">전화번호</td>
                <td colspan="3">
                  <input type="text" placeholder="☎전화번호를 입력해세요." />
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
  name: 'CustomsBasic',
  components: { CustomNavs },
  data() {
    return {
      lastName: '',
      middleName: '',
      firstName: '',
      date: '',
      passportNum: '',
      job: '',
      travelPeriod: '',
      travelPurpose: '',
      flightNum: '',
      famillyNum: '',
      countryNum: '',
    }
  },
  computed: {},
  methods: {
    moveSecondStep1() {
      const basicInfo = {
        lastName: this.lastName,
        middleName: this.middleName,
        firstName: this.firstName,
        date: this.data,
        passportNum: this.passportNum,
        job: this.job,
        travelPeriod: this.travelPeriod,
        travelPurpose: this.travelPurpose,
        flightNum: this.flightNum,
        famillyNum: this.famillyNum,
        countryNum: this.countryNum,
      }
      console.log(basicInfo)
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

.custom-info-wrap input {
  background-color: #dadada;
  border: none;
  outline: none;
}

table tr,
td {
  padding: 5px;
  border: 1px solid #104b69;
}

.custom-info-table {
  width: 100%;
  height: 80%;
  border: 1px solid#104b69;
  border-style: hidden;
}

/* .custom-info-wrap .custom-info-table tr,td{
  padding: 10px;
  border: 1px solid #444444;
} */

#col-name {
  width: 25%;
  text-align: justify;
}

.family-num {
  width: 50%;
  background-color: white;
  outline: none;
  border-top: none;
  border-left: none;
  border-right: none;
}

.visit-country-num {
  background-color: white;
  width: 15%;
  outline: none;
  border-top: none;
  border-left: none;
  border-right: none;
}
.visited-country-name {
  background-color: white;
  width: 80%;
  outline: none;
  border-top: none;
  border-left: none;
  border-right: none;
}

.visited-countries {
  display: flex;
  flex-direction: row;
  justify-content: space-around;
}

.chkboxes-wrap {
  display: flex;
  flex-direction: row;
  align-items: center;
}

.chkboxes-wrap input,
label {
  margin: 0.3%;
}

/* check box design CSS */
input[id='chkbox1'] + label,
input[id='chkbox2'] + label,
input[id='chkbox3'] + label,
input[id='chkbox4'] + label,
input[id='chkbox5'] + label {
  display: inline-block;
  width: 20px;
  height: 20px;
  border: 2px solid #bcbcbc;
  cursor: pointer;
}
input[id='chkbox1']:checked + label,
input[id='chkbox2']:checked + label,
input[id='chkbox3']:checked + label,
input[id='chkbox4']:checked + label,
input[id='chkbox5']:checked + label {
  background-color: var(--nalda-blue-color);
}

input[id='chkbox1'],
input[id='chkbox2'],
input[id='chkbox3'],
input[id='chkbox4'],
input[id='chkbox5'] {
  display: none;
}

/* customs navs */
:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
  --nalda-background-blue-color: #45a9c8;
}

.customform-nav-container {
  background-color: var(--nalda-blue-color);
  color: #ffe6cf;
  height: auto;
  width: auto;
  margin-left: 0;
}

/* body {
  margin: 0;
  font-family: 'Helvetica Neue', -apple-system, BlinkMacSystemFont, 'Segoe UI',
    Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', sans-serif;
  background-color: var(--nalda-blue-color);
  color: #ffe6cf;
  font-size: 11px;
  line-height: 1.4;
  font-weight: 500;
  overflow-x: hidden;
  margin-bottom: 72px;
} */

h2 {
  margin: 0;
  font-weight: 400;
  line-height: 1;
  font-size: 24px;
}

ul,
li {
  margin: 0;
  padding: 0;
}

li {
  list-style: none;
}

.customform-nav-container button {
  background-color: transparent;
  border: none;
  outline: none;
  color: #ffe6cf;
  font-size: 15px;
}

.mouse-effect {
  position: relative;
  overflow: hidden;
}

.mouse-effect:after {
  content: '';
  position: absolute;
  width: 100%;
  height: 100%;
  left: 0;
  top: 0;
  transition: 0.2s;
}

.mouse-effect:hover:after {
  background-color: rgba(0, 0, 0, 0.08);
}

.mouse-effect:active:after {
  background-color: rgba(0, 0, 0, 0.12);
  transition: 0s;
}

/* 리스트 */
.step-list {
  /* margin-top: 48px; */
  padding-top: 42%;
  padding-bottom: 42%;
  width: 100%;
  height: 100%;
}

.step-list .item {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 1px solid rgba(0, 0, 0, 0.08);
  font-size: 15px;
  margin: 2%;
  cursor: pointer;
}

.step-list .item .left {
  display: flex;
  align-items: center;
}

.step-list .item .left .name {
  margin-left: 6px;
}

.step-list .item .right {
  opacity: 0.5;
}

/* 이부분 수정 필요 */
.step-list .item i {
  padding: 20px 22px;
}

.step-list .item .right img {
  padding-right: 14px;
}

.step-list .next-steps {
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 15px;
  cursor: pointer;
}
.right-mid i {
  display: flex;
  justify-content: center;
  align-items: center;
  color: #f5f6f7;
  transform: rotate(90deg);
}
</style>