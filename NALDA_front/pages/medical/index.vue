<template>
  <div class="medical-box">
    <div class="medical-box-item">
      <div class="item-headache" @click="headache">
        <img src="/medical/headache.png" />
        <div>두통</div>
      </div>
      <div class="item-band" @click="bandage">
        <img src="/medical/band-aid.png" />
        <div>외상</div>
      </div>
    </div>
    <div class="medical-box-item">
      <div class="item-stomachache" @click="stomachache">
        <img src="/medical/stomachache.png" />
        <div>복통</div>
      </div>
      <div class="item-etc" @click="moveEtc">
        <img src="/medical/more.png" />
        <div>기타</div>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'

export default {
  name: 'OrdersMedical',
  components: {},
  computed: {
    ...mapState('user', ['loginMember', 'seatInfo', 'flightNum']),
  },
  methods: {
    ...mapActions('menu', ['postOrders']),
    headache() {
      const order = {
        orderMessage: '',
        flightNum: this.flightNum,
        seatNum: this.seatInfo.seatNum,
        username: this.loginMember.username,
        status: 'PROGRESS',
        orderList: [
          {
            orderCode: 'B001',
            cnt: 1,
          },
        ],
      }
      this.postOrders(order)
      this.$router.push('/waiting')
    },
    bandage() {
      const order = {
        orderMessage: '',
        flightNum: this.flightNum,
        seatNum: this.seatInfo.seatNum,
        username: this.loginMember.username,
        status: 'PROGRESS',
        orderList: [
          {
            orderCode: 'B003',
            cnt: 1,
          },
        ],
      }
      this.postOrders(order)
      this.$router.push('/waiting')
    },

    stomachache() {
      const order = {
        orderMessage: '',
        flightNum: this.flightNum,
        seatNum: this.seatInfo.seatNum,
        username: this.loginMember.username,
        status: 'PROGRESS',
        orderList: [
          {
            orderCode: 'B002',
            cnt: 1,
          },
        ],
      }
      this.postOrders(order)
      this.$router.push('/waiting')
    },
    moveEtc() {
      this.$router.push('/medical/etc')
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

.medical-box {
  height: 70vh;
  display: flex;
  flex-direction: column;
  padding: 50px;
  -webkit-filter: opacity(0.5) drop-shadow(0 0 0 #206e95);
  font-size: 30px;
}
.medical-box-item {
  display: flex;
  width: 100%;
  height: 50%;
}
.item-headache {
  width: 50%;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.item-headache img {
  width: 30%;
  height: 60%;
}
.item-headache div {
  height: 20%;
}
.item-band {
  width: 50%;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.item-band img {
  width: 30%;
  height: 60%;
}
.item-band div {
  height: 20%;
}
.item-stomachache {
  width: 50%;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.item-stomachache img {
  width: 30%;
  height: 60%;
}
.item-stomachache div {
  height: 20%;
}
.item-etc {
  width: 50%;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.item-etc img {
  width: 30%;
  height: 60%;
}
.item-etc div {
  height: 20%;
}
</style>
