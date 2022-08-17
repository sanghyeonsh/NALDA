<template>
  <div class="orders-snack-container">
    <header-component />
    <ServiceNavbar />
    <!-- <ServiceCards /> -->
    <!-- <ServiceFooter /> -->
    <!-- <StewardessButton /> -->
  </div>
</template>

<script>
import HeaderComponent from '../../components/HeaderComponent.vue'
export default {
  name: 'OrdersSnack',
  components: { HeaderComponent },
}
</script>

<style scoped>
.orders-snack-container {
  background-color: rgba(239, 239, 239, 0.511);
  display: flex;
  flex-direction: column;
  height: 100vh;
}
</style>
