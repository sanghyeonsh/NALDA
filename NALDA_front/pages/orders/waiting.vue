<template>
  <div class="waiting-container">
    <HeaderComponent />
    <div class="box">
      <div class="text-box">
        가져다 드리겠습니다.<br />
        잠시만 기다려주세요!<br />
      </div>
    </div>
    <StewardessButton />
  </div>
</template>

<script>
export default {
  name: 'OrdersWaiting',
}
</script>

<style scoped>
.waiting-container {
  height: 100vh;
  display: flex;
  flex-direction: column;
}
.box {
  background-color: white;
  height: 70vh;
  display: flex;
  align-items: center;
  justify-content: center;
}
.text-box {
  display: flex;
  width: 70vw;
  height: 50vh;
  border: 2px solid black;
  align-items: center;
  justify-content: center;
  font-size: 50px;
}
</style>
