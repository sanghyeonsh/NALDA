<template>
  <div>
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
.menu-image {
  width: 80px;
  height: 80px;
}
.movehome {
  color: white;
  text-align: center;
}
.card-header {
  background-color: rgb(69, 169, 200);
  color: black;
}
a {
  color: black;
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
