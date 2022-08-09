<template>
  <div class="header-container">
    <div class="header-container-blank"></div>
    <div class="header-container-image">
      <img src="/logo.png" @click="MoveMain" />
    </div>
    <!-- <div @click="MoveSignup">
      signup
    </div>-->

    <div class="header-container-userprofile" @click="MoveMypage">
      <div class="profile-back">
        <img
          class="previous-icon"
          src="/main/previous.png"
          alt=""
          @click="Movefrom"
        />
      </div>
      <div class="profile-img">
        <img src="/main/user_profile_w.png" alt="profile-img" />
      </div>
      &nbsp;&nbsp;&nbsp;
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
    Movefrom() {
      this.$router.push(this.$nuxt.context.from.path)
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
.header-container {
  display: flex;
  align-items: center;
  width: 100vw;
  height: 15vh;
  background-color: rgb(69, 169, 200);
}
.header-container-blank {
  width: 20%;
}
.header-container-image {
  width: 80%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-container-image img {
  width: 13%;
  height: 100%;
  cursor: pointer;
}

.header-container-userprofile {
  width: 20%;
  display: flex;
  align-items: center;
  color: azure;
  cursor: pointer;
}

.profile-back {
  height: 100%;
  width: 20%;
}
.previous-icon {
  width: 100%;
  height: 100%;
}

.profile-img {
  width: 30%;
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
  height: 100%;
  display: flex;
  justify-content: flex-start;
  align-items: center;
  font-size: 30px;
}
</style>
