<template>
  <div class="nav-snack">
    <nav>
      <div class="flex-container">
        <div class="item-home" @click="MoveOrders">
          날다
          <br />
          home
        </div>

        <div class="item" @click="MoveDessert">
          <img src="../static/orders/dessert.png" alt="" />
          <div style="text-align: center">간식</div>
        </div>

        <div class="item" @click="MoveAlchoal">
          <img src="../static/orders/drink.png" alt="" />
          <div style="text-align: center">주류</div>
        </div>
        <div class="item" @click="MoveNonAlchoal">
          <img src="../static/orders/coffee_cup.png" alt="" />
          <div style="text-align: center">비주류</div>
        </div>
      </div>
    </nav>
  </div>
</template>

<script>
export default {
  name: 'SnackNavbar',
  components: {},
  methods: {
    MoveOrders() {
      this.$router.push({ name: 'orders' })
    },
    MoveDessert() {
      this.$router.push('OrdersDessert')
    },
    MoveAlchoal() {
      this.$router.push('OrdersAlchoal')
    },
    MoveNonAlchoal() {
      this.$router.push('OrdertsNonAlchoal')
    },
  },
}
</script>

<style scoped>
.nav-snack {
  position: fixed;
  width: 100%;
}
.flex-container {
  display: flex;
  align-items: center;
  background-color: rgb(69, 169, 200);
}
.item-home {
  color: white;
  text-align: center;
  font-size: 30px;
}
.item {
  margin: 1.5rem;
}
img {
  width: 80px;
  height: 80px;
  object-fit: cover;
}
</style>
