<template>
  <div class="main-service-container">
    <div class="service-container-box" @click="MoveSnack">
      <img src="/orders/foods.png" alt="snack" />
      <h3>간식 및 음료</h3>
    </div>
    <div class="service-container-box" @click="MoveGoods">
      <img src="/orders/blanketbefore.png" alt="goods" />
      <h3>편의물품</h3>
    </div>
    <div class="service-container-box" @click="MoveMeal">
      <img src="/orders/lunchbox (1).png" alt="meal" />
      <h3>기내식 선택</h3>
    </div>
    <div class="service-container-box" @click="MoveMedical">
      <img src="/orders/hospital.png" alt="medical" />
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
@font-face {
  font-family: 'twayfly';
  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_tway@1.0/twayfly.woff')
    format('woff');
  font-weight: normal;
  font-style: normal;
}

* {
  margin: 0;
  padding: 0;
  font-family: 'twayfly';
}
.main-service-container {
  display: flex;
  height: 85vh;
  width: 100vw;
}
.service-container-box {
  margin-bottom: 5vh;
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
