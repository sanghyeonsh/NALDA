<template>
  <div class="main-index">
    <div class="main-container">
      <div class="main-container-box" @click="MoveOrders">
        <div>
          <img class="image" src="../../static/main/service.png" alt="service" />
          <h3>service</h3>
        </div>
      </div>
      <div class="main-container-box">
        <nuxt-link to="/user/login" style="text-decoration: none">
          <div>
            <img
              class="image"
              src="../../static/main/custom_declaration.png"
              alt="custom_declaration"
            />
            <h3>Custom Declaration</h3>
          </div>
        </nuxt-link>
      </div>
      <div class="main-container-box">
        <div>
          <img class="image" src="../../static/main/airport_info.png" alt="airport_info" />
          <h3>Airport Info</h3>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState } from 'vuex'
export default {
  name: 'MainIndex',
  components: {},
  computed: {
    ...mapState('user', ['loginMember']),
  },
  methods: {
    moveLogin() {
      console.loh('aaa')
      console.log(this.loginMember)
      if (this.loginMember === null) {
        this.$router.push('/user/login')
      } else {
        // 세관신고서 페이지로 바꿔야함
        this.$router.push('/main')
      }
    },
    MoveOrders() {
      this.$router.push('/main/service')
    },
  },
}
</script>

<style scoped>
.main-index {
  display: flex;
  flex-direction: column;
  height: 70vh;
}
.main-container {
  display: flex;
  height: 70vh;
}
.main-container-box {
  text-align: center;
  width: 33%;
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
