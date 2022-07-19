<template>
  <div class="user-page">
    <div class="logo-wrap">
      <img class="user-logo" src="../static/logo.png" />
    </div>
    <nuxt-child></nuxt-child>
    <footer-component></footer-component>
  </div>
</template>

<script>
import FooterComponent from '../components/FooterComponent.vue'
export default {
  name: 'UserPage',
  components: { FooterComponent },
}
</script>

<style>
.user-logo {
  width: 8%;
}

.logo-wrap {
  text-align: center;
}
</style>
