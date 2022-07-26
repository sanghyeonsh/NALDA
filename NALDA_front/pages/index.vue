<template>
  <div class="init-screen" @click="moveMain">
    <img class="logo" src="../static/logo.png" />
  </div>
</template>

<script>
export default {
  name: 'MainPage',
  methods: {
    moveMain() {
      this.$router.push('/main')
    },
  },
}
</script>

<style scoped>
.logo {
  cursor: pointer;
}
.init-screen {
  height: 100vh;
  display: flex;
  background-color: rgb(69, 169, 200);
  justify-content: center;
  align-items: center;
}
body {
  cursor: none;
}
</style>
