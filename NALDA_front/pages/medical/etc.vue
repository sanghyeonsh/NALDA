<template>
  <div>
    <div class="box">
      <div class="form-box">
        <div class="title">증상 및 요청사항을 입력해주세요.</div>
        <div class="content">
          <!-- <input
            :value="input"
            class="input"
            placeholder="Tap on the virtual keyboard to start"
            @input="onInputChange"
          /> -->
          <form class="add-form" @submit.prevent="doAdd">
            <input
              ref="comment"
              type="text"
              :value="input"
              class="input"
              placeholder="Tap on the virtual keyboard to start"
              @input="onInputChange"
            />

            <button @click="etcCheck">확인</button>
          </form>

          <!-- <button @click="etcCheck">확인</button> -->
        </div>
      </div>
      <simple-keyboard
        :input="input"
        @onChange="onChange"
        @onKeyPress="onKeyPress"
      ></simple-keyboard>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
import SimpleKeyboard from '../../components/SimpleKeyboard.vue'

export default {
  name: 'OrdersMedicalEtc',
  components: {
    SimpleKeyboard,
  },
  data() {
    return {
      input: '',
    }
  },
  computed: {
    ...mapState('user', ['loginMember', 'seatInfo', 'flightNum']),
  },
  methods: {
    ...mapActions('menu', ['postOrders']),
    etcCheck() {
      const order = {
        orderMessage: this.input,
        flightNum: this.flightNum,
        seatNum: this.seatInfo.seatNum,
        username: this.loginMember.username,
        status: 'PROGRESS',
        orderList: [
          {
            orderCode: 'B004',
            cnt: 1,
          },
        ],
      }
      this.postOrders(order)
      this.$router.push('/waiting')
    },
    onChange(input) {
      this.input = input
    },
    onKeyPress(button) {},
    onInputChange(input) {
      this.input = input.target.value
    },
  },
}
</script>

<style scoped>
@font-face {
  font-family: 'twayfly';
  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_tway@1.0/twayfly.woff')
    format('woff');
  font-weight: normal;
  font-style: normal;
}

* {
  margin: 0;
  padding: 0;
  font-family: 'twayfly';
}

.box {
  background-color: #f5f6f7;
  height: 600px;
}
.form-box {
  width: 800px;
  height: 200px;
  margin: 0px auto;
  padding-top: 50px;
  padding-left: 75px;
}
.title {
  font-size: 20px;
  margin-bottom: 10px;
}
.content > input {
  width: 600px;
  height: 35px;
}
.content > button {
  border: none;
  border-radius: 5px;
  background-color: rgb(69, 169, 200);
  color: white;
}
</style>
