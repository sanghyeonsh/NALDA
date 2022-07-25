<template>
  <div id="header">
    <div class="tmp"></div>
    <img class="logo" src="../static/logo.png" @click="MoveMain" />
    <!-- <div @click="MoveSignup">
      signup
    </div>-->
    <div class="userprofile-wrap" @click="MoveMypage">
      <img
        class="profile-img"
        src="../static/main/user_profile_w.png"
        alt="profile-img"
      />
      <h3>user</h3>
    </div>
  </div>
</template>

<script>
export default {
  name: 'HeaderComponent',
  methods: {
    MoveMain() {
      this.$router.push('/main')
    },
    MoveSignup() {
      this.$router.push('user/signup')
    },
    MoveMypage() {
      this.$router.push('/user/mypage')
    },
  },
}
</script>

<style scoped>
.logo {
  width: 8%;
  justify-content: center;
  cursor: pointer;
}

#header {
  display: flex;
  flex-direction: row;
  width: 100%;
  height: 15vh;
  /* background-color: rgb(136, 192, 197); */
  background-color: rgb(69, 169, 200);
  justify-content: space-between;
  align-items: center;
}

.userprofile-wrap {
  width: 8%;
  display: flex;
  flex-direction: row;
  align-items: center;
  color: azure;
  cursor: pointer;
}
.tmp {
  width: 8%;
}
.profile-img {
  width: 30%;
  height: 30%;
}
</style>
