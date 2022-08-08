<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div>
    <button @click="getSubway">지하철 정보 가져오기</button>
    <button @click="getSubwayByCondition(condition)">
      제 1터미널 정보만 가져오기
    </button>
    <input v-model="check" type="time" @change="aaa" />
    <div>
      <button @click="aaa">데이터 22로 바꾸기</button>
    </div>
    <div>{{ time[cnt] }}</div>
    <button v-if="cnt > 0" @click="dec">감소</button>
    <button v-if="cnt < time.length - 1" @click="inc">증가</button>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
export default {
  data() {
    return {
      cnt: 0,
      subwayInfo: [],
      condition: {
        terminal: 1,
        type: 1,
        min: 0,
      },
      time: [],
      check: '',
    }
  },
  computed: {
    ...mapState('subway', ['subways', 'byCondition']),
  },
  methods: {
    ...mapActions('subway', ['getSubway', 'getSubwayByCondition']),
    aaa() {
      this.condition.terminal = 2
      this.condition.type = 2
      for (let i = 0; i < this.byCondition.length; i++) {
        let temp = []
        temp = this.byCondition[i].time.split(':')
        this.time.push(temp[0].slice(-2) + ':' + temp[1])
        console.log(this.check)
        if (this.check !== '') {
          if (
            parseInt(this.check.split(':')[0]) <= parseInt(temp[0].slice(-2))
          ) {
            if (parseInt(this.check.split(':')[1]) <= parseInt(temp[1])) {
              this.condition.min = i
              break
            }
          }
        }
      }
      console.log(this.condition.min)
    },
    dec() {
      this.cnt--
    },
    inc() {
      this.cnt++
    },
    test() {
      console.log(this.check)
    },
  },
}
</script>

<style></style>
