<template>
  <div class="bus-map">
    <div class="bus-station">
      <div v-for="(station, idx) in stations" :key="idx" class="bus-box">
        <!-- 전체 다그려주는 부분 아래 div 그중에서 오른쪽 끝 왼쪽 끝 만들어지는 부분
        만 안나오게 해줘야함-->
        <div
          v-if="station != '' && idx != 19 && idx != 20 && idx != 39"
          class="station-name"
        >
          <div class="station-name-box">{{ station }}</div>
          <div class="station-name-check"></div>
        </div>
        <!-- 오른쪽에 체크해줘야하는 부분 -->

        <div v-if="idx == 19 || idx == 39" class="check-right">
          <div class="station-name-box">
            {{ station }}
          </div>
          <div class="station-name-check"></div>
        </div>
        <!-- 왼쪽에 체크해줘야하는 부분 -->
        <div v-if="idx == 20" class="check-left">
          <div class="station-name-box">{{ station }}</div>
          <div class="station-name-check"></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      stations: [
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '',
        '',
        '',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
        '서울역',
      ],
    }
  },
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
}

.station-name-box {
  width: 100%;
  height: 90%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.station-name-check {
  background-color: black;
  width: 10%;
  height: 10%;
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
}
</style>
