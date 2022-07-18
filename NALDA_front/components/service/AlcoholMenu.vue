<template>
  <div class="menu-container">
    <div>
      <img src="../../static/sparkling-wine.png" alt="스파클링 와인" />
      <div>술임</div>
    </div>
    <div>
      <img src="../../static/sparkling-wine.png" alt="스파클링 와인" />
      <div>술임</div>
    </div>
    <div>
      <img src="../../static/sparkling-wine.png" alt="스파클링 와인" />
      <div>술임</div>
    </div>
    <div>
      <img src="../../static/sparkling-wine.png" alt="스파클링 와인" />
      <div>술임</div>
    </div>
  </div>
</template>

<script>
export default {}
</script>

<style scoped>
img {
  width: 200px;
}
.menu-container {
  margin-top: 30px;
  display: flex;
  justify-content: space-around;
}
.menu-container > div > div {
  margin-top: 10px;
  text-align: center;
}
</style>
