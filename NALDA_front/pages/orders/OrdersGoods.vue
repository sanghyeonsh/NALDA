<template>
  <div>
    <header-component></header-component>
    <div class="container1">
      <div class="container-box" @click="checkblanket">
        <div>
          <img
            class="image"
            src="../../static/orders/blanket.png"
            alt="service"
          />
          <h4 class="ordermenu">
            <input id="blanket" type="checkbox" @click="checkblanket" />
            담요
          </h4>
        </div>
      </div>
      <div class="container-box" @click="checkpillow">
        <div>
          <img
            class="image"
            src="../../static/orders/pillow.png"
            alt="service"
          />
          <h4 class="ordermenu">
            <input id="pillow" type="checkbox" @click="checkpillow" />
            베개
          </h4>
        </div>
      </div>
      <div class="container-box" @click="checkearplug">
        <div>
          <img
            class="image"
            src="../../static/orders/ear-plug.png"
            alt="service"
          />
          <h4 class="ordermenu">
            <input id="earplug" type="checkbox" @click="checkearplug" />
            귀마개
          </h4>
        </div>
      </div>
      <div class="container-box" @click="checkslipper">
        <div>
          <img
            class="image"
            src="../../static/orders/slippers.png"
            alt="service"
          />
          <h4 class="ordermenu">
            <input id="slipper" type="checkbox" @click="checkslipper" />
            슬리퍼
          </h4>
        </div>
      </div>
    </div>
    <div style="text-align: center">
      <button class="order-button" @click="movewaiting">요청하기</button>
    </div>
  </div>
</template>

<script>
import { mapState } from 'vuex'
import HeaderComponent from '../../components/HeaderComponent.vue'

export default {
  name: 'OrdersGoods',
  components: {
    HeaderComponent,
  },
  computed: {
    ...mapState('orders', ['ordergoods']),
  },
  methods: {
    movewaiting() {
      this.$router.push({ name: 'orders-OrdersWaiting' })
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
.container1 {
  margin: auto;
  display: flex;
  height: 60vh;
  justify-content: space-around;
}

.container-box {
  text-align: center;
  width: 33%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}

.image {
  width: 70%;
}

.container-box {
  display: flex;
}
input {
  width: 20px;
  height: 20px;
  border: 3px solid #707070;
  position: relative;
}
.order-button {
  border-radius: 8px;
  background-color: rgb(69, 169, 200);
  color: white;
  border: none;
  padding: 1rem;
}
.ordermenu {
  padding: 2rem;
}
</style>
