<template>
  <div>
    <div class="modify-container">
      <div class="modify-wrap">
        <header>
          <div class="sel-lang-wrap">
            <select class="lang-select">
              <option>Korean</option>
              <option>English</option>
            </select>
          </div>
        </header>
        <section class="modify-input-section-wrap">
          <h2>modify</h2>
          <div>
            <h6>아이디</h6>
            <div class="modify-input-id-wrap">
              <input
                v-model="username"
                placeholder="Username"
                type="text"
                disabled
              />
            </div>
          </div>
          <div>
            <h6>비밀번호</h6>
            <div class="modify-input-wrap password-wrap">
              <input
                ref="password"
                v-model="password"
                placeholder="Password"
                type="password"
              />
            </div>
          </div>
          <div>
            <h6>비밀번호 확인</h6>
            <div class="modify-input-wrap password-confirm-wrap">
              <input
                v-model="passwordCheck"
                placeholder="Password"
                type="password"
              />
            </div>
          </div>
          <div class="modify-name-form-tag">
            <h6>FirstName</h6>
            <h6>MiddleName</h6>
            <h6>LastName</h6>
          </div>
          <div class="modify-name-form-input">
            <div class="modify-input-wrap name-wrap">
              <input v-model="firstName" placeholder="firstname" type="text" />
            </div>
            <div class="modify-input-wrap name-wrap">
              <input
                v-model="middleName"
                placeholder="middlename"
                type="text"
              />
            </div>

            <div class="modify-input-wrap name-wrap">
              <input v-model="lastName" placeholder="lastname" type="text" />
            </div>
          </div>
          <div>
            <h6>생년월일</h6>
            <div class="birthdate-wrap">
              <div class="modify-input-birth">
                <input v-model="birthday" type="date" />
              </div>
            </div>
          </div>
          <div>
            <h6>성별</h6>
            <div class="gender-wrap">
              <b-form-group v-slot="{ ariaDescribedby }">
                <b-form-radio-group
                  id="btn-radios-2"
                  v-model="gender"
                  :options="genders"
                  :aria-describedby="ariaDescribedby"
                  button-variant="outline-primary"
                  size="lg"
                  name="radio-btn-outline"
                  buttons
                ></b-form-radio-group>
              </b-form-group>
            </div>
          </div>
          <div>
            <h6>이메일</h6>
            <div class="email-wrap">
              <div class="modify-input-email">
                <input
                  id="modify-email-id"
                  v-model="email1"
                  type="text"
                  placeholder="이메일아이디"
                />
              </div>
              <h5>@</h5>
              <div class="modify-input-email">
                <input
                  id="modify-email"
                  v-model="email2"
                  type="text"
                  placeholder="이메일주소"
                />
              </div>
              <div class="modify-input-email" style="margin-left: 10px">
                <select
                  id="modify-email-select"
                  class="selectbox"
                  name="email"
                  @change="changeEmail"
                >
                  <option value="">직접입력</option>
                  <option value="naver.com">naver.com</option>
                  <option value="gmail.com">gmail.com</option>
                  <option value="daum.com">daum.com</option>
                  <option value="hotmail.com">hotmail.com</option>
                </select>
              </div>
            </div>
          </div>
          <div>
            <h6>전화번호</h6>
            <div class="mobile-num-wrap">
              <div class="modify-mobile-num">
                <input
                  v-model="tel1"
                  class="mobile-num"
                  type="text"
                  placeholder="000"
                />
              </div>
              <h5>-</h5>
              <div class="modify-mobile-num">
                <input
                  v-model="tel2"
                  class="mobile-num"
                  type="text"
                  placeholder="0000"
                />
              </div>
              <h5>-</h5>
              <div class="modify-mobile-num">
                <input
                  v-model="tel3"
                  class="mobile-num"
                  type="text"
                  placeholder="0000"
                />
              </div>
            </div>
          </div>
          <div>
            <h6>주소</h6>
            <div class="address-wrap">
              <div class="postal-wrap">
                <input
                  id="postal-code"
                  v-model="zipcode"
                  placeholder="postal code"
                  type="text"
                />
                <input
                  id="postal-check-btn"
                  type="button"
                  value="주소검색"
                  @click="find_Postcode()"
                />
              </div>
              <div class="modify-input-wrap">
                <input
                  id="address"
                  v-model="mainAddress"
                  placeholder="address"
                  type="text"
                />
              </div>
              <div class="modify-input-wrap" style="margin-top: 3px">
                <input
                  id="address-detail"
                  v-model="detailAddress"
                  placeholder="address detail"
                  type="text"
                />
              </div>
            </div>
          </div>
          <div>
            <h6>여권번호</h6>
            <div class="modify-input-wrap passport-num-wrap">
              <input
                v-model="passportNum"
                placeholder="passportnumber"
                type="text"
              />
            </div>
          </div>
          <div>
            <h6>국적</h6>
            <div class="modify-input-wrap nationality-wrap">
              <input
                v-model="nationality"
                placeholder="nationality"
                type="text"
              />
            </div>
          </div>
          <div>
            <h6>직업</h6>
            <div class="modify-input-wrap job-wrap">
              <select
                id="modify-job-select"
                v-model="job"
                class="selectbox"
                name="job"
                onchange
              >
                <option value="학생">학생</option>
                <option value="주부">주부</option>
                <option value="군인">군인</option>
                <option value="금융업">금융업</option>
                <option value="교육계">교육계</option>
                <option value="IT, 정보통신">IT, 정보통신</option>
                <option value="광고">광고</option>
                <option value="농부">농부</option>
                <option value="기타">기타</option>
              </select>
            </div>
          </div>

          <div class="modify-button-wrap">
            <button @click="modify">modify</button>
          </div>
          <!-- <div class="modify-stay-sign-in">
                    <i class="far fa-check-circle"></i>
                    <span>modify</span>
          </div>-->
          <b-modal id="check-modal" hide-footer>
            <template #modal-title> 알림 </template>
            <div class="d-block text-center">
              <h3>정보를 모두 채워주세요!</h3>
            </div>
            <b-button class="mt-3" block @click="$bvModal.hide('check-modal')"
              >Close Me</b-button
            >
          </b-modal>
        </section>
      </div>
    </div>
  </div>
