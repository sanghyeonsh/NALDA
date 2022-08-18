<template>
  <div class="stock-input-wrap">
    <div class="stock-table">
      <div class="stock-input-table">
        <b-table-simple id="stocks-table" hover small caption-top responsive>
          <caption>
            <div class="caption-wrap">
              <h3>항공편 {{ flightNum }} 기내식 목록</h3>
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
              <b-th colspan="3">재고</b-th>
              <b-th colspan="3">기내식 목록</b-th>
            </b-tr>
            <b-tr>
              <b-th>서비스명</b-th>
              <b-th colspan="2">메뉴명</b-th>
              <b-th>수량</b-th>
            </b-tr>
          </b-thead>
          <b-tbody>
            <b-tr>
              <b-th :rowspan="mealList.length + 1">기내식</b-th>
            </b-tr>
            <b-tr v-for="(meal, index) in mealList" :key="index">
              <b-th colspan="2" class="text-right">{{ meal.menu }}</b-th>
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
                총 행:
                <b>{{ mealList.length }}</b>
              </b-td>
            </b-tr>
          </b-tfoot>
        </b-table-simple>
      </div>
      <div class="stock-btn-group">
        <b-button v-if="isValid" variant="info" @click="fixTotal()">저장</b-button>
        <b-button v-else-if="!isValid" variant="info" @click="unFixTotal()">수정</b-button>
        <b-button v-if="!isNotSaved" variant="warning" @click="setTotal()">확인</b-button>
        <b-button
          v-else-if="isNotSaved"
          variant="warning"
          @click="$bvModal.show('modal-save-alert')"
        >확인</b-button>
        <b-modal v-if="isNotSaved" id="modal-save-alert" hide-footer>
          <template #modal-title>주의</template>
          <div class="d-block text-center">
            <h3>저장이 필요합니다!</h3>
          </div>
          <b-button
            variant="dark"
            style="color: aliceblue"
            class="mt-3"
            block
            @click="$bvModal.hide('modal-save-alert')"
          >닫기</b-button>
        </b-modal>
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
      isNotSaved: true,
      isValid: true,
      dialog: false,
      mealList: [],
      total: 0,
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
      if (this.flightMealList?.length === 0) {
        await this.getMeal()
        await this.meals.forEach((meal) => {
          const mealInfo = {
            menu: meal.menu,
            image: meal.image,
            imageName: meal.imageName,
            total: null,
          }
          this.mealList.push(mealInfo)
        })
      } else if (this.flightMealList?.length > 0) {
        // flightMealList가 meals와 다를 수 있기때매.
        await this.getMeal()
        await this.meals.forEach((meal) => {
          const mealInfo = {
            menu: meal.menu,
            image: meal.image,
            imageName: meal.imageName,
            total: null,
          }
          this.flightMealList.forEach((flightMeal) => {
            if (meal.menu === flightMeal.menu) {
              mealInfo.total = flightMeal.total
            }
          })
          this.mealList.push(mealInfo)
        })
        this.isValid = !this.isValid
      }
    })
  },
  methods: {
    ...mapMutations('meal', ['SET_FLIGHTMEALS_LIST', 'CLEAR_FLIGHTMEALS_LIST']),
    setTotal() {
      if (this.selectedMealList.length !== 0) {
        this.CLEAR_FLIGHTMEALS_LIST()
        this.SET_FLIGHTMEALS_LIST(this.selectedMealList)
      }
      this.$router.push('/attendant/mealset')
    },
    fixTotal() {
      this.selectedMealList = []
      this.mealList.forEach((meal) => {
        if (meal.total > 0) {
          this.selectedMealList.push(meal)
        }
      })
      this.isValid = !this.isValid
      this.isNotSaved = !this.isNotSaved
    },
    unFixTotal() {
      this.isValid = !this.isValid
      this.isNotSaved = !this.isNotSaved
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
  height: 85vh;
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
