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
        <div style="flex-basis: 17vw">
          {{ item['name'] }}
        </div>
        <button @click="DELETE_CHOICE_FOODS(item['name'])">
          delete button
        </button>
        <button @click="MINUS_CHOICE_FOODS(item['name'])">minus button</button>
        <div>{{ item['num'] }}</div>
        <button @click="PLUS_CHOICE_FOODS(item['name'])">plus button</button>
      </div>
    </div>
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
</style>
