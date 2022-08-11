<template>
  <v-app id="selected-modal">
    <v-dialog
      v-model="dialog"
      hide-overlay
      transition="dialog-bottom-transition"
      width="60%"
    >
      <v-card tile class="overflow-auto" height="80vh">
        <v-toolbar flat dark color="#0e0737">
          <v-btn icon dark @click="toggle">
            <v-icon>mdi-close</v-icon>
          </v-btn>
          <v-toolbar-title>장바구니</v-toolbar-title>
          <v-spacer></v-spacer>
          <v-toolbar-items>
            <v-btn
              class="mx-2"
              fab
              dark
              large
              width="120%"
              color="pink"
              @click="sendOrder"
            >
              <v-icon> mdi-cart-heart </v-icon>
              <div>주문하기</div>
            </v-btn>
          </v-toolbar-items>
        </v-toolbar>
        <v-card-text>
          <v-card
            v-for="(item, i) in items"
            :key="i"
            color="#FFFFFF"
            dark
            height="15vh"
            class="d-flex flex-no-wrap justify-space-between align-center mt-5"
          >
            <div class="d-flex">
              <v-card-title class="black--text" style="font-size: xx-large">{{
                item.serviceName
              }}</v-card-title>
              <v-icon dark color="red" @click="deleteItem(item)">
                mdi-close-circle
              </v-icon>
            </div>
            <div class="black--text" style="font-size: xx-large">
              <v-btn
                class="mx-2"
                fab
                dark
                large
                color="#0e0737"
                @click="minusNum(item)"
              >
                <v-icon dark> mdi-minus </v-icon>
              </v-btn>
              {{ item.num }}
              <v-btn
                class="mx-2"
                fab
                dark
                large
                color="#0e0737"
                @click="addNum(item)"
              >
                <v-icon dark> mdi-plus </v-icon>
              </v-btn>
            </div>
          </v-card>
        </v-card-text>
      </v-card>
    </v-dialog>
  </v-app>
</template>

<script>
import { mapState, mapMutations, mapActions } from 'vuex'

export default {
  name: 'SelectedItem',
  data() {
    return {
      dialog: false,
      items: [],
    }
  },
  computed: {
    ...mapState('menu', ['selectedItem']),
    ...mapState('user', ['loginMember', 'seatInfo', 'flightNum']),
  },
  created() {
    this.items = [...this.selectedItem]
  },
  methods: {
    ...mapMutations('menu', [
      'PLUS_SELECTED_ITEM',
      'MINUS_SELECTED_ITEM',
      'DELETE_SELECTED_ITEM',
      'CLEAR_CHOICE_FOODS',
    ]),
    ...mapActions('menu', ['postOrders']),
    toggle() {
      this.dialog = !this.dialog
      this.items = [...this.selectedItem]
    },
    addNum(item) {
      this.PLUS_SELECTED_ITEM(item)
      this.items = [...this.selectedItem]
    },
    minusNum(item) {
      this.MINUS_SELECTED_ITEM(item)
      this.items = [...this.selectedItem]
    },
    deleteItem(item) {
      this.DELETE_SELECTED_ITEM(item)
      this.items = [...this.selectedItem]
    },
    sendOrder() {
      const orderList = []

      this.items.forEach((element) => {
        const object = {
          orderCode: element.serviceCode,
          cnt: element.num,
        }
        orderList.push(object)
      })

      const order = {
        orderMessage: '',
        flightNum: this.flightNum,
        seatNum: this.seatInfo.seatNum,
        username: this.loginMember.username,
        status: 'PROGRESS',
        orderList: [...orderList],
      }
      if (orderList.length > 0) {
        this.postOrders(order)
        this.CLEAR_CHOICE_FOODS()
        this.$router.push('/waiting')
      } else {
        // alert('장바구니에 담으세요')
      }
    },
  },
}
</script>

<style></style>
