<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div class="subway-time">
    <div class="subway-time-content">
      <div class="terminal-map-top">
        <img
          class="terminal-arrow-btn"
          src="/transportation/arrow-left-drop-circle-outline.png"
          alt
          @click="changeName"
        />
        <div class="terminal-name">{{ terminal[terminalIdx % 2] }}</div>
        <img
          class="terminal-arrow-btn"
          src="/transportation/arrow-right-drop-circle-outline.png"
          alt
          @click="changeName"
        />
      </div>

      <div>
        <!-- <button class="current-time-title">현재 시각</button> -->
      </div>
      <div class="current-time">
        <div class="current-time-seoul">서울 시간(GMT+9)</div>
        <div class="current-time-now">{{ now }}</div>
      </div>
      <div class="select-time">
        <button class="select-time-title">내 열차 시각 조회</button>
        <img
          class="type-arrow-btn"
          src="/transportation/arrow-left-drop-circle-outline.png"
          alt
          @click="minusType"
        />
        <div class="time-type">{{ dayType[dayTypeIdx % 3] }}</div>
        <img
          class="type-arrow-btn"
          src="/transportation/arrow-right-drop-circle-outline.png"
          alt
          @click="plusType"
        />
      </div>

      <div class="input-time">
        <DxDateBox
          v-model="date"
          type="time"
          picker-type="rollers"
          :interval="1"
          @value-changed="changeTime"
        />
      </div>
      <div class="time-result-title">
        <div>출발역</div>
        <div></div>
        <div>종착역</div>
      </div>
      <div class="time-result">
        <div class="left-icon-map">
          <div>
            인천공항
            <br />
            {{ terminal[terminalIdx % 2].substr(2, 4) }}
          </div>
        </div>
        <div class="next-subway-time">{{ time[cnt] }}</div>

        <div class="left-icon-map">
          <div>{{ endStation[Math.floor(cnt / 124)] }}</div>
        </div>
      </div>
      <div class="subway-show-time">
        <button @click="dec">&lt; 이전열차</button>
        <button @click="inc">다음열차 &gt;</button>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
import 'devextreme/dist/css/dx.light.css'

