<template>
  <div>
    <header-component></header-component>
    <div class="box">
      <div class="form-box">
        <div class="title">증상 및 요청사항을 입력해주세요.</div>
        <div class="content">
          <input
            class="input"
            placeholder="Tap on the virtual keyboard to start"
          />
          <button>확인</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import HeaderComponent from '../../components/HeaderComponent.vue'

export default {
  name: 'EtcPage',
  components: {
    HeaderComponent,
  },
}
</script>

<style>
.box {
  background-color: #f5f6f7;
  height: 600px;
}
.form-box {
  width: 800px;
  height: 200px;
  margin: 0px auto;
  padding-top: 50px;
  padding-left: 75px;
}
.title {
  font-size: 20px;
  margin-bottom: 10px;
}
.content > input {
  width: 600px;
  height: 35px;
}
.content > button {
  border: none;
  border-radius: 5px;
  background-color: rgb(69, 169, 200);
  color: white;
}
</style>
