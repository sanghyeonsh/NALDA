<template>
  <div>
    <div class="container1">
      <div class="container-box">
        <div>
          <img class="image" src="../../static/service.png" alt="service" />
          <h4>티웨이</h4>
        </div>
      </div>
      <div class="container-box">
        <div>
          <img class="image" src="../../static/service.png" alt="service" />
          <h4>Service</h4>
        </div>
      </div>
      <div class="container-box">
        <div>
          <img class="image" src="../../static/service.png" alt="service" />
          <h4>Service</h4>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'MainIndex',
  components: {},
}
</script>

<style>
.container1 {
  margin: auto;
  display: flex;
  height: 92vh;
  justify-content: space-around;
}

.container-box {
  text-align: center;
  width: 33%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.image {
  width: 70%;
}

.container-box {
  display: flex;
}
.content {
  width: 33%;
}
</style>
