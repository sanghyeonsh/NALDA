<template>
  <div>
    <div class="customform-nav-container">
      <header class="user-profile-wrap">
        <div class="thumb-wrapper stagger-item">
          <img class="thumb" src="/main/user_profile_w.png" />
          <!-- <div class="badge">7</div> -->
        </div>

        <div class="text-area">
          <h2 class="greeting-msg stagger-item">Hi, Anonymous-Ku</h2>
          <div class="desc stagger-item">
            Fly with nalda
            <br />Nearest Airser-Line Service during in Airbus
          </div>
        </div>
      </header>

      <ul class="step-list">
        <li class="item mouse-effect stagger-item" @click="moveAccountInfo">
          <div class="left">
            <i class="fa-solid fa-user"></i>
            <div class="name">First Step</div>
            <div>기본정보를 입력하는 단계입니다.</div>
          </div>
          <div class="right">
            <i class="fa-solid fa-chevron-right"></i>
          </div>
        </li>
        <li class="next-steps">쩜쩜</li>
        <li class="item mouse-effect stagger-item" @click="movecustomList">
          <div class="left">
            <i class="fa-solid fa-suitcase-rolling"></i>
            <div class="name">Second Step</div>
            <div>신고사항을 입력하는 단계입니다.</div>
          </div>
          <div class="right">
            <i class="fa-solid fa-chevron-right"></i>
          </div>
        </li>
        <li class="next-steps">쩜쩜</li>
        <li class="item mouse-effect stagger-item">
          <div class="left">
            <i class="fa-solid fa-bookmark"></i>
            <div class="name">Sign and confirm</div>
            <div>서명 하는 단계입니다.</div>
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
  name: 'PageTest',
  methods: {},
}
</script>

<style scoped>
.customform-nav-container {
  background-color: #206e95;
  color: #ffe6cf;
  height: auto;
  width: auto;
  margin-left: 0;
}
.user-profile-wrap {
  padding: 80px 40px;
}

/* body {
  margin: 0;
  font-family: 'Helvetica Neue', -apple-system, BlinkMacSystemFont, 'Segoe UI',
    Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', sans-serif;
  background-color: #206e95;
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

.customform-nav-container button {
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

header .greeting-msg {
  margin-bottom: 10px;
}

/* 리스트 */
.step-list {
  margin-top: 48px;
  padding-bottom: 30px;
}

.step-list .item {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 1px solid rgba(0, 0, 0, 0.08);
  font-size: 15px;
  cursor: pointer;
}

.step-list .item .left {
  display: flex;
  align-items: center;
}

.step-list .item .left .name {
  margin-left: 6px;
}

.step-list .item .right {
  opacity: 0.5;
}

/* 이부분 수정 필요 */
.step-list .item i {
  padding: 20px 22px;
}

.step-list .item .right img {
  padding-right: 14px;
}

.step-list .next-steps {
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 15px;
  cursor: pointer;
}
</style>
