<template>
  <div class="main-container">
    <div class="main-container-box" @click="MoveRequest">
      <div>
        <img class="image" src="../../static/main/call_sevice_icon.png" alt="service" />
        <h3>Request</h3>
      </div>
    </div>
    <div class="main-container-box">
      <nuxt-link to="/attendant/request" style="text-decoration: none">
        <div>
          <img class="image" src="../../static/main/excel_icon.png" alt="custom_declaration" />
          <h3>Maninging Stock</h3>
        </div>
      </nuxt-link>
    </div>
    <div class="main-container-box">
      <div>
        <img class="image" src="../../static/orders/food.png" alt="airport_info" />
        <h3>Meal Service</h3>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'AttendantMain',
}
</script>

<style>
.main-container {
  display: flex;
  height: 70vh;
}
.main-container-box {
  text-align: center;
  width: 50%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.main-container-box img {
  width: 70%;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  /* filter: opacity(0.5) drop-shadow(#206e95); */
}
.main-container-box h3 {
  margin-top: 5vh;
}

.main-container-box div {
  padding: 7vh;
}
</style>