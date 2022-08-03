<template>
  <div>
    <div class="cards row row-cols-4">
      <div v-for="(item, idx) in items" :key="idx" class="col">
        <div class="card" @click="ChoiceMenu(item)">
          <!-- 서버에서 받을때 -->
          <img
            :src="'data:image/jpg;base64,' + item.bytesdata"
            class="card-img-top"
            alt="..."
          />
          <!-- 실험할때 -->
          <!-- <img :src="item.download_url" class="card-img-top" alt="..." /> -->
          <div class="card-body">
            <div class="card-title">{{ item.serviceName }}</div>
          </div>
        </div>
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
.cards {
  overflow: scroll;
  width: 100%;
  padding: 0 10vw;
  height: 65vh;
}
.cards .col {
  padding: 20px;
}
.cards::-webkit-scrollbar {
  display: none; /* Chrome, Safari, Opera*/
}
.card {
  cursor: pointer;
}
.card-img-top {
  overflow: hidden;
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  height: 20vh;
}
.card-body {
  padding: 15px;
  height: 60px;
  border-top: 2px solid;
}
.card-title {
  text-align: center;
  font-size: 20px;
}
</style>
