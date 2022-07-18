<template>
  <div>
    <header-component></header-component>
    <nuxt-child></nuxt-child>
  </div>
</template>

<script>
import HeaderComponent from '../components/HeaderComponent.vue'

export default {
  name: 'OrdersPage',
  components: {
    HeaderComponent,
  },
}
</script>

<style></style>
