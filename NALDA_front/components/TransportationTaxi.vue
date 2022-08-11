<template>
  <div class="Taxi-box">
    <div class="Taxi-box-left">
      <img src="/transportation/taxi-timetable.png" alt="" />
      <!-- <div class="Taxi-class">
        <div class="Taxi-class-1">구분</div>
        <div class="Taxi-class-2">일반택시</div>
        <div class="Taxi-class-3">
          <div>모범택시 /</div>
          <div>대형택시(9인승)</div>
        </div>
        <div class="Taxi-class-4">
          <div>인터내셔널택시</div>
          <div>스마트 택시</div>
        </div>
      </div>
      <div class="Taxi-fee">
        <div class="Taxi-fee-1">기본요금(원)</div>
        <div class="Taxi-fee-2">서울: 3,800</div>
        <div class="Taxi-fee-3">경기: 3,800</div>
        <div class="Taxi-fee-4">인천: 3,800</div>
        <div class="Taxi-fee-5">6,500</div>
        <div class="Taxi-fee-6">
          <div>서울지역 구간요금제</div>
          <div>적용</div>
        </div>
      </div>
      <div class="Taxi-station">
        <div class="Taxi-station-number">승차장번호</div>
        <div class="Taxi-station-terminal-num">
          <div class="Taxi-station-terminal-num-1">제1여객터미널</div>
          <div class="Taxi-station-terminal-num-2">제2여객터미널</div>
        </div>
        <div class="Taxi-station-ordinary">
          <div class="Taxi-station-ordinary-1">5C, 6C, 6D</div>
          <div class="Taxi-station-ordinary-2">
            <div class="Taxi-station-ordinary-2-1">5C</div>
            <div class="Taxi-station-ordinary-2-2">4D</div>
            <div class="Taxi-station-ordinary-2-3">3C,3D</div>
          </div>
        </div>
        <div class="Taxi-station-special">
          <div class="Taxi-station-special-1">7C/8C</div>
          <div class="Taxi-station-special-2">5D</div>
        </div>
        <div class="Taxi-station-internal">
          <div class="Taxi-station-internal-1">4C</div>
          <div class="Taxi-station-internal-2">1C</div>
        </div>
      </div>
      <div class="taxi-etc">
        <div class="taxi-etc-1">비고</div>
        <div class="taxi-etc-2">
          <div class="taxi-etc-2-1">24:00 ~ 04:00 심야할증 20% 적용</div>
          <div class="taxi-etc-2-2">24:00 ~ 04:00 심야할증 20% 적용</div>
          <div class="taxi-etc-2-3">24:00 ~ 04:00 심야할증 20% 적용</div>
        </div>
        <div class="taxi-etc-3">심야할증 및 시계할증 없음</div>
        <div class="taxi-etc-4">외국어 서비스지원 공식 지정 택시</div>
      </div> -->
    </div>
    <div class="Taxi-box-right">
      <img src="/transportation/map_taxi_guide_t1_01.png" alt="" />
      <!-- <img src="/transportation/map_taxi_guide_t2_01.png" alt="" /> -->
    </div>
  </div>
</template>

<script>
export default {}
</script>

<style scoped>
.Taxi-box {
  display: flex;
  height: 85vh;
  width: 100vw;
}
.Taxi-box-left {
  height: 100%;
  width: 30%;
  display: flex;
}
.Taxi-box-left img {
  width: 100%;
  height: 100%;
}

.Taxi-class {
  width: 20%;
  height: 100%;
  display: flex;
  flex-direction: column;
}
.Taxi-class-1 {
  width: 100%;
  height: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: cadetblue;
}
.Taxi-class-2 {
  width: 100%;
  height: 60%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.Taxi-class-3 {
  width: 100%;
  height: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
}
.Taxi-class-4 {
  width: 100%;
  height: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
}

.Taxi-fee {
  width: 25%;
  height: 100%;
  display: flex;
  flex-direction: column;
}
.Taxi-fee-1 {
  width: 100%;
  height: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: cadetblue;
}
.Taxi-fee-2 {
  width: 100%;
  height: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.Taxi-fee-3 {
  width: 100%;
  height: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.Taxi-fee-4 {
  width: 100%;
  height: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.Taxi-fee-5 {
  width: 100%;
  height: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.Taxi-fee-6 {
  width: 100%;
  height: 20%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.Taxi-station {
  width: 30%;
  height: 100%;
  display: flex;
  flex-direction: column;
}
.Taxi-station-number {
  width: 100%;
  height: 15%;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: cadetblue;
}
.Taxi-station-terminal-num {
  width: 100%;
  height: 5%;
  display: flex;
}
.Taxi-station-terminal-num-1 {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: darkcyan;
}
.Taxi-station-terminal-num-2 {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: darkcyan;
}
.Taxi-station-ordinary {
  width: 100%;
  height: 60%;
  display: flex;
}
.Taxi-station-ordinary-1 {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.Taxi-station-ordinary-2 {
  width: 50%;
  height: 100%;
  display: flex;
  flex-direction: column;
}
.Taxi-station-ordinary-2-1 {
  width: 100%;
  height: 34%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.Taxi-station-ordinary-2-2 {
  width: 100%;
  height: 34%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.Taxi-station-ordinary-2-3 {
  width: 100%;
  height: 34%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.Taxi-station-special {
  width: 100%;
  height: 20%;
  display: flex;
}
.Taxi-station-special-1 {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.Taxi-station-special-2 {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.Taxi-station-internal {
  width: 100%;
  height: 20%;
  display: flex;
}
.Taxi-station-internal-1 {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.Taxi-station-internal-2 {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.taxi-etc {
  width: 25%;
  height: 100%;
  display: flex;
  flex-direction: column;
}
.taxi-etc-1 {
  width: 100%;
  height: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: cadetblue;
}
.taxi-etc-2 {
  width: 100%;
  height: 60%;
  display: flex;
  flex-direction: column;
}
.taxi-etc-2-1 {
  width: 100%;
  height: 34%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.taxi-etc-2-2 {
  width: 100%;
  height: 34%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.taxi-etc-2-3 {
  width: 100%;
  height: 34%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.taxi-etc-3 {
  width: 100%;
  height: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.taxi-etc-4 {
  width: 100%;
  height: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.Taxi-box-right {
  width: 70%;
  height: 100%;
}
.Taxi-box-right img {
  width: 100%;
  height: 100%;
}
</style>
