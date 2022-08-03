<template>
  <div class="goods-container">
    <div class="goods-container-box" @click="checkblanket">
      <div>
        <img src="/orders/blanket.png" alt="service" />
        <h3>
          <input id="blanket" type="checkbox" @click="checkblanket" />
          담요
        </h3>
      </div>
    </div>
    <div class="goods-container-box" @click="checkpillow">
      <div>
        <img src="/orders/pillow.png" alt="service" />
        <h3>
          <input id="pillow" type="checkbox" @click="checkpillow" />
          베개
        </h3>
      </div>
    </div>
    <div class="goods-container-box" @click="checkearplug">
      <div>
        <img src="/orders/ear-plug.png" alt="service" />
        <h3>
          <input id="earplug" type="checkbox" @click="checkearplug" />
          귀마개
        </h3>
      </div>
    </div>
    <div class="goods-container-box" @click="checkslipper">
      <div>
        <img src="/orders/slippers.png" alt="service" />
        <h3>
          <input id="slipper" type="checkbox" @click="checkslipper" />
          슬리퍼
        </h3>
      </div>
    </div>
    <button class="order-button" @click="movewaiting">요청하기</button>
  </div>
</template>

<script>
import { mapState, mapMutations } from 'vuex'

export default {
  name: 'OrdersGoods',
  computed: {
    ...mapState('goods', ['goods', 'selected_goods']),
  },
  created() {
    this.CLEAR_CHOICE_GOODS()
  },
  methods: {
    ...mapMutations('goods', ['SET_CHOICE_GOODS', 'CLEAR_CHOICE_GOODS']),
    movewaiting() {
      this.SET_CHOICE_GOODS()
      if (this.selected_goods.length) {
        this.$router.push('/goods/waiting')
      }
    },
    checkblanket() {
      const checkBox = document.getElementById('blanket')
      if (!checkBox.checked) {
        checkBox.checked = true
      } else {
        checkBox.checked = false
      }
    },
    checkpillow() {
      const checkBox = document.getElementById('pillow')
      if (!checkBox.checked) {
        checkBox.checked = true
      } else {
        checkBox.checked = false
      }
    },
    checkearplug() {
      const checkBox = document.getElementById('earplug')
      if (!checkBox.checked) {
        checkBox.checked = true
      } else {
        checkBox.checked = false
      }
    },
    checkslipper() {
      const checkBox = document.getElementById('slipper')
      if (!checkBox.checked) {
        checkBox.checked = true
      } else {
        checkBox.checked = false
      }
    },
  },
}
</script>

<style scoped>
.goods-container {
  display: flex;
  height: 70vh;
}
.goods-container-box {
  text-align: center;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.goods-container-box img {
  width: 70%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
}
.goods-container-box h3 {
  margin-top: 40px;
}
.order-button {
  width: 10vw;
  height: 5vh;
  position: fixed;
  margin: 0 auto;
  left: 0;
  right: 0;
  bottom: 20vh;
  border: none;
  color: white;
  font-size: 100%;
  background-color: rgb(69, 169, 200);
}
</style>
