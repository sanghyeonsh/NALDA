<template>
  <div class="medical-box">
    <div class="medical-box-item">
      <div class="item-headache" @click="moveResult">
        <img src="../../static/medical/headache.png" />
        <div>두통</div>
      </div>
      <div class="item-band" @click="moveResult">
        <img src="../../static/medical/band-aid.png" />
        <div>외상</div>
      </div>
    </div>
    <div class="medical-box-item">
      <div class="item-stomachache" @click="moveResult">
        <img src="../../static/medical/stomachache.png" />
        <div>복통</div>
      </div>
      <div class="item-etc" @click="moveEtc">
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
  display: flex;
  flex-direction: column;
  padding: 50px;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  font-size: 30px;
}
.medical-box-item {
  display: flex;
  width: 100%;
  height: 50%;
}
.item-headache {
  width: 50%;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.item-headache img {
  width: 30%;
  height: 60%;
}
.item-headache div {
  height: 20%;
}
.item-band {
  width: 50%;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.item-band img {
  width: 30%;
  height: 60%;
}
.item-band div {
  height: 20%;
}
.item-stomachache {
  width: 50%;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.item-stomachache img {
  width: 30%;
  height: 60%;
}
.item-stomachache div {
  height: 20%;
}
.item-etc {
  width: 50%;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.item-etc img {
  width: 30%;
  height: 60%;
}
.item-etc div {
  height: 20%;
}
</style>
