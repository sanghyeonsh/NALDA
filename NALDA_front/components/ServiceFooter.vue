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
        <svg
          xmlns="http://www.w3.org/2000/svg"
          width="20"
          height="20"
          fill="currentColor"
          class="bi bi-trash"
          viewBox="0 0 16 16"
          style="flex-basis: 5vw"
          @click="DELETE_CHOICE_FOODS(item['name'])"
        >
          <path
            d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z"
          />
          <path
            fill-rule="evenodd"
            d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z"
          />
        </svg>
        <svg
          xmlns="http://www.w3.org/2000/svg"
          width="20"
          height="20"
          fill="currentColor"
          class="bi bi-dash-circle"
          viewBox="0 0 16 16"
          style="flex-basis: 5vw; margin-left: 3vw"
          @click="MINUS_CHOICE_FOODS(item['name'])"
        >
          <path
            d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"
          />
          <path d="M4 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 4 8z" />
        </svg>
        <div style="flex-basis: 5vw text-align:center">
          {{ item['num'] }}
        </div>
        <svg
          xmlns="http://www.w3.org/2000/svg"
          width="20"
          height="20"
          fill="currentColor"
          class="bi bi-plus-circle"
          viewBox="0 0 16 16"
          style="flex-basis: 5vw"
          @click="PLUS_CHOICE_FOODS(item['name'])"
        >
          <path
            d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"
          />
          <path
            d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"
          />
        </svg>
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
  margin: 0.2vh 1.5vw;
  display: flex;
  align-items: center;
  height: 3vh;
  font-size: 2vh;
}
</style>
