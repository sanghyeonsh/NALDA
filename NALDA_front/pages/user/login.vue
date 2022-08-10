<template>
  <div class="login-main-container">
    <div class="login-main-wrap">
      <header>
        <div class="sel-lang-wrap">
          <select class="lang-select">
            <option>Korean</option>
            <option>English</option>
          </select>
        </div>
      </header>
      <section class="login-input-section-wrap">
        <h2>로그인 창</h2>
        <div class="login-input-wrap mb-3">
          <input v-model="flightNum" placeholder="항공편명" type="text" />
        </div>
        <div class="login-input-wrap">
          <input
            v-model="userInfo.id"
            placeholder="사용자 아이디"
            type="text"
          />
        </div>
        <div class="login-input-wrap password-wrap">
          <input
            v-model="userInfo.password"
            placeholder="패스워드"
            type="password"
          />
        </div>
        <div class="login-button-wrap">
          <button @click="loginClick">로그인</button>
        </div>
        <div class="login-stay-sign-in">
          <nuxt-link to="/user/termsuse" style="text-decoration: none">
            <i class="far fa-check-circle"></i>
            <span>회원가입</span>
          </nuxt-link>
        </div>
      </section>
      <b-modal id="login-modal" hide-footer>
        <template #modal-title>알림</template>
        <div class="d-block text-center">
          <h3>항공편명을 다시 확인해주세요.</h3>
        </div>
        <b-button class="mt-3" block @click="$bvModal.hide('login-modal')"
          >Close Me</b-button
        >
      </b-modal>
      <b-modal id="login-modal" hide-footer>
        <template #modal-title>알림</template>
        <div class="d-block text-center">
          <h3>아이디 또는 패스워드가 일치하지 않습니다.</h3>
        </div>
        <b-button class="mt-3" block @click="$bvModal.hide('login-modal')"
          >Close Me</b-button
        >
      </b-modal>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions, mapMutations } from 'vuex'
export default {
  name: 'LoginUser',
  data() {
    return {
      userInfo: {
        id: null,
        password: null,
      },
      flightNum: '',
    }
  },
  computed: {
    ...mapState('user', ['loginMember']),
  },
  created() {
    this.CLEAR_LOGIN_MEMBER()
    this.CLEAR_MEMBER_DETAIL()
  },
  methods: {
    ...mapMutations('user', ['CLEAR_LOGIN_MEMBER', 'CLEAR_MEMBER_DETAIL']),
    ...mapActions('user', ['inputLogin']),
    async loginClick() {
      await this.inputLogin(this.userInfo)
      if (this.loginMember === null) {
        this.$bvModal.show('login-modal')
      }
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

body {
  background: var(--body-background-color);
}

.login-main-container {
  width: 100%;
  height: 70vh;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.login-main-container .login-main-wrap {
  width: 465px;
  height: 100%;
}

.login-main-container .login-main-wrap .sel-lang-wrap .lang-select {
  width: 96px;
  height: 30px;
  color: var(--font-color);
  border: solid 1px var(--border-gray-color);
}

.login-main-container .login-main-wrap header .sel-lang-wrap {
  display: flex;
  justify-content: flex-end;
  margin-top: 2%;
}

.login-main-container .login-main-wrap header .logo-wrap {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.guest-input-section-wrap,
.login-input-section-wrap {
  padding-top: 16%;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.login-input-section-wrap h2 {
  margin-bottom: 20%;
}

.guest-input-wrap,
.login-input-wrap {
  width: 465px;
  height: 55px;
  border: solid 1px var(--border-gray-color);
  background: white;
  border-radius: 10px;
}
input[type='password'] {
  font-family: '맑은고딕', '돋움';
}
input[type='password']::placeholder {
  font-family: 'twayfly';
}
.password-wrap {
  margin-top: 13px;
}
.guest-input-wrap input,
.login-input-wrap input {
  border: none;
  width: 462px;
  /* margin-top: 10px; */
  font-size: 20px;
  /* margin-left: 10px; */
  height: 53px;
  border-radius: 10px;
  padding: 10px;
}

.guest-button-wrap,
.login-button-wrap {
  padding-top: 13px;
}

.guest-button-wrap button,
.login-button-wrap button {
  width: 465px;
  height: 55px;
  font-size: 20px;
  background: var(--nalda-blue-color);
  color: white;
  border: solid 1px var(--nalda-blue-border-color);
  border-radius: 10px;
}

.login-stay-sign-in {
  width: 465px;
  height: 52px;
  display: flex;
  font-size: 25px;
  color: #4e4e4e;
  align-items: center;
  justify-content: flex-start;
  border-bottom: solid 1px var(--border-gray-color);
}

.login-stay-sign-in i {
  font-size: 25px;
  color: #9ba1a3;
}

.login-stay-sign-in span {
  padding-left: 5px;
  line-height: 25px;
}

.non-member-wrap {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding-top: 40px;
}

.non-member-wrap .forget-msg {
  color: var(--font-color);
  font-size: 14px;
  padding-top: 10px;
}
</style>
