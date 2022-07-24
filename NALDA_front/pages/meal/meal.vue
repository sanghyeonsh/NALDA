<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div>
    <header-component></header-component>
    <div class="box">
      <div class="title">주 메뉴 선택</div>
      <div class="wrapper">
        <div
          v-for="(flightMeal, i) in flightMeals"
          :key="i"
          class="wrapper-choice"
        >
          <img src="../../static/meal/chicken-steak.jpg" alt="치킨 스테이크" />
          <div class="form-check form-check-inline">
            <input
              :id="'mealRadio' + i"
              v-model="choicedMeal"
              class="form-check-input"
              type="radio"
              name="mealOptions"
              :value="flightMeal.menu"
            />
            <label class="form-check-label" :for="'mealRadio' + i">{{
              flightMeals[i].menu
            }}</label>
          </div>
        </div>
      </div>
      <button @click="selectMenu">선택</button>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions, mapMutations } from 'vuex'
import HeaderComponent from '../../components/HeaderComponent.vue'

export default {
  components: {
    HeaderComponent,
  },
  data() {
    return {
      choicedMeal: '',
    }
  },
  computed: {
    // 수정
    ...mapState('meal', ['flightMeals', 'selectedMeal']),
  },
  // created() {
  //   this.getFlightMeal()
  // },

  methods: {
    ...mapActions('meal', ['getFlightMeal']),
    ...mapMutations('meal', ['SET_SELECTED_MEAL']),
    selectMenu() {
      this.SET_SELECTED_MEAL(this.choicedMeal)
      console.log(this.selectedMeal)
      this.$router.push('/meal/detail')
    },
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
