<template>
  <div>
    <HeaderComponent />
    <nuxt-child></nuxt-child>
    <FooterComponent />
  </div>
</template>

<script>
export default {
  name: 'MealPage',
  components: {},
}
</script>

<style>
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
