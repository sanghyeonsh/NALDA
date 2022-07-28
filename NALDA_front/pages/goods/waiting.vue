<template>
  <div class="box">
    <div class="text-box">
      가져다 드리겠습니다.<br />
      잠시만 기다려주세요!<br />
      {{ selected_goods }}
    </div>
  </div>
</template>

<script>
import { mapState } from 'vuex'

export default {
  name: 'OrdersWaiting',
  computed: {
    ...mapState('goods', ['selected_goods']),
  },
}
</script>

<style scoped>
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
