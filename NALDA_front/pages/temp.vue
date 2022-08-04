<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div>
    <ol class="route-bus-line-list">
      <li
        v-for="(area, i) in areas"
        :key="i"
        class="route-bus-line-list-article top"
        @click="checkInfo(i + 1)"
      >
        {{ area }}
      </li>
    </ol>
    <button @click="checkConsole">check</button>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'

export default {
  data() {
    return {
      areas: ['서울', '경기', '인천', '강원', '충청', '경상', '전라'],
    }
  },
  computed: {
    ...mapState('transportation', ['info']),
  },
  created() {
    this.getInfo('1')
  },

  methods: {
    ...mapActions('transportation', ['getInfo', 'getTime', 'getStop']),
    checkInfo(area) {
      this.getInfo(String(area))
    },
    checkConsole() {
      // this.getStop(String(6300))
      this.getTime(String(6300))
    },
  },

  // created() {
  //   let url = 'http://apis.data.go.kr/B551177/BusInformation/getBusInfo'
  //   const key =
  //     '5R6TrpQSR9qAqoXkN7jJvtnhJ3TcQ%2F3Ua3%2FgpSIdBrc2wN%2FDeNYoOyC50DZRlR9cyOLRNV2yximCIyiQZQqM4g%3D%3D'
  //   url += '?' + encodeURIComponent('serviceKey') + '=' + key
  //   url +=
  //     '&' + encodeURIComponent('numOfRows') + '=' + encodeURIComponent('100')
  //   url += '&' + encodeURIComponent('pageNo') + '=' + encodeURIComponent('1')
  //   url += '&' + encodeURIComponent('area') + '=' + encodeURIComponent('2')
  //   url += '&' + encodeURIComponent('type') + '=' + encodeURIComponent('json')
  //   fetch(url)
  //     .then((res) => res.json())
  //     .then((data) => {
  //       console.log(data.response.body)
  //     })
  // },
}
</script>

<style></style>
