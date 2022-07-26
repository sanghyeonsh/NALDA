<template>
  <div id="medical-main">
    <HeaderComponent />
    <div class="box">
      <div class="wrapper">
        <div @click="moveResult">
          <img src="../../static/medical/headache.png" />
          <div>두통</div>
        </div>
        <div @click="moveResult">
          <img src="../../static/medical/band-aid.png" />
          <div>외상</div>
        </div>
      </div>
      <div class="wrapper">
        <div @click="moveResult">
          <img src="../../static/medical/stomachache.png" />
          <div>복통</div>
        </div>
        <div @click="moveEtc">
          <img src="../../static/medical/more.png" />
          <div>기타</div>
        </div>
      </div>
    </div>
    <FooterComponent />
  </div>
</template>

<script>
import HeaderComponent from '../../components/HeaderComponent.vue'
export default {
  name: 'OrdersMedical',
  components: {
    HeaderComponent,
  },
  methods: {
    moveResult() {
      this.$router.push('/medical/result')
    },
    moveEtc() {
      this.$router.push('/medical/etc')
    },
  },
}
</script>

<style scoped>
.medical-main {
  height: 100vh;
}
.box {
  height: 70vh;
}
.wrapper {
  display: flex;
  justify-content: space-around;
}
.wrapper > div {
  cursor: pointer;
}
.wrapper > div > img {
  width: 200px;
  margin: 50px 100px;
}
.wrapper > div > div {
  text-align: center;
  font-size: 30px;
}
</style>
