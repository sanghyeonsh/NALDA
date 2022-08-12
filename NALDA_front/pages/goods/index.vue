<template>
  <div class="goods-container">
    <div class="goods-container-box1" @click="checkblanket">
      <div style="width: 100%">
        <img src="/orders/blanket.png" alt="service" />
        <div class="check-box-items">
          <b-form-checkbox
            id="checkbox-1"
            v-model="blanket"
            value="C001"
            size="lg"
          >
          </b-form-checkbox>
          담요
        </div>
      </div>
    </div>
    <div class="goods-container-box2" @click="checkpillow">
      <div style="width: 100%">
        <img src="/orders/pillow.png" alt="service" />
        <div class="check-box-items">
          <b-form-checkbox v-model="pillow" value="C003" size="lg">
          </b-form-checkbox>
          베개
        </div>
      </div>
    </div>
    <div class="goods-container-box3" @click="checkearplug">
      <div style="width: 100%">
        <img src="/orders/ear-plug.png" alt="service" />
        <div class="check-box-items">
          <b-form-checkbox v-model="earplug" value="C002" size="lg">
          </b-form-checkbox>
          귀마개
        </div>
      </div>
    </div>
    <div class="goods-container-box4" @click="checkslipper">
      <div style="width: 100%">
        <img src="/orders/slippers.png" alt="service" />
        <div class="check-box-items">
          <b-form-checkbox v-model="slipper" value="C004" size="lg">
          </b-form-checkbox>
          슬리퍼
        </div>
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
    }
  },
  computed: {
    ...mapState('user', ['loginMember', 'seatInfo', 'flightNum']),
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
  methods: {
    ...mapActions('menu', ['postOrders']),
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
      if (this.blanket === 'C001') {
        this.blanket = ''
        document.getElementsByClassName(
          'goods-container-box1'
        )[0].style.background = 'rgba(0, 0, 0, 0)'
      } else {
        this.blanket = 'C001'
        document.getElementsByClassName(
          'goods-container-box1'
        )[0].style.background = 'rgba(0, 0, 0, 0.2)'
      }
    },
    checkpillow() {
      if (this.pillow === 'C003') {
        this.pillow = ''
        document.getElementsByClassName(
          'goods-container-box2'
        )[0].style.background = 'rgba(0, 0, 0, 0)'
      } else {
        this.pillow = 'C003'
        document.getElementsByClassName(
          'goods-container-box2'
        )[0].style.background = 'rgba(0, 0, 0, 0.2)'
      }
    },
    checkearplug() {
      if (this.earplug === 'C002') {
        this.earplug = ''
        document.getElementsByClassName(
          'goods-container-box3'
        )[0].style.background = 'rgba(0, 0, 0, 0)'
      } else {
        this.earplug = 'C002'
        document.getElementsByClassName(
          'goods-container-box3'
        )[0].style.background = 'rgba(0, 0, 0, 0.2)'
      }
    },
    checkslipper() {
      if (this.slipper === 'C004') {
        this.slipper = ''
        document.getElementsByClassName(
          'goods-container-box4'
        )[0].style.background = 'rgba(0, 0, 0, 0)'
      } else {
        this.slipper = 'C004'
        document.getElementsByClassName(
          'goods-container-box4'
        )[0].style.background = 'rgba(0, 0, 0, 0.2)'
      }
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

.check-box-items {
  display: flex;
  margin-top: 5px;
  font-size: xx-large;
  width: 100%;
  justify-content: center;
  align-items: center;
}
.goods-container {
  display: flex;
  height: 60vh;
}
.goods-container-box1 {
  text-align: center;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.goods-container-box1 img {
  width: 70%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
}
.goods-container-box1 h3 {
  margin-top: 40px;
}
.goods-container-box2 {
  text-align: center;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.goods-container-box2 img {
  width: 70%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
}
.goods-container-box2 h3 {
  margin-top: 40px;
}
.goods-container-box3 {
  text-align: center;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.goods-container-box3 img {
  width: 70%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
}
.goods-container-box3 h3 {
  margin-top: 40px;
}
.goods-container-box4 {
  text-align: center;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.goods-container-box4 img {
  width: 70%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
}
.goods-container-box4 h3 {
  margin-top: 40px;
}
.order-button {
  width: 14vw;
  height: 8vh;
  position: fixed;
  margin: 0 auto;
  left: 0;
  right: 0;
  bottom: 16vh;
  border: none;
  color: white;
  font-size: 20px;
  background-color: rgb(69, 169, 200);
}
</style>
