<template>
  <div class="taxi-container">
    <div class="taxi-btn-wrap">
      <div>
        <div class="left-icon-table" @click="tableClick">
          <div>
            <div>
              이용 요금
              <br />승차장 번호
              <br />
            </div>
          </div>
        </div>
      </div>
      <div>
        <div class="left-icon-maps" @click="mapClick">
          <div>
            <div>
              승강장
              <br />지도
            </div>
          </div>
        </div>
      </div>
    </div>
    <div v-if="page === 'map'" class="Taxi-box-right" :class="{ map: isMap }">
      <SubwayMap />
    </div>
    <div
      v-else-if="page === 'table'"
      class="Taxi-box-right"
      :class="{ table: isTable }"
    >
      <h3 style="margin-bottom: 3%; font-size: xxx-large">
        이용 요금 및 승차장 번호
      </h3>
      <div class="taxi-info-wrap">
        <table class="taxi-table-wrap">
          <thead>
            <tr>
              <th rowspan="2">구분</th>
              <th rowspan="2">기본요금(원)</th>
              <th colspan="2">승차장번호</th>
              <th rowspan="2">비고</th>
            </tr>
            <tr>
              <th>제 1여객터미널</th>
              <th>제 2여객터미널</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td rowspan="3">일반택시</td>
              <td>서울: 3,800</td>
              <td rowspan="3">5C, 6C, 6D</td>
              <td>5C</td>
              <td>24:00 ~ 04:00 심야할증 20% 적용</td>
            </tr>
            <tr>
              <td>경기: 3,800</td>
              <td>4D</td>
              <td>24:00 ~ 04:00 심야할증 20% 적용</td>
            </tr>
            <tr>
              <td>인천: 3,800</td>
              <td>3C,3D</td>
              <td>24:00 ~ 04:00 심야할증 20% 적용</td>
            </tr>
            <tr>
              <td>모범택시 / 대형택시(9인승)</td>
              <td>6,500</td>
              <td>7C/8C</td>
              <td>5D</td>
              <td>심야할증 및 시계할증 없음</td>
            </tr>
            <tr>
              <td>인터내셔널택시 스마트 택시</td>
              <td>서울지역 구간요금제 적용</td>
              <td>4C</td>
              <td>1C</td>
              <td>외국어 서비스지원 공식 지정 택시</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
    <FooterComponent style="background-color: rgba(239, 239, 239, 0.511)" />
  </div>
</template>

<script>
export default {
  data() {
    return {
      page: 'table',
      isMap: false,
      isTable: true,
    }
  },
  methods: {
    mapClick() {
      this.page = 'map'
      this.isMap = true
      this.isTable = false
      document.getElementsByClassName('left-icon-maps')[0].style.background =
        '#206e95'
      document.getElementsByClassName('left-icon-table')[0].style.background =
        'rgb(69, 169, 200)'
    },
    tableClick() {
      document.getElementsByClassName('left-icon-table')[0].style.background =
        '#206e95'
      document.getElementsByClassName('left-icon-maps')[0].style.background =
        'rgb(69, 169, 200)'
      this.page = 'table'
      this.isTable = true
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
.taxi-container {
  display: flex;
  /* width: 100vh; */
  /* header넣으면 줄이기 */
  height: 85vh;
}
.taxi-btn-wrap {
  display: flex;
  flex-direction: column;
  height: 85vh;
  border-right: 3px solid rgb(69, 169, 200);
  align-items: center;
  background-color: rgba(239, 239, 239, 0.511);
  z-index: 999;
}
.left-icon-maps {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100px;
  height: 100px;
  margin: 15px;
  color: white;
  background-color: rgb(69, 169, 200);
  box-shadow: 8px 8px 15px rgba(7, 47, 69, 0.1);
  border-radius: 50%;
  text-align: center;
}
.left-icon-table {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100px;
  height: 100px;
  margin: 15px;
  color: white;
  background-color: #206e95;
  box-shadow: 8px 8px 15px rgba(7, 47, 69, 0.1);
  border-radius: 50%;
  text-align: center;
}
.Taxi-box-right {
  display: none;
}
.map {
  display: block;
  height: 75vh;
}
.table {
  /* width: 80%; */
  height: 85vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  font-size: 16px;
  background-color: rgba(239, 239, 239, 0.511);
}

/* taxi-table wrap css */
.taxi-info-wrap {
  /* background-color: rgb(153, 193, 202); */
  width: 90%;
  height: 70%;
  display: flex;
  justify-content: center;
  align-items: center;
  text-align: center;
  box-shadow: 15px 15px 18px rgba(10, 55, 80, 0.1);
}

.taxi-table-wrap {
  /* border: solid 1px black; */
  width: 100%;
  height: 100%;
  font-size: 1.13em;
}

.Taxi-box-right[data-v-656bb545] {
  margin-bottom: 9%;
}

th,
td {
  border: 2.5px solid #dee2e6;
  text-align: center;
  vertical-align: middle;
}

thead {
  background-color: #323648;
  color: white;
  /* background-color: rgb(105, 148, 157); */
}
</style>
