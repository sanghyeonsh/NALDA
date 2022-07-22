<template>
  <div>
    <b-card no-body>
      <b-tabs card>
        <b-tab no-body active>
          <template #title>
            <div class="movehome" @click="movehome">
              <h2>날다</h2>
              <h2>HOME</h2>
            </div>
          </template>
        </b-tab>

        <b-tab active>
          <template #title>
            <b-img class="menu-image" src="../../static/orders/dessert.png"></b-img>
            <div>간식</div>
          </template>
          <p class="p-3">Tab contents 1</p>
        </b-tab>

        <b-tab active>
          <template #title>
            <b-img class="menu-image" src="../../static/orders/drink.png"></b-img>
            <div>주류</div>
          </template>
          <p class="p-3">Tab contents 2</p>
        </b-tab>

        <b-tab active>
          <template #title>
            <b-img class="menu-image" src="../../static/orders/coffee_cup.png"></b-img>
            <div>비주류</div>
          </template>
          <p class="p-3">Tab contents 3</p>
        </b-tab>
      </b-tabs>
    </b-card>

    <div class="snack-flex-container">
      <div class="item">
        <h5>메뉴</h5>
      </div>
      <div class="item">
        <h5>수량</h5>
      </div>
    </div>
  </div>
</template>


<script>
import { mapState } from 'vuex'

// import axios from 'axios'

export default {
  name: 'OrderSnack',
  data() {
    return {
      checkedsnacks: [],
      testdata: [],
    }
  },
  computed: {
    ...mapState('orders', ['testdata1']),
  },
  // created: {

  // },
  // created() {
  //   const test = this
  //   axios
  //     .get('https://picsum.photos/v2/list?page=2&limit=5')
  //     .then(function (response) {
  //       test.testdata1 = response.data
  //     })
  //     .catch(function (err) {
  //       console.log(err)
  //     })
  // },
  methods: {
    movehome() {
      this.$router.push({ name: 'orders' })
    },
  },
}
</script>


<style scoped>
@import '../../node_modules/bootstrap/dist/css/bootstrap.css';
@import '../../node_modules/bootstrap-vue/dist/bootstrap-vue.css';
.card-header {
  background-color: rgb(69, 169, 200);
}
.menu-image {
  width: 80px;
  height: 80px;
}
.movehome {
  color: black;
  text-align: center;
}
.snack-flex-container {
  display: flex;
  background-color: rgb(69, 169, 200);
  color: white;
}
.item {
  padding: 0px 200px 0px 40px;
}
</style>