</template>

<script scoped>
import { mapActions, mapState } from 'vuex'

export default {
  name: 'ModifyUser',
  components: {},
  data() {
    return {
      genders: [
        { text: '남성', value: 'MALE' },
        { text: '여성', value: 'FEMALE' },
      ],
      // 주소 변수
      addr: '',
      // 참고항목 변수
      extraAddr: '',
      password: '',
      passwordCheck: '',
      birthday: '',
      firstName: '',
      middleName: '',
      lastName: '',
      gender: '',
      email1: '',
      email2: '',
      tel1: '',
      tel2: '',
      tel3: '',
      zipcode: '',
      mainAddress: '',
      detailAddress: '',
      passportNum: '',
      nationality: '',
      job: '',
      username: '',
    }
  },
  computed: {
    ...mapState('user', ['loginMember', 'memberDetail']),
    tel() {
      return this.tel1 + '-' + this.tel2 + '-' + this.tel3
    },
    email() {
      return this.email1 + '@' + this.email2
    },
  },
  created() {
    this.birthday =
      this.loginMember.birthday[0] +
      '-' +
      (('00' + this.loginMember.birthday[1].toString()).slice(-2) +
        '-' +
        ('00' + this.loginMember.birthday[2].toString()).slice(-2))
    this.username = this.loginMember.username
    this.loginMember.fullName.firstName &&
      (this.firstName = this.loginMember.fullName.firstName)
    this.loginMember.fullName.middleName &&
      (this.middleName = this.loginMember.fullName.middleName)
    this.loginMember.fullName.lastName &&
      (this.lastName = this.loginMember.fullName.lastName)
    this.gender = this.memberDetail.gender
    this.email1 = this.memberDetail.email.split('@')[0]
    this.email2 = this.memberDetail.email.split('@')[1]
    this.tel1 = this.memberDetail.tel.split('-')[0]
    this.tel2 = this.memberDetail.tel.split('-')[1]
    this.tel3 = this.memberDetail.tel.split('-')[2]
    this.zipcode = this.memberDetail.address.zipcode
    this.mainAddress = this.memberDetail.address.mainAddress
    this.detailAddress = this.memberDetail.address.detailAddress
    this.passportNum = this.memberDetail.passportNum
    this.nationality = this.memberDetail.nationality
    this.job = this.memberDetail.job
  },
  methods: {
    ...mapActions('user', ['modifyMember']),
    modify() {
      if (
        this.gender === '' ||
        this.password === '' ||
        this.passwordCheck === '' ||
        this.birthday === '' ||
        this.firstName === '' ||
        this.middleName === '' ||
        this.lastName === '' ||
        this.email1 === '' ||
        this.email2 === '' ||
        this.tel1 === '' ||
        this.tel2 === '' ||
        this.tel3 === '' ||
        this.zipcode === '' ||
        this.mainAddress === '' ||
        this.detailAddress === '' ||
        this.passportNum === '' ||
        this.nationality === '' ||
        this.job === ''
      ) {
        this.$bvModal.show('check-modal')
        return
      }

      if (this.password === this.passwordCheck) {
        const sendObject = {
          username: this.username,
          password: this.password,
          birthday: this.birthday,
          fullName: {
            firstName: this.firstName,
            middleName: this.middleName,
            lastName: this.lastName,
          },
          job: this.job,
          passportNum: this.passportNum,
          address: {
            zipcode: this.zipcode,
            mainAddress: this.mainAddress,
            detailAddress: this.detailAddress,
          },
          tel: this.tel,
          email: this.email,
          gender: this.gender,
          nationality: this.nationality,
        }
        this.modifyMember(sendObject)
        this.$router.push('/user/mypage')
      } else {
        alert('비밀번호를 확인 해주세요')
        this.password = ''
        this.passwordCheck = ''
        this.$refs.password.focus()
      }
    },
    changeEmail(e) {
      this.email2 = e.target.value
    },

    /*
    KAKAO API 사용한부분
    https://postcode.map.daum.net/guide#sample 이거에서
    사용자가 선택한 값 이용하기 부분 소스코드 가져옴
    Key 발급 필요 없고, 사용량 제한 없음
    기업용/상업용 무료 사용 가능
    주소검색 버튼 누르면 아래 function 실행
    */
    find_Postcode() {
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
            this.addr = data.roadAddress
          } else {
            // 사용자가 지번 주소를 선택했을 경우(J)
            this.addr = data.jibunAddress
          }

          // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
          if (data.userSelectedType === 'R') {
            // 법정동명이 있을 경우 추가한다. (법정리는 제외)
            // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
            if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
              this.extraAddr += data.bname
            }
            // 건물명이 있고, 공동주택일 경우 추가한다.
            if (data.buildingName !== '' && data.apartment === 'Y') {
              this.extraAddr +=
                this.extraAddr !== ''
                  ? ', ' + data.buildingName
                  : data.buildingName
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
            if (this.extraAddr !== '') {
              this.extraAddr = ' (' + this.extraAddr + ')'
            }
            // 조합된 참고항목을 해당 필드에 넣는다.
            this.detailAddress = this.extraAddr
          } else {
            this.detailAddress = ''
          }

          // 우편번호와 주소 정보를 해당 필드에 넣는다.
          this.zipcode = data.zonecode
          this.mainAddress = this.addr
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
input[type='password'] {
  font-family: 'Malgun gothic', dotum, sans-serif;
}
::placeholder {
  font-family: 'twayfly';
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

body {
  background: var(--body-background-color);
}

.modify-container {
  width: 100%;
  height: 70vh;
  display: flex;
  flex-direction: column;
  align-items: center;
  overflow: scroll;
}

.modify-container::-webkit-scrollbar {
  display: none;
}

.modify-container .modify-wrap {
  width: 768px;
}

.modify-container .modify-wrap .sel-lang-wrap .lang-select {
  width: 96px;
  height: 30px;
  color: var(--font-color);
  border: solid 1px var(--border-gray-color);
}

.modify-container .modify-wrap header .sel-lang-wrap {
  display: flex;
  justify-content: flex-end;
  margin-top: 2%;
}

/* 회원가입 input 대분류 CSS */

.modify-input-section-wrap {
  padding-top: 60px;
  padding-bottom: 60px;
  display: flex;
  flex-direction: column;
  align-items: center;
  background-color: var(--body-background-color);
  margin-top: 1%;
  margin-bottom: 2%;
}

.modify-input-section-wrap h2 {
  margin-bottom: 60px;
}

.modify-input-section-wrap h6 {
  margin-bottom: 3px;
  margin-top: 10px;
  text-align: left;
  font-size: small;
}

.modify-input-wrap {
  width: 465px;
  height: 55px;
  background: white;
  border-radius: 10px;
}

/* .password-confirm-wrap,
.password-wrap {
  margin-top: 13px;
} */

.modify-input-wrap input {
  border: none;
  width: 465px;
  /* margin-top: 10px; */
  font-size: 14px;
  /* margin-left: 10px; */
  height: 55px;
  border-radius: 10px;
  padding: 10px;
  border: solid 1px var(--border-gray-color);
}

/* 아이디 CSS */
.modify-input-id-wrap {
  width: 465px;
  height: 55px;
  border-radius: 10px;
  display: flex;
  justify-content: space-between;
}

.modify-input-id-wrap input {
  width: 100%;
  border: none;
  /* margin-top: 10px; */
  font-size: 14px;
  /* margin-left: 10px; */
  padding: 10px;
  /* height: 55px; */
  border: solid 1px var(--border-gray-color);
  background: white;
  border-radius: 10px;
}

/* 이름 CSS */

.modify-name-form-tag {
  width: 465px;
  display: flex;
}

.modify-name-form-tag > h6 {
  margin-right: 90px;
}

.modify-name-form-input {
  display: flex;
}
/* 
.signup-input-wrap {
  justify-content: space-around;
} */
.modify-name-form-input > div {
  width: 155px;
}
.modify-name-form-input > div > input {
  width: 155px;
}

/* #input-id {
  width: 300px;
} */

/* #id-check-btn {
  width: 160px;
  height: 55px;
  font-size: 20px;
  background: var(--nalda-blue-color);
  color: white;
  border: solid 1px var(--nalda-blue-border-color);
  border-radius: 10px;
} */

/* 생년월일 CSS */
.birthdate-wrap {
  display: flex;
  width: 465px;
}

.modify-input-birth {
  width: 145px;
  height: 55px;
  border: none;
  border-radius: 10px;
}
.modify-input-birth input {
  border: none;
  width: 145px;
  padding: 10px;
  border: solid 1px var(--border-gray-color);
  border-radius: 10px;
}

/* .modify-input-birth {
  display: block;
  position: relative;
  width: 100%;
  height: 55px;
  background: white;
  box-sizing: border-box;
  border-radius: 10px;
}

#modify-birth-yy,
#modify-birth-mm,
#modify-birth-dd {
  width: 148px;
  height: 55px;
  border: none;
  padding: 10px;
  border: solid 1px var(--border-gray-color);
  border-radius: 10px;
}
#modify-birth-mm {
  outline: none;
  border: solid 1px var(--border-gray-color);
} */

/* 이메일 CSS */
.email-wrap {
  display: flex;
  width: 465px;
  align-items: center;
}

.modify-input-email {
  display: block;
  position: relative;
  width: 100%;
  height: 55px;
  background: white;
  box-sizing: border-box;
  border-radius: 10px;
}

#modify-email-id,
#modify-email {
  width: 145px;
  height: 55px;
  border: none;
  padding: 10px;
  border: solid 1px var(--border-gray-color);
  border-radius: 10px;
}
#modify-email-select {
  width: 145px;
  height: 55px;
  border: none;
  padding: 10px;
  border: solid 1px var(--border-gray-color);
  border-radius: 10px;
}

/* 성별 CSS */
.gender-wrap {
  width: 465px;
  display: flex;
  justify-content: space-between;
}

#gender-btn {
  width: 230px;
  height: 55px;
  font-size: 20px;
  background: var(--nalda-blue-color);
  color: white;
  border: solid 1px var(--nalda-blue-border-color);
  border-radius: 10px;
}

