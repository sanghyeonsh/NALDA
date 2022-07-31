<template>
  <div>
    <button class="order-button" @click="MoveCheck">주문하기</button>
  </div>
</template>

<script>
import { mapState } from 'vuex'

export default {
  name: 'OrdersButton',
  computed: {
    ...mapState('menu', ['selected_foods']),
  },
  methods: {
    MoveCheck() {
      // if (this.selected_foods.length) {
      //   const modal = document.getElementsByClassName('check-modal')[0]
      //   modal.style.display = 'block'
      // }
    },
  },
}
</script>

<style scoped>
.order-button {
  position: fixed;
  bottom: 7%;
  right: 2%;
  background-color: rgb(69, 169, 200);
  color: white;
  width: 150px;
  height: 60px;
  border-radius: 60px;
  border: none;
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 25px;
}
</style>
