<template>
  <div class="waiting-page">
    <HeaderComponent />
    <div class="waiting-page-body">
      <div class="waiting-page-body-text-box">
        <div>
          가져다 드리겠습니다. <br />
          잠시만 기다려주세요!
        </div>
      </div>
      <FooterComponent></FooterComponent>
    </div>
  </div>
</template>

<script>
import FooterComponent from '../components/FooterComponent.vue'
export default {
  name: 'WaitingPage',
  components: { FooterComponent },
  mounted() {
    this.moveMain()
  },
  methods: {
    moveMain() {
      window.setTimeout(() => {
        this.$router.push('/main')
      }, 3000)
    },
  },
}
</script>

<style scoped>
.waiting-page {
  height: 100vh;
  width: 100vw;
}
.waiting-page-body {
  background-color: rgba(239, 239, 239, 0.511);
  height: 85vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.waiting-page-body-text-box {
  background-color: white;
  display: flex;
  width: 70vw;
  height: 50vh;
  border: 2px solid black;
  border-radius: 20px;
  justify-content: center;
  align-items: center;
  font-size: 50px;
}

.waiting-page-body-button {
  background-color: rgb(69, 169, 200);
  position: fixed;
  bottom: 15vh;
  right: 2vw;
  width: 10vw;
  height: 5vh;
  border-radius: 60px;
  border: none;
}
.waiting-page-body-button img {
  width: 30%;
  height: 100%;
}

.waiting-footer {
  height: 15vh;
  display: flex;
  justify-content: center;
  align-items: center;
}
</style>
