<template>
  <div></div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
export default {
  name: 'AttendantStock',
  computed: {
    ...mapState('meal', 'meals'),
  },
  created() {
    this.getMeal()
  },
  methods: {
    ...mapActions('meal', ['getMeal']),
  },
}
</script>

<style scoped></style>
