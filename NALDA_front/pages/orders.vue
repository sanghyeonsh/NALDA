<template>
  <div>
    <div>
      <snack-navbar></snack-navbar>
    </div>
    <nuxt-child></nuxt-child>
  </div>
</template>

<script>
import SnackNavbar from '../components/SnackNavbar.vue'
export default {
  name: 'OrdersPage',
  components: { SnackNavbar },
}
</script>

<style scoped></style>
