<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div>
    <header-component></header-component>
    <div class="box">
      <div class="body-container">
        <div class="wrapper-main">
          <div>치킨 스테이크</div>
          <img src="../../static/meal/chicken-steak.jpg" alt="치킨스테이크" />
        </div>
        <div class="wrapper-detail">
          <div>
            <div class="detail-title">세부 목록</div>
            <div class="detail-content">
              <div
                v-for="(detail, i) in details"
                :key="i"
                class="form-check form-check-inline"
              >
                <input
                  :id="'inlineCheckbox' + i"
                  class="form-check-input"
                  type="checkbox"
                  value="option1"
                />
                <label class="form-check-label" :for="'inlineCheckbox' + i">{{
                  detail
                }}</label>
              </div>
            </div>
          </div>
          <div>
            <div class="detail-title">알레르기 목록</div>
            <ul>
              <li v-for="(allergy, i) in allergies" :key="i">{{ allergy }}</li>
            </ul>
          </div>
        </div>
      </div>
      <div class="choice-box">
        <button>선택</button>
      </div>
    </div>
  </div>
</template>

<script>
import HeaderComponent from '../../components/HeaderComponent.vue'
export default {
  components: {
    HeaderComponent,
  },
  data() {
    return {
      allergies: ['땅콩', '계란', '육류'],
      details: ['치킨 스테이크', '푸딩', '스프'],
    }
  },
}
</script>

<style scoped>
.box {
  display: flex;
  width: 1000px;
  margin: auto;
  flex-direction: column;
}
.body-container {
  display: flex;
}
.wrapper-main {
  font-size: 25px;
}
.wrapper-main > div {
  margin: 20px 0;
}
.wrapper-main > img {
  width: 350px;
}
.wrapper-detail {
  display: flex;
  width: 600px;
  justify-content: space-around;
}
.detail-title {
  font-size: 25px;
  margin: 20px auto;
}
.detail-content {
  display: flex;
  flex-direction: column;
}
.detail-content > div {
  margin: 10px 0;
}
ul {
  margin: 0;
  padding: 0;
}
li {
  list-style: none;
  margin: 20px 0;
}
.choice-box {
  margin: 50px 0;
  text-align: center;
}
button {
  width: 100px;
  padding: 12px 25px;
  border: none;
  color: white;
  background-color: rgb(69, 169, 200);
}
</style>
