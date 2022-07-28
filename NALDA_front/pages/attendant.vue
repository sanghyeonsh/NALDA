<template>
  <div>
    <header-component></header-component>
    <nuxt-child></nuxt-child>
    <footer-component></footer-component>
  </div>
</template>

<script>
import HeaderComponent from '../components/HeaderComponent.vue'
import FooterComponent from '../components/FooterComponent.vue'
export default {
  name: 'AttendantPage',
  components: { HeaderComponent, FooterComponent },
}
</script>

<style>
</style>