<template>
  <div>
    <div class="container1">
      <div class="container-box">
        <div>
          <img class="image" src="../../static/main/service.png" alt="service" />
          <h3>service</h3>
        </div>
      </div>
      <div class="container-box">
        <nuxt-link to="/user/login" style="text-decoration: none;">
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
      <div class="container-box">
        <div>
          <img class="image" src="../../static/main/airport_info.png" alt="airport_info" />
          <h3>Airport Info</h3>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'MainIndex',
  components: {},
  computed: {},
  methods: {
    moveLogin() {
      this.$router.push('/user/login')
    },
  },
}
</script>

<style>
:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
}

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

.container-box h3 {
  margin-top: 40px;
}

.container-box img {
  width: 70%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  /* filter: opacity(0.5) drop-shadow(#206e95); */
}

.container-box {
  display: flex;
}
.container-box div {
  padding: 30px;
}
.content {
  width: 33%;
}
</style>
