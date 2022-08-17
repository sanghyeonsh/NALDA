<template>
  <div class="goods-container">
    <div
      v-if="cnt.blanket > 0"
      class="goods-container-box"
      @click="checkblanket"
    >
      <div style="height: 18vh"></div>
      <div style="width: 100%">
        <img
          class="goods-img"
          :class="{ selected: isCheckBlanket }"
          src="/orders/blanket.png"
          alt="service"
        />
        <div class="check-box-items">
          <b-form-checkbox
            id="checkbox-1"
            v-model="blanket"
            value="C001"
            size="lg"
          ></b-form-checkbox
          >담요
        </div>
      </div>
    </div>
    <div v-else-if="cnt.blanket <= 0" class="goods-container-box">
      <div style="height: 18vh"></div>
      <div style="width: 100%">
        <img
          class="goods-img"
          src="/orders/free-icon-out-of-stock-5578604.png"
          alt="service"
          style="
            -webkit-filter: opacity(1) drop-shadow(0 0 0 #206e95);
            filter: opacity(1) drop-shadow(0 0 0 #206e95);
          "
        />
        <div class="check-box-items">담요</div>
      </div>
    </div>

    <div v-if="cnt.pillow > 0" class="goods-container-box" @click="checkpillow">
      <div style="height: 18vh"></div>
      <div style="width: 100%">
        <img
          :class="{ selected: isCheckPillow }"
          src="/orders/pillow.png"
          alt="service"
        />
        <div class="check-box-items">
          <b-form-checkbox
            v-model="pillow"
            value="C003"
            size="lg"
          ></b-form-checkbox
          >베개
        </div>
      </div>
    </div>
    <div v-else-if="cnt.pillow <= 0" class="goods-container-box">
      <div style="height: 18vh"></div>
      <div style="width: 100%">
        <img
          class="goods-img"
          src="/orders/free-icon-out-of-stock-5578604.png"
          alt="service"
          style="
            -webkit-filter: opacity(1) drop-shadow(0 0 0 #206e95);
            filter: opacity(1) drop-shadow(0 0 0 #206e95);
          "
        />
        <div class="check-box-items">베개</div>
      </div>
    </div>

    <div
      v-if="cnt.earplug > 0"
      class="goods-container-box"
      @click="checkearplug"
    >
      <div style="height: 18vh"></div>
      <div style="width: 100%">
        <img
          :class="{ selected: isCheckEarplug }"
          src="/orders/ear-plug.png"
          alt="service"
        />
        <div class="check-box-items">
          <b-form-checkbox
            v-model="earplug"
            value="C002"
            size="lg"
          ></b-form-checkbox
          >귀마개
        </div>
      </div>
    </div>

    <div v-else-if="cnt.earplug <= 0" class="goods-container-box">
      <div style="height: 18vh"></div>
      <div style="width: 100%">
        <img
          class="goods-img"
          src="/orders/free-icon-out-of-stock-5578604.png"
          alt="service"
          style="
            -webkit-filter: opacity(1) drop-shadow(0 0 0 #206e95);
            filter: opacity(1) drop-shadow(0 0 0 #206e95);
          "
        />
        <div class="check-box-items">귀마개</div>
      </div>
    </div>

    <div
      v-if="cnt.slipper > 0"
      class="goods-container-box"
      @click="checkslipper"
    >
      <div style="height: 18vh"></div>
      <div style="width: 100%">
        <img
          :class="{ selected: isCheckSlipper }"
          src="/orders/slippers.png"
          alt="service"
        />
        <div class="check-box-items">
          <b-form-checkbox
            v-model="slipper"
            value="C004"
            size="lg"
          ></b-form-checkbox
          >슬리퍼
        </div>
      </div>
    </div>
    <div v-else-if="cnt.slipper <= 0" class="goods-container-box">
      <div style="height: 18vh"></div>
      <div style="width: 100%">
        <img
          class="goods-img"
          src="/orders/free-icon-out-of-stock-5578604.png"
          alt="service"
          style="
            -webkit-filter: opacity(1) drop-shadow(0 0 0 #206e95);
            filter: opacity(1) drop-shadow(0 0 0 #206e95);
          "
        />
        <div class="check-box-items">슬리퍼</div>
      </div>
    </div>
    <b-button variant="primary" class="order-button" @click="movewaiting"
      >요청하기</b-button
    >
  </div>
</template>

<script>
import { mapActions, mapState } from 'vuex'

export default {
  name: 'OrdersGoods',
  data() {
    return {
      blanket: '',
      pillow: '',
      earplug: '',
      slipper: '',
      cnt: { blanket: 100, pillow: 100, earplug: 100, slipper: 100 },
      isCheckBlanket: false,
      isCheckPillow: false,
      isCheckEarplug: false,
      isCheckSlipper: false,
    }
  },
  computed: {
    ...mapState('user', ['loginMember', 'seatInfo', 'flightNum']),
    ...mapState('menu', ['stock', 'total']),
    orderList() {
      const orderList = []
      if (this.blanket !== '')
        orderList.push({ orderCode: this.blanket, cnt: 1 })
      if (this.pillow !== '') orderList.push({ orderCode: this.pillow, cnt: 1 })
      if (this.earplug !== '')
        orderList.push({ orderCode: this.earplug, cnt: 1 })
      if (this.slipper !== '')
        orderList.push({ orderCode: this.slipper, cnt: 1 })

      return orderList
    },
  },
  created() {
    this.isCheckBlanket = false
    this.isCheckPillow = false
    this.isCheckEarplug = false
    this.isCheckSlipper = false

    const promise = new Promise((resolve, reject) => {
      resolve()
    })

    promise.then(async () => {
      await this.getOrderCnt(this.flightNum)
      await this.getServiceCnt(this.flightNum)
      this.cnt.blanket = this.stock[30].total
      this.cnt.pillow = this.stock[32].total
      this.cnt.earplug = this.stock[31].total
      this.cnt.slipper = this.stock[33].total
      for (let i = 0; i < 4; i++) {
        for (let j = 0; j < this.total.length; j++) {
          if (
            this.stock[i + 30].serviceCode === this.total[j].serviceCode &&
            this.total[j].serviceCode === 'C001'
          ) {
            this.cnt.blanket -= this.total[j].total
          } else if (
            this.stock[i + 30].serviceCode === this.total[j].serviceCode &&
            this.total[j].serviceCode === 'C003'
          ) {
            this.cnt.pillow -= this.total[j].total
          } else if (
            this.stock[i + 30].serviceCode === this.total[j].serviceCode &&
            this.total[j].serviceCode === 'C002'
          ) {
            this.cnt.earplug -= this.total[j].total
          } else if (
            this.stock[i + 30].serviceCode === this.total[j].serviceCode &&
            this.total[j].serviceCode === 'C004'
          ) {
            this.cnt.slipper -= this.total[j].total
          }
        }
      }
    })
  },
  methods: {
    ...mapActions('menu', ['postOrders', 'getOrderCnt', 'getServiceCnt']),
    movewaiting() {
      const order = {
        orderMessage: '',
        flightNum: this.flightNum,
        seatNum: this.seatInfo.seatNum,
        username: this.loginMember.username,
        status: 'PROGRESS',
        orderList: this.orderList,
      }
      this.postOrders(order)
      this.$router.push('/waiting')
    },
    checkblanket() {
      this.isCheckBlanket = !this.isCheckBlanket
      if (this.blanket === 'C001') this.blanket = ''
      else this.blanket = 'C001'
    },
    checkpillow() {
      this.isCheckPillow = !this.isCheckPillow
      if (this.pillow === 'C003') this.pillow = ''
      else this.pillow = 'C003'
    },
    checkearplug() {
      this.isCheckEarplug = !this.isCheckEarplug
      if (this.earplug === 'C002') this.earplug = ''
      else this.earplug = 'C002'
    },
    checkslipper() {
      this.isCheckSlipper = !this.isCheckSlipper
      if (this.slipper === 'C004') this.slipper = ''
      else this.slipper = 'C004'
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
.goods-container {
  background-color: rgba(239, 239, 239, 0.511);
  display: flex;
  justify-content: center;
  height: 85vh;
}
.goods-container-box {
  text-align: center;
  display: flex;
  flex-direction: column;
  /* justify-content: center; */
  align-items: center;
  cursor: pointer;
}
.goods-container-box img {
  width: 80%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  padding: 10%;
  margin-bottom: 10%;
  /* border: solid; */
}

.custom-control-input:checked ~ .custom-control-label::before {
  color: #fff;
  border-color: #bfd2d0;
  background-color: #bfd2d0;
}

/* .custom-control-label:checked ~ .custom-control-label::before {
  color: #fff;
  border-color: #bfd2d0 !important;
  background-color: #bfd2d0 !important;
} */
.selected {
  background-color: beige;
  border-radius: 20%;
  box-shadow: 2px 2px 2px 3px inset;
}

.check-box-items {
  display: flex;
  font-size: xx-large;
  width: 100%;
  justify-content: center;
  align-items: center;
}
/* .goods-wrap {
  display: flex;
  height: 50%;
} */
.goods-container-box h3 {
  margin-top: 40px;
}

.order-button {
  width: 12vw;
  height: 5vh;
  position: fixed;
  margin: 0 auto;
  left: 0;
  right: 0;
  bottom: 15vh;
  border: none;
  color: white;
  font-size: 100%;
  background-color: rgb(69, 169, 200);
}
</style>
