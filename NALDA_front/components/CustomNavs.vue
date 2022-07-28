<template>
  <div>
    <div class="customform-nav-container">
      <ul class="step-list">
        <li class="item mouse-effect stagger-item" @click="moveInformStep">
          <div class="left">
            <i class="fa-solid fa-user"></i>
            <div class="name">before start</div>
            <div>유의사항</div>
          </div>
          <div class="right">
            <i class="fa-solid fa-chevron-right"></i>
          </div>
        </li>

        <div class="right-mid">
          <i class="fa-solid fa-chevron-right"></i>
        </div>

        <li class="item mouse-effect stagger-item" @click="moveFirstStep">
          <div class="left">
            <i class="fa-solid fa-user"></i>
            <div class="name">First Step</div>
            <div>기본정보를 입력하는 단계입니다.</div>
          </div>
          <div class="right">
            <i class="fa-solid fa-chevron-right"></i>
          </div>
        </li>
        <div class="right-mid">
          <i class="fa-solid fa-chevron-right"></i>
        </div>
        <li class="item mouse-effect stagger-item" @click="moveSecondStep1">
          <div class="left">
            <i class="fa-solid fa-suitcase-rolling"></i>
            <div class="name">Second Step1</div>
            <div>신고사항을 입력하는 단계입니다.</div>
          </div>
          <div class="right">
            <i class="fa-solid fa-chevron-right"></i>
          </div>
        </li>
        <div class="right-mid">
          <i class="fa-solid fa-chevron-right"></i>
        </div>
        <li class="item mouse-effect stagger-item" @click="moveSecondStep2">
          <div class="left">
            <i class="fa-solid fa-suitcase-rolling"></i>
            <div class="name">Second Step2</div>
            <div>신고사항을 입력하는 단계입니다.</div>
          </div>
          <div class="right">
            <i class="fa-solid fa-chevron-right"></i>
          </div>
        </li>
        <div class="right-mid">
          <i class="fa-solid fa-chevron-right"></i>
        </div>
        <li class="item mouse-effect stagger-item">
          <div class="left">
            <i class="fa-solid fa-bookmark"></i>
            <div class="name">detail</div>
            <div>상세신고사항을 작성하는 단계입니다.</div>
          </div>
          <div class="right">
            <i class="fa-solid fa-chevron-right"></i>
          </div>
        </li>
        <div class="right-mid">
          <i class="fa-solid fa-chevron-right"></i>
        </div>
        <li class="item mouse-effect stagger-item">
          <div class="left">
            <i class="fa-solid fa-bookmark"></i>
            <div class="name">complete</div>
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
  name: 'CustomNavs',
  props: {
    basicInfo: {},
  },
  data() {
    return {}
  },
  computed: {},
  methods: {
    moveInformStep() {
      this.$router.push('/customs/inform')
    },
    moveFirstStep() {
      this.$router.push('/customs/basic')

      console.log(1)
    },
    moveSecondStep1() {
      this.$router.push('/customs/checkone')
      console.log(this.basicInfo)
    },
    moveSecondStep2() {
      this.$router.push('/customs/checktwo')
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

.customform-nav-container {
  background-color: #206e95;
  color: #ffe6cf;
  height: auto;
  width: auto;
  margin-left: 0;
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

/* 리스트 */
.step-list {
  /* margin-top: 48px; */
  padding-top: 42%;
  padding-bottom: 42%;
  width: 100%;
  height: 100%;
}

.step-list .item {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 1px solid rgba(0, 0, 0, 0.08);
  font-size: 15px;
  margin: 2%;
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
.right-mid i {
  display: flex;
  justify-content: center;
  align-items: center;
  color: #f5f6f7;
  transform: rotate(90deg);
}
</style>