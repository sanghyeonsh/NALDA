<template>
  <div class="service-modal">
    <div class="service-modal-box">
      <div class="service-modal-head">
        <div class="service-modal-head-close">
          <img src="/orders/icons8-x-100.png" alt="" />
        </div>
      </div>
      <div class="service-modal-body">
        <div class="service-modal-body-image">
          <img :src="'data:image/jpg;base64,' + item[0].bytesdata" alt="" />
        </div>

        <div class="service-modal-body-detail">
          <div class="service-modal-body-detail-name">
            {{ item[0].serviceName }}
          </div>
        </div>
      </div>

      <div class="service-modal-footer">
        <!-- <button @click="ChoiceMenu(item[0])">담기</button> -->
        <div class="service-modal-body-detail-button">
          <button @click="MINUS_CHOICE_FOODS(item[0])">
            <img src="/orders/minus.png" alt="" />
          </button>
          <div class="button-num">{{ item[0].num }}</div>
          <button @click="PLUS_CHOICE_FOODS(item[0])">
            <img src="/orders/plus.png" alt="" />
          </button>
        </div>
        <div class="detail-button">
          <button @click="SET_CHOICE_FOODS(item)">담기</button>
        </div>
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
.service-modal {
  display: none;
  position: fixed;
  z-index: 1;
  left: 0;
  top: 0;
  width: 100vw;
  height: 100vh;
  overflow: auto;
  background-color: rgb(0, 0, 0);
  background-color: rgba(0, 0, 0, 0.4);
  font-size: 30px;
}

.service-modal-box {
  display: flex;
  flex-direction: column;
  width: 50vw;
  height: 80vh;
  margin: 10vh auto;
  border: solid;
}

.service-modal-head {
  width: 100%;
  height: 10%;
  display: flex;
  justify-content: flex-end;
  background-color: rgb(69, 169, 200);
}
.service-modal-head-close {
  width: 10%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.service-modal-head-close img {
  width: 50%;
  height: 50%;
}

.service-modal-body {
  width: 100%;
  height: 80%;
  border-bottom: solid;
}
.service-modal-body-image {
  width: 100%;
  height: 85%;
  padding: 10%;
  background-color: white;
}
.service-modal-body-image img {
  width: 100%;
  height: 100%;
}
.service-modal-body-detail {
  background-color: rgb(69, 169, 200);
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 15%;
}
.service-modal-body-detail-name {
  width: 70%;
  display: flex;
  align-items: center;
  justify-content: center;
}

.service-modal-footer {
  display: flex;
  height: 10%;
  background-color: white;
}
.service-modal-body-detail-button {
  width: 50%;
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.service-modal-body-detail-button img {
  width: 50%;
  height: 80%;
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
.detail-button {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.detail-button button {
  width: 100%;
  height: 100%;
  border: none;
  background-color: white;
  border-left: solid;
}
</style>
