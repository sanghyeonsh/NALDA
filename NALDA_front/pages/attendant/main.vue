<template>
  <div class="main-container">
    <div class="main-container-box" @click="moveRequestPage">
      <div>
        <img class="image" src="/main/call_sevice_icon.png" alt="service" />
        <h3>고객요청</h3>
      </div>
    </div>
    <div class="main-container-box" @click="moveStockPage">
      <div>
        <img class="image" src="/main/excel_icon.png" alt="custom_declaration" />
        <h3>재고목록</h3>
      </div>
    </div>
    <div class="main-container-box" @click="moveMealPage">
      <div>
        <img class="image" src="/orders/food.png" alt="airport_info" />
        <h3>기내식관리</h3>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState } from 'vuex'
export default {
  name: 'AttendantMain',
  data() {
    return {
      airplaneKind: '',
    }
  },
  computed: {
    ...mapState('meal', [
      'meals',
      'flightMeals',
      'details',
      'allergies',
      'validMsg',
      'flightMealList',
    ]),
    ...mapState('user', ['loginMember', 'flightNum', 'seatInfo']),
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
      if (this.flightMeals?.length === 0) {
        if (this.flightMealList?.length === 0) {
          this.$router.push('/attendant/mealtable')
        } else {
          this.$router.push('/attendant/mealset')
        }
      } else if (this.flightMeals?.length > 0) {
        this.airplaneKind = '777-200ER-1'
        if (this.airplaneKind === '777-200ER-1') {
          this.$router.push('/attendant/meal-777-200ER-1')
        } else if (this.airplaneKind === 'A380') {
          this.$router.push('/attendant/meal-A380')
        }
      }
    },
  },
}
</script>

<style scoped>
.main-container {
  display: flex;
  height: 75vh;
  background-color: rgba(239, 239, 239, 0.511);
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
