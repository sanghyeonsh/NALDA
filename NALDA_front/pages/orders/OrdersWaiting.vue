<template>
  <div>
    <h1>기다려주세요</h1>
    <h3>
      {{ selected_goods }}
    </h3>
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

<style></style>
