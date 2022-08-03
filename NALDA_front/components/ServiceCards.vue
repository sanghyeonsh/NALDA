<template>
  <div class="snack-box">
    <div
      v-for="(item, idx) in items"
      :key="idx"
      class="snack-card"
      @click="ChoiceMenu(item)"
    >
      <div class="snack-image">
        <img :src="'data:image/jpg;base64,' + item.bytesdata" alt="..." />
      </div>
      <div class="snack-name">
        {{ item.serviceName }}
      </div>
    </div>
    <ServiceModal />
  </div>
</template>

<script>
import { mapState, mapMutations, mapActions } from 'vuex'

export default {
  computed: {
    ...mapState('menu', ['items']),
  },
  // mounted() {
  //   setTimeout(() => {
  //     const menu = document.querySelector('.footer-body')
  //     menu.scrollTop = menu.scrollHeight
  //   }, 0)
  // },
  methods: {
    ...mapMutations('menu', [
      'SET_ITEM',
      'SET_CHOICE_FOODS',
      'DELETE_CHOICE_FOODS',
      'PLUS_CHOICE_FOODS',
      'MINUS_CHOICE_FOODS',
      'CLEAR_ITEM',
      'CLEAR_CHOICE_FOODS',
    ]),

    ChoiceMenu(data) {
      this.CLEAR_ITEM()
      this.SET_ITEM(data)

      // Get the modal
      const modal = document.getElementsByClassName('service-modal')[0]
      // Get the <span> element that closes the modal
      const span = document.getElementsByClassName(
        'service-modal-head-close'
      )[0]
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
      'CLEAR_ITEMS',
    ]),
  },
  ...mapActions('menu', ['getSnack', 'getAlcohols', 'getNonAlcohols']),
}
</script>

<style scoped>
.snack-box {
  width: 100vw;
  height: 65vh;
  overflow-y: scroll;
  display: flex;
  flex-wrap: wrap;
  padding: 0 10% 0 10%;
}

.snack-card {
  flex-basis: 25%;
  height: 50%;
  padding: 30px;
  cursor: pointer;
}
.snack-image {
  width: 100%;
  height: 80%;
  border: solid;
  border-bottom: none;
}
.snack-image img {
  width: 100%;
  height: 100%;
}
.snack-name {
  display: flex;
  justify-content: center;
  align-items: center;
  border: solid;
  width: 100%;
  height: 20%;
}
</style>
