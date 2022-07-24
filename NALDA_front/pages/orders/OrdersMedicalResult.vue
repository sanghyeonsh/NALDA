<template>
  <div>
    <header-component></header-component>
    <div class="box">
      <div>
        <div class="text-box">
          가져다 드리겠습니다.<br />
          잠시만 기다려주세요!
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import HeaderComponent from '../../components/HeaderComponent.vue'
export default {
  name: 'OrdersMedicalResult',
  components: {
    HeaderComponent,
  },
}
</script>

<style scoped>
.box {
  background-color: #f5f6f7;
  height: 600px;
  display: flex;
  align-items: center;
  justify-content: center;
}
.text-box {
  display: table-cell;
  width: 800px;
  height: 400px;
  background-color: white;
  border: 2px solid black;
  text-align: center;
  vertical-align: middle;
  font-size: 50px;
}
</style>
