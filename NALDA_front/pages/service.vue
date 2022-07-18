<template>
  <div>
    <header-component></header-component>
    <service-navbar></service-navbar>
    <snack-menu></snack-menu>
  </div>
</template>

<script>
import HeaderComponent from '../components/HeaderComponent.vue'
import ServiceNavbar from '../components/ServiceNavbar.vue'
import SnackMenu from './service/SnackMenu.vue'
export default {
  name: 'ServicePage',
  components: {
    HeaderComponent,
    ServiceNavbar,
    SnackMenu,
  },
}
</script>

<style></style>
