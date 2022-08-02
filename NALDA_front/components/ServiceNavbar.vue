<template>
  <div class="service-navbar">
    <div class="service-navbar-menu">
      <div class="service-navbar-home" @click="MoveOrders">
        <div>날다</div>
        <div>Home</div>
      </div>
      <div
        class="service-navbar-snack"
        :class="{ snackactive: isSnack }"
        @click="MoveSnack"
      >
        <img src="../static/orders/dessert.png" alt="" />
        <span>간식</span>
      </div>
      <div
        class="service-navbar-alcohol"
        :class="{ snackactive: isAlcohol }"
        @click="MoveAlcohol"
      >
        <img src="../static/orders/drink.png" alt="" />
        <span>주류</span>
      </div>
      <div
        class="service-navbar-nonalcohol"
        :class="{ snackactive: isNonAlcohol }"
        @click="MoveNonAlcohol"
      >
        <img src="../static/orders/coffee_cup.png" alt="" />
        <span>비주류</span>
      </div>
    </div>

    <div class="service-navbar-profile">
      <div class="profile-back">
        <img src="../static/orders/left-round-128.png" alt="" />
      </div>
      <div class="profile-image">
        <img src="../static/main/user_profile_w.png" alt="" />
        <div class="profile-name">김익명</div>
      </div>
    </div>
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
    }
  },
  computed: {
    ...mapState('menu', ['items', 'selected_foods', 'check_foods']),
  },

  created() {
    this.isSnack = true
    this.CLEAR_ITEMS()

    const promise = new Promise((resolve, reject) => {
      resolve()
    })

    promise.then(async () => {
      await this.getSnack()
      console.log(this.items.length)
    })
    // this.getsnack()
  },
  methods: {
    MoveOrders() {
      this.$router.push('/main/service')
      this.CLEAR_CHOICE_FOODS()
    },
    MoveSnack() {
      this.isSnack = true
      this.isAlcohol = false
      this.isNonAlcohol = false
      this.CLEAR_ITEMS()
      this.getSnack()
    },
    MoveAlcohol() {
      this.isSnack = false
      this.isAlcohol = true
      this.isNonAlcohol = false
      this.CLEAR_ITEMS()
      this.getAlcohols()
    },
    MoveNonAlcohol() {
      this.isSnack = false
      this.isAlcohol = false
      this.isNonAlcohol = true
      this.CLEAR_ITEMS()
      this.getNonAlcohols()
    },
    ...mapMutations('menu', [
      'SET_CHOICE_FOODS',
      'DELETE_CHOICE_FOODS',
      'CLEAR_CHOICE_FOODS',
      'PLUS_CHOICE_FOODS',
      'MINUS_CHOICE_FOODS',
      'CLEAR_ITEMS',
    ]),
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
</style>
