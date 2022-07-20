<template>
  <div>
    <div class="singup-main-container">
      <div class="singup-main-wrap">
        <header>
          <div class="sel-lang-wrap">
            <select class="lang-select">
              <option>Korean</option>
              <option>English</option>
            </select>
          </div>
        </header>
        <section class="signup-input-section-wrap">
          <h2>Sign up</h2>
          <div>
            <h6>아이디</h6>
            <div class="signup-input-id-wrap">
              <input id="input-id" placeholder="Username" type="text" />
              <input id="id-check-btn" type="button" value="아이디 중복 검사" />
            </div>
          </div>
          <div>
            <h6>비밀번호</h6>
            <div class="signup-input-wrap password-wrap">
              <input placeholder="Password" type="password" />
            </div>
          </div>
          <div>
            <h6>비밀번호 확인</h6>
            <div class="signup-input-wrap password-confirm-wrap">
              <input placeholder="Password" type="password" />
            </div>
          </div>
          <div>
            <h6>이름</h6>
            <div class="signup-input-wrap name-wrap">
              <input placeholder="name" type="text" />
            </div>
          </div>
          <div>
            <h6>생년월일</h6>
            <div class="birthdate-wrap">
              <div class="signup-input-birth">
                <input type="date" />
              </div>
              <!-- <div class="signup-input-birth">
                <input id="signup-birth-yy" type="text" placeholder="년(yyyy)" />
              </div>
              <div class="signup-input-birth" style="margin-left: 10px;">
                <select id="signup-birth-mm" class="selectbox" name="month" onchange>
                  <option value="month">월</option>
                  <option value="1">1</option>
                  <option value="2">2</option>
                  <option value="3">3</option>
                  <option value="4">4</option>
                  <option value="5">5</option>
                  <option value="6">6</option>
                  <option value="7">7</option>
                  <option value="8">8</option>
                  <option value="9">9</option>
                  <option value="10">10</option>
                  <option value="11">11</option>
                  <option value="12">12</option>
                </select>
              </div>
              <div class="signup-input-birth" style="margin-left: 10px;">
                <input id="signup-birth-dd" type="text" placeholder="일" />
              </div>-->
            </div>
          </div>
          <div>
            <h6>성별</h6>
            <div class="gender-wrap">
              <!-- <select id="signup-gender" class="selectbox" name="gender" onchange="">
                        <option value="gender">성별</option>
                        <option value="man">남자</option>
                        <option value="woman">여자</option>
                        <option value="no">선택 안함</option>
              </select>-->
              <div>
                <button id="gender-btn">남자</button>
              </div>
              <div>
                <button id="gender-btn">여자</button>
              </div>
            </div>
          </div>
          <div>
            <h6>이메일</h6>
            <div class="email-wrap">
              <div class="signup-input-email">
                <input id="signup-email-id" type="text" placeholder="이메일아이디" />
              </div>
              <h5>@</h5>
              <div class="signup-input-email">
                <input id="signup-email" type="text" placeholder="이메일주소" />
              </div>
              <div class="signup-input-email" style="margin-left: 10px;">
                <select id="signup-email-select" class="selectbox" name="email" onchange>
                  <option value="self">직접입력</option>
                  <option value="naver">naver.com</option>
                  <option value="gmail">gmail.com</option>
                  <option value="daum">daum.com</option>
                  <option value="hotmail">hotmail.com</option>
                </select>
              </div>
            </div>
          </div>
          <div>
            <h6>전화번호</h6>
            <div class="mobile-num-wrap">
              <div class="signup-mobile-num">
                <input id="mobile-num" type="text" placeholder="000" />
              </div>
              <h5>-</h5>
              <div class="signup-mobile-num">
                <input id="mobile-num" type="text" placeholder="0000" />
              </div>
              <h5>-</h5>
              <div class="signup-mobile-num">
                <input id="mobile-num" type="text" placeholder="0000" />
              </div>
            </div>
          </div>
          <div>
            <h6>주소</h6>
            <div class="address-wrap">
              <div class="postal-wrap">
                <input id="postal-code" placeholder="postal code" type="text" />
                <input id="postal-check-btn" type="button" value="주소검색" @click="find_Postcode()" />
              </div>
              <div class="signup-input-wrap">
                <input id="address" placeholder="address" type="text" />
              </div>
              <div class="signup-input-wrap" style="margin-top: 3px;">
                <input id="address-detail" placeholder="address detail" type="text" />
              </div>
            </div>
          </div>
          <div>
            <h6>여권번호</h6>
            <div class="signup-input-wrap passport-num-wrap">
              <input placeholder="passportnumber" type="text" />
            </div>
          </div>
          <div>
            <h6>직업</h6>
            <div class="signup-input-wrap job-wrap">
              <select id="signup-job-select" class="selectbox" name="job" onchange>
                <option value="student">학생</option>
                <option value="housewife">주부</option>
                <option value="soldier">군인</option>
                <option value="financial business">금융업</option>
                <option value="teacher ">교육계</option>
                <option value="IT">IT, 정보통신</option>
                <option value="commercial">광고</option>
                <option value="agriculture">농부</option>
                <option value="etc">기타</option>
              </select>
            </div>
          </div>

          <div class="signup-button-wrap">
            <button @click="moveMain">Sign up</button>
          </div>
          <!-- <div class="signup-stay-sign-in">
                    <i class="far fa-check-circle"></i>
                    <span>Sign up</span>
          </div>-->
        </section>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'SignUp',
  data() {
    return {
      // 주소 변수
      addr: '',
      // 참고항목 변수
      extraAddr: '',
    }
  },
  methods: {
    moveMain() {
      this.$router.push('/main')
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

body {
  background: var(--body-background-color);
}

.singup-main-container {
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: 21px;
}

.singup-main-container .singup-main-wrap {
  width: 768px;
}

.singup-main-container .singup-main-wrap .sel-lang-wrap .lang-select {
  width: 96px;
  height: 30px;
  color: var(--font-color);
  border: solid 1px var(--border-gray-color);
}

.singup-main-container .singup-main-wrap .logo-wrap {
  padding-top: 55px;
}

.singup-main-container .singup-main-wrap .logo-wrap img {
  width: 100px;
  height: 100px;
}

.singup-main-container .singup-main-wrap header .sel-lang-wrap {
  display: flex;
  justify-content: flex-end;
}

.singup-main-container .singup-main-wrap header .logo-wrap {
  display: flex;
  flex-direction: column;
  align-items: center;
}

/* 회원가입 input 대분류 CSS */

.signup-input-section-wrap {
  padding-top: 60px;
  padding-bottom: 60px;
  display: flex;
  flex-direction: column;
  align-items: center;
  background-color: var(--body-background-color);
  margin-top: 1%;
  margin-bottom: 1%;
}

.signup-input-section-wrap h2 {
  margin-bottom: 60px;
}

.signup-input-section-wrap h6 {
  margin-bottom: 3px;
  margin-top: 10px;
  text-align: left;
  font-size: small;
}

.signup-input-wrap {
  width: 465px;
  height: 48px;
  background: white;
  border-radius: 10px;
}

/* .password-confirm-wrap,
.password-wrap {
  margin-top: 13px;
} */

.signup-input-wrap input {
  border: none;
  width: 465px;
  /* margin-top: 10px; */
  font-size: 14px;
  /* margin-left: 10px; */
  height: 48px;
  border-radius: 10px;
  padding: 10px;
  border: solid 1px var(--border-gray-color);
}

/* 아이디 CSS */
.signup-input-id-wrap {
  width: 465px;
  height: 48px;
  border-radius: 10px;
  display: flex;
  justify-content: space-between;
}

.signup-input-id-wrap input {
  border: none;
  /* margin-top: 10px; */
  font-size: 14px;
  /* margin-left: 10px; */
  padding: 10px;
  height: 48px;
  border: solid 1px var(--border-gray-color);
  background: white;
  border-radius: 10px;
}

#input-id {
  width: 300px;
}

#id-check-btn {
  width: 160px;
  height: 48px;
  font-size: 18px;
  background: var(--nalda-blue-color);
  color: white;
  border: solid 1px var(--nalda-blue-border-color);
  border-radius: 10px;
}
/* 생년월일 CSS */
.birthdate-wrap {
  display: flex;
  width: 465px;
}

