<template>
  <div class="airfood-container">
    <h1>주 메뉴 선택</h1>
    <div id="app">
      <v-app id="inspire">
        <div class="wrapper">
          <div v-for="(flightMeal, i) in flightMeals" :key="i" class="food-box">
            <v-card class="mx-auto my-12" max-width="374">
              <template slot="progress">
                <v-progress-linear
                  color=""
                  height="10"
                  indeterminate
                ></v-progress-linear>
              </template>

              <v-img
                height="250"
                :src="'data:image/jpg;base64,' + flightMeal.image"
                :alt="flightMeal.menu"
              ></v-img>

              <v-card-title style="display: flex; justify-content: center">{{
                flightMeal.menu
              }}</v-card-title>

              <v-card-text>
                <div>
                  굽기만 해도 맛있는 촉촉한 치킨스테이크 지방과 살의 적당한
                  비율과 촉촉한 육즙으로 많은 이들의 사랑을 받는 부위, 치킨
                  다리살입니다. 스테이크용으로 먹기 좋게 손질해서 시즈닝했으니
                  간편하게 구워내 식사해보세요.
                </div>
              </v-card-text>

              <v-divider class="mx-4"></v-divider>

              <v-card-actions>
                <v-spacer></v-spacer>

                <div>
                  <v-btn
                    text
                    color="teal accent-4"
                    @click="updateCheck(flightMeal)"
                  >
                    세부사항
                  </v-btn>
                </div>
              </v-card-actions>

              <v-expand-transition>
                <v-card
                  v-if="flightMeal.check === true"
                  class="transition-fast-in-fast-out v-card--reveal"
                  style="height: 100%"
                >
                  <v-card-text class="pb-0">
                    <div class="text-h4 text--primary">세부목록</div>
                    <ul>
                      <li
                        v-for="(detail, idx) in flightMeals[i].details"
                        :key="idx"
                      >
                        {{ detail['mealName'] }}
                      </li>
                    </ul>
                    <hr />
                    <div class="text-h4 text--primary">알레르기</div>
                    <ul>
                      <li>
                        {{ flightMeals[i].allergies[0]['allergyType'] }}
                      </li>
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
                    >
                      Close
                    </v-btn>
                  </v-card-actions>
                </v-card>
              </v-expand-transition>
            </v-card>
            <div>
              <button @click="updateSelected(i)">선택</button>
            </div>
          </div>
        </div>
        <div class="meal-order-button" @click="finalChoice">주문하기</div>
      </v-app>
    </div>
    <!-- <button class="choice-button" @click="MoveDetail">선택</button> -->
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
import { choiceMeal } from '@/api/meal'
export default {
  name: 'TestPage2',
  components: {},
  data() {
    return {
      finalDetail: [],
      info: {
        flightNum: null,
        mealMenu: null,
        username: null,
        seatNum: null,
        status: 'PROGRESS',
      },
      select: {},
      detailOfMeal: [],
      allergiesOfMeal: [],
    }
  },
  computed: {
    ...mapState('meal', [
      'selectedMeal',
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
      await this.getFlightMeal('num1')
      this.getDetail(this.flightMeals)
      this.getAllergy(this.flightMeals)
    })
  },
  methods: {
    ...mapActions('meal', [
      'getFlightMeal',
      'getSelectedMeal',
      'getDetail',
      'getAllergy',
    ]),

    updateSelected(e) {
      this.$store.commit('meal/updateSelected', e)
    },

    updateCheck(e) {
      this.$store.commit('meal/updateCheck', e)
    },

    finalChoice() {
      this.info.flightNum = this.flightNum
      this.info.username = this.loginMember.username
      this.info.seatNum = this.seatInfo.seatNum
      this.info.mealMenu = this.selectedMeal
      const promise = new Promise((resolve, reject) => {
        resolve()
      })
      promise.then(async () => {
        await this.validMeal(this.info.seatNum)
        if (this.validMsg === '가능') {
          choiceMeal(
            this.info,
            () => {
              this.$router.push('/meal/result')
            },
            (error) => {
              console.log(error)
            }
          )
        } else {
          alert('이미 주문했습니다.')
        }
      })
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
