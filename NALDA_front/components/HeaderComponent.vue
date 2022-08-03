<template>
  <div class="header-container">
    <div class="header-container-blank"></div>
    <div class="header-container-image">
      <img src="../static/logo.png" @click="MoveMain" />
    </div>
    <!-- <div @click="MoveSignup">
      signup
    </div>-->
    <div class="header-container-userprofile" @click="MoveMypage">
      <div class="profile-img">
        <img src="../static/main/user_profile_w.png" alt="profile-img" />
      </div>
      <div class="profile-name">{{ fullname }}</div>
    </div>
  </div>
</template>

<script>
import { mapState } from 'vuex'

export default {
  name: 'HeaderComponent',
  computed: {
    ...mapState('user', ['loginMember']),
    fullname() {
      if (this.loginMember == null) return '비회원'
      let fullname = ''
      this.loginMember.fullName.firstName &&
        (fullname += this.loginMember.fullName.firstName)
      this.loginMember.fullName.middleName &&
        (fullname += this.loginMember.fullName.middleName)
      this.loginMember.fullName.lastName &&
        (fullname += this.loginMember.fullName.lastName)
      return fullname
    },
  },
  methods: {
    MoveMain() {
      this.$router.push('/main')
    },
    MoveSignup() {
      this.$router.push('user/signup')
    },
    MoveMypage() {
      if (this.loginMember != null) {
        this.$router.push('/user/mypage')
      } else {
        this.$router.push('/user/login')
      }
    },
  },
}
</script>

<style scoped>
.header-container {
  display: flex;
  width: 100vw;
  height: 15vh;
  background-color: rgb(69, 169, 200);
}
.header-container-blank {
  width: 20%;
}
.header-container-image {
  width: 80%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.header-container-image img {
  width: 13%;
  height: 100%;
}

.header-container-userprofile {
  width: 20%;
  display: flex;
  align-items: center;
  color: azure;
  cursor: pointer;
}
.profile-img {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: flex-end;
  align-items: center;
}
.profile-img img {
  width: 50%;
  height: 50%;
}
.profile-name {
  width: 50%;
  display: flex;
  justify-content: flex-start;
  align-items: center;
  font-size: 30px;
}
</style>
