<template>
  <div></div>
</template>

<script>
import { mapState } from 'vuex'

export default {
  name: 'OrdersButton',
  computed: {
    ...mapState('menu', ['selected_foods']),
  },
  methods: {},
}
</script>

<style scoped></style>
