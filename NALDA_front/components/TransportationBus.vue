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
      <div class="bus-time-button">
        <button>
          <img
            src="/transportation/arrow-left-drop-circle-outline.png"
            alt=""
            style="filter: brightness(0) invert(1)"
            @click="ChangeDayType"
          />
        </button>
        <div class="day-wday-change">주중</div>
        <button>
          <img
            src="/transportation/arrow-right-drop-circle-outline.png"
            alt=""
            style="filter: brightness(0) invert(1)"
            @click="ChangeDayType"
          />
        </button>
      </div>
      <div class="bus-timetable">
        <div v-for="(table, idx) in choiceTime" :key="idx" class="timeTable">
          {{ table }}
        </div>
      </div>
    </div>
    <div class="bus-detail">
      <div class="bus-detail-terminal">
        <button>
          <img
            src="/transportation/arrow-left-drop-circle-outline.png"
            alt=""
            style="filter: opacity(0.5) drop-shadow(0 0 0 rgb(69, 169, 200))"
            @click="TerminalChange"
          />
        </button>
        <div class="terminal-check">제1터미널</div>
        <button>
          <img
            src="/transportation/arrow-right-drop-circle-outline.png"
            alt=""
            style="filter: opacity(0.5) drop-shadow(0 0 0 rgb(69, 169, 200))"
            @click="TerminalChange"
          />
        </button>
        <div class="terminal-blank"></div>

        <div id="app">
          <v-app id="inspire" style="width: 100%; height: 1%">
            <v-dialog transition="dialog-top-transition" max-width="100%">
              <template #activator="{ on, attrs }">
                <v-btn
                  color=""
                  v-bind="attrs"
                  style="
                    width: 105%;
                    height: 5%;
                    background-color: rgb(69, 169, 200);
                    color: white;
                    margin-top: 7%;
                  "
                  class="treminal-map1"
                  v-on="on"
                  >지도보기</v-btn
                >
              </template>
              <template #default="dialog">
                <v-card>
                  <v-toolbar
                    style="background-color: rgb(69, 169, 200); color: white"
                  >
                    <div style="font-size: 30px">제1터미널</div>
                    <v-spacer></v-spacer>
                    <div>
                      <v-btn
                        text
                        style="font-size: 40px; color: white"
                        @click="dialog.value = false"
                        >X</v-btn
                      >
                    </div>
                  </v-toolbar>
                  <div class="terminal-image-box">
                    <img
                      src="/transportation/map_bus_stop_information_t1_01.png"
                      alt=""
                    />
                  </div>
                </v-card>
              </template>
            </v-dialog>

            <v-dialog transition="dialog-top-transition" max-width="100%">
              <template #activator="{ on, attrs }">
                <v-btn
                  color=""
                  v-bind="attrs"
                  style="
                    width: 105%;
                    height: 5%;
                    background-color: rgb(69, 169, 200);
                    color: white;
                    margin-top: 7%;
                  "
                  class="treminal-map2"
                  v-on="on"
                  >지도보기</v-btn
                >
              </template>
              <template #default="dialog">
                <v-card>
                  <v-toolbar
                    style="background-color: rgb(69, 169, 200); color: white"
                  >
                    <div style="font-size: 30px">제2터미널</div>
                    <v-spacer></v-spacer>
                    <div>
                      <v-btn
                        text
                        style="font-size: 40px; color: white"
                        @click="dialog.value = false"
                        >X</v-btn
                      >
                    </div>
                  </v-toolbar>
                  <div class="terminal-image-box">
                    <img
                      src="/transportation/map_bus_stop_information_t2_01.png"
                      alt=""
                    />
                  </div>
                </v-card>
              </template>
            </v-dialog>
          </v-app>
        </div>
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
    <FooterComponent />
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
        document.getElementsByClassName('bus-region-click')[i].style.color =
          'white'
      }
      check.style.color = '#ffe16f'
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
          'rgb(69, 169, 200)'
      }
      check.style.backgroundColor = '#ffe16f'
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
    TerminalChange() {
      if (this.terminal === 1) {
        this.terminal = 2
        document.getElementsByClassName('terminal-check')[0].innerText =
          '제2터미널'
        document.getElementsByClassName('treminal-map2')[0].style.display =
          'flex'
        document.getElementsByClassName('treminal-map1')[0].style.display =
          'none'
        this.makeTimeTable()
      } else {
        this.terminal = 1
        document.getElementsByClassName('terminal-check')[0].innerText =
          '제1터미널'
        document.getElementsByClassName('treminal-map1')[0].style.display =
          'flex'
        document.getElementsByClassName('treminal-map2')[0].style.display =
          'none'
        this.makeTimeTable()
      }
    },

    ChangeDayType() {
      if (this.daytype === 1) {
        this.daytype = 2
        document.getElementsByClassName('day-wday-change')[0].innerText = '주말'
        this.makeTimeTable()
      } else {
        this.daytype = 1
        document.getElementsByClassName('day-wday-change')[0].innerText = '주중'
        this.makeTimeTable()
      }
    },
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
        // this.choiceTime = ['배정된 버스가 없습니다.']
        this.choiceTime = ['', '', '', '배정된', '버스가', '없습니다.']
      } else {
        this.choiceTime = tempTime.split(', ')
        for (let i = 0; i < this.choiceTime.length; i++) {
          this.choiceTime[i] =
            this.choiceTime[i].substr(0, 2) +
            ':' +
            this.choiceTime[i].substr(2, 2)
          // console.log(111)
          // console.log(this.choiceTime[i])
        }
      }
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
  font-size: 35px;
  display: flex;
  flex-direction: column;
  background-color: rgb(69, 169, 200);
  color: white;
  box-shadow: 5px 5px 5px gray;
  z-index: 3;
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
  color: #ffe26f;
}
.bus-number {
  height: 100%;
  width: 13%;
  overflow: auto;
  font-size: 20px;
  color: rgb(69, 169, 200);
  box-shadow: 5px 5px 5px gray;
  z-index: 2;
  background-color: white;
}
/* .bus-number::-webkit-scrollbar {
  display: none;
} */

