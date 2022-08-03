<template>
  <div v-if="!isloaded" class="page-loader">
    <div class="square1"></div>
    <div class="square2"></div>
    <div class="square3"></div>
    <div class="square4"></div>
    <div class="plane">
      <!--<img
        class="loading-airplane"
        src="../static/icon/airplane_load_icon1.png"
        alt="loading-plane"
      />-->
      <!--<img
        class="loading-airplane"
        src="../static/icon/airplane_load_icon2.png"
        alt="loading-plane"
      />-->
      <img
        class="loading-airplane"
        src="../static/icon/airplane_load_icon3.png"
        alt="loading-plane"
      />
    </div>
    <div class="spinner">
      <img class="load-spinner" src="../static/icon/load_spinner_icon.png" alt="loading-plane" />
    </div>
  </div>
</template>

<script>
export default {
  name: 'PageLoader',
  data: () => {
    return {
      isloaded: false,
    }
  },
  mounted() {
    document.onreadystatechange = () => {
      if (document.readyState === 'complete') {
        // this.isloaded = true
      }
    }
  },
}
</script>

<style scoped>
.page-loader {
  display: flex;
  justify-content: center;
  align-items: center;
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: 70vh;
  background-color: rgba(255, 255, 255, 0);
  z-index: 999;
}

.square1 {
  width: 2%;
  height: 2%;
  margin-right: 0.5%;
  background-color: #dadada;
  animation: left 1s infinite;
}
.square2 {
  width: 2%;
  height: 2%;
  margin-right: 0.5%;
  background-color: #88c0c5;
}
.square3 {
  width: 2%;
  height: 2%;
  margin-right: 0.5%;
  background-color: #45a9c8;
}
.square4 {
  width: 2%;
  height: 2%;
  margin-right: 0.5%;
  background-color: #206e95;
}
.loading-airplane {
  width: 100%;
  height: 100%;
  margin-right: 0.5%;
  /*transform: rotate(135deg);*/
  transform: rotate(45deg);
}
.plane {
  width: 4%;
  margin-right: 0.5%;
  animation: right 1s infinite 0.5s;
}
/* .load-spinner {
  width: 100%;
  height: 100%;
  animation: spinner 2s linear infinite;
}
.spinner {
  width: 8%;
  margin-right: 0.5%;
} */

@keyframes left {
  40% {
    transform: translateX(-60px);
  }
  50% {
    transform: translateX(0);
  }
}
@keyframes right {
  40% {
    transform: translateX(60px);
  }
  50% {
    transform: translateX(0);
  }
}
</style>