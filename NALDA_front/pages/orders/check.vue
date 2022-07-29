<template>
  <div class="check-container">
    <nav class="check-nav">
      <div class="check-nav-home" @click="MoveHome">
        <div>날다</div>
        <div>Home</div>
      </div>
      <div class="check-nav-title">
        <div>주문 확인</div>
      </div>
      <div class="check-nav-back">back</div>
      <div class="check-nav-profile">
        <div>profile</div>
        <div>김익명</div>
      </div>
    </nav>
    <body class="check-body">
      <div class="check-body-title">
        <div class="check-body-menu">메뉴</div>
        <div class="check-body-count">수량</div>
      </div>
      <div
        v-for="(item, idx) in selected_foods"
        :key="idx"
        class="check-body-detail"
      >
        <div class="check-body-detail-name">
          {{ item.name }}
        </div>
        <button class="check-body-detail-button">minus</button>
        <div class="check-body-detail-num">
          {{ item.num }}
        </div>
        <button class="check-body-detail-button">plus</button>
      </div>
    </body>
    <footer>
      <button class="check-button" @click="ShowPopup">주문하기</button>
      <StewardessButton />
    </footer>

    <div id="myModal" class="modal">
      <div class="modal-box">
        <div>
          <button class="close">close</button>
        </div>
        <div class="modal-title">
          <div>주문을 완료하시겠습니까?</div>
        </div>
        <div class="modal-button">
          <button @click="MoveWaiting">ok</button>
          <button @click="Cancel">cancel</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script scoped>
import { mapState, mapMutations } from 'vuex'

export default {
  name: 'OrdersCheck',
  computed: {
    ...mapState('menu', ['selected_foods']),
  },
  methods: {
    // modal popup
    ShowPopup() {
      // Get the modal
      const modal = document.getElementById('myModal')
      // Get the <span> element that closes the modal
      const span = document.getElementsByClassName('close')[0]
      // When the user clicks on the button, open the modal
      modal.style.display = 'block'

      // When the user clicks on <span> (x), close the modal
      span.onclick = function () {
        modal.style.display = 'none'
      }
      window.onclick = function (event) {
        if (event.target === modal) {
          modal.style.display = 'none'
        }
      }
    },
    MoveHome() {
      this.$router.push('/main')
    },
    MoveWaiting() {
      this.$router.push('/orders/waiting')
      this.CLEAR_CHOICE_FOODS()
    },
    Cancel() {
      const modal = document.getElementById('myModal')
      modal.style.display = 'none'
    },
    ...mapMutations('menu', [
      'SET_CHOICE_FOODS',
      'DELETE_CHOICE_FOODS',
      'CLEAR_CHOICE_FOODS',
      'PLUS_CHOICE_FOODS',
      'MINUS_CHOICE_FOODS',
    ]),
  },
}
</script>

<style scoped>
.check-container {
  display: flex;
  flex-direction: column;
  height: 100vh;
}
.check-nav {
  display: flex;
  background-color: rgb(69, 169, 200);
  height: 15vh;
  color: white;
  width: 100%;
}
.check-nav-home {
  /* flex-grow: 1; */
  width: 20%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  font-size: 30px;
  cursor: pointer;
}
.check-nav-title {
  /* flex-grow: 3; */
  width: 60%;
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 40px;
}
.check-nav-back {
  /* flex-grow: 0.5; */
  width: 5%;
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 25px;
}
.check-nav-profile {
  /* flex-grow: 0.5; */
  width: 15%;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  font-size: 15px;
}

.check-body {
  height: 85vh;
  overflow: scroll;
}
.check-body-title {
  margin-top: 10px;
  display: flex;
  background-color: rgb(69, 169, 200);
  color: white;
  gap: 10%;
  font-size: 50px;
  justify-content: space-around;
}
.check-body-menu {
  display: flex;
  justify-content: center;
}
.check-body-count {
  display: flex;
  justify-content: center;
}
.check-body-detail {
  display: flex;
  border-bottom: solid;
  height: 80px;
}
.check-body-detail-name {
  display: flex;
  justify-content: flex-start;
  margin-left: 5%;
  flex-basis: 62%;
  font-size: 50px;
}
.check-body-detail-button {
  flex-basis: 5%;
}
.check-body-detail-num {
  display: flex;
  justify-content: center;
  font-size: 50px;
  flex-basis: 10%;
}
.check-button {
  position: fixed;
  bottom: 7%;
  right: 2%;
  background-color: rgb(69, 169, 200);
  color: white;
  width: 150px;
  height: 60px;
  border-radius: 60px;
  border: none;
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 25px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0, 0, 0); /* Fallback color */
  background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
}

/* Modal Content/Box */
.modal-box {
  display: flex;
  flex-direction: column;
  background-color: rgb(69, 169, 200);
  color: white;
  /* 15% from the top and centered */
  margin: 15% auto;
  padding: 15px;
  width: 35%; /* Could be more or less, depending on screen size */
  height: 30%;
  border-radius: 20px;
}
/* The Close Button */
.close {
  display: flex;
  color: black;
  font-size: 20px;
  /* font-weight: bold; */
  justify-content: flex-end;
}
.close:hover,
.close:focus {
  color: black;
  text-decoration: none;
  cursor: pointer;
}
.modal-title {
  text-align: center;
  font-size: 20px;
  margin-top: 10%;
}
.modal-button {
  margin-top: 50px;
  display: flex;
  justify-content: center;
  gap: 20px;
}
.modal-button button {
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: white;
  color: rgb(69, 169, 200);
  width: 100px;
  padding: 10px;
  border-radius: 10px;
  border: none;
}
</style>
