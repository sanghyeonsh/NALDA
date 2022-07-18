<template>
  <div class="user-page">
    <div>
      <img class="user-logo" src="../static/logo.png" />
    </div>
    <nuxt-child></nuxt-child>
  </div>
</template>

<script>
export default {
  name: 'UserPage',
  components: {
  },
}
</script>

<style> 
.user-logo {
  width: 8%;
}
.user-page {
  text-align: center;
}
</style>
