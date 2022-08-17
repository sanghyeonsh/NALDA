<template>
  <div class="init-screen" @click="moveMain">
    <img class="logo" src="/logo.png" />
  </div>
</template>

<script>
import { mapMutations } from 'vuex'
export default {
  name: 'MainPage',
  created() {
    this.CLEAR_LOGIN_MEMBER()
    this.CLEAR_SEATINFO()
    this.CLEAR_MEMBER_DETAIL()
    this.CLEAR_FLIGHTNUM()
  },
  methods: {
    ...mapMutations('user', [
      'CLEAR_LOGIN_MEMBER',
      'CLEAR_MEMBER_DETAIL',
      'CLEAR_SEATINFO',
      'CLEAR_FLIGHTNUM',
    ]),
    moveMain() {
      this.$router.push('/login')
    },
  },
}
</script>

<style scoped>
.logo {
  cursor: pointer;
}
::-webkit-scrollbar {
  display: none;
}
.init-screen {
  height: 100vh;
  display: flex;
  background-color: rgb(69, 169, 200);
  justify-content: center;
  align-items: center;
}
body {
  cursor: none;
}
</style>
