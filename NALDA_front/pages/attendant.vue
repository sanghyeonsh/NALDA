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
  methods: {},
}
</script>

<style>
::-webkit-scrollbar {
  display: none;
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

@font-face {
  font-family: 'twayfly';
  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_tway@1.0/twayfly.woff')
    format('woff');
  font-weight: normal;
  font-style: normal;
}

* {
  font-family: 'twayfly';
  /* background-color: rgba(239, 239, 239, 0.511); */
}
</style>
