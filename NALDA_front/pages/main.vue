<template>
  <div class="main-page">
    <header-component></header-component>
    <nuxt-child></nuxt-child>
    <footer-component></footer-component>
  </div>
</template>

<script>
import HeaderComponent from '../components/HeaderComponent.vue'
import FooterComponent from '../components/FooterComponent.vue'

export default {
  name: 'MainPage',
  components: {
    HeaderComponent,
    FooterComponent,
  },
  mounted() {
    window.addEventListener('click', function (e) {
      const d = document.createElement('div')
      d.className = 'clickEffect'
      d.style.top = e.clientY + 'px'
      d.style.left = e.clientX + 'px'
      document.body.appendChild(d)
      d.addEventListener('animationend', function () {
        d.parentElement.removeChild(d)
      })
    })
  },
}
</script>

<style>
@font-face {
  font-family: 'twayfly';
  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_tway@1.0/twayfly.woff')
    format('woff');
  font-weight: normal;
  font-style: normal;
}

* {
  font-family: 'twayfly';
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

.main-page {
  background-color: rgba(239, 239, 239, 0.511);
}

div.clickEffect {
  position: fixed;
  box-sizing: border-box;
  border-style: solid;
  border-color: #206e95;
  border-radius: 50%;
  -webkit-animation: clickEffect 0.5s ease-out;
  z-index: 5;
}
@keyframes clickEffect {
  0% {
    opacity: 1;
    width: 1em;
    height: 1em;
    margin: -0.25em;
    border-width: 0.3rem;
  }
  100% {
    opacity: 0.1;
    width: 15em;
    height: 15em;
    margin: -7.5em;
    border-width: 0.01rem;
  }
}
</style>
