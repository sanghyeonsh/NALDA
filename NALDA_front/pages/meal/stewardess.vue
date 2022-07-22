<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div>
    <!-- {{ testdata1 }} -->

    <div v-for="(item, idx) in testdata1" :key="idx">
      <img :src="item.download_url" alt="a" />
    </div>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  data() {
    return {
      testdata1: [],
    }
  },
  created() {
    const test = this
    axios
      .get('https://picsum.photos/v2/list?page=2&limit=5')
      .then(function (response) {
        test.testdata1 = response.data
        console.log(test.testdata1)
      })
      .catch(function (err) {
        console.log(err)
      })
  },
}
</script>

<style scoped>
img {
  width: 200px;
  height: 200px;
}
</style>
