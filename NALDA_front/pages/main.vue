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
  name: 'MainPage',
  components: {
    HeaderComponent,
    FooterComponent,
  },
  beforeRouteEnter(to, from, next) {
    let isLogin = null

    next((vm) => {
      isLogin = vm.$store.getters['user/isLogin']
    })
    if (isLogin) {
      next()
    } else {
      next(false)
    }
  },
}
</script>

<style scoped>
:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-background-blue-color: #45a9c8;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
  --nalda-navy-color: #1b2f40;
}
</style>
