<template>
  <div>
    <nav id="nav-items">
      <li style="width: 7vw; height: 15vh" @click="MoveOrders">
        <span class="order-dessert-span">날다 Home</span>
      </li>
      <li id="snack" @click="MoveSnack">
        <img src="../static/orders/dessert.png" alt="" />
        <span>간식</span>
      </li>
      <li id="alchoal" @click="MoveAlcohol">
        <img src="../static/orders/drink.png" alt="" />
        <span>주류</span>
      </li>
      <li id="nonalchoal" @click="MoveNonAlcohol">
        <img src="../static/orders/coffee_cup.png" alt="" />
        <span>비주류</span>
      </li>
    </nav>
  </div>
</template>

<script>
import { mapState, mapMutations } from 'vuex'

export default {
  name: 'ServiceNavbar',
  computed: {
    ...mapState('menu', ['selected_foods']),
  },
  mounted() {
    if (document.location.pathname === '/orders/snack') {
      const target = document.getElementById('snack')
      target.style.borderBottomStyle = 'solid'
      target.style.borderBottomWidth = '0.5vh'
    } else if (document.location.pathname === '/orders/alcohol') {
      const target = document.getElementById('alchoal')
      target.style.borderBottomStyle = 'solid'
      target.style.borderBottomWidth = '0.5vh'
    } else {
      const target = document.getElementById('nonalchoal')
      target.style.borderBottomStyle = 'solid'
      target.style.borderBottomWidth = '0.5vh'
    }
  },
  methods: {
    MoveOrders() {
      this.$router.push('/main/service')
      this.CLEAR_CHOICE_FOODS()
    },
    MoveSnack() {
      this.$router.push('/orders/snack')
    },
    MoveAlcohol() {
      this.$router.push('/orders/alcohol')
    },
    MoveNonAlcohol() {
      this.$router.push('/orders/nonalcohol')
    },
    ...mapMutations('menu', [
      'SET_CHOICE_FOODS',
      'DELETE_CHOICE_FOODS',
      'CLEAR_CHOICE_FOODS',
      'PLUS_CHOICE_FOODS',
      'MINUS_CHOICE_FOODS',
    ]),
  },
}
</script>

<style scoped>
#nav-items {
  display: flex;
  width: 100%;
  height: 15vh;
  background-color: rgb(69, 169, 200);
  gap: 4vw;
}
nav li {
  list-style: none;
  display: flex;
  flex-direction: column;
}
nav li:hover {
  cursor: pointer;
}
nav img {
  width: 7vw;
  height: 10vh;
}
.order-dessert-span {
  font-size: 4vh;
  color: white;
  text-align: center;
  line-height: 1em;
  margin-top: 3vh;
}
img ~ span {
  height: 5vh;
  text-align: center;
  font-size: 3vh;
}
</style>
