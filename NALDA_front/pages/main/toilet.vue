<template>
  <div class="toilet-box">
    <div class="toilet-box-image">
      <img src="../../static/water.png" alt="" />
    </div>
  </div>
</template>

<script>
export default {
  name: 'MainToilet',
}
</script>

<style scoped>
.toilet-box {
  height: 70vh;
  width: 100%;
}
.toilet-box-image {
  height: 100%;
  width: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.toilet-box-image img {
  height: 80%;
  width: 80%;
}
</style>
