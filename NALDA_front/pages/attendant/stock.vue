<template>
  <div class="stock-input-wrap">
    <div class="stock-table">
      <div class="stock-input-table">
        <b-table-simple id="stocks-table" hover small caption-top responsive>
          <caption>
            <div class="caption-wrap">
              <h3>항공편 {{flightNum}} 재고 목록</h3>
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
              <b-th>Name</b-th>
              <b-th>Service Code</b-th>
              <b-th>Quantity</b-th>
            </b-tr>
          </b-thead>
          <b-tbody v-if="ListType === 'snacks' ">
            <b-tr>
              <b-th :rowspan="snackList.length+1">Snacks</b-th>
            </b-tr>
            <b-tr v-for="(snack,index) in snackList" :key="index">
              <b-th class="text-right">{{snack.serviceName}}</b-th>
              <b-th>{{snack.serviceCode}}</b-th>
              <b-td>
                <b-form-input
                  id="snack-input"
                  v-model="snackQuantity[index]"
                  class="snack-input-wrap"
                  :disabled="!isValid"
                  type="number"
                  :name="snack.serviceName"
                  placeholder="수량을 입력해주세요."
                  @change="setSnackQuantity(snack, snackQuantity[index])"
                />
              </b-td>
            </b-tr>
          </b-tbody>
          <b-tbody v-else-if="ListType ==='alcohols'">
            <b-tr>
              <b-th :rowspan="alcoholsList.length+1">Alcohols</b-th>
            </b-tr>
            <b-tr v-for="(alcohol, index) in alcoholsList" :key="index">
              <b-th class="text-right">{{alcohol.serviceName}}</b-th>
              <b-th>{{alcohol.serviceCode}}</b-th>
              <b-td>
                <b-form-input
                  v-model="alcoholQuantity[index]"
                  class="alcohol-input-wrap"
                  :disabled="!isValid"
                  type="number"
                  placeholder="수량을 입력해주세요."
                  @change="setAlcoholQuantity(alcohol, alcoholQuantity[index])"
                />
              </b-td>
            </b-tr>
          </b-tbody>
          <b-tbody v-else-if="ListType ==='nonalcohols'">
            <b-tr>
              <b-th :rowspan="nonalcoholosList.length+1">Non-Alcohols</b-th>
            </b-tr>
            <b-tr v-for="(nonalcohol, index) in nonalcoholosList" :key="index">
              <b-th class="text-right">{{nonalcohol.serviceName}}</b-th>
              <b-th>{{nonalcohol.serviceCode}}</b-th>
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
          <b-tbody v-else-if="ListType ==='amenities'">
            <b-tr>
              <b-th :rowspan="amenityList.length+1">Amenity</b-th>
            </b-tr>
            <b-tr v-for="(amenity, index) in amenityList" :key="index">
              <b-th class="text-right">{{amenity.serviceName}}</b-th>
              <b-th>{{amenity.serviceCode}}</b-th>
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
                Total Rows:
                <b v-if="ListType === 'snacks'">{{snackList.length}}</b>
                <b v-else-if="ListType === 'alcohols'">{{alcoholsList.length}}</b>
                <b v-else-if="ListType === 'nonalcohols'">{{nonalcoholosList.length}}</b>
                <b v-else-if="ListType === 'amenities'">{{amenityList.length}}</b>
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
        <b-button @click="showSnack">Snacks</b-button>
        <b-button @click="showAlcohol">Alcohol</b-button>
        <b-button @click="showNonAlcohol">Non-Alcohols</b-button>
        <b-button @click="showAmenity">Amenity</b-button>
        <b-button v-if="isValid" variant="warning" @click="setTotal()">save</b-button>
        <b-button v-else-if="!isValid" variant="warning" @click="unSetTotal()">modify</b-button>
        <b-button @click="testStockCnt">test</b-button>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
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
  },
  created() {
    this.getServiceList(this.flightNum)
    // this.setQuantityList()
    console.log(this.flightNum)
  },
  methods: {
    ...mapActions('attendant', [
      'getServiceList',
      'setStockAmount',
      'modifyStockAmount',
      'getStockAmount',
    ]),
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
    setSnackQuantity() {
      // console.log(this.snackQuantity)
    },
    setAlcoholQuantity(alcohol, index, value) {
      // console.log(this.alcoholQuantity)
    },
    testStockCnt() {
      console.log(this.flightNum)
      const promise = new Promise((resolve, reject) => {
        resolve()
      })
      promise.then(async () => {
        await this.getStockAmount(this.flightNum)
        console.log(this.stockCnt)
        console.log(this.setStock)
        // console.log(this.stockCnt.cntList[2].serviceCode.substr(0, 2))
        for (let i = 0; i < this.stockCnt.cntList.length; i++) {
          // console.log(this.stockCnt.cntList[i].serviceCode.substr(0, 2))
          // console.log(this.stockCnt.cntList[i].serviceCode.substr(3))
          const classification = this.stockCnt.cntList[i].serviceCode.substr(
            0,
            2
          )
          let idx = this.stockCnt.cntList[i].serviceCode.substr(3) - 1
          if (idx < 0) {
            idx += 10
          }
          if (classification === 'A0') {
            this.$set(this.snackQuantity, idx, this.stockCnt.cntList[i].total)
            // this.snackQuantity[idx] = this.stockCnt.cntList[i].total
          } else if (classification === 'A1') {
            this.$set(this.alcoholQuantity, idx, this.stockCnt.cntList[i].total)
            // this.alcoholQuantity[idx] = this.stockCnt.cntList[i].total
          } else if (classification === 'A2') {
            this.$set(
              this.nonAlcoholQuantity,
              idx,
              this.stockCnt.cntList[i].total
            )
            // this.nonAlcoholQuantity[idx] = this.stockCnt.cntList[i].total
          } else if (classification === 'C0') {
            this.$set(this.amenityQuantity, idx, this.stockCnt.cntList[i].total)
            // this.amenityQuantity[idx] = this.stockCnt.cntList[i].total
          }
        }

        // this.$forceUpdate()
        console.log(this.amenityQuantity)
        console.log(this.snackQuantity)
        console.log(this.alcoholQuantity)
      })
    },
    setTotal() {
      this.TotalServiceQuantity = []
      this.whole = []
      this.whole.push(this.snackList)
      this.whole.push(this.alcoholsList)
      this.whole.push(this.nonalcoholosList)
      this.whole.push(this.amenityList)

      // this.whole[type][i].serviceQuantity부분 수정 필요함
      // 0아니고 stock db에 있으면 그 값으로 다 바꿔야함..
      // store부분에서 수정 필요.. 말고 그냥 여기서 함수 불러서
      // getStockAmount 해서 그거로 total에 넣어주는거로.

      // console.log(this.amenityQuantity)
      // 1. 전체 재고 목록 배열을 하나 생성한다.
      for (let type = 0; type < this.whole.length; type++) {
        for (let i = 0; i < this.whole[type].length; i++) {
          const stock = {
            serviceCode: this.whole[type][i].serviceCode,
            flightNum: this.flightNum,
            total: this.whole[type][i].serviceQuantity,
          }
          console.log(stock)
          this.TotalServiceQuantity.push(stock)
        }
      }

      // 2. input 값들 해당 자리에 채워주기
      // snackQuantity, alcoholQuantity, nonAlcoholQuantity, amenityQuantity에 각각의 input 값들이 담겨있음
      for (
        let codenum = 0;
        codenum < this.TotalServiceQuantity.length;
        codenum++
      ) {
        if (codenum < this.snackList.length) {
          // console.log('스낵수량입니다 ' + this.snackQuantity[codenum])
          if (this.snackQuantity[codenum] !== undefined)
            this.TotalServiceQuantity[codenum].total =
              this.snackQuantity[codenum]
        } else if (codenum < this.snackList.length + this.alcoholsList.length) {
          if (this.alcoholQuantity[codenum] !== undefined)
            this.TotalServiceQuantity[codenum].total =
              this.alcoholQuantity[codenum - this.snackList.length]
        } else if (
          codenum <
          this.snackList.length +
            this.alcoholsList.length +
            this.nonalcoholosList.length
        ) {
          if (this.nonAlcoholQuantity[codenum] !== undefined)
            this.TotalServiceQuantity[codenum].total =
              this.nonAlcoholQuantity[
                codenum - (this.snackList.length + this.alcoholsList.length)
              ]
        } else if (
          codenum <
          this.snackList.length +
            this.alcoholsList.length +
            this.nonalcoholosList.length +
            this.amenityList.length
        ) {
          if (this.amenityQuantity[codenum] !== undefined)
            this.TotalServiceQuantity[codenum].total =
              this.amenityQuantity[
                codenum -
                  (this.snackList.length +
                    this.alcoholsList.length +
                    this.nonalcoholosList.length)
              ]
        }
      }
      console.log(this.TotalServiceQuantity)
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
</style>
