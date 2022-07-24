<template>
  <div>
    <header-component></header-component>
    <div class="container1">
      <div class="container-box" @click="moveOrdersSnack">
        <div>
          <img
            class="image"
            src="../../static/orders/foods.png"
            alt="service"
          />
          <h4 class="order">간식 및 음료</h4>
        </div>
      </div>
      <div class="container-box" @click="moveOrdersGoods">
        <div>
          <img
            class="image"
            src="../../static/orders/blanket.png"
            alt="service"
          />
          <h4 class="order">편의물품</h4>
        </div>
      </div>
      <div class="container-box" @click="moveOrdersAirFood">
        <div>
          <img class="image" src="../../static/orders/food.png" alt="service" />
          <h4 class="order">기내식 선택</h4>
        </div>
      </div>
      <div class="container-box" @click="moveOrdersMedical">
        <div>
          <img
            class="image"
            src="../../static/orders/hospital.png"
            alt="service"
          />
          <h4 class="order">의료</h4>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import HeaderComponent from '../../components/HeaderComponent.vue'

export default {
  name: 'OrdersIndex',
  components: {
    HeaderComponent,
  },
  methods: {
    moveOrdersSnack() {
      this.$router.push({ name: 'orders-OrdersSnack' })
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
.container1 {
  margin: auto;
  display: flex;
  height: 60vh;
  justify-content: space-around;
}

.container-box {
  text-align: center;
  width: 33%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}

.image {
  width: 70%;
}

.container-box {
  display: flex;
}
.content {
  width: 33%;
}
.order {
  padding: 2rem;
}
</style>
