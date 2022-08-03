<template>
  <div class="check-modal">
    <div class="check-modal-box">
      <div class="check-modal-head">
        <div class="check-modal-head-check">주문확인</div>
        <div class="check-modal-head-close" @click="CloseCheck">
          <img src="../static/orders/icons8-x-100.png" alt="" />
        </div>
      </div>
      <div class="check-modal-body">
        <div class="check-modal-body-head">
          <div class="body-head-menu">메뉴</div>
          <div class="body-head-count">수량</div>
        </div>

        <!-- for문 사용해서 div태그가 반복 -->
        <div class="check-modal-body-body">
          <!-- 줄v-for사용 -->
          <div
            v-for="(item, idx) in selected_foods"
            :key="idx"
            class="modal-body-body-item"
          >
            <div class="modal-body-body-menu">{{ item.serviceName }}</div>
            <div class="modal-body-body-count">
              <button @click="MINUS_CHOICE_FOODS(item)">
                <img src="../static/orders/minus.png" alt="" />
              </button>
              <div>{{ item.num }}</div>
              <button @click="PLUS_CHOICE_FOODS(item)">
                <img src="../static/orders/plus.png" alt="" />
              </button>
            </div>
          </div>
        </div>
      </div>
      <div class="check-modal-footer">
        <!-- <button @click="ChoiceMenu(item[0])">담기</button> -->
        <button @click="Waiting">주문완료</button>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState, mapMutations, mapActions } from 'vuex'
// import { inputOrders } from '@/api/menu'

export default {
  name: 'CheckModal',
  computed: {
    ...mapState('menu', ['selected_foods']),
    ...mapState('user', ['loginMember']),
    orders() {
      const Today = new Date()
      const year = Today.getFullYear()
      const month = ('0' + (Today.getMonth() + 1)).slice(-2)
      const day = ('0' + Today.getDate()).slice(-2)
      const hours = ('0' + Today.getHours()).slice(-2)
      const minutes = ('0' + Today.getMinutes()).slice(-2)
      const seconds = ('0' + Today.getSeconds()).slice(-2)
      const currentTime =
        year +
        '-' +
        month +
        '-' +
        day +
        'T' +
        hours +
        ':' +
        minutes +
        ':' +
        seconds
      const order = {
        orderMessage: 'test',
        orderTime: currentTime,
        flightNum: '1',
        seatNum: 'A36',
        username: this.loginMember.username,
        status: 'PROGRESS',
        orderList: [],
      }
      for (let i = 0; i < this.selected_foods.length; i++) {
        const code = this.selected_foods[i].serviceCode
        const num = this.selected_foods[i].num
        order.orderList.push({ orderCode: code, cnt: num })
      }
      return order
    },
  },
  methods: {
    CloseCheck() {
      const modal = document.getElementsByClassName('check-modal')[0]
      const span = document.getElementsByClassName('check-modal-head-close')[0]
      span.onclick = function () {
        modal.style.display = 'none'
      }
      window.onclick = function (event) {
        if (event.target === modal) {
          modal.style.display = 'none'
        }
      }
    },
    Waiting() {
      this.postOrders(this.orders)
      this.CLEAR_ITEMS()
      this.CLEAR_CHOICE_FOODS()
      this.CLEAR_CHECK_FOODS()
      this.$router.push('/waiting')
    },

    ...mapMutations('menu', [
      'SET_CHOICE_FOODS',
      'SET_CHOICE_FOODS',
      'DELETE_CHOICE_FOODS',
      'PLUS_CHOICE_FOODS',
      'MINUS_CHOICE_FOODS',
      'CLEAR_ITEM',
      'CLEAR_ITEMS',
      'CLEAR_CHOICE_FOODS',
      'CLEAR_CHECK_FOODS',
    ]),
    ...mapActions('menu', ['postOrders']),
  },
}
</script>

<style scoped>
.check-modal {
  /* Hidden by default */
  display: none;
  /* Stay in place */
  position: fixed;
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100vw; /* Full width */
  height: 100vh; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  /* Fallback color */
  background-color: rgb(0, 0, 0);
  /* Black w/ opacity */
  background-color: rgba(0, 0, 0, 0.4);
  font-size: 30px;
}

/* Modal Content/Box */
.check-modal-box {
  display: flex;
  flex-direction: column;
  background-color: rgb(69, 169, 200);
  /* color: white; */
  /* 15% from the top and centered */
  /* margin: 15% auto;
  padding: 15px; */
  /* width: 35%; Could be more or less, depending on screen size */
  /* height: 30%; */
  width: 60vw;
  height: 80vh;
  margin: 10vh auto;
  border: solid;
}

.check-modal-head {
  width: 100%;
  height: 10%;
  display: flex;
  background-color: rgb(69, 169, 200);
}
.check-modal-head-check {
  width: 90%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.check-modal-head-close {
  width: 10%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.check-modal-head-close img {
  width: 50%;
  height: 50%;
}

.check-modal-body {
  width: 100%;
  height: 80%;
  display: flex;
  flex-direction: column;
  background-color: white;
}

.check-modal-body-head {
  display: flex;
  width: 100%;
  height: 10%;
  border-top: solid;
  border-bottom: solid;
  background-color: #dadada;
}
.body-head-menu {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 80%;
}
.body-head-count {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 20%;
}
.check-modal-body-body {
  display: flex;
  flex-direction: column;
  height: 80%;
  width: 100%;
}
.modal-body-body-item {
  display: flex;
  border-bottom: solid;
  background-color: #f5f6f7;
}
.modal-body-body-menu {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 80%;
}
.modal-body-body-count {
  display: flex;
  width: 20%;
  justify-content: space-around;
  align-items: center;
}
.modal-body-body-count div {
  width: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
}
.modal-body-body-count button {
  width: 30%;
  border: none;
  background-color: #f5f6f7;
}
.modal-body-body-count img {
  width: 50%;
  height: 100%;
}

.check-modal-footer {
  background-color: white;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 10%;
}
.check-modal-footer button {
  width: 30%;
  height: 80%;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: #dadada;
  border: solid;
}
</style>
