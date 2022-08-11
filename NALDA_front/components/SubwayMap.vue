<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div class="map-container">
    <div>
      <div class="terminal-map-top">
        <i class="fa-solid fa-caret-right"></i>
        <img
          class="arrow-btn"
          src="/transportation/arrow-left-drop-circle-outline.png"
          alt
          @click="changeName"
        />
        <div class="terminal-name">{{ terminal[idx % 2] }}</div>
        <img
          class="arrow-btn"
          src="/transportation/arrow-right-drop-circle-outline.png"
          alt
          @click="changeName"
        />
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
  margin: 0 0 0 30px;
}
.map-container > div {
  width: 100%;
  height: 100%;
}
.terminal-map-top {
  display: flex;
  align-items: center;
  width: 100%;
  margin: 20px 0;
}
.arrow-btn {
  width: 50px;
  height: 50px;
  margin: 0px 10px;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 rgb(69, 169, 200));
  filter: opacity(0.5) drop-shadow(0 0 0 rgb(69, 169, 200));
}
.terminal-name {
  font-size: 30px;
  color: rgb(69, 169, 200);
  margin-right: 10px;
}
.subway-img-box {
  width: 100%;
  height: 100%;
  margin-top: 2%;
}
.subway-img-box > img {
  width: 80%;
  height: 90%;
}
</style>
