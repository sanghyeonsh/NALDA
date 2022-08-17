<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div class="subway-container">
    <div class="left-nav">
      <div>
        <div class="left-icon-map" @click="mapClick">
          <div>공항철도<br />타는곳</div>
        </div>
      </div>
      <div>
        <div class="left-icon-time" @click="timeClick">
          <div>공항철도<br />시간조회<br /></div>
        </div>
      </div>
    </div>
    <div class="content" :class="{ Map: isMap }">
      <SubwayMap />
    </div>
    <div class="content" :class="{ Time: isTime }">
      <TransportationSubway />
    </div>
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
::-webkit-scrollbar {
  display: none;
}

.subway-container {
  display: flex;
  width: 100vh;
  /* header넣으면 줄이기 */
  height: 100vh;
}
.left-nav {
  display: flex;
  flex-direction: column;
  width: 20%;
  height: 100%;
  border-right: 3px solid rgb(69, 169, 200);
  align-items: center;
}
.left-icon-map {
  width: 100px;
  height: 100px;
  margin: 15px;
  color: white;
  background-color: #206e95;
  border-radius: 50%;
  text-align: center;
  line-height: 50px;
}
.left-icon-time {
  width: 100px;
  height: 100px;
  margin: 15px;
  color: white;
  background-color: rgb(69, 169, 200);
  border-radius: 50%;
  text-align: center;
  line-height: 50px;
}
.content {
  display: none;
}
.Map {
  display: block;
}
.Time {
  display: block;
}
</style>