import DxDateBox from 'devextreme-vue/date-box'
export default {
  components: {
    DxDateBox,
  },
  data() {
    return {
      date: new Date(),
      terminalIdx: 0,
      dayTypeIdx: 30000,
      terminal: ['제 1터미널', '제 2터미널'],
      dayType: ['평 일', '토요일', '공휴일'],
      endStation: ['서울역', '디지털미디어시티'],
      now: '00:00:00',
      cnt: 0,
      min: 0,
      subwayInfo: [],
      condition: {
        terminal: 1,
        type: 1,
      },
      time: [],
      check: '',
    }
  },
  computed: {
    ...mapState('subway', ['subways', 'byCondition']),
  },

  created() {
    this.currentTime()
    const promise = new Promise((resolve, reject) => {
      resolve()
    })
    promise.then(async () => {
      await this.getSubway(this.condition)
      await this.getSubwayByCondition(this.condition)
      this.changeTime()
    })
  },
  mounted() {
    setInterval(this.currentTime, 10000)
  },
  methods: {
    ...mapActions('subway', ['getSubway', 'getSubwayByCondition']),
    terminal1() {
      this.condition.terminal = 1
      this.getSubwayByCondition(this.condition)
    },
    terminal2() {
      this.condition.terminal = 2
      this.getSubwayByCondition(this.condition)
    },
    plusType() {
      this.dayTypeIdx++
      this.condition.type = (this.dayTypeIdx % 3) + 1
      const promise = new Promise((resolve, reject) => {
        resolve()
      })
      promise.then(async () => {
        await this.getSubwayByCondition(this.condition)
        this.changeTime()
      })
    },
    minusType() {
      this.dayTypeIdx--
      this.condition.type = (this.dayTypeIdx % 3) + 1
      const promise = new Promise((resolve, reject) => {
        resolve()
      })
      promise.then(async () => {
        await this.getSubwayByCondition(this.condition)
        this.changeTime()
      })
    },
    changeName() {
      this.terminalIdx += 1
      this.condition.terminal = (this.terminalIdx % 2) + 1
      const promise = new Promise((resolve, reject) => {
        resolve()
      })
      promise.then(async () => {
        await this.getSubwayByCondition(this.condition)
        this.changeTime()
      })
    },
    currentTime() {
      const date = new Date()
      this.now =
        ('0' + date.getHours()).slice(-2) +
        ':' +
        ('0' + date.getMinutes()).slice(-2)
    },
    changeTime() {
      this.time = []

      for (let i = 0; i < this.byCondition.length; i++) {
        let temp = []
        temp = this.byCondition[i].time.split(':')
        this.time.push(temp[0].slice(-2) + ':' + temp[1])
        this.check = this.date.getHours() + ':' + this.date.getMinutes()
        if (this.check !== '') {
          if (
            parseInt(this.check.split(':')[0]) <= parseInt(temp[0].slice(-2))
          ) {
            if (
              parseInt(this.check.split(':')[1]) <= parseInt(temp[1]) &&
              this.min === 0
            ) {
              this.cnt = i
              this.min = 1
            }
          }
        }
      }
      this.min = 0
    },
    dec() {
      if (this.cnt > 0) {
        this.cnt--
      }
    },
    inc() {
      if (this.cnt < 124) {
        this.cnt++
      }
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
  font-family: 'twayfly';
}

.subway-time {
  display: flex;
  width: 100vw;
  height: 68vh;
  justify-content: flex-start;
  margin: 0 0 0 30px;
}
.terminal-map-top {
  display: flex;
  width: 100%;
  margin: 20px 0;
}
.terminal-name {
  font-size: 30px;
  color: rgb(69, 169, 200);
  margin-right: 10px;
}
.terminal-arrow-btn {
  width: 50px;
  height: 50px;
  margin-right: 10px;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 rgb(69, 169, 200));
  filter: opacity(0.5) drop-shadow(0 0 0 rgb(69, 169, 200));
}
.subway-time-content {
  width: 80%;
}
.current-time-title {
  width: 100px;
  height: 30px;
  background-color: rgb(69, 169, 200);
  color: white;
  border-radius: 5px;
}
.current-time {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 30%;
  text-align: center;
}
.current-time-seoul {
  font-size: 30px;
}
.current-time-now {
  font-size: 60px;
}
.select-time {
  display: flex;
  align-items: center;
  margin-bottom: 50px;
}
.select-time-title {
  width: 200px;
  height: 40px;
  font-size: 20px;
  background-color: rgb(69, 169, 200);
  color: white;
  border-radius: 5px;
}
.type-arrow-btn {
  width: 50px;
  height: 50px;
  margin: 0px 10px;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 rgb(69, 169, 200));
  filter: opacity(0.5) drop-shadow(0 0 0 rgb(69, 169, 200));
}
.time-type {
  margin: 0 20px;
  font-size: 30px;

  color: rgb(69, 169, 200);
}
.change-time {
  display: flex;
  height: 40%;
  justify-content: center;
  align-items: center;
}
.change-time > input {
  width: 50%;
  height: 50%;
}
.input-time {
  height: 10%;
}
.select-btn-bottom {
  display: flex;
  justify-content: flex-end;
}
.time-result-title {
  width: 80%;
  display: flex;
  margin: auto;
  justify-content: space-around;
}
.time-result-title {
  font-size: 25px;
}
.time-result {
  width: 80%;
  height: 20%;
  display: flex;
  margin: auto;
  justify-content: space-around;
  align-items: center;
}

.left-icon-map {
  display: flex;
  width: 100px;
  height: 100px;
  margin: 15px;
  justify-content: center;
  align-items: center;
  /* padding-top: 32px; */
  color: white;
  background-color: rgb(69, 169, 200);
  border-radius: 50%;
  text-align: center;
}
.next-subway-time {
  font-size: 30px;
}
.subway-show-time {
  width: 20%;
  margin: 20px auto;
  display: flex;
  justify-content: space-around;
}
.subway-show-time > button {
  color: rgb(69, 169, 200);
}
</style>
