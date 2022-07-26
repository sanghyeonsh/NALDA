<template>
  <div id="container">
    <ServiceNavbar />
    <div class="cards row row-cols-4">
      <div v-for="(item, idx) in testdata" :key="idx" class="col">
        <div class="card h-100" @click="ChoiceMenu(item.author)">
          <img :src="item.download_url" class="card-img-top" alt="..." />
          <div class="card-body">
            <h5 class="card-title">{{ item.author }}</h5>
          </div>
        </div>
      </div>
    </div>
    <ServiceFooter />
  </div>
</template>

<script>
import axios from 'axios'
import { mapState, mapMutations } from 'vuex'

export default {
  name: 'OrdersDesset',
  data() {
    return {
      testdata: [],
    }
  },
  computed: {
    ...mapState('menu', ['selected_foods']),
  },
  created() {
    const test = this
    axios
      .get('https://picsum.photos/v2/list?page=2&limit=12')
      .then(function (response) {
        test.testdata = response.data
      })
      .catch(function (error) {
        console.log(error)
      })
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
#container {
  display: flex;
  flex-direction: column;
  height: 100vh;
}

.cards {
  height: 70vh;
  overflow: scroll;
  width: 100%;
  padding: 0 10vw;
}
.cards .col {
  padding: 20px;
}
.card-img-top {
  overflow: hidden;
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  height: 200px;
}
img + div {
  text-align: center;
  font-size: 1.5rem;
}
</style>
