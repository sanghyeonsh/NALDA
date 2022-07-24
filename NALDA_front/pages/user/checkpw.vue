<template>
  <div>
    <div class="main-container">
      <div class="main-wrap">
        <header>
          <div class="sel-lang-wrap">
            <select class="lang-select">
              <option>Korean</option>
              <option>English</option>
            </select>
          </div>
          <!-- <div class="logo-wrap">
                      <img src="../../static/logo.png" />
          </div>-->
        </header>
        <section class="user-input-section-wrap">
          <h2>My Page</h2>
          <div class>
            <p class="chk-msg">
              개인 정보 조회를 위해서는 인증이 필요합니다. 비밀번호 입력 후 확인
              버튼을 클릭해 주세요.
            </p>
            <div class="user-input-wrap">
              <input placeholder="Username" type="text" disabled />
            </div>
            <div class="user-input-wrap password-wrap">
              <input placeholder="Password" type="password" />
            </div>
            <div>
              <h6 class="wrong-pw">비밀 번호를 다시 입력해 주세요.</h6>
            </div>
            <div class="user-button-wrap">
              <button>확인</button>
            </div>
          </div>
        </section>

        <!-- <footer>
          <div class="copyright-wrap">
            <div>
              <span>Copyright © NALDA Corp. All Rights Reserved.</span>
            </div>
          </div>
        </footer>-->
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'CheckPassword',
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

.main-container {
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: 21px;
}

.main-container .main-wrap {
  width: 768px;
}

.main-container .main-wrap .sel-lang-wrap .lang-select {
  width: 96px;
  height: 30px;
  color: var(--font-color);
  border: solid 1px var(--border-gray-color);
}

.main-container .main-wrap .logo-wrap {
  padding-top: 55px;
}

.main-container .main-wrap .logo-wrap img {
  width: 100px;
  height: 100px;
}

.main-container .main-wrap header .sel-lang-wrap {
  display: flex;
  justify-content: flex-end;
}

.main-container .main-wrap header .logo-wrap {
  display: flex;
  flex-direction: column;
  align-items: center;
}

/* user input 대분류 CSS */

.user-input-section-wrap {
  padding-top: 60px;
  display: flex;
  flex-direction: column;
  align-items: center;
}

/* check msg */
.chk-msg {
  width: 465px;
}

.user-input-section-wrap h2 {
  margin-bottom: 60px;
}

.user-input-wrap {
  width: 465px;
  height: 48px;
  border: solid 1px var(--border-gray-color);
  background: white;
  border-radius: 10px;
  /* padding: 10px; */
}

.password-wrap {
  margin-top: 13px;
}

.user-input-wrap input {
  border: none;
  width: 465px;
  /* margin-top: 10px; */
  font-size: 14px;
  /* margin-left: 10px; */
  padding: 10px;
  border: solid 1px var(--border-gray-color);
  height: 48px;
  border-radius: 10px;
}

/* wrong-pw CSS*/
.wrong-pw {
  font-size: smaller;
  margin: 10px;
  /* justify-content: start;
  안먹는다,,, ㅠ3ㅠ  */
}

.user-button-wrap {
  padding-top: 13px;
}

.user-button-wrap button {
  width: 465px;
  height: 48px;
  font-size: 18px;
  background: var(--nalda-blue-color);
  color: white;
  border: solid 1px var(--nalda-blue-border-color);
  border-radius: 10px;
}

footer {
  padding-top: 95px;
  padding-bottom: 15px;

  display: flex;
  flex-direction: column;
  align-items: center;
  width: 768px;
}

.copyright-wrap {
  display: flex;
  flex-direction: column;
  align-items: center;
  height: 15px;
}

footer .copyright-wrap div img {
  width: 50px;

  height: 50px;
}

footer .copyright-wrap span {
  font-size: 13px;
  line-height: 15px;
}
</style>
