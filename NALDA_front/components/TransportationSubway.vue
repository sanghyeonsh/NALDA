<template>
  <div class="subway-box">
    <div class="select-terminal-nav">
      <div class="terminal-1">제1터미널</div>
      <div class="terminal-2">제2터미널</div>
    </div>
    <div class="subway-enter-time-box">
      <div class="subway-enter-time">
        시간 입력하기

        <v-app id="inspire">
          <v-time-picker v-model="e7" format="24hr" landscape></v-time-picker>
        </v-app>
      </div>
      <div class="subway-show-time">빠른열차보여주는곳</div>
      <div class="previous-next-time-box">
        <div>다음열차</div>
        <div>이전열차</div>
      </div>
    </div>
    <div class="terminal-map">map</div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      e7: null,
    }
  },
}
</script>

<style>
.v-picker--landscape .v-picker__title {
  width: 100px;
}
.subway-box {
  width: 100vw;
  height: 85vh;
  display: flex;
}
.select-terminal-nav {
  height: 100%;
  width: 20%;
}
.terminal-1 {
  width: 100%;
  height: 15%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.terminal-2 {
  width: 100%;
  height: 15%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.subway-enter-time-box {
  width: 30%;
  height: 100%;
  display: flex;
  flex-direction: column;
}
.subway-enter-time {
  width: 100%;
  height: 40%;
  display: inline-block;
}

.subway-show-time {
  width: 100%;
  height: 30%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.previous-next-time-box {
  width: 100%;
  height: 30%;
  display: flex;
  justify-content: space-around;
  align-items: center;
}

.terminal-map {
  height: 100%;
  width: 50%;
}
</style>