.signup-input-birth {
  width: 145px;
  height: 48px;
  border: none;
  border-radius: 10px;
}
.signup-input-birth input {
  border: none;
  width: 145px;
  padding: 10px;
  border: solid 1px var(--border-gray-color);
  border-radius: 10px;
}

/* .signup-input-birth {
  display: block;
  position: relative;
  width: 100%;
  height: 48px;
  background: white;
  box-sizing: border-box;
  border-radius: 10px;
}

#signup-birth-yy,
#signup-birth-mm,
#signup-birth-dd {
  width: 148px;
  height: 48px;
  border: none;
  padding: 10px;
  border: solid 1px var(--border-gray-color);
  border-radius: 10px;
}
#signup-birth-mm {
  outline: none;
  border: solid 1px var(--border-gray-color);
} */

/* 이메일 CSS */
.email-wrap {
  display: flex;
  width: 465px;
}
.signup-input-email {
  display: block;
  position: relative;
  width: 100%;
  height: 48px;
  background: white;
  box-sizing: border-box;
  border-radius: 10px;
}

#signup-email-id,
#signup-email {
  width: 145px;
  height: 48px;
  border: none;
  padding: 10px;
  border: solid 1px var(--border-gray-color);
  border-radius: 10px;
}
#signup-email-select {
  width: 145px;
  height: 48px;
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
  height: 48px;
  font-size: 18px;
  background: var(--nalda-blue-color);
  color: white;
  border: solid 1px var(--nalda-blue-border-color);
  border-radius: 10px;
}

/* #signup-gender {
  border: none;
  width: 430px;
} */

/* 전화번호 CSS */
.mobile-num-wrap {
  width: 465px;
  display: flex;
}

.signup-mobile-num {
  display: block;
  position: relative;
  width: 100%;
  height: 48px;
  background: white;
  box-sizing: border-box;
  border-radius: 10px;
}

#mobile-num {
  width: 149.48px;
  border: none;
  height: 48px;
  border: none;
  padding: 10px;
  border: solid 1px var(--border-gray-color);
  border-radius: 10px;
}

/* 주소 CSS */

.postal-wrap {
  width: 465px;
  display: flex;
  height: 48px;
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
  height: 48px;
  font-size: 18px;
  margin-left: 10px;
  background: var(--nalda-blue-color);
  color: white;
  border: solid 1px var(--nalda-blue-border-color);
  border-radius: 10px;
}

/* 직업 CSS */

#signup-job-select {
  width: 465px;
  height: 48px;
  border: none;
  padding: 10px;
  border: solid 1px var(--border-gray-color);
  border-radius: 10px;
}

/* 회원가입 버튼 CSS */

.signup-button-wrap {
  padding-top: 50px;
}

.signup-button-wrap button {
  width: 465px;
  height: 48px;
  font-size: 18px;
  background: var(--nalda-blue-color);
  color: white;
  border: solid 1px var(--nalda-blue-border-color);
  border-radius: 10px;
}
</style>