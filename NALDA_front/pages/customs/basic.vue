<template>
  <div class="customs-input-container">
    <div class="customs-nav">
      <custom-navs
        :basicInfo="{lastName, middleName, firstName, date, passportNum, job, travelPeriod, travelPurpose, flightNum, famillyNum, countryNum}"
      ></custom-navs>
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
                  <input v-model="birthday" type="date" />
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
                      id="chkbox1"
                      v-model="travelPurpose"
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
                      <input
                        v-model="country1"
                        class="visited-country-name"
                        type="text"
                        placeholder="국가명"
                      />
                    </div>
                    <div>
                      2.
                      <input
                        v-model="country2"
                        class="visited-country-name"
                        type="text"
                        placeholder="국가명"
                      />
                    </div>
                    <div>
                      3.
                      <input
                        v-model="coutry3"
                        class="visited-country-name"
                        type="text"
                        placeholder="국가명"
                      />
                    </div>
                  </div>
                </td>
              </tr>
              <tr>
                <td id="col-name">국내주소</td>
                <td colspan="3">
                  <div class="address-wrap">
                    <input id="postal-code" v-model="zipcode" placeholder="우편번호" type="text" />
                    <input id="address" v-model="mainAddress" placeholder="주소" type="text" disabled />
                    <input
                      id="address-detail"
                      v-model="detailAddress"
                      placeholder="상세주소"
                      type="text"
                    />
                    <input
                      id="postal-check-btn"
                      type="button"
                      value="주소검색"
                      @click="find_Postcode()"
                    />
                  </div>
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
      country1: '',
      country2: '',
      country3: '',
      zipcode: '',
      mainAddress: '',
      detailAddress: '',
    }
  },
  computed: {},
  methods: {
    find_Postcode() {
      this.zipcode = ''
      this.mainAddress = ''
      this.detailAddress = ''
      new window.daum.Postcode({
        oncomplete: (data) => {
          // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

          // 각 주소의 노출 규칙에 따라 주소를 조합한다.
          // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
          // let addr = '' // 주소 변수
          // let extraAddr = '' // 참고항목 변수
          // vue라서 위 data에 변수로 추가해줬음.

          // //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.

          if (data.userSelectedType === 'R') {
            // 사용자가 도로명 주소를 선택했을 경우
            this.mainAddress = data.roadAddress
          } else {
            // 사용자가 지번 주소를 선택했을 경우(J)
            this.mainAddress = data.jibunAddress
          }

          // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
          if (data.userSelectedType === 'R') {
            // 법정동명이 있을 경우 추가한다. (법정리는 제외)
            // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
            if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
              this.detailAddress += data.bname
            }
            // 건물명이 있고, 공동주택일 경우 추가한다.
            if (data.buildingName !== '' && data.apartment === 'Y') {
              this.detailAddress +=
                this.detailAddress !== ''
                  ? ', ' + data.buildingName
                  : data.buildingName
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
            if (this.detailAddress !== '') {
              this.detailAddress = ' (' + this.detailAddress + ')'
            }
            // 조합된 참고항목을 해당 필드에 넣는다.
            document.getElementById('address-detail').value = this.extraAddr
          } else {
            document.getElementById('address-detail').value = ''
          }

          // 우편번호와 주소 정보를 해당 필드에 넣는다.
          document.getElementById('postal-code').value = data.zonecode
          document.getElementById('address').value = this.addr
          // 커서를 상세주소 필드로 이동한다.
          document.getElementById('address-detail').focus()
        },
      }).open()
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

#postal-check-btn {
  width: 10%;
  height: 4%;
  font-size: 17px;
  background: #104b69;
  color: white;
  border: solid 1px #104b69;
  border-radius: 10px;
  text-align: center;
}

.address-wrap {
  display: flex;
  justify-content: space-between;
}
</style>