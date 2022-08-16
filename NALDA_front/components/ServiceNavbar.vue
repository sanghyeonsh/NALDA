<template>
  <div style="overflow: scroll; height: 100vh">
    <v-app id="inspire">
      <div style="display: flex">
        <v-tabs
          v-model="tab"
          background-color="rgb(69, 169, 200)"
          vertical
          dark
          fixed-tabs
          icons-and-text
          height="85vh"
          style="width: 10%; position: fixed; z-index: 1"
        >
          <v-tabs-slider color="rgb(69, 169, 200)"></v-tabs-slider>
          <v-tab key="snacks" href="#snacks">
            간식
            <v-icon x-large>mdi-cookie</v-icon>
          </v-tab>
          <v-tab key="alcohols" href="#alcohols">
            주류
            <v-icon x-large>mdi-glass-mug-variant</v-icon>
          </v-tab>
          <v-tab key="nonAlcohols" href="#nonAlcohols">
            비주류
            <v-icon x-large>mdi-cup</v-icon>
          </v-tab>
        </v-tabs>
        <div>
          <v-tabs-items v-model="tab">
            <v-tab-item
              key="snacks"
              value="snacks"
              style="background-color: rgba(239, 239, 239, 0.511)"
            >
              <div class="tab-item">
                <div
                  v-for="(item, idx) in snacks"
                  :key="idx"
                  class="snack-image"
                >
                  <v-card
                    v-if="item.cnt > 0"
                    style="margin-bottom: 30px"
                    @click="ChoiceMenu(item)"
                  >
                    <div>재고있음</div>
                    <v-img
                      :src="'data:image/jpg;base64,' + item.bytesdata"
                      class="black--text align-end"
                      gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.1)"
                      height="200px"
                      width="200px"
                    >
                    </v-img>

                    <v-card-actions class="ml-3">
                      <div style="font-size: x-large">
                        {{ item.serviceName }}
                      </div>
                      <v-spacer></v-spacer>
                      <v-btn icon>
                        <v-icon>mdi-heart</v-icon>
                      </v-btn>
                    </v-card-actions>
                  </v-card>

                  <!-- 품절부분 -->
                  <v-card
                    v-else-if="item.cnt === 0"
                    style="
                      margin-bottom: 30px;
                      background-image: url('/orders/out-of-stock.png');
                      position: relative;
                      background-size: 55%;
                      background-position: center;
                      background-color: rgba(0, 0, 0, 0.5);
                    "
                  >
                    <div>품절</div>
                    <v-img
                      class="black--text align-end"
                      gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.1)"
                      height="200px"
                      width="200px"
                    >
                    </v-img>

                    <v-card-actions class="ml-3">
                      <div style="font-size: x-large">
                        {{ item.serviceName }}
                      </div>
                      <v-spacer></v-spacer>
                      <v-btn icon>
                        <v-icon>mdi-heart</v-icon>
                      </v-btn>
                    </v-card-actions>
                  </v-card>
                </div>
              </div>
            </v-tab-item>
            <v-tab-item
              key="alcohols"
              value="alcohols"
              style="background-color: rgba(239, 239, 239, 0.511)"
            >
              <div class="tab-item">
                <div
                  v-for="(item, idx) in alcohols"
                  :key="idx"
                  class="snack-image"
                >
                  <v-card style="margin-bottom: 30px" @click="ChoiceMenu(item)">
                    <v-img
                      :src="'data:image/jpg;base64,' + item.bytesdata"
                      class="black--text align-end"
                      gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.1)"
                      height="200px"
                      width="200px"
                    >
                    </v-img>

                    <v-card-actions>
                      <div class="ml-3" style="font-size: x-large">
                        {{ item.serviceName }}
                      </div>
                      <v-spacer></v-spacer>
                      <v-btn icon>
                        <v-icon>mdi-heart</v-icon>
                      </v-btn>
                    </v-card-actions>
                  </v-card>
                </div>
              </div>
            </v-tab-item>
            <v-tab-item
              key="nonAlcohols"
              value="nonAlcohols"
              style="background-color: rgba(239, 239, 239, 0.511)"
            >
              <div class="tab-item">
                <div
                  v-for="(item, idx) in nonAlcohols"
                  :key="idx"
                  class="snack-image"
                >
                  <v-card style="margin-bottom: 30px" @click="ChoiceMenu(item)">
                    <v-img
                      :src="'data:image/jpg;base64,' + item.bytesdata"
                      class="black--text align-end"
                      gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.1)"
                      width="200px"
                      height="200px"
                    >
                    </v-img>

                    <v-card-actions>
                      <div class="ml-3" style="font-size: x-large">
                        {{ item.serviceName }}
                      </div>
                      <v-spacer></v-spacer>
                      <v-btn icon>
                        <v-icon>mdi-heart</v-icon>
                      </v-btn>
                    </v-card-actions>
                  </v-card>
                </div>
              </div>
            </v-tab-item>
          </v-tabs-items>
        </div>
      </div>
      <v-alert
        v-model="alert"
        color="pink"
        border="left"
        elevation="2"
        colored-border
        icon="mdi-cart-heart"
        style="z-index: 2; position: fixed; bottom: 0; width: 100%"
        transition="slide-y-transition"
      >
        장바구니에 담았습니다!
      </v-alert>
      <v-btn
        class="mx-2"
        fab
        dark
        x-large
        color="#0e0737"
        style="position: fixed; bottom: 10vh; right: 3vh"
        @click="openSelectedModal"
      >
        <v-icon dark> mdi-cart-heart </v-icon>
      </v-btn>
    </v-app>
    <ServiceModal ref="serviceModal" @shoppingAlert="shoppingAlert" />
    <SelectedItem ref="selectedItem" />
  </div>
