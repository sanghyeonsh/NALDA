<template>
  <div class="footer-container">
    <div class="footer-wrap">
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
          style="background-color: #206e95"
          @click="endMeals"
        >
          <img src="/main/flight_attendant_w.png" alt="toilet" />
          <h3>기내식종료</h3>
        </button>
        <button v-else class="service-wrap" style="background-color: #206e95" @click="MoveHelpcall">
          <img src="/main/flight_attendant_w.png" alt="toilet" />
          <h3>승무원호출</h3>
        </button>
      </div>
    </div>
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
      this.$router.push('/attendant/toilet')
    },
    endMeals() {
      const promise = new Promise((resolve, reject) => {
        resolve()
      })
      promise.then(async () => {
        await this.endMeal(this.flightNum)
      })
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

.footer-container {
  position: fixed;
  bottom: 0;
  width: 100vw;
  height: 10vh;
  display: flex;
  flex-direction: column;
  /* background-color: rgba(0, 0, 0, 0); */
}
.footer-container footer {
  width: 100%;
  text-align: center;
  font-size: smaller;
}

.footer-wrap {
  /* padding: 1%; */
}
.service-btn-wrap {
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
  /* padding: 1%; */
  align-items: center;
  height: 60%;
  margin-top: 1%;
  margin-right: 1%;
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
