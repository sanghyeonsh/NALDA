<template>
  <div class="transport-bus">
    <div class="bus-region">
      <div
        v-for="(area, idx) in areas"
        :key="idx"
        class="bus-region-click"
        @click=";[checkInfo(idx + 1), checkRegion(idx)]"
      >
        {{ area }}
      </div>
    </div>
    <div class="bus-number">
      <div
        v-for="(bus, idx) in busNum"
        :key="idx"
        class="bus-number-click"
        @click=";[showTime(bus), checkBus(idx)]"
      >
        {{ bus }}
      </div>
    </div>
    <div class="bus-time">
      <div class="bus-time-button" @click="ChangeDayType">주중 / 주말</div>
      <div v-for="(table, idx) in choiceTime" :key="idx" class="timeTable">
        {{ table }}
      </div>
    </div>
    <div class="bus-detail">
      <div class="bus-detail-terminal">
        <div class="terminal-1" @click="terminal1">제1터미널</div>
        <div class="terminal-2" @click="terminal2">제2터미널</div>
      </div>
      <div class="bus-detail-map">
        <TransportationBusMap :stations="choiceStation" />
      </div>
    </div>

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
import { mapState, mapActions } from 'vuex'

export default {
  data() {
    return {
      areas: ['서울', '경기', '인천', '강원', '충청', '경상', '전라'],
      busNum: [],
      infos: {},
      terminal: 1,
      daytype: 1,
      choiceTime: [],
      choiceStation: [],
    }
  },
  computed: {
    ...mapState('transportation', ['info', 'time', 'stop']),
  },
  created() {
    // this.getInfo('1')
    const promise = new Promise((resolve, reject) => {
      resolve()
    })
    promise.then(async () => {
      await this.getInfo(String(1))
      await this.getTime(String(6300))
      await this.getStop(String(6300))

      for (let i = 0; i < this.info.totalCount; i++) {
        this.busNum.push(this.info.items[i].busnumber)
      }
      this.makeTimeTable()
      this.makeStationTable()
    })
  },
  methods: {
    ...mapActions('transportation', ['getInfo', 'getTime', 'getStop']),
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
    checkInfo(area) {
      const promise = new Promise((resolve, reject) => {
        resolve()
      })
      promise.then(async () => {
        await this.getInfo(String(area))
        this.busNum = []
        for (let i = 0; i < this.info.totalCount; i++) {
          this.busNum.push(this.info.items[i].busnumber)
        }
        console.log(this.info)
        await this.getTime(this.info.items[0].busnumber)
        await this.getStop(this.info.items[0].busnumber)
        this.makeTimeTable()
        this.makeStationTable()
      })
    },
    checkRegion(idx) {
      const len = document.getElementsByClassName('bus-region-click').length
      const check = document.getElementsByClassName('bus-region-click')[idx]

      for (let i = 0; i < len; i++) {
        document.getElementsByClassName('bus-region-click')[
          i
        ].style.backgroundColor = 'white'
        document.getElementsByClassName('bus-region-click')[i].style.color =
          'black'
      }
      check.style.backgroundColor = '#206e95'
      check.style.color = 'white'
      this.checkBus(0)
    },
    checkBus(idx) {
      const len = document.getElementsByClassName('bus-number-click').length
      const check = document.getElementsByClassName('bus-number-click')[idx]

      for (let i = 0; i < len; i++) {
        document.getElementsByClassName('bus-number-click')[
          i
        ].style.backgroundColor = 'white'
        document.getElementsByClassName('bus-number-click')[i].style.color =
          'black'
      }
      check.style.backgroundColor = '#206e95'
      check.style.color = 'white'
    },

    showTime(bus) {
      const promise = new Promise((resolve, reject) => {
        resolve()
      })
      promise.then(async () => {
        await this.getTime(bus)
        await this.getStop(bus)
        this.makeTimeTable()
        this.makeStationTable()
      })
    },
    terminal1() {
      this.terminal = 1
      document.getElementsByClassName('terminal-1')[0].style.background =
        '#206e95'
      document.getElementsByClassName('terminal-1')[0].style.color = 'white'
      // document.getElementsByClassName('terminal-1')[0].style.fontWeight = 'bold'
      document.getElementsByClassName('terminal-2')[0].style.background =
        'white'
      document.getElementsByClassName('terminal-2')[0].style.color = 'black'
      this.makeTimeTable()
    },
    terminal2() {
      this.terminal = 2
      document.getElementsByClassName('terminal-2')[0].style.background =
        '#206e95'
      document.getElementsByClassName('terminal-2')[0].style.color = 'white'
      document.getElementsByClassName('terminal-1')[0].style.background =
        'white'
      document.getElementsByClassName('terminal-1')[0].style.color = 'black'
      this.makeTimeTable()
    },

    ChangeDayType() {
      if (this.daytype === 1) {
        this.daytype = 2
        document.getElementsByClassName('bus-time-button')[0].style.background =
          'white'
        this.makeTimeTable()
      } else {
        this.daytype = 1
        document.getElementsByClassName('bus-time-button')[0].style.background =
          '#206e95'
        this.makeTimeTable()
      }
    },
    // dayType1() {
    //   this.daytype = 1
    //   document.getElementsByClassName('detail-day')[0].style.background =
    //     '#206e95'
    //   document.getElementsByClassName('detail-day')[0].style.color = 'white'
    //   document.getElementsByClassName('detail-wday')[0].style.background =
    //     'white'
    //   document.getElementsByClassName('detail-wday')[0].style.color = 'black'
    //   this.makeTimeTable()
    // },
    // dayType2() {
    //   this.daytype = 2
    //   document.getElementsByClassName('detail-wday')[0].style.background =
    //     '#206e95'
    //   document.getElementsByClassName('detail-wday')[0].style.color = 'white'
    //   document.getElementsByClassName('detail-day')[0].style.background =
    //     'white'
    //   document.getElementsByClassName('detail-day')[0].style.color = 'black'
    //   this.makeTimeTable()
    // },
    makeTimeTable() {
      let temp = 0
      let tempTime = ''
      if (this.terminal === 1 && this.daytype === 1) {
        temp = 0
      } else if (this.terminal === 1 && this.daytype === 2) {
        temp = 1
      } else if (this.terminal === 2 && this.daytype === 1) {
        temp = 2
      } else {
        temp = 3
      }
      tempTime = this.time[temp]
      console.log(tempTime)
      // this.choiceTime = []
      if (tempTime === null) {
        this.choiceTime = ['배정된 버스가 없습니다.']
      } else {
        this.choiceTime = tempTime.split(', ')
      }
      console.log(this.choiceTime)
    },
    makeStationTable() {
      // const len = { stationCnt: 0 }
      // len.stationCnt = this.choiceStation.length
      let test = []
      if (this.stop === null) {
        this.choiceStation = ['버스 노선도가 없습니다.']
      } else {
        this.choiceStation = this.stop.split(', ')
        // test = Object.assign([], this.choiceStation)
        // if(this.choiceStation[test.])
        test = [...this.choiceStation]
        console.log('aaaaaaa')
        console.log(this.choiceStation[test.length - 1])
        if (this.choiceStation[test.length - 1] === '') {
          this.choiceStation.splice(test.length - 1, 1)
        }
        test = [...this.choiceStation]

        if (test.length > 10) {
          for (
            let i = test.length;
            i < (Math.floor((test.length - 1) / 10) + 1) * 10;
            i++
          ) {
            this.choiceStation.push(' ')
          }
          let temp = ''
          for (let i = 10; i < 15; i++) {
            temp = this.choiceStation[i]
            this.choiceStation[i] = this.choiceStation[29 - i]
            this.choiceStation[29 - i] = temp
          }
          if (test.length > 30) {
            for (let i = 30; i < 35; i++) {
              temp = this.choiceStation[i]
              this.choiceStation[i] = this.choiceStation[69 - i]
              this.choiceStation[69 - i] = temp
            }
          }
          if (test.length > 50) {
            for (let i = 50; i < 55; i++) {
              temp = this.choiceStation[i]
              this.choiceStation[i] = this.choiceStation[109 - i]
              this.choiceStation[109 - i] = temp
            }
          }
        }
      }
      console.log(test)
    },
  },
}
</script>

