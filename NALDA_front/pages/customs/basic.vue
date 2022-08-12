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
                @click="$router.push('/customs/checkone')"
                >다음 페이지</b-button
              >
            </div>
          </div>
          <div class="custom-info-wrap">
            <table class="custom-info-table">
              <tr>
                <td id="col-name">성명</td>
                <td colspan="3">
                  <input
                    v-model="lastName"
                    type="text"
                    placeholder="성을 입력해주세요."
                    disabled
                  />
                  <input
                    v-model="middleName"
                    type="text"
                    placeholder="middle name을 입력해주세요."
                    disabled
                  />
                  <input
                    v-model="firstName"
                    type="text"
                    placeholder="이름을 입력해주세요."
                    disabled
                  />
                </td>
              </tr>
              <tr>
                <!-- 첫번째 줄 시작 -->
                <td id="col-name">생년월일</td>
                <td>
                  <input v-model="birthday" type="date" disabled />
                </td>
                <td id="col-name">여권번호</td>
                <td>
                  <input
                    v-model="passportNum"
                    type="text"
                    placeholder="여권번호를 입력해주세요."
                    disabled
                  />
                </td>
              </tr>
              <!-- 첫번째 줄 끝 -->

              <tr>
                <!-- 두번째 줄 시작 -->
                <td id="col-name">직업</td>
                <td>
                  <input
                    v-model="job"
                    type="text"
                    placeholder="직업을 입력해주세요."
                    disabled
                  />
                </td>
                <td id="col-name">여행기간</td>
                <td>
                  <input
                    v-model="travelPeriod"
                    type="text"
                    placeholder="여행기간을 입력해주세요."
                  />
                  (일)
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
                      type="radio"
                      name="travelPurpose"
                      value="travel"
                      checked
                    />
                    <label for="chkbox1"></label>
                    여행
                    <input
                      id="chkbox2"
                      v-model="travelPurpose"
                      type="radio"
                      name="travelPurpose"
                      value="business"
                    />
                    <label for="chkbox2"></label>
                    사업
                    <input
                      id="chkbox3"
                      v-model="travelPurpose"
                      type="radio"
                      name="travelPurpose"
                      value="visitfamily"
                    />
                    <label for="chkbox3"></label>
                    친지방문
                    <input
                      id="chkbox4"
                      v-model="travelPurpose"
                      type="radio"
                      name="travelPurpose"
                      value="public"
                    />
                    <label for="chkbox4"></label>
                    공무
                    <input
                      id="chkbox5"
                      v-model="travelPurpose"
                      type="radio"
                      name="travelPurpose"
                      value="etc"
                    />
                    <label for="chkbox5"></label>
                    기타
                  </div>
                </td>
              </tr>
              <tr>
                <td id="col-name">항공편명</td>
                <td>
                  <input
                    v-model="flightNum"
                    type="text"
                    placeholder="항공편을 입력해주세요."
                  />
                </td>
                <td id="col-name">동반가족수</td>
                <td>
                  <input
                    v-model="famillyNum"
                    class="family-num"
                    type="text"
                    placeholder="00"
                  />
                  명
                </td>
              </tr>
              <tr>
                <td colspan="4">
                  대한민국에 입국하기전 방문했던 국가
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
                        v-model="country3"
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
                    <input
                      id="postal-code"
                      v-model="zipcode"
                      placeholder="우편번호"
                      type="text"
                      disabled
                    />
                    <input
                      id="address"
                      v-model="mainAddress"
                      placeholder="주소"
                      type="text"
                      disabled
                    />
                    <input
                      id="address-detail"
                      v-model="detailAddress"
                      placeholder="상세주소"
                      type="text"
                      disabled
                    />
                  </div>
                </td>
              </tr>
              <tr>
                <td id="col-name">전화번호</td>
                <td colspan="3">
                  <input
                    v-model="tel"
                    type="text"
                    placeholder="☎전화번호를 입력해세요."
                    disabled
                  />
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
import { mapActions, mapState, mapMutations } from 'vuex'
import CustomNavs from '../../components/CustomNavs.vue'

