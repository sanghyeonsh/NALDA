<template>
  <div class="service-navbar">
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
      <span style="color: white">간식</span>
    </div>
    <div
      class="service-navbar-alcohol"
      :class="{ snackactive: isAlcohol }"
      @click="MoveAlcohol"
    >
      <img src="../static/orders/drink.png" alt="" />
      <span style="color: white">주류</span>
    </div>
    <div
      class="service-navbar-nonalcohol"
      :class="{ snackactive: isNonAlcohol }"
      @click="MoveNonAlcohol"
    >
      <img src="../static/orders/coffee_cup.png" alt="" />
      <span style="color: white">비주류</span>
    </div>
    <div class="service-navbar-profile">
      <button>뒤로</button>
      <img
        src="../static/main/user_profile_w.png"
        style="width: 15%; height: 60%; margin: 7px"
        alt=""
      />
      <div style="color: white; font-size: 35px">김익명</div>
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

  mounted() {
    this.isSnack = true
    this.CLEAR_ITEMS()
    this.getsnack()
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
      this.getsnack()
    },
    MoveAlcohol() {
      this.isSnack = false
      this.isAlcohol = true
      this.isNonAlcohol = false
      this.CLEAR_ITEMS()
      this.getalcohol()
    },
    MoveNonAlcohol() {
      this.isSnack = false
      this.isAlcohol = false
      this.isNonAlcohol = true
      this.CLEAR_ITEMS()
      this.getnonalcohol()
    },
    ...mapMutations('menu', [
      'SET_CHOICE_FOODS',
      'DELETE_CHOICE_FOODS',
      'CLEAR_CHOICE_FOODS',
      'PLUS_CHOICE_FOODS',
      'MINUS_CHOICE_FOODS',
      'CLEAR_ITEMS',
    ]),
    ...mapActions('menu', ['getsnack', 'getalcohol', 'getnonalcohol']),
  },
}
</script>

<style scoped>
.service-navbar {
  display: flex;
  width: 100%;
  height: 15vh;
  background-color: rgb(69, 169, 200);
}
.service-navbar-home {
  display: flex;
  flex-direction: column;
  color: white;
  justify-content: center;
  align-items: center;
  padding: 10px;
  font-size: 30px;
}
.service-navbar-snack {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 10px;
  font-size: 20px;
}
.snackactive {
  border-bottom: 0.5rem solid;
}
.service-navbar-alcohol {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 10px;
  font-size: 20px;
}
.service-navbar-nonalcohol {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 10px;
  font-size: 20px;
}
.service-navbar-profile {
  margin-left: auto;
  display: flex;
  align-items: center;
  justify-content: flex-end;
  /* 아래 크기 조정해서 오른쪽 여백주기 */
  margin-right: 50px;
  /* 아래 box사이즈 조정해서 크기조절하기 */
  flex-basis: 250px;
}
.service-navbar img {
  width: 50%;
  height: 80%;
}
</style>
