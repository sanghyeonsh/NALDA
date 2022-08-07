<template>
  <v-app id="item-modal">
    <v-dialog
      v-model="dialog"
      hide-overlay
      transition="dialog-bottom-transition"
      width="60%"
    >
      <v-card tile>
        <v-toolbar flat dark color="rgb(69, 169, 200)">
          <v-btn icon dark @click="toggle">
            <v-icon>mdi-close</v-icon>
          </v-btn>
          <v-toolbar-title>선택 제품</v-toolbar-title>
          <v-spacer></v-spacer>
          <v-toolbar-items>
            <v-btn
              class="mx-2"
              fab
              dark
              large
              color="pink"
              @click="addSelectedItem"
            >
              <v-icon dark> mdi-cart-heart </v-icon>
            </v-btn>
          </v-toolbar-items>
        </v-toolbar>
        <v-card-text class="d-flex align-center">
          <img
            class="item-img mt-5"
            :src="'data:image/jpg;base64,' + item.bytesdata"
          />
          <div style="font-size: xx-large; margin-left: 20%">
            <v-btn class="mx-2" fab dark large color="cyan" @click="minusNum">
              <v-icon dark> mdi-minus </v-icon>
            </v-btn>
            {{ num }}
            <v-btn class="mx-2" fab dark large color="cyan" @click="addNum">
              <v-icon dark> mdi-plus </v-icon>
            </v-btn>
          </div>
        </v-card-text>
      </v-card>
    </v-dialog>
  </v-app>
</template>

<script>
import { mapState, mapMutations } from 'vuex'

export default {
  name: 'ServiceModal',
  data() {
    return {
      num: 0,
      dialog: false,
    }
  },
  computed: {
    ...mapState('menu', ['item']),
  },
  methods: {
    addSelectedItem() {
      this.$emit('shoppingAlert', '')
      this.ADD_SELECTED_FOODS(this.item)
      this.toggle()
    },
    toggle() {
      this.dialog = !this.dialog
      this.num = 1
    },
    addNum() {
      this.PLUS_CHOICE_FOODS()
      this.num = this.item.num
    },
    minusNum() {
      this.MINUS_CHOICE_FOODS()
      this.num = this.item.num
    },

    ...mapMutations('menu', [
      'PLUS_CHOICE_FOODS',
      'MINUS_CHOICE_FOODS',
      'ADD_SELECTED_FOODS',
    ]),
  },
}
</script>

<style scoped>
.item-img {
  height: 40%;
  width: 40%;
}
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
