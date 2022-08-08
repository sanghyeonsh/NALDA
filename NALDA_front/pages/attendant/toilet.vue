<template>
  <div class="toilet-container">
    <!-- <div class="toilet-wrap"> -->
    <div class="toilet-wrap">
      <img
        class="b-777-toilet"
        src="../../static/icon/fl-777-200er-261-seatmap-pc.png"
        alt
      />
      <div class="th-middle"></div>
      <div class="tbr1-middle"></div>
      <div class="tbl1-middle"></div>
      <div class="tbr2-middle"></div>
      <div class="tbm2-middle"></div>
      <div class="tbl2-middle"></div>
      <div class="ttr1-middle"></div>
      <div class="ttr2-middle"></div>
      <div class="ttl1-middle"></div>
      <div class="ttl2-middle"></div>
      <!-- </div> -->
      <div class="alert-wrap">
        <div class="in-use">
          <div class="word">사용중</div>
          <div class="square-in-use"></div>
        </div>
        <div class="not-use">
          <div class="word">사용가능</div>
          <div class="square-not-use"></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'AttendantToilet',
}
</script>

<script>
let browserPoint = (event) => {
  console.log(`브라우저 좌표 : (${event.pageX}, ${event.pageY})`)
}
let clientPoint = (event) => {
  console.log(`화면 좌표 : (${event.clientX}, ${event.clientY})`)
}
window.addEventListener('click', (e) => {
  browserPoint(e)
  clientPoint(e)
})
//
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
  margin: 0;
  padding: 0;
  font-family: 'twayfly';
}
.toilet-container {
  height: 70vh;
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  /* overflow: scroll; */
}
/* .toilet-wrap {
  display: flex;
  justify-content: center;
  align-items: center;
} */

.toilet-wrap {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100%;
  width: 100%;
}

.b-777-toilet {
  width: 21%;
  transform: rotate(-90deg);
  filter: grayscale(100%);
}

.alert-wrap {
  z-index: 500;
  position: absolute;
  transform: translate(-400%, 400%);
}

.in-use,
.not-use {
  display: flex;
  width: 400%;
}
.word {
  width: 30%;
}
.square-in-use {
  width: 30%;
  background-color: aqua;
  filter: opacity(0.6);
}
.square-not-use {
  width: 30%;
  background-color: rgb(242, 0, 255);
  filter: opacity(0.6);
}

.th-middle {
  width: 2.2%;
  height: 3.5%;
  background-color: aqua;
  position: absolute;
  z-index: 999;
  transform: translate(-1625%, 11%);
  filter: opacity(0.3);
}
.tbr1-middle {
  width: 1.9%;
  height: 4.8%;
  background-color: aqua;
  position: absolute;
  z-index: 999;
  transform: translate(-885%, -150%);
  filter: opacity(0.3);
}
.tbl1-middle {
  width: 1.9%;
  height: 4.8%;
  background-color: aqua;
  position: absolute;
  z-index: 999;
  transform: translate(-885%, 165%);
  filter: opacity(0.3);
}
.tbr2-middle {
  width: 2.9%;
  height: 3.3%;
  background-color: aqua;
  position: absolute;
  z-index: 999;
  transform: translate(525%, -215%);
  filter: opacity(0.3);
}

.tbm2-middle {
  width: 1.9%;
  height: 4.2%;
  background-color: aqua;
  position: absolute;
  z-index: 999;
  transform: translate(835%, 36%);
  filter: opacity(0.3);
}
.tbl2-middle {
  width: 1.9%;
  height: 4.2%;
  background-color: aqua;
  position: absolute;
  z-index: 999;
  transform: translate(823%, 185%);
  filter: opacity(0.3);
}
.ttr1-middle {
  width: 1.9%;
  height: 4.2%;
  background-color: aqua;
  position: absolute;
  z-index: 999;
  transform: translate(1961%, -168%);
  filter: opacity(0.3);
}
.ttr2-middle {
  width: 1.8%;
  height: 3.3%;
  background-color: aqua;
  position: absolute;
  z-index: 999;
  transform: translate(2069%, -45%);
  filter: opacity(0.3);
}
.ttl1-middle {
  width: 1.8%;
  height: 3.3%;
  background-color: aqua;
  position: absolute;
  z-index: 999;
  transform: translate(2069%, 65%);
  filter: opacity(0.3);
}
.ttl2-middle {
  width: 1.9%;
  height: 4.2%;
  background-color: aqua;
  position: absolute;
  z-index: 999;
  transform: translate(1961%, 180%);
  filter: opacity(0.3);
}
</style>
