<template>
  <div>
    <header-component></header-component>
    <service-navbar :active="active" @click="activeChange"></service-navbar>
    <component :is="whichChoice"></component>
    <div>{{ active }}</div>
  </div>
</template>

<script>
import HeaderComponent from '../components/HeaderComponent.vue'
import ServiceNavbar from '../components/ServiceNavbar.vue'
import SnackMenu from '../components/service/SnackMenu.vue'
import NonalcoholMenu from '../components/service/NonalcoholMenu.vue'
import AlcoholMenu from '../components/service/AlcoholMenu.vue'

export default {
  name: 'ServicePage',
  components: {
    HeaderComponent,
    ServiceNavbar,
    SnackMenu,
    NonalcoholMenu,
    AlcoholMenu,
  },
  data() {
    return {
      active: 0,
    }
  },
  computed: {
    // eslint-disable-next-line vue/return-in-computed-property
    whichChoice() {
      switch (this.active) {
        case 1:
          return 'SnackMenu'
        case 2:
          return 'NonalcoholMenu'
        case 3:
          return 'AlcoholMenu'
        default:
          return 'SnackMenu'
      }
    },
  },
}
</script>

<style></style>
