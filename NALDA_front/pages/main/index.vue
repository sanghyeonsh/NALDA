<template>
  <div>
    <div class="main-container1">
      <div class="main-container-box" @click="MoveOrders">
        <div>
<<<<<<< HEAD
          <img
            class="image"
            src="../../static/main/service.png"
            alt="service"
          />
=======
<<<<<<< HEAD
          <img class="image" src="../../static/service.png" alt="service" />
          <h4>{{ meal }}</h4>
=======
          <img class="image" src="../../static/main/service.png" alt="service" />
>>>>>>> a9028e23820f5498da421956bd515c5ffda7ce80
          <h3>service</h3>
>>>>>>> e173df38916e4d44554d6b190e6c3134aa5196cd
        </div>
      </div>
      <div class="main-container-box">
        <nuxt-link to="/user/login" style="text-decoration: none">
          <div>
            <img
              class="image"
              src="../../static/main/custom_declaration.png"
              alt="custom_declaration"
            />
            <h3>Custom Declaration</h3>
          </div>
        </nuxt-link>
      </div>
      <div class="main-container-box">
        <div>
          <img
            class="image"
            src="../../static/main/airport_info.png"
            alt="airport_info"
          />
          <h3>Airport Info</h3>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
<<<<<<< HEAD
import { mapState } from 'vuex'

const meal = 'meal'

export default {
  name: 'MainIndex',
  components: {},
  computed: {
    ...mapState(meal, ['meal']),
  },
=======
export default {
  name: 'MainIndex',
  components: {},
  computed: {},
>>>>>>> e173df38916e4d44554d6b190e6c3134aa5196cd
  methods: {
    moveLogin() {
      this.$router.push('/user/login')
    },
    MoveOrders() {
      this.$router.push('/orders')
    },
  },
}
</script>

<style scoped>
:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
}

.main-container1 {
  margin: auto;
  display: flex;
  height: 70vh;
  justify-content: space-around;
}

.main-container-box {
  text-align: center;
  width: 33%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}

.main-container-box h3 {
  margin-top: 40px;
}

.main-container-box img {
  width: 70%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  /* filter: opacity(0.5) drop-shadow(#206e95); */
}

.main-container-box {
  display: flex;
}
.main-container-box div {
  padding: 30px;
}
</style>
