<template>
  <div class="subway-box">
    <div class="select-terminal-nav">
      <div class="terminal-1" @click="terminal1">제1터미널</div>
      <div class="terminal-2" @click="terminal2">제2터미널</div>
    </div>
    <div>
      <input type="time" />
    </div>
    <div class="subway-enter-time-box">
      <div class="subway-enter-day">
        <div @click="dayType1">평일</div>
        <div @click="dayType2">토요일</div>
        <div @click="dayType3">일요일/공휴일</div>
      </div>
      <div class="subway-blank"></div>
      <div class="subway-enter-time">
        <v-app id="inspire">
          <v-row justify="space-around" align="center">
            <v-time-picker v-model="check" :landscape="$vuetify.breakpoint.smAndUp" ampm-in-title></v-time-picker>
          </v-row>
        </v-app>
      </div>

      <div class="subway-time-check">
        <v-app>
          <v-btn depressed color="primary" @click="changeTime">시간선택완료</v-btn>
        </v-app>
      </div>

      <div class="subway-show-time">
        <div v-if="cnt > 0" @click="dec">이전열차</div>
        <div>{{ time[cnt] }}</div>
        <div v-if="cnt < time.length - 1" @click="inc">다음열차</div>
      </div>
      <div class="previous-next-time-box"></div>
    </div>

    <div class="terminal-map">
      <v-app id="inspire">
        <v-carousel hide-delimiters height="auto">
          <v-carousel-item v-for="(item, i) in items" :key="i" :src="item.src"></v-carousel-item>
        </v-carousel>
      </v-app>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'

export default {
  data() {
    return {
      // picker: null,
      items: [
        {
          src: '/transportation/map_taxi_guide_t1_01.png',
        },
        {
          src: '/transportation/map_taxi_guide_t2_01.png',
        },
      ],
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
    const promise = new Promise((resolve, reject) => {
      resolve()
    })
    promise.then(async () => {
      await this.getSubway(this.condition)
      this.getSubwayByCondition(this.condition)
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
    dayType1() {
      this.condition.type = 1
    },
    dayType2() {
      this.condition.type = 2
    },
    dayType3() {
      this.condition.type = 3
    },

    changeTime() {
      for (let i = 0; i < this.byCondition.length; i++) {
        let temp = []
        temp = this.byCondition[i].time.split(':')
        this.time.push(temp[0].slice(-2) + ':' + temp[1])

        console.log(this.check)
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
      this.cnt--
    },
    inc() {
      this.cnt++
    },
  },
}
</script>

<style scoped>
.subway-box {
  width: 100vw;
  height: 85vh;
  display: flex;
}
.select-terminal-nav {
  height: 100%;
  width: 15%;
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
.subway-enter-day {
  display: flex;
  margin: 10px;
  justify-content: space-around;
}
.subway-enter-day > div {
  margin: 10px;
}
.subway-enter-time-box {
  width: 35%;
  height: 100%;
  display: flex;
  flex-direction: column;
}
.subway-enter-time {
  width: 100%;
  height: 40%;
  display: inline-block;
}
/* 여기서 뷰티파이 */
:deep(.v-application--wrap) {
  min-height: fit-content;
}
/* 여기서 뷰티파이 */

.subway-time-check {
  height: 8%;
  display: flex;
  justify-content: center;
  align-items: flex-end;
}
.subway-blank {
  height: 5%;
  width: 100%;
}
.subway-show-time {
  width: 100%;
  height: 15%;
  display: flex;
  justify-content: space-around;
  align-items: center;
}
.previous-next-time-box {
  width: 100%;
  height: 15%;
  display: flex;
  justify-content: space-around;
  align-items: center;
}

.terminal-map {
  height: 100%;
  width: 50%;
}
</style>
