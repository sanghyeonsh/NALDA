<template>
  <div id="footer">
    <div class="footer-head">
      <div class="footer-item">메뉴</div>
      <div class="footer-item">수량</div>
    </div>
    <div class="footer-body">
      <div
        v-for="(item, idx) in selected_foods"
        :key="idx"
        class="footer-content"
      >
        <div>
          {{ item.serviceName }}
        </div>
        <button @click="DELETE_CHOICE_FOODS(item)">delete button</button>
        <button @click="MINUS_CHOICE_FOODS(item)">minus button</button>
        <div>{{ item.num }}</div>
        <button @click="PLUS_CHOICE_FOODS(item)">plus button</button>
      </div>
    </div>
    <ServiceCheck />
    <button class="order-button" @click="MoveCheck">주문하기</button>
  </div>
</template>

<script>
import { mapState, mapMutations } from 'vuex'

export default {
  name: 'ServiceFooter',
  computed: {
    ...mapState('menu', ['selected_foods']),
  },
  methods: {
    ...mapMutations('menu', [
      'SET_CHOICE_FOODS',
      'DELETE_CHOICE_FOODS',
      'CLEAR_CHOICE_FOODS',
      'PLUS_CHOICE_FOODS',
      'MINUS_CHOICE_FOODS',
    ]),
    MoveCheck() {
      if (this.selected_foods.length) {
        const modal = document.getElementsByClassName('check-modal')[0]
        modal.style.display = 'block'
      }
    },
  },
}
</script>

<style scoped>
#footer {
  display: flex;
  flex-direction: column;
  height: 20vh;
  width: 100%;
}
.footer-head {
  display: flex;
  background-color: rgb(69, 169, 200);
  color: white;
  height: 4vh;
  gap: 20vw;
  font-size: 3vh;
}
.footer-item {
  display: flex;
  margin-left: 3vw;
  align-items: center;
}
.footer-body {
  overflow: scroll;
}
/* 스크롤 없애기 */
.footer-body::-webkit-scrollbar {
  display: none; /* Chrome, Safari, Opera*/
}
.footer-content {
  display: flex;
  align-items: center;
  padding: 5px;
  font-size: 20px;
}
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
