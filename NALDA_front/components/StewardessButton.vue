<template>
  <div>
    <button class="stewardess-button">
      <img src="../static/main/flight_attendant_w.png" alt="toilet" />
      <h3>승무원</h3>
    </button>
  </div>
</template>

<script>
export default {
  name: 'StewardessButton',
}
</script>

<style scoped>
.stewardess-button {
  position: fixed;
  right: 2%;
  bottom: 22%;
  background-color: #206e95;
  color: white;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  width: 150px;
  height: 60px;
  border-radius: 60px;
  border: none;
}
.stewardess-button img {
  width: 50px;
  height: 50px;
}

.stewardess-button:hover {
  background-color: #88c0c5;
  box-shadow: 5px 5px 10px rgba(46, 205, 229, 0.4);
  color: #fff;
  transform: translateY(-7px);
}
</style>
