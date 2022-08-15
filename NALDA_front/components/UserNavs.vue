<template>
  <div class="usernav-container">
    <header class="profile-wrap">
      <div class="thumb-wrapper stagger-item">
        <img class="thumb" src="/main/user_profile_w.png" />
        <!-- <div class="badge">7</div> -->
      </div>

      <div class="text-area">
        <h3 class="greeting stagger-item">{{ fullname }}</h3>
      </div>

      <div class="modify mouse-effect stagger-item" @click="moveModify">
        <button>회원 정보 수정</button>
      </div>
    </header>
    <ul class="list">
      <li class="item mouse-effect stagger-item" @click="moveAccountInfo">
        <div class="left">
          <i class="fa-solid fa-user"></i>
          <div class="name">회원 정보</div>
        </div>
        <div class="right">
          <i class="fa-solid fa-chevron-right"></i>
        </div>
      </li>

      <li class="item mouse-effect stagger-item" @click="movecustomList">
        <div class="left">
          <i class="fa-solid fa-suitcase-rolling"></i>
          <div class="name">세관신고서 목록</div>
        </div>
        <div class="right">
          <i class="fa-solid fa-chevron-right"></i>
        </div>
      </li>
    </ul>
  </div>
</template>

<script>
import { mapState } from 'vuex'

export default {
  name: 'UserNavs',
  components: {},
  computed: {
    ...mapState('user', ['loginMember']),
    fullname() {
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
    moveModify() {
      this.$router.push({ name: 'user-modify' })
    },
    moveAccountInfo() {
      this.$router.push('/user/mypage')
    },
    movecustomList() {
      this.$router.push('/user/custom')
    },
  },
}
</script>

<style scoped>
:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
  --nalda-background-blue-color: #45a9c8;
}

.usernav-container {
  /* position: fixed; */
  background-color: var(--nalda-blue-color);
  /* background-color: red; */
  color: #ffe6cf;
  height: 70vh;
  width: 30%;
  margin-left: 0;
}
.profile-wrap {
  padding: 14% 12%;
}

/* body {
  margin: 0;
  font-family: 'Helvetica Neue', -apple-system, BlinkMacSystemFont, 'Segoe UI',
    Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', sans-serif;
  background-color: var(--nalda-blue-color);
  color: #ffe6cf;
  font-size: 11px;
  line-height: 1.4;
  font-weight: 500;
  overflow-x: hidden;
  margin-bottom: 72px;
} */

h2 {
  margin: 0;
  font-weight: 400;
  line-height: 1;
  font-size: 24px;
}

ul,
li {
  margin: 0;
  padding: 0;
}

li {
  list-style: none;
}

.usernav-container button {
  background-color: transparent;
  border: none;
  outline: none;
  color: #ffe6cf;
  font-size: 1em;
}

.mouse-effect {
  width: 100%;
  height: 100%;
  position: relative;
  overflow: hidden;
}

.mouse-effect:after {
  content: '';
  position: absolute;
  width: 100%;
  height: 100%;
  left: 0;
  top: 0;
  transition: 0.2s;
}

.mouse-effect:hover:after {
  background-color: rgba(0, 0, 0, 0.08);
}

.mouse-effect:active:after {
  background-color: rgba(0, 0, 0, 0.12);
  transition: 0s;
}

/* 헤더 */
header {
  text-align: center;
}

header .thumb {
  width: 30%;
  height: 30%;
  border-radius: 50%;
  box-shadow: 0 6px 12px 0 rgba(0, 0, 0, 0.1), 0 12px 24px 0 rgba(0, 0, 0, 0.24);
}

header .thumb-wrapper {
  position: relative;
  display: inline-block;
  /* margin-bottom: 3%; */
}

/* msg 기능이 생긴다면 */
/* header .badge {
  width: 28px;
  height: 28px;
  font-size: 12px;
  position: absolute;
  background-color: #ff5500;
  border-radius: 50%;
  top: 0;
  right: -8px;
  display: flex;
  justify-content: center;
  align-items: center; */
/* animation */
/* animation: scaleUp 0.5s;
  animation-timing-function: cubic-bezier(0.175, 0.885, 0.32, 1.275);
  animation-fill-mode: both;
  animation-delay: 0.5s;
} */

header .greeting {
  /* margin-bottom: 5%; */
  margin-top: 5%;
  font-size: 1.3em;
}

header .desc {
  font-size: 1em;
}

header .modify {
  /* padding: 1% 2% 1% 2%; */
  background-color: rgba(0, 0, 0, 0.05);
  display: inline-block;
  border-radius: 20px;
  box-shadow: inset 0 0 0 1px rgba(0, 0, 0, 0.08);
  margin-top: 5%;
  cursor: pointer;
}

/* 리스트 */
.list {
  /* margin-top: 8%; */
  padding-bottom: auto;
}

.list .item {
  height: 10vh;
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 1px solid rgba(0, 0, 0, 0.08);
  font-size: 1em;
  cursor: pointer;
}

.list .item .left {
  display: flex;
  align-items: center;
}

.list .item .left .name {
  /* margin-left: 6px; */
}

.list .item .right {
  opacity: 0.5;
}

/* 이부분 수정 필요 */
.list .item i {
  padding: 20px 22px;
}

.list .item .right img {
  padding-right: 1%;
}
</style>
