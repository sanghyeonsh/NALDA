<template>
  <div>
    <HeaderComponent />
    <div class="box">
      <div class="text-box">
        가져다 드리겠습니다.<br />
        잠시만 기다려주세요!<br />
      </div>
    </div>
    <FooterComponent />
  </div>
</template>

<script>
export default {
  name: 'WaitingPage',
}
</script>

<style scoped>
.box {
  background-color: white;
  height: 70vh;
  display: flex;
  justify-content: center;
  align-items: center;
}
.text-box {
  display: flex;
  width: 70vw;
  height: 50vh;
  border: 2px solid black;
  border-radius: 20px;
  justify-content: center;
  align-items: center;
  font-size: 50px;
}
</style>
