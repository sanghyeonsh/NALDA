<template>
  <div class="meal-container">
    <div class="body-container">
      <div class="wrapper-main">
        <div>{{ selectedMeal.mealMenu }}</div>
        <img
          :src="'data:image/jpg;base64,' + selectedMeal.bytesdata"
          :alt="selectedMeal.mealMenu"
        />
      </div>
      <div class="wrapper-detail">
        <div>
          <div class="detail-title">세부 목록</div>
          <ul>
            <li v-for="(detail, i) in details" :key="i">
              {{ detail.mealName }}
            </li>
          </ul>
          <!-- </div> -->
          <!-- </div> -->
        </div>
        <div>
          <div class="detail-title">알레르기 목록</div>
          <ul>
            <li v-for="(allergy, i) in allergies" :key="i">
              {{ allergy.allergyType }}
            </li>
          </ul>
        </div>
      </div>
    </div>
    <div class="choice-box">
      <button @click="finalChoice">선택</button>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
import { choiceMeal } from '@/api/meal'
export default {
  name: 'MealDetail',
  components: {},
  data() {
    return {
      finalDetail: [],
      info: {
        flightNum: null,
        mealMenu: null,
        username: null,
        seatNum: null,
      },
      select: {},
      detailOfMeal: [],
      allergiesOfMeal: [],
    }
  },
  computed: {
    ...mapState('meal', ['selectedMeal', 'details', 'allergies']),
    ...mapState('user', ['loginMember', 'flightNum', 'seatInfo']),
  },
  created() {
    // this.select = this.selectedMeal
    // this.detailOfMeal = this.details
    // this.allergiesOfMeal = this.allergies
    // console.log(this.select)
    // console.log(this.detailOfMeal)
    // console.log(this.allergiesOfMeal)
  },
  methods: {
    finalChoice() {
      // 다 State로 넘겨줄거임
      this.info.flightNum = this.flightNum
      this.info.username = this.loginMember.username
      this.info.seatNum = this.seatInfo.seatNum
      this.info.mealMenu = this.selectedMeal.mealMenu
      choiceMeal(
        this.info,
        () => {
          this.$router.push('/meal/result')
        },
        (error) => {
          console.log(error)
        }
      )
    },
    ...mapActions('meal', ['getDetail', 'getAllergy', 'registSeatMeal']),
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
  margin: 0;
  padding: 0;
  font-family: 'twayfly';
}

.meal-container {
  display: flex;
  height: 70vh;
  width: 100vw;
  padding: 5vh 10vw;
  flex-direction: column;
}
.body-container {
  display: flex;
}
.wrapper-main {
  font-size: 25px;
}
.wrapper-main > div {
  margin: 20px 0;
}
.wrapper-main > img {
  width: 350px;
}
.wrapper-detail {
  display: flex;
  width: 600px;
  justify-content: space-around;
}
.detail-title {
  font-size: 25px;
  margin: 20px auto;
}
.detail-content {
  display: flex;
  flex-direction: column;
}
.detail-content > div {
  margin: 10px 0;
}
ul {
  margin: 0;
  padding: 0;
}
li {
  list-style: none;
  margin: 20px 0;
}
.choice-box {
  margin: 50px 0;
  text-align: center;
}
button {
  width: 100px;
  padding: 12px 25px;
  border: none;
  color: white;
  background-color: rgb(69, 169, 200);
}
</style>
