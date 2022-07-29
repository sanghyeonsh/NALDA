<template>
  <div class="cards row row-cols-4">
    <div v-for="(item, idx) in items" :key="idx" class="col">
      <div class="card" @click="ChoiceMenu(item.author)">
        <img
          :src="'data:image/jpg;base64,' + item"
          class="card-img-top"
          alt="..."
        />
        <div class="card-body">
          <div class="card-title">{{ item.author }}</div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState, mapMutations } from 'vuex'

export default {
  computed: {
    ...mapState('menu', ['items']),
  },
  mounted() {
    setTimeout(() => {
      const menu = document.querySelector('.footer-body')
      menu.scrollTop = menu.scrollHeight
    }, 0)
  },
  methods: {
    ...mapMutations('menu', [
      'SET_CHOICE_FOODS',
      'DELETE_CHOICE_FOODS',
      'CLEAR_CHOICE_FOODS',
      'PLUS_CHOICE_FOODS',
      'MINUS_CHOICE_FOODS',
    ]),

    ChoiceMenu(data) {
      this.SET_CHOICE_FOODS(data)
      setTimeout(() => {
        const menu = document.querySelector('.footer-body')
        menu.scrollTop = menu.scrollHeight
      }, 0)
    },
  },
}
</script>

<style>
.cards {
  overflow: scroll;
  width: 100%;
  padding: 0 10vw;
  height: 65vh;
}
.cards .col {
  padding: 20px;
}
.cards::-webkit-scrollbar {
  display: none; /* Chrome, Safari, Opera*/
}
.card-img-top {
  overflow: hidden;
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  height: 20vh;
}
.card-body {
  padding: 15px;
  height: 100px;
}
.card-title {
  text-align: center;
  font-size: 20px;
}
</style>
