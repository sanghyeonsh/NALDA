<template>
  <div class="airfood-container">
    <h1 @click="test">항공편 {{flightNum}} 기내식 선택</h1>
    <div id="app">
      <v-app id="inspire">
        <div class="wrapper">
          <div v-for="(meal, i) in mealList" :key="i" class="food-box">
            <v-card
              class="mx-auto my-12"
              :class="{valid: (flightMealList[i].validated === true || meal.validated === true)}"
              max-width="374"
              @click="setMealSelected(meal)"
            >
              <template slot="progress">
                <v-progress-linear color height="10" indeterminate></v-progress-linear>
              </template>

              <v-img height="250" :src="'data:image/jpg;base64,' + meal.image" :alt="meal.menu"></v-img>

              <v-card-title style="font-size: x-large; display: flex; justify-content: flex-start">
                {{
                meal.menu
                }}
              </v-card-title>

              <v-card-text>
                <div>{{meal.content}}</div>
              </v-card-text>

              <v-divider class="mx-4"></v-divider>

              <v-card-actions>
                <!-- <v-spacer></v-spacer> -->
                <div v-if="meal.total !== null">
                  <v-btn text color="teal accent-4" @click="updateCheck(meal)">수량: {{meal.total}}</v-btn>
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

                  <!-- <v-card-actions class="pt-0">
                    <v-spacer></v-spacer>
                    <v-btn
                      text
                      color="teal accent-4"
                      style="position: relative; top: 185px; right: 10px"
                      @click="updateCheck(flightMeal)"
                    >Close</v-btn>
                  </v-card-actions>-->
                </v-card>
              </v-expand-transition>
            </v-card>
            <!-- <div>
              <button @click="setMealSelected(meal)">선택</button>
            </div>-->
          </div>
        </div>
        <div class="meal-order-button">
          <v-btn
            color="cyan"
            class="ma-2 white--text"
            x-large
            style="width: 20%;"
            @click="setMeal"
          >기내식입력</v-btn>
        </div>
      </v-app>
    </div>
    <v-app id="item-modal">
      <v-dialog v-model="dialog" hide-overlay transition="dialog-bottom-transition" width="60%">
        <v-card tile v-bind="selectedMeal">
          <v-toolbar flat dark color="rgb(69, 169, 200)">
            <v-btn icon dark @click="toggle">
              <v-icon>mdi-close</v-icon>
            </v-btn>
            <v-toolbar-title style="font-size: xx-large;">{{selectedMeal.menu}}</v-toolbar-title>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn
                v-if="selectedMeal.validated === false"
                class="mx-2"
                fab
                dark
                large
                color="pink"
                style="width:100%;"
                @click="setMealtotal(selectedMeal)"
              >
                <div style="font-size:x-large">Validate</div>
              </v-btn>
              <v-btn
                v-else-if="selectedMeal.validated === true"
                class="mx-2"
                fab
                dark
                large
                color="pink"
                style="width:100%;"
                @click="unsetMealtotal(selectedMeal)"
              >
                <div style="font-size:x-large">unValidate</div>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text class="d-flex align-center justify-content-between">
            <img
              class="item-img mt-5"
              :src="'data:image/jpg;base64,' + selectedMeal.image"
              style="height: 350px; width: 350px;"
            />
            <div style="margin-right: 17%; display: flex; flex-direction: column;">
              <div style="font-size: xxx-large;">수량: {{selectedMeal.total}}</div>
            </div>
          </v-card-text>
        </v-card>
      </v-dialog>
    </v-app>
  </div>
</template>

<script>
import { mapState, mapActions, mapMutations } from 'vuex'
export default {
  name: 'AttendantMealSet',
  components: {},
  data() {
    return {
      valid: true,
      dialog: false,
      mealList: [],
      total: 0,
      totalRules: [(v) => /^[0-9]*$/.test(v) || '숫자만 입력해주세요.'],
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
      'flightMealList',
    ]),
    ...mapState('user', ['loginMember', 'flightNum', 'seatInfo']),
  },
  created() {
    // flightNum받아와서 넣어야함
    const promise = new Promise((resolve, reject) => {
      resolve()
    })
    promise.then(async () => {
      this.mealList = []
      await this.flightMealList.forEach((meal) => {
        const mealInfo = {
          menu: meal.menu,
          image: meal.image,
          imageName: meal.imageName,
          total: meal.total,
          validated: meal.validated,
        }
        this.mealList.push(mealInfo)
      })
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
      'registSeatMeal',
      'validMeal',
    ]),
    ...mapMutations('meal', ['UPDATE_FLIGHTMEALS_LIST']),
    test() {
      // console.log(this.mealList)
      console.log(this.flightMealList)
      console.log(this.select)
    },
    setMealSelected(meal) {
      if (meal.validate !== true) {
        this.dialog = !this.dialog
      }
      this.selectedMeal = meal
      //   console.log(meal)
      // console.log(this.selectedMeal)
    },
    setMealtotal(meal) {
      meal.validated = true
      const info = {
        fligtNum: this.flightNum,
        mealMenu: meal.menu,
        total: meal.total,
      }
      console.log(info)
      if (this.select.length === 0) {
        this.select.push(info)
      } else if (this.select.length < 2) {
        let isSame = false
        this.select.forEach((selectmeal) => {
          if (selectmeal.menu === info.mealMenu) {
            isSame = true
          }
        })
        if (isSame === false) {
          this.select.push(info)
        }
      } else {
        meal.validated = false
      }
      this.UPDATE_FLIGHTMEALS_LIST(meal)
      console.log(this.select)
      this.dialog = !this.dialog
    },
    unsetMealtotal(meal) {
      meal.validated = false
      this.UPDATE_FLIGHTMEALS_LIST(meal)
      this.select = this.select.filter(
        (selectmeal) => selectmeal.validated !== false
      )
      console.log(this.select)
      this.dialog = !this.dialog
    },
    toggle() {
      this.dialog = !this.dialog
    },
    setMeal() {
      this.registFlightMeal(this.select)
      // this.select = []
      console.log(this.select)
      console.log('기내식등록')
    },
    updateSelected(e) {
      this.$store.commit('meal/updateSelected', e)
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
  font-family: 'twayfly';
}
.v-application--wrap {
  flex: 1 1 auto;
  -webkit-backface-visibility: hidden;
  backface-visibility: hidden;
  display: flex;
  flex-direction: column;
  min-height: 0vh;
  max-width: 100%;
  position: relative;
  background-color: rgba(239, 239, 239, 0.511);
}
.airfood-container {
  height: 75vh;
  background-color: rgba(239, 239, 239, 0.511);
}
.airfood-container > h1 {
  text-align: center;
  vertical-align: middle;
  margin-top: 3%;
}
.wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  overflow-y: hidden;
  -webkit-overflow-scrolling: touch;
}

/* .wrapper {
  -webkit-overflow-scrolling: touch;
} */

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
.v-card__actions {
  align-items: center;
  display: flex;
  padding: 8px;
  justify-content: flex-start;
}

.valid {
  filter: brightness(50%);
  /* pointer-events: none; */
}
.food-box {
  width: 20%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  /* gap: 10vw; */
  background-color: rgba(239, 239, 239, 0.511);
}
.v-card__title {
  justify-content: flex-start;
}
.meal-order-button {
  display: flex;
  justify-content: center;
}

.v-text-field input {
  flex: 1 1 auto;
  line-height: 20px;
  padding: 8px 0 8px;
  max-width: 100%;
  min-width: 0px;
  width: 100%;
  text-align: center;
}
</style>
