<template>
  <div class="customs-page">
    <header-component></header-component>
    <nuxt-child></nuxt-child>
    <footer-component></footer-component>
  </div>
</template>

<script>
import HeaderComponent from '../components/HeaderComponent.vue'
import FooterComponent from '../components/FooterComponent.vue'
export default {
  name: 'CustomsDeclaration',
  components: { HeaderComponent, FooterComponent },
}
</script>
b
<style scoped>
.costoms-page {
  background-color: rgba(239, 239, 239, 0.511);
}

:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-background-blue-color: #45a9c8;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
  --nalda-navy-color: #1b2f40;
}
::-webkit-scrollbar {
  display: none;
}
</style>
