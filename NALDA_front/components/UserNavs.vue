<template>
  <div>
    <div class="usernav-container">
      <header class="profile-wrap">
        <div class="thumb-wrapper stagger-item">
          <img class="thumb" src="../static/user_profile_w.png" />
          <!-- <div class="badge">7</div> -->
        </div>

        <div class="text-area">
          <h2 class="greeting stagger-item">Hi, Anonymous-Ku</h2>
          <div class="desc stagger-item">
            Fly with nalda
            <br />Nearest Airser-Line Service during in Airbus
          </div>
        </div>

        <div class="modify mouse-effect stagger-item" @click="moveModify">
          <div>modify</div>
        </div>
      </header>

      <ul class="list">
        <li class="item mouse-effect stagger-item">
          <div class="left">
            <i class="fa-solid fa-bookmark"></i>
            <div class="name">Bookmark</div>
          </div>
          <div class="right">
            <i class="fa-solid fa-chevron-right"></i>
          </div>
        </li>

        <li class="item mouse-effect stagger-item">
          <div class="left">
            <img src="img/icon/account.svg" />
            <div class="name">Account Info</div>
          </div>
          <div class="right">
            <i class="fa-solid fa-chevron-right"></i>
          </div>
        </li>

        <li class="item mouse-effect stagger-item">
          <div class="left">
            <img src="img/icon/business.svg" />
            <div class="name">Past Journey</div>
          </div>
          <div class="right">
            <i class="fa-solid fa-chevron-right"></i>
          </div>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: 'UserNavs',
  components: {},
  methods: {
    moveModify() {
      this.$router.push({ name: 'user-modify' })
    },
  },
}
</script>

<style >
:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
  --nalda-background-blue-color: #45a9c8;
}

.usernav-container {
  background-color: var(--nalda-blue-color);
  color: #ffe6cf;
  height: 700px;
}
.profile-wrap {
  padding: 80px 40px;
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

button {
  background-color: transparent;
  border: none;
  outline: none;
  color: #ffe6cf;
  font-size: 15px;
}

.mouse-effect {
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
  width: 92px;
  height: 92px;
  border-radius: 50%;
  box-shadow: 0 6px 12px 0 rgba(0, 0, 0, 0.1), 0 12px 24px 0 rgba(0, 0, 0, 0.24);
}

header .thumb-wrapper {
  position: relative;
  display: inline-block;
  margin-bottom: 36px;
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
  margin-bottom: 10px;
}

header .modify {
  padding: 8px 22px 10px 22px;
  background-color: rgba(0, 0, 0, 0.05);
  display: inline-block;
  border-radius: 20px;
  box-shadow: inset 0 0 0 1px rgba(0, 0, 0, 0.08);
  margin-top: 18px;
}

/* 리스트 */
.list {
  margin-top: 48px;
  padding-bottom: 30px;
}

.list .item {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 1px solid rgba(0, 0, 0, 0.08);
  font-size: 15px;
}

.list .item .left {
  display: flex;
  align-items: center;
}

.list .item .left .name {
  margin-left: 6px;
}

.list .item .right {
  opacity: 0.5;
}

/* 이부분 수정 필요 */
.list .item i {
  padding: 20px 22px;
}

.list .item .right img {
  padding-right: 14px;
}
</style>