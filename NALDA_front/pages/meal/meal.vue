<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div>
    <header-component></header-component>
    <div class="box">
      <div class="title">주 메뉴 선택</div>
      <div class="wrapper">
        <div class="wrapper-choice">
          <img src="../../static/meal/chicken-steak.jpg" alt="치킨 스테이크" />
          <div class="form-check form-check-inline">
            <input
              id="inlineRadio1"
              class="form-check-input"
              type="radio"
              name="inlineRadioOptions"
              value="option1"
            />
            <label class="form-check-label" for="inlineRadio1"
              >치킨스테이크</label
            >
          </div>
        </div>
        <div class="wrapper-choice">
          <img src="../../static/meal/nakji-deopbap.png" alt="낙지 덮밥" />

          <div class="form-check form-check-inline">
            <input
              id="inlineRadio2"
              class="form-check-input"
              type="radio"
              name="inlineRadioOptions"
              value="option2"
            />
            <label class="form-check-label" for="inlineRadio2">낙지 덮밥</label>
          </div>
        </div>
      </div>
      <button>선택</button>
    </div>
  </div>
</template>

<script>
import HeaderComponent from '../../components/HeaderComponent.vue'
export default {
  components: {
    HeaderComponent,
  },
}
</script>

<style scoped>
.box {
  width: 800px;
  margin: auto;
  text-align: center;
}
.title {
  font-size: 25px;
  text-align: left;
}
.box > div {
  margin: 20px 0;
}
.wrapper {
  display: flex;
  justify-content: space-between;
}
.wrapper > div > img {
  width: 350px;
  height: 350px;
}
.wrapper-choice {
  display: flex;
  flex-direction: column;
  align-items: center;
}
.wrapper-choice > div {
  margin-top: 30px;
}
button {
  padding: 12px 25px;
  border: none;
  color: white;
  background-color: rgb(69, 169, 200);
}
</style>
