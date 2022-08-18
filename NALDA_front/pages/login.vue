<template>
  <div class="login-main-container" @click="hideKeyboard">
    <div class="login-main-wrap">
      <!-- <header>
        <div class="sel-lang-wrap">
          <select class="lang-select">
            <option>Korean</option>
            <option>English</option>
          </select>
        </div>
      </header>-->
      <section class="login-input-section-wrap fadeInUp">
        <img class="logo" src="/logo.png" alt />
        <div class="login-input-wrap mb-3">
          <input
            v-model="flightNum"
            placeholder="항공편명"
            type="search"
            @focus="flightKeyOn"
            @blur="focusOut"
          />
        </div>
        <div class="login-input-wrap">
          <input
            v-model="userInfo.id"
            placeholder="사용자 아이디"
            type="text"
            @focus="usernameKeyOn"
            @blur="focusOut"
          />
        </div>
        <div class="login-input-wrap password-wrap">
          <input
            v-model="userInfo.password"
            placeholder="패스워드"
            type="password"
            @focus="pwdKeyOn"
            @blur="focusOut"
          />
        </div>
        <div class="login-button-wrap">
          <button @click="loginClick">로그인</button>
        </div>
        <div class="login-stay-sign-in" @click="$router.push('/user/termsuse')">
          <img class="login-icon-check mr-3" src="/icon/check_mark_w.png" alt="check-icon" />
          <span>회원가입</span>
        </div>
      </section>
      <b-modal id="login-modal" hide-footer>
        <template #modal-title>알림</template>
        <div class="d-block text-center">
          <h3>항공편명을 다시 확인해주세요.</h3>
        </div>
        <b-button class="mt-3" block @click="$bvModal.hide('login-modal')">닫기</b-button>
      </b-modal>
      <b-modal id="login-modal" hide-footer>
        <template #modal-title>알림</template>
        <div class="d-block text-center">
          <h3>일치하지 않는 정보가 있습니다.</h3>
        </div>
        <b-button class="mt-3" block @click="$bvModal.hide('login-modal')">닫기</b-button>
      </b-modal>
    </div>
    <div v-if="flightKeyboardView">
      <VirtualKeyboard ref="keyboard" theme="white-shadow" @getKeyValue="changeFlight"></VirtualKeyboard>
    </div>
    <div v-if="UsernameKeyboardView">
      <VirtualKeyboard ref="keyboard" theme="white-shadow" @getKeyValue="changeUsername"></VirtualKeyboard>
    </div>
    <div v-if="pwdKeyboardView">
      <VirtualKeyboard ref="keyboard" theme="white-shadow" @getKeyValue="changePwd"></VirtualKeyboard>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions, mapMutations, mapGetters } from 'vuex'
import VirtualKeyboard from '@/components/VirtualKeyboard'

export default {
  name: 'LoginUser',
  components: {
    VirtualKeyboard,
  },
  data() {
    return {
      userInfo: {
        id: null,
        password: null,
      },
      flightNum: '',
      flightKeyboardView: false,
      UsernameKeyboardView: false,
      pwdKeyboardView: false,
    }
  },
  computed: {
    ...mapState('user', ['loginMember']),
    ...mapGetters('user', ['isLogin']),
  },
  created() {
    this.CLEAR_LOGIN_MEMBER()
    this.CLEAR_MEMBER_DETAIL()
  },
  methods: {
    ...mapMutations('user', ['CLEAR_LOGIN_MEMBER', 'CLEAR_MEMBER_DETAIL']),
    ...mapActions('user', ['inputLogin']),
    loginClick() {
      const object = {
        id: this.userInfo.id,
        password: this.userInfo.password,
        flightNum: this.flightNum,
      }
      const promise = new Promise((resolve, reject) => {
        resolve()
      })
      promise.then(async () => {
        await this.inputLogin(object)
        if (this.loginMember === null) {
          this.$bvModal.show('login-modal')
        }
        if (this.loginMember.userRole === 'ROLE_USER') {
          this.$router.push('/main')
        }
        if (this.loginMember.userRole === 'ROLE_ATTENDANT') {
          this.$router.push('/attendant/main')
        }
      })
    },
    changeFlight(flightNum) {
      this.flightNum = flightNum
    },
    changeUsername(username) {
      this.userInfo.id = username
    },
    changePwd(pwd) {
      this.userInfo.password = pwd
    },
    hideKeyboard(e) {
      if (e.target.localName !== 'input' && e.y < 401) {
        this.flightKeyboardView = false
        this.UsernameKeyboardView = false
        this.pwdKeyboardView = false
      }
    },
    flightKeyOn() {
      this.flightKeyboardView = true
      this.UsernameKeyboardView = false
      this.pwdKeyboardView = false
    },
    usernameKeyOn() {
      this.flightKeyboardView = false
      this.UsernameKeyboardView = true
      this.pwdKeyboardView = false
    },
    pwdKeyOn() {
      this.pwdKeyboardView = true
      this.flightKeyboardView = false
      this.UsernameKeyboardView = false
    },
    focusOut() {
      this.$refs.keyboard?.clearArray()
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
.logo {
  width: 60%;
}
.login-main-container {
  width: 100%;
  height: 100vh;
  display: flex;
  flex-direction: column;
  align-items: center;
  overflow: scroll;
  background-color: rgb(69, 169, 200);
}

.login-main-container .login-main-wrap {
  width: 400px;
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
  /* padding-top: 32%;   */
  display: flex;
  flex-direction: column;
  align-items: center;
  /* margin-top: ; */
}

.login-input-section-wrap h2 {
  margin-bottom: 20%;
}

.guest-input-wrap,
.login-input-wrap {
  width: 500px;
  height: 90px;
  border: solid 1px var(--border-gray-color);
  background: white;
  border-radius: 30px;
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
  width: 500px;
  height: 90px;
  /* margin-top: 10px; */
  font-size: 20px;
  /* margin-left: 10px; */

  border-radius: 30px;
  padding: 10px;
}

.guest-button-wrap,
.login-button-wrap {
  padding-top: 13px;
}

.guest-button-wrap button,
.login-button-wrap button {
  width: 500px;
  height: 90px;
  font-size: 20px;
  background: #206e95;
  color: white;
  border: solid 1px var(--nalda-blue-border-color);
  border-radius: 30px;
}

.login-stay-sign-in {
  width: 500px;
  height: 90px;
  display: flex;
  font-size: 25px;
  color: #4e4e4e;
  align-items: center;
  justify-content: flex-end;
  margin-right: 3%;
  border-bottom: solid 1px var(--border-gray-color);
  color: white;
  cursor: pointer;
}

.login-stay-sign-in i {
  font-size: 25px;
  color: #9ba1a3;
}

.login-stay-sign-in span {
  /* padding-left: 5px; */
  line-height: 25px;
}
a {
  display: flex;
  align-items: center;
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
.login-icon-check {
  width: 30px;
  height: 30px;
  filter: drop-shadow(0 0 0 #ffffff);
}

.fadeInUp {
  animation: fadeInUp 1s ease backwards;
}
@keyframes fadeInUp {
  0% {
    transform: translate(0px, 100px);
    opacity: 0;
  }
  100% {
    transform: translate(0px, 0);
    opacity: 1;
  }
}
</style>
