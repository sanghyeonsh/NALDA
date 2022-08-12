<template>
  <div class="stock-input-wrap">
    <div class="stock-table">
      <div class="stock-input-table">
        <b-table-simple id="stocks-table" hover small caption-top responsive>
          <caption>
            <div v-bind="flightNum" class="caption-wrap">
              <h3>항공편 {{flightNum}} 기내식 목록</h3>
              <!-- <div id="flight-num-input">
                <b-form-input
                  v-model="flightNum"
                  type="text"
                  disabled
                  style="height: 5vh; font-size: x-large;"
                />
              </div>-->
            </div>
          </caption>
          <colgroup>
            <col />
            <col />
          </colgroup>
          <colgroup>
            <col />
            <col />
            <col />
          </colgroup>
          <colgroup>
            <col />
            <col />
          </colgroup>
          <b-thead head-variant="dark">
            <b-tr>
              <b-th colspan="3">Stocks</b-th>
              <b-th colspan="3">Item List</b-th>
            </b-tr>
            <b-tr>
              <b-th>Service Title</b-th>
              <b-th colspan="2">Name</b-th>
              <b-th>Quantity</b-th>
            </b-tr>
          </b-thead>
          <b-tbody>
            <b-tr>
              <b-th :rowspan="mealList.length+1">기내식</b-th>
            </b-tr>
            <b-tr v-for="(meal,index) in mealList" :key="index">
              <b-th colspan="2" class="text-right">{{meal.menu}}</b-th>
              <b-td>
                <b-form-input
                  id="snack-input"
                  v-model="meal.total"
                  class="snack-input-wrap"
                  type="number"
                  :disabled="!isValid"
                  :name="meal.menu"
                  placeholder="수량을 입력해주세요."
                />
              </b-td>
            </b-tr>
          </b-tbody>
          <b-tfoot>
            <b-tr>
              <b-td colspan="7" variant="secondary" class="text-right">
                Total Rows:
                <b>{{mealList.length}}</b>
              </b-td>
            </b-tr>
          </b-tfoot>
        </b-table-simple>
      </div>
      <div class="stock-btn-group">
        <b-button v-if="isValid" variant="info" @click="fixTotal()">save</b-button>
        <b-button v-else-if="!isValid" variant="info" @click="unFixTotal()">modify</b-button>
        <b-button variant="warning" @click="setTotal()">next</b-button>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions, mapMutations } from 'vuex'
export default {
  name: 'AttendantMeal',
  components: {},
  data() {
    return {
      isValid: true,
      dialog: false,
      mealList: [],
      total: 0,
      totalRules: [(v) => /^[0-9]*$/.test(v) || '숫자만 입력해주세요.'],
      selectedMealList: [],
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
      this.meals.forEach((meal) => {
        const mealInfo = {
          menu: meal.menu,
          image: meal.image,
          imageName: meal.imageName,
          total: null,
        }
        this.mealList.push(mealInfo)
      })
      // this.getDetail(this.meals)
      // this.getAllergy(this.meals)
    })
  },
  methods: {
    ...mapMutations('meal', ['SET_FLIGHTMEALS_LIST']),
    setTotal() {
      console.log(this.selectedMealList) // 얘를 넘겨줘야함
      //   console.log(this.meals)
      this.SET_FLIGHTMEALS_LIST(this.selectedMealList)
      this.$router.push('/attendant/mealset')
    },
    fixTotal() {
      this.selectedMealList = []
      this.mealList.forEach((meal) => {
        if (meal.total !== null) {
          this.selectedMealList.push(meal)
        }
      })
      console.log(this.selectedMealList)
      this.isValid = !this.isValid
    },
    unFixTotal() {
      this.isValid = !this.isValid
    },
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

.stock-input-wrap {
  height: 75vh;
  background-color: rgba(239, 239, 239, 0.511);
}

.caption-wrap {
  display: flex;
  justify-content: space-around;
  align-items: baseline;
  margin-bottom: 1%;
}
#flight-num-input {
  width: 88%;
}
.stock-table {
  padding: 2%;
  height: 70vh;
  display: flex;
  flex-direction: column;
}

.stock-btn-group {
  margin-top: 0.5%;
  text-align: center;
}
.btn-secondary {
  font-size: small;
  height: 100%;
  width: 8%;
  background-color: #206e95;
  border-color: #206e95;
}
.btn-info {
  font-size: small;
  height: 100%;
  width: 8%;
  color: white;
}
.btn-warning {
  font-size: small;
  height: 100%;
  width: 8%;
}
input {
  border: none;
  outline: none;
  height: 3vh;
}

.v-messages__message {
  float: right;
}
</style>