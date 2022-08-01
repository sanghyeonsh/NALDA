<template>
  <div class="medical-box">
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
</template>

<script>
export default {
  name: 'OrdersMedical',
  components: {},
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
.medical-box {
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
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
}
.wrapper > div > div {
  text-align: center;
  font-size: 30px;
}
</style>
