<template>
  <div class="stock-input-wrap">
    <div class="stock-table">
      <div class="stock-input-table">
        <b-table-simple id="stocks-table" hover small caption-top responsive>
          <caption>
            <div class="caption-wrap">
              <h3>항공편 {{ flightNum }} 재고 목록</h3>
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
              <b-th colspan="3">상품 목록</b-th>
            </b-tr>
            <b-tr>
              <b-th>서비스명</b-th>
              <b-th>상품명</b-th>
              <b-th>상품코드</b-th>
              <b-th>수량</b-th>
            </b-tr>
          </b-thead>
          <b-tbody v-if="ListType === 'snacks'">
            <b-tr>
              <b-th :rowspan="snackList.length + 1">과자</b-th>
            </b-tr>
            <b-tr v-for="(snack, index) in snackList" :key="index">
              <b-th class="text-right">{{ snack.serviceName }}</b-th>
              <b-th>{{ snack.serviceCode }}</b-th>
              <b-td>
                <b-form-input
                  id="snack-input"
                  v-model="snackQuantity[index]"
                  class="snack-input-wrap"
                  :disabled="!isValid"
                  type="number"
                  :name="snack.serviceName"
                  placeholder="수량을 입력해주세요."
                />
              </b-td>
            </b-tr>
          </b-tbody>
          <b-tbody v-else-if="ListType === 'alcohols'">
            <b-tr>
              <b-th :rowspan="alcoholsList.length + 1">주류</b-th>
            </b-tr>
            <b-tr v-for="(alcohol, index) in alcoholsList" :key="index">
              <b-th class="text-right">{{ alcohol.serviceName }}</b-th>
              <b-th>{{ alcohol.serviceCode }}</b-th>
              <b-td>
                <b-form-input
                  v-model="alcoholQuantity[index]"
                  class="alcohol-input-wrap"
                  :disabled="!isValid"
                  type="number"
                  placeholder="수량을 입력해주세요."
                />
              </b-td>
            </b-tr>
          </b-tbody>
          <b-tbody v-else-if="ListType === 'nonalcohols'">
            <b-tr>
              <b-th :rowspan="nonalcoholosList.length + 1">비주류</b-th>
            </b-tr>
            <b-tr v-for="(nonalcohol, index) in nonalcoholosList" :key="index">
              <b-th class="text-right">{{ nonalcohol.serviceName }}</b-th>
              <b-th>{{ nonalcohol.serviceCode }}</b-th>
              <b-td>
                <b-form-input
                  v-model="nonAlcoholQuantity[index]"
                  class="nonalcohol-input-wrap"
                  :disabled="!isValid"
                  type="number"
                  placeholder="수량을 입력해주세요."
                />
              </b-td>
            </b-tr>
          </b-tbody>
          <b-tbody v-else-if="ListType === 'amenities'">
            <b-tr>
              <b-th :rowspan="amenityList.length + 1">편의물품</b-th>
            </b-tr>
            <b-tr v-for="(amenity, index) in amenityList" :key="index">
              <b-th class="text-right">{{ amenity.serviceName }}</b-th>
              <b-th>{{ amenity.serviceCode }}</b-th>
              <b-td>
                <b-form-input
                  v-model="amenityQuantity[index]"
                  class="amenity-input-wrap"
                  :disabled="!isValid"
                  type="number"
                  placeholder="수량을 입력해주세요."
                />
              </b-td>
            </b-tr>
          </b-tbody>

          <b-tfoot>
            <b-tr>
              <b-td colspan="7" variant="secondary" class="text-right">
                총 행:
                <b v-if="ListType === 'snacks'">{{ snackList.length }}</b>
                <b v-else-if="ListType === 'alcohols'">{{ alcoholsList.length }}</b>
                <b v-else-if="ListType === 'nonalcohols'">{{ nonalcoholosList.length }}</b>
                <b v-else-if="ListType === 'amenities'">{{ amenityList.length }}</b>
              </b-td>
            </b-tr>
          </b-tfoot>
        </b-table-simple>
        <!-- <b-pagination
          v-model="currentPage"
          :total-rows="rows"
          :per-page="perPage"
          size="sm"
          align="center"
          class="mt-4"
          aria-controls="stocks-table"
        ></b-pagination>-->
      </div>
      <div class="stock-btn-group">
        <b-button @click="showSnack">과자</b-button>
        <b-button @click="showAlcohol">주류</b-button>
        <b-button @click="showNonAlcohol">비주류</b-button>
        <b-button @click="showAmenity">편의물품</b-button>
        <b-button
          v-if="isValid"
          v-b-modal.modal-1
          variant="warning"
          @click=";[setTotal(), $bvModal.show('modal-stock')]"
        >입력</b-button>

        <b-button v-else-if="!isValid" variant="warning" @click="unSetTotal()">수정</b-button>
        <b-modal id="modal-stock" hide-footer>
          <template #modal-title>
            항공편
            <code>{{ flightNum }}</code>
          </template>
          <div class="d-block text-center">
            <h3>재고 입력 성공!</h3>
          </div>
          <b-button
            variant="dark"
            style="color: aliceblue"
            class="mt-3"
            block
            @click="$bvModal.hide('modal-stock')"
          >닫기</b-button>
        </b-modal>

        <b-button variant="success" @click=";[setTotal(), $bvModal.show('modal-end')]">운항종료</b-button>
        <b-modal id="modal-end" hide-footer>
          <template #modal-title>
            항공편
            <code>{{ flightNum }}</code>
          </template>
          <div class="d-block text-center">
            <h3>운항 종료 완료!</h3>
          </div>
          <b-button
            variant="dark"
            style="color: aliceblue"
            class="mt-3"
            block
            @click="$bvModal.hide('modal-end')"
          >닫기</b-button>
        </b-modal>
      </div>
    </div>
  </div>
