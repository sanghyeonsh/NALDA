<template>
  <div class="subway-container">
    <div class="left-nav">
      <div>
        <div class="left-icon-map" @click="mapClick">
          <div>
            <div>
              공항철도
              <br />타는곳
            </div>
          </div>
        </div>
      </div>
      <div>
        <div class="left-icon-time" @click="timeClick">
          <div>
            <div>
              공항철도
              <br />시간조회
              <br />
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="content" :class="{ Map: isMap }">
      <SubwayMap />
    </div>
    <div class="content" :class="{ Time: isTime }">
      <SubwayTime />
    </div>
    <FooterComponent />
  </div>
</template>

<script>
export default {
  data() {
    return {
      isMap: true,
      isTime: false,
    }
  },
  methods: {
    mapClick() {
      document.getElementsByClassName('left-icon-map')[0].style.background =
        '#206e95'
      document.getElementsByClassName('left-icon-time')[0].style.background =
        'rgb(69, 169, 200)'
      this.isMap = true
      this.isTime = false
    },
    timeClick() {
      document.getElementsByClassName('left-icon-time')[0].style.background =
        '#206e95'
      document.getElementsByClassName('left-icon-map')[0].style.background =
        'rgb(69, 169, 200)'
      this.isTime = true
      this.isMap = false
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

.subway-container {
  /* background-color: rgba(239, 239, 239, 0.511); */

  display: flex;
  width: 100vh;
  height: 85vh;
}
.left-nav {
  display: flex;
  flex-direction: column;
  width: 20%;
  height: 75vh;
  border-right: 3px solid rgb(69, 169, 200);
  align-items: center;
  background-color: rgba(239, 239, 239, 0.511);
}
.left-icon-map {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100px;
  height: 100px;
  margin: 15px;
  color: white;
  background-color: #206e95;
  border-radius: 50%;
  text-align: center;
}
.left-icon-time {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100px;
  height: 100px;
  margin: 15px;
  color: white;
  background-color: rgb(69, 169, 200);
  border-radius: 50%;
  text-align: center;
}
.content {
  display: none;
}
.Map {
  height: 75vh;
  display: block;
  background-color: rgba(239, 239, 239, 0.511);
}
.Time {
  height: 75vh;
  display: block;
  background-color: rgba(239, 239, 239, 0.511);
}
</style>
