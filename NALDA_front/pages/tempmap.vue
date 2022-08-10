<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div class="subway-time">
    <div class="subway-time-content">
      <div class="terminal-map-top">
        <button class="terminal-arrow-btn" @click="changeName">&lt;</button>
        <div class="terminal-name">{{ terminal[terminalIdx % 2] }}</div>
        <button class="terminal-arrow-btn" @click="changeName">&gt;</button>
      </div>

      <div>
        <button class="current-time-title">현재 시각</button>
      </div>
      <div class="current-time">{{ now }}</div>
      <div class="select-time">
        <button class="select-time-title">내 열차 시각 조회</button>
        <button class="type-arrow-btn" @click="minusType">&lt;</button>
        <div class="time-type">{{ dayType[dayTypeIdx % 3] }}</div>
        <button class="type-arrow-btn" @click="plusType">&gt;</button>
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
        <div>종착역</div>
      </div>
      <div class="time-result">
        <div class="left-icon-map">
          {{ byCondition[cnt].name.substr(0, 4) }}<br />{{
            byCondition[cnt].name.substr(4, 4)
          }}
        </div>
        <div class="left-icon-map">{{ byCondition[cnt].end }}</div>
      </div>
      <div class="subway-show-time">
        <button @click="dec">&lt;이전열차</button>
        <div>{{ time[cnt] }}</div>
        <button @click="inc">다음열차&gt;</button>
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
      terminal: ['제 1 터미널', '제 2 터미널'],
      dayType: ['평 일', '토요일', '공휴일'],
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
    // dayType1() {
    //   this.condition.type = 1
    // },
    // dayType2() {
    //   this.condition.type = 2
    // },
    // dayType3() {
    //   this.condition.type = 3
    // },
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
      this.now = date.getHours() + ':' + date.getMinutes()
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
              console.log(this.time)
              this.cnt = i
              this.min = 1
            }
          }
        }
      }
      this.min = 0
    },
    dec() {
      this.cnt--
    },
    inc() {
      this.cnt++
    },
  },
}
</script>

<style>
.subway-time {
  display: flex;
  width: 100vw;
  height: 100vh;
  justify-content: center;
  margin: auto;
}
.terminal-map-top {
  display: flex;
  width: 100%;
  margin: 20px 0;
}
.terminal-name {
  margin-right: 10px;
}
.terminal-arrow-btn {
  width: 50px;
  height: 50px;
  margin-right: 10px;
  background-color: rgb(229, 226, 226);
}
.subway-time-content {
  width: 80%;
}
/* .content-title {
  margin: 20px 0;
  font-size: 25px;
} */
.select-time {
  display: flex;
  align-items: center;
  margin-bottom: 50px;
}
.current-time-title {
  width: 100px;
  height: 30px;
  background-color: rgb(69, 169, 200);
  color: white;
  border-radius: 5px;
}
.current-time {
  height: 30%;
  font-size: 100px;
  text-align: center;
}
.select-time-title {
  width: 150px;
  height: 30px;
  background-color: rgb(69, 169, 200);
  color: white;
  border-radius: 5px;
}
.type-arrow-btn {
  width: 30px;
  height: 30px;
  margin: 0px 10px;
  background-color: rgb(229, 226, 226);
}
.time-type {
  margin: 0 40px;
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
  justify-content: end;
}
.time-result-title {
  display: flex;
  justify-content: space-around;
}
.time-result {
  display: flex;
  justify-content: space-around;
}
.left-icon-map {
  width: 100px;
  height: 100px;
  margin: 15px;
  color: white;
  background-color: rgb(69, 169, 200);
  border-radius: 50%;
  text-align: center;
  line-height: 50px;
}
.subway-show-time {
  width: 75%;
  margin: 20px auto;
  display: flex;
  justify-content: space-around;
}
.subway-show-time > button {
  color: rgb(69, 169, 200);
  /* background-color: rgb(69, 169, 200); */
}
/* .select-btn {
  width: 100px;
  height: 30px;
  background-color: rgb(69, 169, 200);
  color: white;
  border-radius: 5px;
} */
</style>
