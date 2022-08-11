<template>
  <div class="main-container">
    <div class="main-container-box" @click="moveRequestPage">
      <div>
        <img class="image" src="/main/call_sevice_icon.png" alt="service" />
        <h3>Request</h3>
      </div>
    </div>
    <div class="main-container-box" @click="moveStockPage">
      <div>
        <img class="image" src="/main/excel_icon.png" alt="custom_declaration" />
        <h3>Maninging Stock</h3>
      </div>
    </div>
    <div class="main-container-box" @click="moveMealPage">
      <div>
        <img class="image" src="/orders/food.png" alt="airport_info" />
        <h3>Meal Service</h3>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'AttendantMain',
  data() {
    return {
      flightNum: '',
      airplaneKind: '',
    }
  },
  created() {},
  methods: {
    moveRequestPage() {
      this.$router.push('/attendant/request')
    },
    moveStockPage() {
      this.$router.push('/attendant/stock')
    },
    moveMealPage() {
      this.airplaneKind = '777-200ER-1'
      if (this.airplaneKind === '777-200ER-1') {
        this.$router.push('/attendant/meal-777-200ER-1')
      } else if (this.airplaneKind === 'A380') {
        this.$router.push('/attendant/meal-A380')
      }
    },
  },
}
</script>

<style scoped>
.main-container {
  display: flex;
  height: 70vh;
}
.main-container-box {
  text-align: center;
  width: 50%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.main-container-box img {
  width: 70%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  /* filter: opacity(0.5) drop-shadow(#206e95); */
}
.main-container-box h3 {
  margin-top: 5vh;
}

.main-container-box div {
  padding: 7vh;
}
</style>