<style scoped>
.transport-bus {
  height: 75vh;
  display: flex;
}
.bus-region {
  height: 100%;
  width: 15%;
  font-size: 30px;
  display: flex;
  flex-direction: column;
  border-right: solid;
}
.bus-region div {
  width: 100%;
  height: 10%;
  flex-grow: 1;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.bus-region-click:first-child {
  background-color: #206e95;
  color: white;
}
.bus-number {
  height: 100%;
  width: 15%;
  overflow: auto;
  font-size: 20px;
}
.bus-number div {
  width: 100%;
  height: 10%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.bus-number-click:first-child {
  background-color: #206e95;
  color: white;
}
.bus-time {
  width: 15%;
  height: 100%;
  overflow: auto;
}
.bus-time-button {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 12%;
  background-color: #206e95;
}

.bus-detail {
  height: 100%;
  width: 70%;
  display: flex;
  flex-direction: column;
}
.bus-detail-terminal {
  display: flex;
  width: 100%;
  height: 10%;
  font-size: 20px;
}
.terminal-1 {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: #206e95;
  color: white;
  border-bottom: 1px solid white;
}
.terminal-2 {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  border-bottom: 1px solid white;
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
  background-color: #206e95;
  color: white;
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
  height: 10%;
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
.timeTable {
  width: 100%;
  display: flex;
  height: 7%;
  justify-content: center;
  align-items: center;
}
.bus-detail-map {
  width: 100%;
  height: 65%;
  display: flex;
  justify-content: center;
  align-items: center;
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
