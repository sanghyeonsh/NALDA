<template>
  <div class="toilet-container">
    <!-- <div class="toilet-wrap"> -->
    <div class="toilet-wrap">
      <div class="alert-wrap">
        <div class="in-use">
          <div class="word">사용중</div>
          <div class="square-in-use"></div>
        </div>
        <div class="not-use" @click="testClick">
          <div class="word">사용가능</div>
          <div class="square-not-use"></div>
        </div>
      </div>
    </div>
    <PageLoader />
  </div>
</template>

<script>
export default {
  name: 'AttendantToilettest',
  data() {
    return {
      th1: true,
      tbr1: true,
      tbl1: true,
      tbr2: true,
      tbm2: true,
      tbl2: true,
      ttr1: true,
      ttr2: true,
      ttl1: true,
      ttl2: true,
    }
  },
  computed: {},
  methods: {
    testClick() {
      // this.th1 = !this.th1
      console.log(1)
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
  background-color: rgba(239, 239, 239, 0.511);
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
.square-not-use {
  width: 30%;
  background-color: rgb(0, 255, 17);
  filter: opacity(0.6);
}
.square-in-use {
  width: 30%;
  background-color: rgb(255, 0, 34);
  filter: opacity(0.6);
}

.inuse {
  background-color: rgb(255, 0, 34);
}
.th-middle {
  width: 2.2%;
  height: 3.5%;
  background-color: rgb(0, 255, 17);
  position: absolute;
  z-index: 999;
  transform: translate(-1625%, 11%);
  filter: opacity(0.3);
}
.tbr1-middle {
  width: 1.9%;
  height: 4.8%;
  background-color: rgb(0, 255, 17);
  position: absolute;
  z-index: 999;
  transform: translate(-885%, -150%);
  filter: opacity(0.3);
}
.tbl1-middle {
  width: 1.9%;
  height: 4.8%;
  background-color: rgb(0, 255, 17);
  position: absolute;
  z-index: 999;
  transform: translate(-885%, 165%);
  filter: opacity(0.3);
}
.tbr2-middle {
  width: 2.9%;
  height: 3.3%;
  background-color: rgb(0, 255, 17);
  position: absolute;
  z-index: 999;
  transform: translate(525%, -215%);
  filter: opacity(0.3);
}

.tbm2-middle {
  width: 1.9%;
  height: 4.2%;
  background-color: rgb(0, 255, 17);
  position: absolute;
  z-index: 999;
  transform: translate(835%, 36%);
  filter: opacity(0.3);
}
.tbl2-middle {
  width: 1.9%;
  height: 4.2%;
  background-color: rgb(0, 255, 17);
  position: absolute;
  z-index: 999;
  transform: translate(823%, 185%);
  filter: opacity(0.3);
}
.ttr1-middle {
  width: 1.9%;
  height: 4.2%;
  background-color: rgb(0, 255, 17);
  position: absolute;
  z-index: 999;
  transform: translate(1961%, -168%);
  filter: opacity(0.3);
}
.ttr2-middle {
  width: 1.8%;
  height: 3.3%;
  background-color: rgb(0, 255, 17);
  position: absolute;
  z-index: 999;
  transform: translate(2069%, -45%);
  filter: opacity(0.3);
}
.ttl1-middle {
  width: 1.8%;
  height: 3.3%;
  background-color: rgb(0, 255, 17);
  position: absolute;
  z-index: 999;
  transform: translate(2069%, 65%);
  filter: opacity(0.3);
}
.ttl2-middle {
  width: 1.9%;
  height: 4.2%;
  background-color: rgb(0, 255, 17);
  position: absolute;
  z-index: 999;
  transform: translate(1961%, 180%);
  filter: opacity(0.3);
}
</style>