</template>

<script>
import { mapActions, mapMutations, mapState } from 'vuex'
export default {
  name: 'AttendantStock',
  data() {
    return {
      // perPage: 10,
      // currentPage: 1,
      isValid: true,
      ListType: 'snacks',
      snackQuantity: [],
      alcoholQuantity: [],
      nonAlcoholQuantity: [],
      amenityQuantity: [],
      TotalServiceQuantity: [],
      whole: [],
      wholeQuantity: [],
    }
  },
  computed: {
    rows() {
      return this.serviceList.length
    },
    ...mapState('attendant', [
      'serviceList',
      'snackList',
      'alcoholsList',
      'nonalcoholosList',
      'amenityList',
      'setStock',
      'stockCnt',
    ]),
    ...mapState('user', ['loginMember', 'flightNum']),
    ...mapState('menu', ['total', 'items', 'stock']),
  },
  created() {
    const promise = new Promise((resolve, reject) => {
      resolve()
    })
    promise.then(async () => {
      await this.getServiceList(this.flightNum)
      await this.getServiceCnt(this.flightNum)
      await this.getOrderCnt(this.flightNum)

      if (this.stock?.length > 0) {
        this.stock.forEach((stockInfo) => {
          const classification = stockInfo.serviceCode.substr(0, 2)
          let idx = stockInfo.serviceCode.substr(3) - 1
          if (idx < 0) {
            idx += 10
          }
          if (classification === 'A0') {
            this.$set(this.snackQuantity, idx, stockInfo.total)
          } else if (classification === 'A1') {
            this.$set(this.alcoholQuantity, idx, stockInfo.total)
          } else if (classification === 'A2') {
            this.$set(this.nonAlcoholQuantity, idx, stockInfo.total)
          } else if (classification === 'C0') {
            this.$set(this.amenityQuantity, idx, stockInfo.total)
          }
          if (this.total?.length > 0)
            this.total.forEach((cntInfo) => {
              if (cntInfo.serviceCode === stockInfo.serviceCode)
                if (classification === 'A0') {
                  this.$set(
                    this.snackQuantity,
                    idx,
                    stockInfo.total - cntInfo.total
                  )
                } else if (classification === 'A1') {
                  this.$set(
                    this.alcoholQuantity,
                    idx,
                    stockInfo.total - cntInfo.total
                  )
                } else if (classification === 'A2') {
                  this.$set(
                    this.nonAlcoholQuantity,
                    idx,
                    stockInfo.total - cntInfo.total
                  )
                } else if (classification === 'C0') {
                  this.$set(
                    this.amenityQuantity,
                    idx,
                    stockInfo.total - cntInfo.total
                  )
                }
            })
        })
        this.isValid = !this.isValid
        this.SET_STOCK_STATUS()
      }
    })
  },
  methods: {
    ...mapActions('attendant', [
      'getServiceList',
      'setStockAmount',
      'modifyStockAmount',
      'getStockAmount',
    ]),
    ...mapActions('menu', ['getOrderCnt', 'getServiceCnt']),
    ...mapMutations('attendant', ['SET_STOCK_STATUS']),
    ...mapMutations('menu', ['SET_ITEM', 'CALC_STOCK']),
    calcStock() {
      this.CALC_STOCK()
    },
    showSnack() {
      this.ListType = 'snacks'
    },
    showAlcohol() {
      this.ListType = 'alcohols'
    },
    showNonAlcohol() {
      this.ListType = 'nonalcohols'
    },
    showAmenity() {
      this.ListType = 'amenities'
    },
    setTotal() {
      this.TotalServiceQuantity = []
      this.whole = []
      this.whole.push(this.snackList)
      this.whole.push(this.alcoholsList)
      this.whole.push(this.nonalcoholosList)
      this.whole.push(this.amenityList)
      this.wholeQuantity.push(this.snackQuantity)
      this.wholeQuantity.push(this.alcoholQuantity)
      this.wholeQuantity.push(this.nonAlcoholQuantity)
      this.wholeQuantity.push(this.amenityQuantity)

      for (let type = 0; type < this.whole.length; type++) {
        for (let i = 0; i < this.whole[type].length; i++) {
          const stock = {
            serviceCode: this.whole[type][i].serviceCode,
            flightNum: this.flightNum,
            total: this.whole[type][i].serviceQuantity,
          }
          if (this.wholeQuantity[type][i] >= 0) {
            stock.total = this.wholeQuantity[type][i]
          }
          this.TotalServiceQuantity.push(stock)
        }
      }

      for (let i = 0; i < this.TotalServiceQuantity.length; i++) {
        if (i < this.snackList.length) {
          if (this.snackQuantity[i] !== undefined)
            this.TotalServiceQuantity[i].total = this.snackQuantity[i]
        } else if (i < this.snackList.length + this.alcoholsList.length) {
          if (this.alcoholQuantity[i] !== undefined)
            this.TotalServiceQuantity[i].total =
              this.alcoholQuantity[i - this.snackList.length]
        } else if (
          i <
          this.snackList.length +
            this.alcoholsList.length +
            this.nonalcoholosList.length
        ) {
          if (this.nonAlcoholQuantity[i] !== undefined)
            this.TotalServiceQuantity[i].total =
              this.nonAlcoholQuantity[
                i - (this.snackList.length + this.alcoholsList.length)
              ]
        } else if (
          i <
          this.snackList.length +
            this.alcoholsList.length +
            this.nonalcoholosList.length +
            this.amenityList.length
        ) {
          if (this.amenityQuantity[i] !== undefined)
            this.TotalServiceQuantity[i].total =
              this.amenityQuantity[
                i -
                  (this.snackList.length +
                    this.alcoholsList.length +
                    this.nonalcoholosList.length)
              ]
        }
      }
      this.isValid = !this.isValid

      // 재고 입력 or 수정으로 보내기
      if (this.setStock === false) {
        this.$store.dispatch(
          'attendant/setStockAmount',
          this.TotalServiceQuantity
        )
      } else if (this.setStock === true) {
        this.$store.dispatch(
          'attendant/modifyStockAmount',
          this.TotalServiceQuantity
        )
      }
    },
    unSetTotal() {
      this.isValid = !this.isValid
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
  margin-top: 2%;
  text-align: center;
}
.btn-secondary {
  font-size: large;
  height: 100%;
  width: 8%;
  background-color: #206e95;
  border-color: #206e95;
  color: white;
}
.btn-warning {
  font-size: large;
  height: 100%;
  width: 8%;
}
.btn-success {
  font-size: large;
  height: 100%;
  width: 8%;
  color: white;
}
input {
  border: none;
  outline: none;
  height: 3vh;
}
</style>
