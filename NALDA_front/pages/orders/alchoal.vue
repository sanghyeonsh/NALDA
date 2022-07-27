<template>
  <div id="container">
    <nav id="nav-items">
      <li style="display: flex; align-items: center" @click="MoveOrders">
        <h2 style="color: white; text-align: center">
          날다
          <br />home
        </h2>
      </li>
      <li @click="MoveDessert">
        <img src="../../static/orders/dessert.png" alt />
        <div>간식</div>
      </li>
      <li @click="MoveAlchoal">
        <img src="../../static/orders/drink.png" alt />
        <div>주류</div>
      </li>
      <li @click="MoveNonAlchoal">
        <img src="../../static/orders/coffee_cup.png" alt />
        <div>비주류</div>
      </li>
    </nav>

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

    <div id="footer">
      <div class="footer-head">
        <div class="footer-item">메뉴</div>
        <div class="footer-item">수량</div>
      </div>
      <div class="footer-body">
        <div v-for="(item, idx) in selected_foods" :key="idx" class="footer-content">
          <div style="flex-basis: 17vw">{{ item['name'] }}</div>
          <svg
            xmlns="http://www.w3.org/2000/svg"
            width="16"
            height="16"
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
            width="16"
            height="16"
            fill="currentColor"
            class="bi bi-dash-circle"
            viewBox="0 0 16 16"
            style="flex-basis: 5vw"
            @click="MINUS_CHOICE_FOODS(item['name'])"
          >
            <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z" />
            <path d="M4 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 4 8z" />
          </svg>
          <div style="flex-basis: 5vw text-align:center">{{ item['num'] }}</div>
          <svg
            xmlns="http://www.w3.org/2000/svg"
            width="16"
            height="16"
            fill="currentColor"
            class="bi bi-plus-circle"
            viewBox="0 0 16 16"
            style="flex-basis: 5vw"
            @click="PLUS_CHOICE_FOODS(item['name'])"
          >
            <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z" />
            <path
              d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"
            />
          </svg>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
import { mapState, mapMutations } from 'vuex'

export default {
  name: 'OrdersDesset',
  components: {},
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
    MoveOrders() {
      this.$router.push({ name: 'orders' })
      this.CLEAR_CHOICE_FOODS()
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

<style scoped>
#container {
  display: flex;
  flex-direction: column;
  height: 100vh;
}
#nav-items {
  display: flex;
  height: 15vh;
  /* padding: 0px; */
  /* gap: 30px; */
  background-color: rgb(69, 169, 200);
  width: 100%;
}
nav li {
  list-style: none;
  margin: 0 20px;
}
nav li:hover {
  cursor: pointer;
}
nav img {
  width: 7vw;
  height: 10vh;
}
.cards {
  height: 80vh;
  overflow: scroll;
  margin: 20px 0;
  padding: 0 150px;
}
.card-img-top {
  overflow: hidden;
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  height: 200px;
}
.col {
  padding: 15px;
}
img + div {
  text-align: center;
  font-size: 1.5rem;
}
#footer {
  display: flex;
  flex-direction: column;
  height: 20vh;
}
.footer-head {
  display: flex;
  background-color: rgb(69, 169, 200);
  color: white;
  gap: 300px;
}
.footer-body {
  overflow: scroll;
}
.footer-content {
  display: flex;
  align-items: center;
}
</style>
