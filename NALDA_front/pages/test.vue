<template>
  <div>
    <h1>test2</h1>
    <div id="hi">hihihiihihih</div>
  </div>
</template>

<script>
export default {
  name: 'TestPage2',
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
div.clickEffect {
  position: fixed;
  box-sizing: border-box;
  border-style: solid;
  border-color: #828282;
  border-radius: 50%;
  animation: clickEffect 0.8s ease-out;
  z-index: 5;
}
@keyframes clickEffect {
  0% {
    opacity: 1;
    width: 0.5em;
    height: 0.5em;
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

<style scoped>
#hi {
  background-color: black;
}
</style>
