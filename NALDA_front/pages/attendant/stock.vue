<template>
  <div class="stock-input-wrap">
    <div class="stock-table">
      <div class="stock-input-table">
        <b-table-simple id="stocks-table" hover small caption-top responsive>
          <caption>
            <h3>재고 목록:</h3>
            <b-form-input v-model="flightNum" type="text" />
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
                  type="number"
                  :name="snack.serviceName"
                  placeholder="수량을 입력해주세요."
                  @change="setSnackQuantity()"
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
                  type="number"
                  placeholder="수량을 입력해주세요."
                  @change="setAlcoholQuantity(alcohol, index, alcoholQuantity[index])"
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
                  type="number"
                  placeholder="수량을 입력해주세요."
                  @change="setNonAlcoholQuantity(alcohol, index, nonAlcoholQuantity[index])"
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
        <b-button @click="setTotal">save</b-button>
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
      ListType: '',
      flightNum: '',
      snackQuantity: [],
      alcoholQuantity: [],
      nonAlcoholQuantity: [],
      amenityQuantity: [],
      TotalServiceQuantity: [],
      Quantity: '',
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
    ]),
  },
  created() {
    this.getServiceList()
    // this.setQuantityList()
  },
  methods: {
    ...mapActions('attendant', ['getServiceList']),
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
      console.log(this.snackQuantity)
    },
    setAlcoholQuantity(alcohol, index, value) {
      console.log(this.alcoholQuantity)
    },
    setTotal() {
      // console.log(this.snackQuantity)
      // this.TotalServiceQuantity = []
      // const totalLength =
      //   this.snackQuantity.length +
      //   this.alcoholQuantity.length +
      //   this.nonAlcoholQuantity.length +
      //   this.amenityQuantity
      // for (let i = 0; i < totalLength; i++) {
      //   if (i < this.snackQuantity.length) {
      //     console.log(1)
      //     this.TotalServiceQuantity.push(this.snackQuantity[i])
      //   } else if (
      //     i <
      //     this.snackQuantity.length + this.alcoholQuantity.length
      //   ) {
      //     this.TotalServiceQuantity.push(this.alcoholQuantity[i])
      //   } else if (
      //     i <
      //     this.snackQuantity.length +
      //       this.alcoholQuantity.length +
      //       this.nonAlcoholQuantity.length
      //   ) {
      //     this.TotalServiceQuantity.push(this.nonAlcoholQuantity[i])
      //   } else if (
      //     i <
      //     this.snackQuantity.length +
      //       this.alcoholQuantity.length +
      //       this.nonAlcoholQuantity.length +
      //       this.amenityQuantity.length
      //   ) {
      //     this.TotalServiceQuantity.push(this.amenityQuantity[i])
      //   }
      // }
      // console.log(this.TotalServiceQuantity)
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
  height: 70vh;
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
input {
  border: none;
  outline: none;
  height: 3vh;
}
</style>