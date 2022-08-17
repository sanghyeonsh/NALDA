<template>
  <div class="orders-page">
    <nuxt-child></nuxt-child>
  </div>
</template>

<script>
export default {
  name: 'OrdersPage',
}
</script>

<style scoped>
::-webkit-scrollbar {
  display: none;
}

@font-face {
  font-family: 'twayfly';
  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_tway@1.0/twayfly.woff')
    format('woff');
  font-weight: normal;
  font-style: normal;
}
.orders-page {
  background-color: rgba(239, 239, 239, 0.511);
}

* {
  font-family: 'twayfly';
}
</style>
