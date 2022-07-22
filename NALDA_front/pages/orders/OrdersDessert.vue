<template>
  <div>
    <button class="orderbutton">주문하기</button>
    <div class="nav-snack">
      <nav>
        <div class="flex-container">
          <div class="item-home" @click="MoveOrders">
            날다
            <br />
            home
          </div>

          <div class="item1" @click="MoveDessert">
            <img src="../../static/orders/dessert.png" alt="" />
            <div style="text-align: center">간식</div>
          </div>

          <div class="item2" @click="MoveAlchoal">
            <img src="../../static/orders/drink.png" alt="" />
            <div style="text-align: center">주류</div>
          </div>
          <div class="item3" @click="MoveNonAlchoal">
            <img src="../../static/orders/coffee_cup.png" alt="" />
            <div style="text-align: center">비주류</div>
          </div>
        </div>
      </nav>
    </div>

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

    <div class="footer">
      <div class="footer-head">
        <div class="footer-item">메뉴(최대 5개)</div>
        <div class="footer-item">수량</div>
      </div>
      <div class="footer-body">
        <div v-for="(item, idx) in selected_foods.slice(0, 5)" :key="idx">
          <div>
            {{ item['name'] }}
            <svg
              xmlns="http://www.w3.org/2000/svg"
              width="16"
              height="16"
              fill="currentColor"
              class="bi bi-trash"
              viewBox="0 0 16 16"
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
              @click="MINUS_CHOICE_FOODS(item['name'])"
            >
              <path
                d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"
              />
              <path
                d="M4 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 4 8z"
              />
            </svg>
            <span>{{ item['num'] }}</span>
            <svg
              xmlns="http://www.w3.org/2000/svg"
              width="16"
              height="16"
              fill="currentColor"
              class="bi bi-plus-circle"
              viewBox="0 0 16 16"
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
    },
  },
}
</script>

<style scoped>
.cards {
  padding: 170px 30px 180px 30px;
}

.col {
  padding: 20px;
}
.snack-footer {
  z-index: 1;
}
.nav-snack {
  position: fixed;
  z-index: 1;
  width: 100%;
}
.flex-container {
  display: flex;
  align-items: center;
  background-color: rgb(69, 169, 200);
  height: 110px;
}
.item-home {
  color: white;
  text-align: center;
  font-size: 30px;
  margin-left: 30px;
}
.item1 {
  margin: 1.5rem;
  border-bottom: solid;
}
.item2 {
  margin: 1.5rem;
}
.item3 {
  margin: 1.5rem;
}
.item1 > img {
  width: 80px;
  height: 80px;
  object-fit: cover;
}
.item2 > img {
  width: 80px;
  height: 80px;
  object-fit: cover;
}
.item3 > img {
  width: 80px;
  height: 80px;
  object-fit: cover;
}
.card-img-top {
  overflow: hidden;
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  height: 200px;
}
.footer {
  position: fixed;
  width: 100%;
  bottom: 0px;
}
.footer-head {
  background-color: rgb(69, 169, 200);
  display: flex;
  color: white;
}
.footer-body {
  background-color: white;
}
.footer-item {
  padding: 0 50px 0 50px;
}

.orderbutton {
  z-index: 2;
  position: fixed;
  right: 50px;
  color: white;
  bottom: 30px;
  background-color: rgb(69, 169, 200);
  border: 2px solid rgb(69, 169, 200);
  border-radius: 12px;
  font-size: 20px;
  padding: 16px 14px;
}
</style>