.bus-number div {
  width: 100%;
  height: 12%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}

.bus-number-click:first-child {
  background-color: #ffe16f;
  color: white;
}
.bus-time {
  width: 15%;
  height: 100%;
  background-color: rgb(69, 169, 200);
  color: white;
  font-size: 35px;
  overflow: auto;
  display: flex;
  flex-direction: column;
  box-shadow: 5px 5px 5px gray;
  z-index: 1;
}
.bus-time-button {
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 100%;
  height: 10%;
}
.bus-time-button button {
  width: 25%;
  height: 50%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.bus-time-button button img {
  width: 70%;
  height: 100%;
}
.day-wday-change {
  width: 50%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.bus-detail {
  height: 100%;
  width: 55%;
  display: flex;
  flex-direction: column;
  background-color: white;
}
.bus-detail-terminal {
  display: flex;
  width: 100%;
  height: 10%;
  font-size: 20px;
}
.bus-detail-terminal button {
  width: 10%;
  height: 100%;
}
.bus-detail-terminal button img {
  width: 70%;
  height: 60%;
}
.terminal-blank {
  width: 40%;
  height: 100%;
}
.terminal-check {
  width: 30%;
  display: flex;
  justify-content: center;
  align-items: center;
  color: rgb(69, 169, 200);
  font-size: 35px;
}
.treminal-map1 {
  width: 40%;
  display: flex;
  justify-content: center;
  align-items: center;
  color: rgb(69, 169, 200);
  font-size: 25px;
}
.treminal-map2 {
  display: none;
  width: 40%;
  justify-content: center;
  align-items: center;
  color: rgb(69, 169, 200);
  font-size: 25px;
}

.bus-timetable {
  height: 90%;
  width: 100%;
}
.timeTable {
  width: 100%;
  display: flex;
  height: 10%;
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
.terminal-image-box {
  width: 100%;
  height: 100%;
  display: flex;
  padding: 20px;
  justify-content: center;
  align-items: center;
}
.terminal-image-box img {
  width: 75%;
  height: 100%;
}
</style>