export default {
  name: 'CustomsBasic',
  components: { CustomNavs },
  beforeRouteLeave(to, from, next) {
    this.MODIFY_USERNAME(this.loginMember.username)
    this.MODIFY_TRAVELPERIOD(this.travelPeriod)
    this.MODIFY_PURPOSETRAVEL(this.travelPurpose)
    this.MODIFY_FLIGHTNUM(this.flightNum)
    this.MODIFY_ACCOMPANY(this.famillyNum)
    const visitedCountries = []
    if (this.country1 !== '')
      visitedCountries.push({ countryName: this.country1 })
    if (this.country2 !== '')
      visitedCountries.push({ countryName: this.country2 })
    if (this.country3 !== '')
      visitedCountries.push({ countryName: this.country3 })
    this.MODIFY_VISITEDCOUNTRIES(visitedCountries)
    next()
  },
  data() {
    return {
      lastName: '',
      middleName: '',
      firstName: '',
      birthday: '',
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
      tel: '',
    }
  },
  computed: {
    ...mapState('customdeclaration', ['declaration']),
    ...mapState('user', ['loginMember', 'memberDetail']),
  },
  created() {
    const promise = new Promise((resolve, reject) => {
      resolve()
    })

    promise.then(async () => {
      await this.callMemberDetail(this.loginMember.username)
      this.loginMember.fullName.firstName &&
        (this.firstName = this.loginMember.fullName.firstName)
      this.loginMember.fullName.middleName &&
        (this.middleName = this.loginMember.fullName.middleName)
      this.loginMember.fullName.lastName &&
        (this.lastName = this.loginMember.fullName.lastName)
      this.loginMember.birthday &&
        (this.birthday =
          this.loginMember.birthday[0] +
          '-' +
          (('00' + this.loginMember.birthday[1].toString()).slice(-2) +
            '-' +
            ('00' + this.loginMember.birthday[2].toString()).slice(-2)))
      this.memberDetail.passportNum &&
        (this.passportNum = this.memberDetail.passportNum)
      this.memberDetail.job && (this.job = this.memberDetail.job)
      this.memberDetail.address.zipcode &&
        (this.zipcode = this.memberDetail.address.zipcode)
      this.memberDetail.address.mainAddress &&
        (this.mainAddress = this.memberDetail.address.mainAddress)
      this.memberDetail.address.detailAddress &&
        (this.detailAddress = this.memberDetail.address.detailAddress)
      this.memberDetail.tel && (this.tel = this.memberDetail.tel)
    })

    if (this.declaration.username !== '') {
      this.declaration.travelPeriod !== ''
        ? (this.travelPeriod = this.declaration.travelPeriod)
        : (this.travelPeriod = '')
      this.declaration.purposeTravel !== ''
        ? (this.travelPurpose = this.declaration.purposeTravel)
        : (this.travelPurpose = '')
      this.declaration.accompany !== ''
        ? (this.famillyNum = this.declaration.accompany)
        : (this.famillyNum = '')
      this.declaration.flightNum !== ''
        ? (this.flightNum = this.declaration.flightNum)
        : (this.flightNum = '')
      this.declaration.visitedCountries[0] &&
        (this.country1 = this.declaration.visitedCountries[0].countryName)
      this.declaration.visitedCountries[1] &&
        (this.country2 = this.declaration.visitedCountries[1].countryName)
      this.declaration.visitedCountries[2] &&
        (this.country3 = this.declaration.visitedCountries[2].countryName)
    }
  },
  methods: {
    ...mapMutations('customdeclaration', [
      'MODIFY_USERNAME',
      'MODIFY_TRAVELPERIOD',
      'MODIFY_PURPOSETRAVEL',
      'MODIFY_FLIGHTNUM',
      'MODIFY_ACCOMPANY',
      'MODIFY_VISITEDCOUNTRIES',
    ]),
    ...mapActions('user', ['callMemberDetail']),
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
  justify-content: flex-end;
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
  width: 100%;
  height: 80%;
  padding: 2%;
  border: solid 2px #104b69;
  box-shadow: 10px 10px 15px rgba(15, 61, 107, 0.1);
  transition: all 0.3s ease 0s;
  display: flex;
  flex-direction: column;
  background-color: white;
}
.customform-title {
  font-size: xx-large;
  font-weight: bolder;
  text-align: center;
  color: #004568;
  margin-bottom: 2%;
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
  padding: 0.5%;
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
  width: 1rem;
  height: 1rem;
  border: 2px solid #bcbcbc;
  cursor: pointer;
}
input[id='chkbox1']:checked + label,
input[id='chkbox2']:checked + label,
input[id='chkbox3']:checked + label,
input[id='chkbox4']:checked + label,
input[id='chkbox5']:checked + label {
  background-color: #206e95;
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