</template>

<script>
import { mapState, mapMutations, mapActions } from 'vuex'
export default {
  name: 'ServiceNavbar',
  data() {
    return {
      isSnack: false,
      isAlcohol: false,
      isNonAlcohol: false,
      tab: null,
      tabs: ['snacks', 'alcohols', 'nonAlcohols'],
      snacks: [],
      alcohols: [],
      nonAlcohols: [],
      dialog: false,
      alert: false,
    }
  },
  computed: {
    ...mapState('menu', ['items']),
  },

  created() {
    this.isSnack = true
    const promise = new Promise((resolve, reject) => {
      resolve()
    })

    promise.then(async () => {
      await this.getSnack()
      await this.getAlcohols()
      await this.getNonAlcohols()

      this.snacks = this.items.snack
      this.alcohols = this.items.alcohol
      this.nonAlcohols = this.items.nonAlcohol
    })
  },
  methods: {
    openSelectedModal() {
      this.$refs.selectedItem.toggle()
    },
    shoppingAlert() {
      window.setTimeout(() => {
        this.alert = true
        window.setTimeout(() => {
          this.alert = false
        }, 3000)
      }, 500)
    },
    ChoiceMenu(data) {
      this.SET_ITEM(data)
      this.$refs.serviceModal.toggle()
    },
    ...mapMutations('menu', ['SET_ITEM']),
    ...mapActions('menu', ['getSnack', 'getAlcohols', 'getNonAlcohols']),
  },
}
</script>

<style scoped>
@font-face {
  font-family: 'twayfly';
  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_tway@1.0/twayfly.woff')
    format('woff');
  font-weight: normal;
  font-style: normal;
}
* {
  font-family: 'twayfly';
}

::-webkit-scrollbar {
  display: none;
}
.tab-item {
  margin-top: 2%;
  margin-left: 8%;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-around;
  width: 90%;
}
.service-navbar {
  display: flex;
  width: 100%;
  height: 15vh;
  background-color: rgb(69, 169, 200);
  color: white;
}
.service-navbar-menu {
  display: flex;
  width: 85%;
  height: 100%;
}
.service-navbar-home {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.service-navbar-snack {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.service-navbar-alcohol {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.service-navbar-nonalcohol {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.snackactive {
  border-bottom: 0.5rem solid;
  color: black;
}
.service-navbar img {
  width: 50%;
  height: 80%;
}

.service-navbar-profile {
  width: 15%;
  height: 100%;
  display: flex;
  align-items: center;
}
.profile-back {
  display: flex;
  width: 30%;
  height: 50%;
  justify-content: flex-start;
  align-items: center;
  margin: 0;
  cursor: pointer;
}
.profile-back img {
  width: 70%;
  height: 70%;
}
.snack-image {
  margin-bottom: 4%;
  margin-left: 5%;
}
.profile-image {
  display: flex;
  width: 70%;
  height: 100%;
  align-items: center;
  justify-content: flex-end;
  cursor: pointer;
}
.profile-image img {
  width: 30%;
  height: 30%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.profile-name {
  width: 60%;
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 25px;
}

#item-modal {
  display: none;
}

#selected-modal {
  display: none;
}
</style>
