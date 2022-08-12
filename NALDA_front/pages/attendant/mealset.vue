<template>
  <div class="airfood-container">
    <h1 @click="test">주 메뉴 선택</h1>
    <div id="app">
      <v-app id="inspire">
        <div class="wrapper">
          <div v-for="(meal, i) in meals" :key="i" class="food-box">
            <v-card class="mx-auto my-12" max-width="374">
              <template slot="progress">
                <v-progress-linear color height="10" indeterminate></v-progress-linear>
              </template>

              <v-img height="250" :src="'data:image/jpg;base64,' + meal.image" :alt="meal.menu"></v-img>

              <v-card-title style="display: flex; justify-content: center">
                {{
                meal.menu
                }}
              </v-card-title>

              <v-card-text>
                <div>{{meal.content}}</div>
              </v-card-text>

              <v-divider class="mx-4"></v-divider>

              <v-card-actions>
                <v-spacer></v-spacer>

                <div>
                  <v-btn text color="teal accent-4" @click="updateCheck(meal)">세부사항</v-btn>
                </div>
              </v-card-actions>

              <v-expand-transition>
                <v-card
                  v-if="meal.check === true"
                  class="transition-fast-in-fast-out v-card--reveal"
                  style="height: 100%"
                >
                  <v-card-text class="pb-0">
                    <div class="text-h4 text--primary">세부목록</div>
                    <ul>
                      <li
                        v-for="(detail, idx) in meals[i].details"
                        :key="idx"
                      >{{ detail['mealName'] }}</li>
                    </ul>
                    <hr />
                    <div class="text-h4 text--primary">알레르기</div>
                    <ul>
                      <li>{{ meals[i].allergies[0]['allergyType'] }}</li>
                    </ul>

                    <hr />
                  </v-card-text>

                  <v-card-actions class="pt-0">
                    <v-spacer></v-spacer>
                    <v-btn
                      text
                      color="teal accent-4"
                      style="position: relative; top: 185px; right: 10px"
                      @click="updateCheck(flightMeal)"
                    >Close</v-btn>
                  </v-card-actions>
                </v-card>
              </v-expand-transition>
            </v-card>
            <div>
              <button @click="setMealSelected(meal)">선택</button>
            </div>
          </div>
        </div>
        <div class="meal-order-button" @click="setMeal">기내식입력</div>
      </v-app>
    </div>
    <v-app id="item-modal">
      <v-dialog v-model="dialog" hide-overlay transition="dialog-bottom-transition" width="60%">
        <v-card tile>
          <v-toolbar flat dark color="rgb(69, 169, 200)">
            <v-btn icon dark @click="toggle">
              <v-icon>mdi-close</v-icon>
            </v-btn>
            <v-toolbar-title>선택 제품</v-toolbar-title>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn class="mx-2" fab dark large color="pink" @click="addSelectedItem">
                <v-icon dark>mdi-cart-heart</v-icon>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text v-bind="selectedMeal" class="d-flex align-center">
            <img class="item-img mt-5" :src="'data:image/jpg;base64,' + selectedMeal.image" />
            <div style="font-size: xx-large; margin-left: 20%">
              <v-btn class="mx-2" fab dark large color="cyan" @click="minusNum">
                <v-icon dark>mdi-minus</v-icon>
              </v-btn>
              {{ num }}
              <v-btn class="mx-2" fab dark large color="cyan" @click="addNum">
                <v-icon dark>mdi-plus</v-icon>
              </v-btn>
            </div>
          </v-card-text>
        </v-card>
      </v-dialog>
    </v-app>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
export default {
  name: 'AttendantMealSet',
  components: {},
  data() {
    return {
      dialog: false,
      info: {
        flightNum: '',
        mealMenu: '',
        total: null,
        status: 'PROGRESS',
      },
      select: [],
      selectedMeal: [],
    }
  },
  computed: {
    ...mapState('meal', [
      'meals',
      'flightMeals',
      'details',
      'allergies',
      'validMsg',
    ]),
    ...mapState('user', ['loginMember', 'flightNum', 'seatInfo']),
  },
  created() {
    // flightNum받아와서 넣어야함
    const promise = new Promise((resolve, reject) => {
      resolve()
    })
    promise.then(async () => {
      await this.getMeal()
      this.getDetail(this.meals)
      this.getAllergy(this.meals)
    })
  },
  methods: {
    ...mapActions('meal', [
      'getMeal',
      'getFlightMeal',
      'getSelectedMeal',
      'getDetail',
      'getAllergy',
      'registFlightMeal',
    ]),
    test() {
      this.getMeal()
      console.log(this.meals)
    },
    setMealSelected(meal) {
      this.dialog = !this.dialog
      this.select.push(meal)
      this.selectedMeal = meal
      //   console.log(meal)
      //   console.log(this.selectedMeal)
    },
    toggle() {
      this.dialog = !this.dialog
    },
    setMeal() {
      this.registFlightMeal()
    },
    updateSelected(e) {
      this.$store.commit('meal/updateSelected', e)
    },

    updateCheck(e) {
      this.$store.commit('meal/updateCheck', e)
    },
    ...mapActions('meal', [
      'getDetail',
      'getAllergy',
      'registSeatMeal',
      'validMeal',
    ]),
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
  font-family: 'twayfly';
}

.airfood-container {
  height: 75vh;
  background-color: rgba(239, 239, 239, 0.511);
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
.v-card--reveal {
  bottom: 0;
  opacity: 1 !important;
  position: absolute;
  width: 100%;
}
.food-box {
  width: 35%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  /* gap: 10vw; */
}
.meal-order-button {
  display: flex;
  justify-content: center;
}
</style>
