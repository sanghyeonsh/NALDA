<template>
  <div class="main-container">
    <div class="main-container-box" @click="MoveOrders">
      <div class="main-container-box-image">
        <img src="/main/service.png" alt="service" />
      </div>
      <div class="box-image-name">서비스</div>
    </div>
    <div class="main-container-box" @click="MoveLogin">
      <div class="main-container-box-image">
        <img src="/main/custom_declaration.png" alt="custom_declaration" />
      </div>
      <div class="box-image-name">세관신고서</div>
    </div>
    <div class="main-container-box" @click="MoveTransportation">
      <div class="main-container-box-image">
        <img src="/main/airport_info.png" alt="airport_info" />
      </div>
      <div class="box-image-name">공항정보</div>
    </div>
  </div>
</template>

<script>
import { mapState, mapMutations } from 'vuex'

export default {
  name: 'TestPage',
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
    MoveLogin() {
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
  font-family: 'twayfly';
}
.main-container {
  display: flex;
  height: 70vh;
  width: 100vw;
}
.main-container-box {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
  height: 100%;
  width: 100%;
  padding: 70px;
}
.main-container-box-image {
  height: 45%;
  width: 70%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.main-container-box-image img {
  width: 100%;
  height: 100%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
}
.box-image-name {
  height: 20%;
  display: flex;
  justify-content: center;
  align-items: flex-end;
  font-size: 30px;
}
</style>
