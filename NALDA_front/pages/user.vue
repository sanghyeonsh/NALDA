<template>
  <div class="user-page">
    <header-component></header-component>
    <nuxt-child></nuxt-child>
    <footer-component></footer-component>
  </div>
</template>

<script>
import FooterComponent from '../components/FooterComponent.vue'
import HeaderComponent from '../components/HeaderComponent.vue'
export default {
  name: 'UserPage',
  components: { FooterComponent, HeaderComponent },
}
</script>

<style scoped>
.user-logo {
  width: 8%;
}

.logo-wrap {
  text-align: center;
}
</style>
