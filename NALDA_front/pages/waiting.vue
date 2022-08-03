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
      <button class="waiting-page-body-button">
        <img src="/main/flight_attendant.png" alt="" />
        승무원
      </button>
    </div>
    <div class="waiting-footer">
      <span
        >이용약관 | 개인정보처리방침 | 책임의 한계와 고지 | 회원정보
        고객센터</span
      >
      <div>Copyright © NALDA Corp. All Rights Reserved.</div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'WaitingPage',
}
</script>

<style scoped>
.waiting-page {
  height: 100vh;
  width: 100vw;
}
.waiting-page-body {
  background-color: white;
  height: 70vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.waiting-page-body-text-box {
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