/* #modify-gender {
  border: none;
  width: 430px;
} */

/* 전화번호 CSS */
.mobile-num-wrap {
  width: 465px;
  display: flex;
  align-items: center;
}

.modify-mobile-num {
  display: block;
  position: relative;
  width: 100%;
  height: 55px;
  background: white;
  box-sizing: border-box;
  border-radius: 10px;
}

.mobile-num {
  width: 149.48px;
  border: none;
  height: 55px;
  border: none;
  padding: 10px;
  border: solid 1px var(--border-gray-color);
  border-radius: 10px;
}

/* 주소 CSS */

.postal-wrap {
  width: 465px;
  display: flex;
  height: 55px;
  border-radius: 10px;
  margin-bottom: 5px;
}

#postal-code {
  width: 400;
  border: solid 1px var(--border-gray-color);
  background: white;
  border-radius: 10px;
  padding: 10px;
}

#postal-check-btn {
  width: 100px;
  height: 55px;
  font-size: 20px;
  margin-left: 10px;
  background: var(--nalda-blue-color);
  color: white;
  border: solid 1px var(--nalda-blue-border-color);
  border-radius: 10px;
}

/* 직업 CSS */

#modify-job-select {
  width: 465px;
  height: 55px;
  border: none;
  padding: 10px;
  border: solid 1px var(--border-gray-color);
  border-radius: 10px;
}

/* 회원가입 버튼 CSS */

.modify-button-wrap {
  padding-top: 50px;
}

.modify-button-wrap button {
  width: 465px;
  height: 55px;
  font-size: 20px;
  background: var(--nalda-blue-color);
  color: white;
  border: solid 1px var(--nalda-blue-border-color);
  border-radius: 10px;
}
</style>
