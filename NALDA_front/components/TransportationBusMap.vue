<template>
  <div class="bus-map">
    <div class="bus-station">
      <div v-for="(station, idx) in stations" :key="idx" class="bus-box">
        <div v-if="idx != 7" class="station-name">
          {{ station }}
        </div>
        <div v-if="idx == 7" class="station-name1">
          {{ station }}
        </div>
        <div v-if="idx != 3" class="station-box"></div>
        <div v-if="idx == 3" class="station-box1"></div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      stations: ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11'],
    }
  },
}
</script>

<style scoped>
.bus-map {
  height: 100vh;
  width: 100vw;
  padding: 20px;
}
.bus-station {
  display: flex;
  width: 100%;
  height: 50%;
  flex-wrap: wrap;
  align-items: flex-start;
}
.bus-box {
  display: flex;
  flex-direction: column;
  width: 25%;
  height: 50%;
}
.station-name {
  width: 100%;
  height: 40%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.station-name1 {
  width: 100%;
  height: 40%;
  display: flex;
  justify-content: center;
  align-items: center;
  border-right: solid;
}
.station-box {
  width: 100%;
  height: 60%;
  border-top: solid;
}
.station-box1 {
  width: 100%;
  height: 60%;
  border-top: solid;
  border-right: solid;
}
</style>
