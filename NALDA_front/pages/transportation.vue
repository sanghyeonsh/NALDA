<template>
  <div>
    <div class="transport-header">
      <div class="transport-header-left">
        <div class="transport-header-home">
          <div>날다</div>
          <div>Home</div>
        </div>
        <div class="transport-header-bus">공항리무진</div>
        <div class="transport-header-taxi">택시승강장</div>
        <div class="transport-header-subway">공항철도</div>
      </div>

      <div class="transport-header-right">
        <div class="transport-header-profile">
          <div class="profile-back">back버튼</div>
          <div class="profile-image">
            <img src="../static/main/user_profile_w.png" alt="" />
          </div>
          <div class="profile-name">김익명</div>
        </div>
      </div>
    </div>

    <div class="transport-body">이미지파일들 보여주기</div>
  </div>
</template>

<script>
export default {
  name: 'TransportPage',
}
</script>

<style>
.transport-header {
  height: 15vh;
  width: 100vw;
  display: flex;
  background-color: rgb(69, 169, 200);
  color: white;
}
.transport-header-left {
  width: 80%;
  display: flex;
}
.transport-header-home {
  width: 10%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.transport-header-bus {
  width: 15%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.transport-header-taxi {
  width: 15%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.transport-header-subway {
  width: 15%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.transport-header-right {
  width: 20%;
  display: flex;
}
.transport-header-profile {
  width: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
}
</style>
