<template>
  <div class="header">
    <div></div>
    <img class="logo" src="../static/logo.png" />
    <div @click="MoveSignup">
      signup
    </div>
  </div>
</template>

<script>
export default {
  name: 'HeaderComponent',
  methods: {
    MoveSignup() {
      this.$router.push('user/signup')
    }
  },
}
</script>

<style scoped>
.logo {
  width: 8%;
}

.header {
  display: flex;
  height: 30;
  /* background-color: rgb(136, 192, 197); */
  background-color: rgb(69, 169, 200);
  justify-content: space-between;
  align-items: center;
}
</style>
