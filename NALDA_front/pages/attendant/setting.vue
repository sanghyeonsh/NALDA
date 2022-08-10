<template>
  <div class="setting-main-container">
    <div class="setting-wrap">
      <section class="setting-input-section-wrap">
        <h2>flight</h2>
        <div>
          <h6>편명</h6>
          <div class="setting-input-flight-wrap">
            <input
              v-model="flightNum"
              :rules="numRules"
              required
              placeholder="flight Number"
              type="text"
            />
          </div>
        </div>
        <div class="dep-input-wrap">
          <div>
            <h6>DEP DATE</h6>
            <div class="dep-input-date">
              <input v-model="departureDate" type="date" />
            </div>
          </div>
          <div>
            <h6>DEP TIME</h6>
            <div class="dep-input-date">
              <input v-model="departureTime" type="time" />
            </div>
          </div>
        </div>
        <div class="setting-button-wrap">
          <button @click="registerFlightinfo()">register</button>
        </div>
        <!-- <div class="modify-stay-sign-in">
                    <i class="far fa-check-circle"></i>
                    <span>modify</span>
        </div>-->
        <b-modal id="flightNum-modal" hide-footer>
          <template #modal-title>알림</template>
          <div class="d-block text-center">
            <h3>항공편명을 다시 확인해주세요.</h3>
          </div>
          <b-button class="mt-3" block @click="$bvModal.hide('check-modal')"
            >Close Me</b-button
          >
        </b-modal>
      </section>
    </div>
  </div>
</template>

<script>
export default {
  name: 'AttendantSetting',
  data() {
    return {
      flightNum: '',
      departureDate: '',
      departureTime: '',
      departureCountry: '',
      arrivalCountry: '',
      numRules: [(v) => !!v || '항공편명은 필수 입력사항입니다.'],
    }
  },
  methods: {
    registerFlightinfo() {
      const Date = this.departureDate + 'T' + this.departureTime + ':00'
      const flightInfo = {
        flightNum: this.flightNum,
        flightDate: Date,
      }
      console.log(flightInfo)
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
input[type='password'] {
  font-family: 'Malgun gothic', dotum, sans-serif;
}
::placeholder {
  font-family: 'twayfly';
}

:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
}

* {
  margin: 0;
  padding: 0;
  font-family: 'twayfly';
}

body {
  background: #f5f6f7;
}

.setting-main-container {
  width: 100%;
  height: 70vh;
  display: flex;
  justify-content: center;
  align-items: center;
  overflow: scroll;
}

.setting-main-container::-webkit-scrollbar {
  display: none;
}

.setting-main-container .setting-wrap {
  width: 768px;
}

.setting-main-container .setting-wrap .sel-lang-wrap .lang-select {
  width: 96px;
  height: 30px;
  color: #4e4e4e;
  border: solid 1px #dadada;
}

/* flight 정보 input 대분류 CSS */

.setting-input-section-wrap {
  padding-top: 60px;
  padding-bottom: 60px;
  display: flex;
  flex-direction: column;
  align-items: center;
  background-color: #f5f6f7;
}

.setting-input-section-wrap h2 {
  margin-bottom: 3%;
}

.setting-input-section-wrap h6 {
  margin-bottom: 3px;
  margin-top: 10px;
  text-align: left;
  font-size: small;
}

.setting-input-wrap {
  width: 465px;
  height: 55px;
  background: white;
  border-radius: 10px;
}

.setting-input-wrap input {
  border: none;
  width: 465px;
  /* margin-top: 10px; */
  font-size: 14px;
  /* margin-left: 10px; */
  height: 55px;
  border-radius: 10px;
  padding: 10px;
  border: solid 1px #dadada;
}

/* flight number CSS */
.setting-input-flight-wrap {
  width: 465px;
  height: 55px;
  border-radius: 10px;
  display: flex;
  justify-content: space-between;
}

.setting-input-flight-wrap input {
  width: 100%;
  height: 100%;
  border: none;
  /* margin-top: 10px; */
  font-size: 14px;
  /* margin-left: 10px; */
  padding: 10px;
  /* height: 55px; */
  border: solid 1px #dadada;
  background: white;
  border-radius: 10px;
}

/* flight date CSS */
.dep-input-wrap {
  width: 465px;
  display: flex;
  justify-content: space-between;
}
.dep-input-date {
  width: 225px;
  height: 55px;
  border: none;
  border-radius: 10px;
}
.dep-input-date input {
  border: none;
  width: 225px;
  padding: 10px;
  border: solid 1px #dadada;
  border-radius: 10px;
}

/* register 버튼 CSS */

.setting-button-wrap {
  padding-top: 3%;
}

.setting-button-wrap button {
  width: 465px;
  height: 55px;
  font-size: 20px;
  background: #206e95;
  color: white;
  border: solid 1px #88c0c5;
  border-radius: 10px;
}
</style>
