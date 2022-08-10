<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div>
    <div>test1</div>
    <div @click="aaa">test2</div>
    <div>test3</div>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
export default {
  data() {
    return {}
  },
  computed: {
    ...mapState('flight', ['validMsg']),
  },

  created() {
    this.getFlight('num1')
  },
  methods: {
    ...mapActions('flight', ['registFlight', 'getFlight', 'modifyFlight']),
    aaa() {
      console.log(this.validMsg)
    },
  },
}
</script>

<style></style>
