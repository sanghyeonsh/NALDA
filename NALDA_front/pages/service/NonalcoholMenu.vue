<template>
  <div class="menu-container">
    <div>
      <img src="../../static/nacho.jpg" alt="나쵸" />
      <div>아직</div>
    </div>
    <div>
      <img src="../../static/nacho.jpg" alt="나쵸" />
      <div>아직</div>
    </div>
    <div>
      <img src="../../static/nacho.jpg" alt="나쵸" />
      <div>아직</div>
    </div>
    <div>
      <img src="../../static/nacho.jpg" alt="나쵸" />
      <div>아직</div>
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
