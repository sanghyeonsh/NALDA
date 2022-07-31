<template>
  <div class="check-modal">
    <div class="check-modal-box">
      <div class="check-modal-head">
        <div>주문확인</div>
        <button>close</button>
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
            v-for="(item, idx) in test"
            :key="idx"
            class="modal-body-body-item"
          >
            <div class="modal-body-body-menu">{{ item.name }}</div>
            <div class="modal-body-body-count">
              <button>-</button>
              <div>{{ item.num }}</div>
              <button>+</button>
            </div>
          </div>
        </div>
      </div>

      <div class="check-modal-footer">
        <!-- <button @click="ChoiceMenu(item[0])">담기</button> -->
        <button>주문하기</button>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState, mapMutations } from 'vuex'

export default {
  name: 'CheckModal',
  data() {
    return {
      test: [
        { name: '나쵸', num: 6 },
        { name: '콜라', num: 2 },
        { name: '맥주', num: 4 },
      ],
    }
  },
  computed: {
    ...mapState('menu', ['item']),
  },
  methods: {
    // modal popup
    ShowPopup() {
      // Get the modal
      const modal = document.getElementsByClassName('check-modal')[0]
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

    ...mapMutations('menu', [
      'SET_CHOICE_FOODS',
      'DELETE_CHOICE_FOODS',
      'CLEAR_CHOICE_FOODS',
      'PLUS_CHOICE_FOODS',
      'MINUS_CHOICE_FOODS',
      'SET_CHOICE_FOODS',
    ]),
  },
}
</script>

<style scoped>
.check-modal {
  /* Hidden by default */
  /* display: none; */
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
  width: 80vw;
  height: 80vh;
  margin: 10vh auto;
  border-radius: 20px;
}

.check-modal-head {
  width: 100%;
  height: 10%;
  display: flex;
}
.check-modal-head div {
  background-color: salmon;
  width: 90%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.check-modal-head button {
  background-color: rebeccapurple;
  width: 10%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.check-modal-body {
  width: 100%;
  height: 80%;
  display: flex;
  flex-direction: column;
}

.check-modal-body-head {
  display: flex;
  width: 100%;
  height: 20%;
}
.body-head-menu {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 80%;
  background-color: brown;
}
.body-head-count {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 20%;
  background-color: black;
}
.check-modal-body-body {
  display: flex;
  flex-direction: column;
  background-color: bisque;
  height: 80%;
  width: 100%;
}
.modal-body-body-item {
  display: flex;
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

.check-modal-footer {
  display: flex;
  justify-content: flex-end;
  height: 10%;
}
.check-modal-footer button {
  width: 30%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
</style>
