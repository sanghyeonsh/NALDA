<template>
  <div>
    <div class="container1">
      <div class="container-box">
        <div>
          <img class="image" src="../../static/service.png" alt="service" />
          <h4>{{ meal }}</h4>
        </div>
      </div>
      <div class="container-box">
        <div @click="moveLogin">
          <img class="image" src="../../static/service.png" alt="service" />
          <h4>Custom Declaration</h4>
        </div>
      </div>
      <div class="container-box">
        <div>
          <img class="image" src="../../static/service.png" alt="service" />
          <h4>Airport Info</h4>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState } from 'vuex'

const meal = 'meal'

export default {
  name: 'MainIndex',
  components: {},
  computed: {
    ...mapState(meal, ['meal']),
  },
  methods: {
    moveLogin() {
      this.$router.push({ name: 'user-login' })
    },
  },
}
</script>

<style>
.container1 {
  margin: auto;
  display: flex;
  height: 92vh;
  justify-content: space-around;
}

.container-box {
  text-align: center;
  width: 33%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}

.image {
  width: 70%;
}

.container-box {
  display: flex;
}
.content {
  width: 33%;
}
</style>
