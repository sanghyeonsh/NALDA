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
        <h2>Member</h2>
        <div class="login-input-wrap">
          <input v-model="userInfo.id" placeholder="Username" type="text" />
        </div>
        <div class="login-input-wrap password-wrap">
          <input
            v-model="userInfo.password"
            placeholder="Password"
            type="password"
          />
        </div>
        <div class="login-button-wrap">
          <button @click="loginClick">Sign in</button>
        </div>
        <div class="login-stay-sign-in">
          <nuxt-link to="/user/termsuse" style="text-decoration: none">
            <i class="far fa-check-circle"></i>
            <span>Sign up</span>
          </nuxt-link>
        </div>
      </section>
      <!-- <section class="non-member-wrap">
      <h2>Guest</h2>-->
      <!-- <div class="guest-input-list">
                    <li><button><i class="fas fa-qrcode"></i><span>Sign in with QR code</span></button></li>
                    <li><button><i class="fab fa-facebook-square"></i><span>Facebook</span></button></li>
                    <li><button><i class="fab fa-line"></i><span>line</span></button></li>
      </div>-->
      <!-- <section class="guest-input-section-wrap">
            <div class="guest-input-wrap">
              <input placeholder="Username" type="text" />
            </div>
            <div class="guest-input-wrap password-wrap">
              <input placeholder="Password" type="password" />
            </div>
            <div class="guest-button-wrap">
              <button>Use as guest</button>
            </div>
          </section>
          <p class="forget-msg">Forgot your Username or Password? | Sign up</p>
      </section>-->
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
    loginClick() {
      this.inputLogin(this.userInfo)
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
  /* font-family: 'twayfly'; */
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
