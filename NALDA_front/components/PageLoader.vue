<template>
  <div v-if="toggle" class="page-loader">
    <div class="spinner">
      <div class="front">
        <img
          class="load-spinner"
          src="/icon/load_spinner_earth.png"
          alt="loading-earth"
        />
      </div>
      <div class="back">
        <img
          class="load-spinner"
          src="/icon/load_spinner_plane.png"
          alt="loading-spinner-plane"
        />
      </div>
    </div>
    <!-- <div id="spinner"></div> -->
    <!-- <img class="spinner-logo" src="/logo.png" alt /> -->
  </div>
</template>

<script>
export default {
  name: 'PageLoader',
  props: {
    toggle: Boolean,
  },
  data: () => {
    return {
      isloaded: false,
    }
  },
  mounted() {
    document.onreadystatechange = () => {
      if (document.readyState === 'complete') {
        this.isloaded = true
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
  top: 15vh;
  left: 0;
  margin-bottom: 15vh;
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
.load-spinner {
  width: 100%;
  height: 100%;
  animation: spinner 2s linear infinite;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
}
.spinner {
  width: 20%;
  margin-right: 0.5%;
  position: relative;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  margin-bottom: 15%;
}
.front {
  position: absolute;
}
.back {
  position: absolute;
  animation: spin 2s linear infinite;
}

@keyframes spin {
  0% {
    transform: rotate(0deg);
  }
  100% {
    transform: rotate(360deg);
  }
}

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
/*
#spinner {
  min-width: 200px;
  min-height: 200px;
  border: 10px solid rgba(255, 255, 255, 0.1);
  border-right: 10px solid #88c0c5;
  border-radius: 50%;
  animation: spinner 1s linear infinite;
}
@keyframes spinner {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}
.spinner-logo {
  width: 10%;
  position: fixed;
} */
</style>
