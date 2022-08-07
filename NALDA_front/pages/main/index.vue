<template>
  <div class="main-container">
    <div class="main-container-box" @click="MoveOrders">
      <div>
        <img class="image" src="/main/service.png" alt="service" />
        <h3>서비스</h3>
      </div>
    </div>
    <div class="main-container-box">
      <nuxt-link :to="isLogin" style="text-decoration: none">
        <div>
          <img
            class="image"
            src="/main/custom_declaration.png"
            alt="custom_declaration"
          />
          <h3>세관신고서</h3>
        </div>
      </nuxt-link>
    </div>
    <div class="main-container-box" @click="MoveTransportation">
      <div>
        <img class="image" src="/main/airport_info.png" alt="airport_info" />
        <h3>공항정보</h3>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState, mapMutations } from 'vuex'

export default {
  name: 'MainIndex',
  components: {},
  computed: {
    ...mapState('user', ['loginMember']),
    isLogin() {
      if (this.loginMember === null) return '/user/login'
      return '/customs/thirdparty'
    },
  },
  created() {
    this.CLEAR_DECLARATION()
    this.getIP()
  },
  methods: {
    ...mapMutations('customdeclaration', ['CLEAR_DECLARATION']),
    moveLogin() {
      if (this.loginMember === null) {
        this.$router.push('/user/login')
      } else {
        // 세관신고서 페이지로 바꿔야함
        this.$router.push('/customs/thirdparty')
      }
    },
    MoveOrders() {
      if (this.loginMember === null) {
        this.$router.push('/user/login')
      } else {
        this.$router.push('/main/service')
      }
    },
    MoveTransportation() {
      this.$router.push('/transportation')
    },
    getIP() {
      const localIpAddress = require('local-ip-address')

      console.log(localIpAddress())
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
/* .main-index {
  display: flex;
  flex-direction: column;
  height: 70vh;
} */
.main-container {
  display: flex;
  height: 70vh;
}
.main-container-box {
  text-align: center;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.main-container-box img {
  width: 70%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  /* filter: opacity(0.5) drop-shadow(#206e95); */
}
.main-container-box h3 {
  margin-top: 5vh;
}

.main-container-box div {
  padding: 7vh;
}
</style>
