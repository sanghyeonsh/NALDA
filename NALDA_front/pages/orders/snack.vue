<template>
  <div class="orders-snack-container">
    <ServiceNavbar />
    <ServiceCards />
    <ServiceFooter />
    <StewardessButton />
  </div>
</template>

<script>
export default {
  name: 'OrdersSnack',
}
</script>

<style scoped>
.orders-snack-container {
  display: flex;
  flex-direction: column;
  height: 100vh;
}
</style>
