<template>
  <div class="helpcall-box">
    <div class="text-box">
      <div>승무원이 요청을 확인 중입니다.</div>
      <div>잠시만 기다려주세요!</div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'MainHelpCall',
  components: {},
}
</script>

<style scoped>
.helpcall-box {
  height: 70vh;
  width: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.text-box {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 60%;
  height: 70%;
  flex-direction: column;
  border: 2px solid black;
  font-size: 50px;
}
</style>
