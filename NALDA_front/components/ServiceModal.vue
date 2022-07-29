<template>
  <div class="service-modal">
    <div class="service-modal-box">
      <div class="service-modal-head">
        <button class="close">close</button>
      </div>
      <div class="service-modal-body">
        <div class="service-modal-body-image">
          <img src="../static/water.png" alt="" />
        </div>

        <div class="service-modal-body-detail">
          <div class="service-modal-body-detail-name">메뉴이름</div>
          <div class="service-modal-body-detail-button">
            <button>-</button>
            <div>4</div>
            <button>+</button>
          </div>
        </div>
      </div>

      <div class="service-modal-footer">
        <button>담기</button>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState } from 'vuex'

export default {
  name: 'ServiceModal',
  computed: {
    ...mapState('menu', ['selected_foods']),
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
.service-modal-head button {
  background-color: rebeccapurple;
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
  background-color: blue;
}
.service-modal-body-image img {
  width: 70%;
  height: 100%;
}
.service-modal-body-detail {
  background-color: red;
  display: flex;
  width: 100%;
  height: 15%;
}
.service-modal-body-detail-name {
  background-color: orange;
  width: 70%;
  display: flex;
  align-items: center;
  justify-content: center;
}
.service-modal-body-detail-button {
  background-color: yellow;
  width: 30%;
  display: flex;
  align-items: center;
  justify-content: space-around;
}
.service-modal-body-detail-button button {
  background-color: red;
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
  background-color: red;
}

.service-modal-footer {
  display: flex;
  justify-content: flex-end;
  height: 10%;
  padding: 1%;
  background-color: brown;
}
.service-modal-footer button {
  width: 30%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
</style>
