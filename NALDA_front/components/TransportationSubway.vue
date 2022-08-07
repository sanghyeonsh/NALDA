<template>
  <div class="subway-box">
    <div class="select-terminal-nav">
      <div class="terminal-1">제1터미널</div>
      <div class="terminal-2">제2터미널</div>
    </div>
    <div class="subway-enter-time-box">
      <div class="subway-blank"></div>
      <div class="subway-enter-time">
        <v-app id="inspire">
          <v-row justify="space-around" align="center">
            <v-time-picker
              v-model="picker"
              :landscape="$vuetify.breakpoint.smAndUp"
              ampm-in-title
            ></v-time-picker>
          </v-row>
        </v-app>
      </div>

      <div class="subway-time-check">
        <v-app>
          <v-btn depressed color="primary" @click="Test()">
            시간선택완료
          </v-btn>
        </v-app>
      </div>

      <div class="subway-show-time">
        <div>이전열차</div>
        <div>빠른열차 시간보여주는곳</div>
        <div>다음열차</div>
      </div>
      <div class="previous-next-time-box"></div>
    </div>

    <div class="terminal-map">
      <v-app id="inspire">
        <v-carousel hide-delimiters height="auto">
          <v-carousel-item v-for="(item, i) in items" :key="i" :src="item.src">
          </v-carousel-item>
        </v-carousel>
      </v-app>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      picker: null,
      items: [
        {
          src: '/transportation/map_taxi_guide_t1_01.png',
        },
        {
          src: '/transportation/map_taxi_guide_t2_01.png',
        },
      ],
    }
  },
  methods: {
    Test() {
      console.log(this.picker)
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
::v-deep .v-application--wrap {
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
