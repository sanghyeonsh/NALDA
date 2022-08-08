<template>
  <div class="bus-map">
    <div class="bus-station">
      <div v-for="(station, idx) in stations" :key="idx" class="bus-box">
        <!-- 전체 다그려주는 부분 아래 div 그중에서 오른쪽 끝 왼쪽 끝 만들어지는 부분
        만 안나오게 해줘야함-->
        <div
          v-if="
            station != ' ' &&
            idx != 19 &&
            idx != 20 &&
            idx != 39 &&
            idx != 40 &&
            idx != 59 &&
            idx != 60
          "
          class="station-name"
        >
          <div class="station-name-box">{{ station }}</div>
          <div class="station-name-check">
            <img src="/transportation/bus-stop-icon.png" alt="" />
          </div>
        </div>
        <!-- 오른쪽에 체크해줘야하는 부분 -->
<<<<<<< HEAD
        <div v-if="idx == 19 || idx == 39" class="check-right">
=======

        <div v-if="idx == 19 || idx == 39 || idx == 59" class="check-right">
>>>>>>> 9d882e1480fa8e9fac4eb9eb953a4c27a8d38f24
          <div class="station-name-box">
            {{ station }}
          </div>
          <div class="station-name-check">
            <img src="/transportation/bus-stop-icon.png" alt="" />
          </div>
        </div>
        <!-- 왼쪽에 체크해줘야하는 부분 -->
        <div v-if="idx == 20 || idx == 40 || idx == 60" class="check-left">
          <div class="station-name-box">{{ station }}</div>
          <div class="station-name-check">
            <img src="/transportation/bus-stop-icon.png" alt="" />
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/require-prop-types
  props: ['stations'],
}
</script>

<style scoped>
.bus-map {
  height: 100%;
  width: 100%;
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
  width: 10%;
  height: 50%;
}
.station-name {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  border-bottom: solid;
  border-color: cornflowerblue;
}
.check-right {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
  border-right: solid;
  border-bottom: solid;
  justify-content: center;
  align-items: center;
  border-color: cornflowerblue;
}

.station-name-box {
  width: 100%;
  height: 90%;
  display: flex;
  justify-content: center;
  align-items: center;
  transform: rotate(-40deg);
}
.station-name-check {
  /* background-color: cornflowerblue; */
  /* border-color: cornflowerblue; */
  width: 25%;
  height: 25%;
}
.station-name-check img {
  width: 100%;
  height: 100%;
  filter: opacity(0.5) drop-shadow(0 0 0 cornflowerblue);
}
.check-left {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
  border-left: solid;
  border-bottom: solid;
  justify-content: center;
  align-items: center;
  border-color: cornflowerblue;
}
</style>
