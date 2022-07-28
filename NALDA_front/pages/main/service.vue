<template>
  <div class="main-service-container">
    <div class="service-container-box" @click="MoveSnack">
      <img src="../../static/orders/foods.png" alt="snack" />
      <h3>간식 및 음료</h3>
    </div>
    <div class="service-container-box" @click="MoveGoods">
      <img src="../../static/orders/blanket.png" alt="goods" />
      <h3>편의물품</h3>
    </div>
    <div class="service-container-box" @click="MoveMeal">
      <img src="../../static/orders/food.png" alt="meal" />
      <h3>기내식 선택</h3>
    </div>
    <div class="service-container-box" @click="MoveMedical">
      <img src="../../static/orders/hospital.png" alt="medical" />
      <h3>의료</h3>
    </div>
  </div>
</template>

<script>
export default {
  name: 'MainService',
  components: {},
  methods: {
    MoveSnack() {
      this.$router.push('/orders/snack')
    },
    MoveGoods() {
      this.$router.push('/goods')
    },
    MoveMeal() {
      this.$router.push('/meal')
    },
    MoveMedical() {
      this.$router.push('/medical')
    },
  },
}
</script>

<style scoped>
.main-service-container {
  display: flex;
  height: 70vh;
}
.service-container-box {
  text-align: center;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.service-container-box img {
  width: 70%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
}
.service-container-box h3 {
  margin-top: 40px;
}
</style>
