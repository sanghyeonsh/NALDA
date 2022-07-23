<template>
  <div>
    <div class="box">
      <div>
        <div class="text-box">
          승무원이 요청을 확인 중입니다.<br />
          잠시만 기다려주세요!
        </div>
      </div>
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
