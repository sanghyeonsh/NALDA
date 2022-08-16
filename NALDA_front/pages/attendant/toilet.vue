<template>
  <div class="toilet-container">
    <div class="toilet-wrap">
      <div class="toilet-wrap">
        <img class="b-777-toilet" src="/icon/fl-777-200er-261-seatmap-pc.png" />
        <div class="th-middle" :class="{ inuse: !th1 }"></div>
        <div class="tbr1-middle" :class="{ inuse: !HR01 }"></div>
        <div class="tbl1-middle" :class="{ inuse: !HL01 }"></div>
        <div class="tbr2-middle" :class="{ inuse: !tbr2 }"></div>
        <div class="tbm2-middle" :class="{ inuse: !tbm2 }"></div>
        <div class="tbl2-middle" :class="{ inuse: !tbl2 }"></div>
        <div class="ttr1-middle" :class="{ inuse: !ttr1 }"></div>
        <div class="ttr2-middle" :class="{ inuse: !ttr2 }"></div>
        <div class="ttl1-middle" :class="{ inuse: !ttl1 }"></div>
        <div class="ttl2-middle" :class="{ inuse: !ttl2 }"></div>
      </div>
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
import { mapActions, mapState } from 'vuex'

export default {
  name: 'AttendantToilet',
  data() {
    return {
      interval: null,
      th1: true,
      HR01: true,
      HL01: true,
      tbr2: true,
      tbm2: true,
      tbl2: true,
      ttr1: true,
      ttr2: true,
      ttl1: true,
      ttl2: true,
    }
  },
  computed: {
    ...mapState('toilet', ['toilet']),
  },
  async created() {
    await this.callToiletLog('777-200ER-1')
    this.toilet.forEach((element) => {
      if (element.toiletCode === 'HR01') {
        if (element.used === 1) this.HR01 = false
        else this.HR01 = true
      }
      if (element.toiletCode === 'HL01') {
        if (element.used === 1) this.HL01 = false
        else this.HR01 = false
      }
    })
    this.interval = setInterval(async () => {
      await this.callToiletLog('777-200ER-1')
      this.toilet.forEach((element) => {
        if (element.toiletCode === 'HR01') {
          if (element.used === 1) this.HR01 = false
          else this.HR01 = true
        }
        if (element.toiletCode === 'HL01') {
          if (element.used === 1) this.HL01 = false
          else this.HR01 = false
        }
      })
    }, 5000)
  },
  destroyed() {
    clearInterval(this.interval)
  },
  methods: {
    ...mapActions('toilet', ['callToiletLog']),
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
  height: 75vh;
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
.toilet-title {
  font-size: xxx-large;
}
.toilet-wrap {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 65%;
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
  background-color: rgb(26, 255, 0);
  filter: opacity(0.6);
  border-radius: 7px;
}
.square-in-use {
  width: 30%;
  background-color: #ee2c2a;
  filter: opacity(0.7);
  border-radius: 7px;
}

.th-middle {
  width: 2.2%;
  height: 3.5%;
  background-color: rgb(26, 255, 0);
  position: absolute;
  z-index: 999;
  transform: translate(-1625%, 11%);
  filter: opacity(0.5);
}
.tbr1-middle {
  width: 1.9%;
  height: 4.8%;
  background-color: rgb(26, 255, 0);
  position: absolute;
  z-index: 999;
  transform: translate(-885%, -150%);
  filter: opacity(0.3);
}
.tbl1-middle {
  width: 1.9%;
  height: 4.8%;
  background-color: rgb(26, 255, 0);
  position: absolute;
  z-index: 999;
  transform: translate(-885%, 165%);
  filter: opacity(0.3);
}
.tbr2-middle {
  width: 2.9%;
  height: 3.3%;
  background-color: rgb(26, 255, 0);
  position: absolute;
  z-index: 999;
  transform: translate(525%, -215%);
  filter: opacity(0.3);
}

.tbm2-middle {
  width: 1.9%;
  height: 4.2%;
  background-color: rgb(26, 255, 0);
  position: absolute;
  z-index: 999;
  transform: translate(835%, 36%);
  filter: opacity(0.3);
}
.tbl2-middle {
  width: 1.9%;
  height: 4.2%;
  background-color: rgb(26, 255, 0);
  position: absolute;
  z-index: 999;
  transform: translate(823%, 185%);
  filter: opacity(0.3);
}
.ttr1-middle {
  width: 1.9%;
  height: 4.2%;
  background-color: rgb(26, 255, 0);
  position: absolute;
  z-index: 999;
  transform: translate(1961%, -168%);
  filter: opacity(0.3);
}
.ttr2-middle {
  width: 1.8%;
  height: 3.3%;
  background-color: rgb(26, 255, 0);
  position: absolute;
  z-index: 999;
  transform: translate(2069%, -45%);
  filter: opacity(0.3);
}
.ttl1-middle {
  width: 1.8%;
  height: 3.3%;
  background-color: rgb(26, 255, 0);
  position: absolute;
  z-index: 999;
  transform: translate(2069%, 65%);
  filter: opacity(0.3);
}
.ttl2-middle {
  width: 1.9%;
  height: 4.2%;
  background-color: rgb(26, 255, 0);
  position: absolute;
  z-index: 999;
  transform: translate(1961%, 180%);
  filter: opacity(0.3);
}

.inuse {
  background-color: #ee2c2a;
}
</style>
