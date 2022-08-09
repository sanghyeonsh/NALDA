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
  name: 'MainPage',
  components: {
    HeaderComponent,
    FooterComponent,
  },
  beforeRouteEnter(to, from, next) {
    let isLogin = null

    next((vm) => {
      isLogin = vm.$store.getters['user/isLogin']
    })
    if (isLogin) {
      next()
    } else {
      next(false)
    }
  },
  mounted() {
    window.addEventListener('click', function (e) {
      const d = document.createElement('div')
      d.className = 'clickEffect'
      d.style.top = e.clientY + 'px'
      d.style.left = e.clientX + 'px'
      document.body.appendChild(d)
      console.log(1)
      d.addEventListener('animationend', function () {
        console.log(2)
        d.parentElement.removeChild(d)
      })
    })
  },
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
div.clickEffect {
  position: fixed;
  box-sizing: border-box;
  border-style: solid;
  border-color: #206e95;
  border-radius: 50%;
  -webkit-animation: clickEffect 0.8s ease-out;
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
