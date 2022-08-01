<template>
  <div class="airfood-container">
    <h1>주 메뉴 선택</h1>
    <div class="wrapper">
      <div
        v-for="(flightMeal, i) in flightMeals"
        :key="i"
        class="wrapper-choice"
      >
        <img
          :src="'data:image/jpg;base64,' + flightMeal.image"
          :alt="flightMeal.menu"
        />
        <div class="form-check form-check-inline">
          <input
            :id="'inlineRadio' + i"
            class="form-check-input"
            type="radio"
            name="inlineRadioOptions"
            :value="flightMeal.id"
          />
          <label class="form-check-label" :for="'inlineRadio' + i">{{
            flightMeal.menu
          }}</label>
        </div>
      </div>
    </div>
    <button class="choice-button" @click="MoveDetail">선택</button>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
export default {
  name: 'OrdersAirFood',
  components: {},
  computed: {
    ...mapState('meal', ['selectedMeal', 'flightMeals']),
  },
  created() {
    this.getFlightMeal(4)
  },
  methods: {
    ...mapActions('meal', ['getFlightMeal', 'getDetail', 'getAllergy']),

    MoveDetail() {
      this.getDetail(
        document.querySelector(
          'input[type=radio][name=inlineRadioOptions]:checked'
        ).value
      )
      this.getAllergy(
        document.querySelector(
          'input[type=radio][name=inlineRadioOptions]:checked'
        ).value
      )
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
  display: flex;
  justify-content: center;
  width: 10vw;
  padding: 12px 25px;
  border: none;
  color: white;
  background-color: rgb(69, 169, 200);
  margin: auto;
  left: 0;
  right: 0;
  bottom: 25vh;
}
</style>
