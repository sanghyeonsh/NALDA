<template>
  <div>
    <div class="container1">
      <div class="container-box" @click="moveOrdersSnack">
        <div>
          <img class="image" src="../../static/service.png" alt="service" />
          <h4>간식 및 음료</h4>
        </div>
      </div>
      <div class="container-box" @click="moveOrdersGoods">
        <div>
          <img class="image" src="../../static/service.png" alt="service" />
          <h4>편의물품</h4>
        </div>
      </div>
      <div class="container-box" @click="moveOrdersAirFood">
        <div>
          <img class="image" src="../../static/service.png" alt="service" />
          <h4>기내식 선택</h4>
        </div>
      </div>
      <div class="container-box" @click="moveOrdersMedical">
        <div>
          <img class="image" src="../../static/service.png" alt="service" />
          <h4>의료</h4>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'OrdersIndex',
  components: {},
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

<style>
.container1 {
  margin: auto;
  display: flex;
  height: 92vh;
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
</style>
