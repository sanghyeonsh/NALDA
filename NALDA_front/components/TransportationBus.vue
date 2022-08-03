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
        <img src="/water.png" alt="" />
      </div>
    </div>
    <!-- 버튼은 fixed로 고정 -->
    <button class="bus-button1">제1여객터미널</button>
    <button class="bus-button2">제2여객터미널</button>
  </div>
</template>

<script>
export default {}
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
  display: inline-block;
  width: 100%;
  height: 15%;
  overflow: auto;
  white-space: nowrap;
  font-size: 20px;
}
.bus-detail-time div {
  width: 10%;
  height: 100%;
  display: inline-block;
  color: rgb(0, 0, 0);
  text-align: center;
  text-decoration: none;
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
  width: 9%;
  height: 4%;
}
.bus-button2 {
  position: fixed;
  right: 8%;
  bottom: 20%;
  border: none;
  background-color: dodgerblue;
  color: white;
  width: 9%;
  height: 4%;
}
</style>
