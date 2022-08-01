<template>
  <div class="service-modal">
    <div class="service-modal-box">
      <div class="service-modal-head">
        <button class="service-modal-head-close">close</button>
      </div>
      <div class="service-modal-body">
        <div class="service-modal-body-image">
          <img :src="'data:image/jpg;base64,' + item[0].bytesdata" alt="" />
        </div>

        <div class="service-modal-body-detail">
          <div class="service-modal-body-detail-name">
            {{ item[0].serviceName }}
          </div>
          <div class="service-modal-body-detail-button">
            <button @click="MINUS_CHOICE_FOODS(item[0])">
              <img src="../static/orders/minus.png" alt="" />
            </button>
            <div class="button-num">{{ item[0].num }}</div>
            <button @click="PLUS_CHOICE_FOODS(item[0])">
              <img src="../static/orders/plus.png" alt="" />
            </button>
          </div>
        </div>
      </div>

      <div class="service-modal-footer">
        <!-- <button @click="ChoiceMenu(item[0])">담기</button> -->
        <button @click="SET_CHOICE_FOODS(item)">담기</button>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState, mapMutations } from 'vuex'

export default {
  name: 'ServiceModal',
  computed: {
    ...mapState('menu', ['item']),
  },
  methods: {
    // modal popup
    ShowPopup() {
      // Get the modal
      const modal = document.getElementsByClassName('service-modal')[0]
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
/* The Modal (background) */
.service-modal {
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
.service-modal-box {
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

.service-modal-head {
  width: 100%;
  height: 10%;
  display: flex;
  justify-content: flex-end;
}
.service-modal-head-close {
  background-color: red;
  width: 10%;
  height: 100;
  display: flex;
  justify-content: center;
  align-items: center;
}

.service-modal-body {
  width: 100%;
  height: 80%;
}
.service-modal-body-image {
  width: 100%;
  height: 85%;
}
.service-modal-body-image img {
  width: 70%;
  height: 100%;
}
.service-modal-body-detail {
  background-color: white;
  display: flex;
  width: 100%;
  height: 15%;
}
.service-modal-body-detail-name {
  width: 70%;
  display: flex;
  align-items: center;
  justify-content: center;
}

.service-modal-body-detail-button {
  width: 30%;
  display: flex;
  align-items: center;
  justify-content: space-around;
}
.service-modal-body-detail-button img {
  width: 50%;
  height: 50%;
}
.service-modal-body-detail-button button {
  background-color: white;
  border: none;
  width: 30%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.service-modal-body-detail-button div {
  display: flex;
  justify-content: center;
  align-items: center;
}

.service-modal-footer {
  display: flex;
  justify-content: flex-end;
  height: 10%;
  padding: 1%;
  /* background-color: brown; */
}
.service-modal-footer button {
  width: 30%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
</style>
