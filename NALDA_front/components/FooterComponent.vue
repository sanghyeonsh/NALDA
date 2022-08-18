<template>
  <div class="service-btn-wrap">
    <button class="toilet-wrap" @click="MoveToilet">
      <div style="display: flex; align-items: center">
        <img src="/main/toilet_navy.png" alt="toilet" class="mr-2" />
        <div>화장실</div>
      </div>
    </button>
    <button
      v-if="role === 'ROLE_ATTENDANT'"
      class="service-wrap"
      style="background-color: #0e0737"
      @click="endMeals"
    >
      <img src="/main/flight_attendant_w.png" alt="toilet" />
      <div>기내식종료</div>
    </button>
    <button
      v-else
      class="service-wrap"
      style="background-color: #0e0737"
      @click="MoveHelpcall"
    >
      <img src="/main/flight_attendant_w.png" alt="toilet" />
      <div>승무원호출</div>
    </button>
  </div>
</template>

<script>
import { mapActions, mapState } from 'vuex'

export default {
  name: 'FooterComponent',
  data() {
    return {
      role: '',
    }
  },
  computed: {
    ...mapState('user', ['loginMember', 'flightNum', 'seatInfo']),
  },
  created() {
    this.role = this.loginMember?.userRole
  },
  methods: {
    ...mapActions('menu', ['postOrders']),
    ...mapActions('meal', ['endMeal', 'getMealList']),
    MoveHelpcall() {
      const order = {
        orderMessage: '',
        flightNum: this.flightNum,
        seatNum: this.seatInfo.seatNum,
        username: this.loginMember.username,
        status: 'PROGRESS',
        orderList: [
          {
            orderCode: 'A000',
            cnt: 1,
          },
        ],
      }
      this.postOrders(order)
      this.$router.push({ name: 'main-helpcall' })
    },
    MoveToilet() {
      this.$router.push('/main/toilet')
    },
    endMeals() {
      this.endMeal(this.flightNum)
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
  font-family: 'twayfly';
}

.service-btn-wrap {
  position: fixed;
  bottom: 20px;
  right: 15px;
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
  /* padding: 1%; */
  align-items: center;
}
.service-btn-wrap h3 {
  font-size: medium;
}

button {
  width: 150px;
  height: 60px;
  border-radius: 60px;
  border: none;
}

button:hover {
  background-color: #88c0c5;
  box-shadow: 5px 5px 10px rgba(46, 205, 229, 0.4);
  color: #fff;
  transform: translateY(-7px);
}

.toilet-wrap,
.service-wrap {
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
}

.toilet-wrap img {
  width: 50px;
  height: 50px;
}

.toilet-wrap {
  margin-right: 10px;
  background-color: #dadada;
  color: #1b2f40;
}

.service-wrap img {
  width: 50px;
  height: 50px;
}

.service-wrap {
  margin-left: 1%;
  background-color: #206e95;
  color: white;
}
</style>
