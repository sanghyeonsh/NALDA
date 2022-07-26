<template>
  <div id="orders-main">
    <HeaderComponent />
    <div class="orders-container">
      <div class="container-box" @click="moveOrdersSnack">
        <div>
          <img class="image" src="../../static/orders/foods.png" alt="service" />
          <h3>간식 및 음료</h3>
        </div>
      </div>
      <div class="container-box" @click="moveOrdersGoods">
        <div>
          <img class="image" src="../../static/orders/blanket.png" alt="service" />
          <h3>편의물품</h3>
        </div>
      </div>
      <div class="container-box" @click="moveOrdersAirFood">
        <div>
          <img class="image" src="../../static/orders/food.png" alt="service" />
          <h3>기내식 선택</h3>
        </div>
      </div>
      <div class="container-box" @click="moveOrdersMedical">
        <div>
          <img class="image" src="../../static/orders/hospital.png" alt="service" />
          <h3>의료</h3>
        </div>
      </div>
    </div>
    <FooterComponent />
  </div>
</template>

<script>
export default {
  name: 'OrdersIndex',
  components: {},
  methods: {
    moveOrdersSnack() {
      this.$router.push({ name: 'orders-OrdersDessert' })
    },
    moveOrdersGoods() {
      this.$router.push({ name: 'orders-OrdersGoods' })
    },
    moveOrdersAirFood() {
      this.$router.push({ name: 'orders-OrdersAirFood' })
    },
    moveOrdersMedical() {
      this.$router.push({ name: 'orders-OrdersMedical' })
    },
  },
}
</script>

<style scoped>
#orders-main {
  height: 100%;
}
.orders-container {
  margin-top: 10%;
  margin-bottom: 10%;
  margin-right: 5%;
  margin-left: 5%;
  display: flex;
  height: 100%;
}
.container-box {
  text-align: center;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.container-box img {
  width: 70%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
}
.container-box h3 {
  margin-top: 40px;
}
</style>
