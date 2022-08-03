<template>
  <div class="transport-bus">
    <div class="bus-region">
      <div>지역</div>
      <div>지역</div>
      <div>지역</div>
      <div>지역</div>
      <div>지역</div>
      <div>지역</div>
      <div>지역</div>
    </div>
    <div class="bus-number">
      <div>busnumber</div>
      <div>busnumber</div>
      <div>busnumber</div>
      <div>busnumber</div>
      <div>busnumber</div>
      <div>busnumber</div>
      <div>busnumber</div>
      <div>busnumber</div>
      <div>busnumber</div>
      <div>busnumber</div>
    </div>
    <div class="bus-detail">
      <!-- flex-column으로 -->
      <div class="bus-detail-terminal">
        <div class="terminal-1">제1터미널</div>
        <div class="terminal-2">제2터미널</div>
      </div>
      <div class="bus-detail-day">
        <div class="detail-day">평일</div>
        <div class="detail-wday">주말</div>
      </div>
      <div class="bus-detail-time">
        <div>0815</div>
        <div>1115</div>
        <div>1315</div>
        <div>1315</div>
        <div>1315</div>
        <div>1315</div>
        <div>1315</div>
        <div>1315</div>
        <div>1315</div>
        <div>1315</div>
        <div>1315</div>
        <div>1315</div>
        <div>1315</div>
        <div>1315</div>
        <div>1315</div>
        <div>1315</div>
      </div>
      <div class="bus-detail-image">
        <img src="/logo.png" alt="" />
      </div>
    </div>
    <!-- 버튼은 fixed로 고정 -->
    <button class="bus-button1" @click="ShowImage1">제1여객터미널</button>
    <button class="bus-button2" @click="ShowImage2">제2여객터미널</button>
    <div class="button1-image">
      <div class="button1-image-box">
        <img src="/water.png" alt="" />
      </div>
    </div>
    <div class="button2-image">
      <div class="button2-image-box">
        <img src="/nacho.jpg" alt="" />
      </div>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    ShowImage1() {
      const image1 = document.getElementsByClassName('button1-image')[0]
      const image2 = document.getElementsByClassName('button2-image')[0]
      image1.style.display = 'block'
      image2.style.display = 'none'
      window.onclick = function (event) {
        if (
          event.target ===
          document.getElementsByClassName('button1-image-box')[0]
        ) {
          image1.style.display = 'none'
        }
      }
    },
    ShowImage2() {
      const image1 = document.getElementsByClassName('button1-image')[0]
      const image2 = document.getElementsByClassName('button2-image')[0]
      image1.style.display = 'none'
      image2.style.display = 'block'
      window.onclick = function (event) {
        if (
          event.target ===
          document.getElementsByClassName('button2-image-box')[0]
        ) {
          image2.style.display = 'none'
        }
      }
    },
  },
}
</script>

<style scoped>
.transport-bus {
  height: 85vh;
  display: flex;
}
.bus-region {
  height: 100%;
  width: 25%;
  font-size: 30px;
}
.bus-region div {
  width: 100%;
  height: 10%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.bus-number {
  height: 80%;
  width: 25%;
  overflow: auto;
  font-size: 30px;
}
.bus-number div {
  width: 100%;
  height: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.bus-detail {
  height: 60%;
  width: 50%;
  display: flex;
  flex-direction: column;
}
.bus-detail-terminal {
  display: flex;
  width: 100%;
  height: 15%;
  font-size: 20px;
}
.terminal-1 {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.terminal-2 {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.bus-detail-day {
  display: flex;
  width: 100%;
  height: 10%;
  font-size: 20px;
}
.detail-day {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.detail-wday {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.bus-detail-time {
  display: flex;
  width: 100%;
  height: 15%;
  flex-wrap: nowrap;
  overflow-x: auto;
  font-size: 20px;
}
.bus-detail-time div {
  width: 20%;
  height: 100%;
  flex: 0 0 auto;
  display: flex;
  justify-content: center;
  align-items: center;
}
.bus-detail-image {
  width: 100%;
  height: 65%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.bus-detail-image img {
  width: 100%;
  height: 100%;
}
.bus-button1 {
  position: fixed;
  right: 20%;
  bottom: 20%;
  border: none;
  background-color: dodgerblue;
  color: white;
  width: 15%;
  height: 7%;
}
.bus-button2 {
  position: fixed;
  right: 8%;
  bottom: 20%;
  border: none;
  background-color: dodgerblue;
  color: white;
  width: 15%;
  height: 7%;
}

.button1-image {
  display: none;
  position: fixed;
  z-index: 1;
  left: 0;
  top: 0;
  width: 100vw;
  height: 100vh;
  overflow: auto;
  background-color: rgb(0, 0, 0);
  background-color: rgba(0, 0, 0, 0.4);
  font-size: 30px;
}
.button1-image-box {
  width: 100%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.button1-image-box img {
  width: 50%;
  height: 50%;
}

.button2-image {
  display: none;
  position: fixed;
  z-index: 1;
  left: 0;
  top: 0;
  width: 100vw;
  height: 100vh;
  overflow: auto;
  background-color: rgb(0, 0, 0);
  background-color: rgba(0, 0, 0, 0.4);
  font-size: 30px;
}
.button2-image-box {
  width: 100%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.button2-image-box img {
  width: 50%;
  height: 50%;
}
</style>
