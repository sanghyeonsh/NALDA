<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div>
    <button @click="changeForm">Change</button>
    <button @click="postInfo(list)">Input</button>
    <div v-for="(a, idx) in info" :key="idx">{{ a }}</div>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'

export default {
  data() {
    return {
      list: [],
    }
  },
  computed: {
    ...mapState('subway', ['info']),
  },
  created() {
    this.getInfo()
  },
  methods: {
    ...mapActions('subway', ['getInfo', 'postInfo']),
    changeForm() {
      for (let idx = 0; idx < this.info.totalCount; idx++) {
        const subway = {
          name: '',
          time: '',
          end: '',
          dayCode: '',
        }

        subway.name = this.info.items.item[idx].subwayStationNm
        subway.end = this.info.items.item[idx].endSubwayStationNm
        subway.dayCode = this.info.items.item[idx].dailyTypeCode
        const Today = new Date()
        const year = Today.getFullYear()
        const month = ('0' + (Today.getMonth() + 1)).slice(-2)
        const day = ('0' + Today.getDate()).slice(-2)
        const hour = String(this.info.items.item[idx].depTime).substr(0, 2)
        const minute = String(this.info.items.item[idx].depTime).substr(2, 2)
        const second = String(this.info.items.item[idx].depTime).substr(4, 2)

        const currentTime =
          year +
          '-' +
          month +
          '-' +
          day +
          'T' +
          hour +
          ':' +
          minute +
          ':' +
          second
        subway.time = currentTime
        this.list.push(subway)
      }
  },
  // subwayInput() {
  //   this.postInfo(this.list)
  // },
}
</script>

<style></style>
