<template>
  <div class="meal-container">
    <div class="body-container">
      <div class="wrapper-main">
        <div>{{ selectedMeal }}</div>
        <img src="../../static/meal/chicken-steak.jpg" alt="치킨스테이크" />
      </div>
      <div class="wrapper-detail">
        <div>
          <div class="detail-title">세부 목록</div>
          <div class="detail-content">
            <div
              v-for="(detail, i) in details"
              :key="i"
              class="form-check form-check-inline"
            >
              <input
                :id="'inlineCheckbox' + i"
                class="form-check-input"
                type="checkbox"
                :value="detail"
                checked
                @click="toggle1(detail)"
              />
              <label class="form-check-label" :for="'inlineCheckbox' + i">{{
                detail
              }}</label>
            </div>
          </div>
        </div>
        <div>
          <div class="detail-title">알레르기 목록</div>
          <ul>
            <li v-for="(allergy, i) in allergies" :key="i">{{ allergy }}</li>
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
export default {
  name: 'MealDetail',
  components: {},
  data() {
    return {
      finalDetail: [],
    }
  },
  computed: {
    ...mapState('meal', ['selectedMeal', 'details', 'allergies']),
  },
  created() {
    // this.getDetail(this.selectedMeal)
    // this.getAllergy(this.selectedMeal)
    for (let i = 0; i < this.details.length; i++) {
      this.finalDetail.push(this.details[i])
    }
  },
  methods: {
    finalChoice() {
      console.log(this.finalDetail)
      this.$router.push('/medical/result')
    },
    toggle1(item) {
      console.log(this.finalDetail.includes(item))
      if (this.finalDetail.includes(item)) {
        for (let i = 0; i < this.finalDetail.length; i++) {
          if (this.finalDetail[i] === item) {
            this.finalDetail.splice(i, 1)
          }
        }
        return
      }

      this.finalDetail.push(item)
    },
    ...mapActions('meal', ['getDetail', 'getAllergy']),
  },
}
</script>

<style scoped>
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
