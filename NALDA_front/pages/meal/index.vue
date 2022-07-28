<template>
  <div class="airfood-container">
    <h1>주 메뉴 선택</h1>
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
    <button class="choice-button" @click="MoveDetail">선택</button>
  </div>
</template>

<script>
export default {
  name: 'OrdersAirFood',
  components: {},
  methods: {
    MoveDetail() {
      this.$router.push('/meal/detail')
    },
  },
}
</script>

<style scoped>
.airfood-container {
  height: 70vh;
}
.airfood-container > h1 {
  text-align: center;
  vertical-align: middle;
  line-height: 10vh;
  height: 10vh;
}
.wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 20vw;
}
.wrapper img {
  width: 400px;
  height: 300px;
}
.wrapper-choice {
  display: flex;
  flex-direction: column;
  align-items: center;
}
.wrapper-choice > div {
  margin-top: 30px;
}
.choice-button {
  width: 10vw;
  padding: 12px 25px;
  border: none;
  color: white;
  background-color: rgb(69, 169, 200);
  position: fixed;
  margin: 0 auto;
  left: 0;
  right: 0;
  bottom: 25vh;
}
</style>
