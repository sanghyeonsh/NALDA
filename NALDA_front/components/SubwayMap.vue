<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div class="map-container">
    <div>
      <div class="terminal-map-top">
        <button class="arrow-btn" @click="changeName">&lt;</button>
        <div class="terminal-name">{{ terminal[idx % 2] }}</div>
        <button class="arrow-btn" @click="changeName">&gt;</button>
      </div>
      <div class="subway-img-box">
        <img :src="items[idx % 2].src" alt="터미널 이미지" />
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      idx: 0,
      terminal: ['제 1 터미널', '제 2 터미널'],
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
    changeName() {
      this.idx += 1
      console.log(this.idx)
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

.map-container {
  width: 100vw;
  height: 85%;
  margin: auto;
}
.map-container > div {
  width: 100%;
  height: 100%;
}
.terminal-map-top {
  display: flex;
  width: 80%;
}
.arrow-btn {
  width: 50px;
  height: 50px;
  margin: 0px 10px;
  background-color: rgb(229, 226, 226);
}
.terminal-name {
  font-size: 30px;
  color: rgb(69, 169, 200);
}
.subway-img-box {
  width: 100%;
  height: 100%;
}
.subway-img-box > img {
  width: 90%;
  height: 90%;
}
</style>
