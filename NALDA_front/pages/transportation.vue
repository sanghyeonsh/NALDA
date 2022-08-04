<template>
  <div>
    <div class="transport-header">
      <div class="transport-header-left">
        <div class="transport-header-home" @click="MoveHome">
          <div>날다</div>
          <div>Home</div>
        </div>
        <div
          class="transport-header-bus"
          :class="{ transportactive: isBus }"
          @click="MoveBus"
        >
          공항리무진
        </div>
        <div
          class="transport-header-taxi"
          :class="{ transportactive: isTaxi }"
          @click="MoveTaxi"
        >
          택시승강장
        </div>
        <div
          class="transport-header-subway"
          :class="{ transportactive: isSubway }"
          @click="MoveSubway"
        >
          공항철도
        </div>
      </div>

      <div class="transport-header-right">
        <div class="transport-header-profile">
          <div class="profile-back" @click="MoveHome">
            <img src="../static/orders/left-round-128.png" alt="" />
          </div>

          <div class="profile-image">
            <img src="/main/user_profile_w.png" alt="" />
          </div>
          <div class="profile-name">김익명</div>
        </div>
      </div>
    </div>
    <div class="transport-body" :class="{ Bus: isBus }">
      <TransportationBus />
    </div>
    <div class="transport-body" :class="{ Taxi: isTaxi }">
      <h1>Taxi</h1>
    </div>
    <div class="transport-body" :class="{ Subway: isSubway }">
      <h1>Subway</h1>
    </div>
  </div>
</template>

<script scoped>
export default {
  name: 'TransportPage',
  data() {
    return {
      isBus: false,
      isTaxi: false,
      isSubway: false,
    }
  },
  mounted() {
    this.isBus = true
  },
  methods: {
    MoveHome() {
      this.$router.push('/main')
    },
    MoveBus() {
      this.isBus = true
      this.isTaxi = false
      this.isSubway = false
      this.test = 'nacho.jpg'
    },
    MoveTaxi() {
      this.isBus = false
      this.isTaxi = true
      this.isSubway = false
      this.test = 'water.png'
    },
    MoveSubway() {
      this.isBus = false
      this.isTaxi = false
      this.isSubway = true
      this.test = 'logo.png'
    },
  },
}
</script>

<style scoped>
.transport-header {
  height: 15vh;
  width: 100vw;
  display: flex;
  background-color: rgb(69, 169, 200);
  color: white;
}
.transport-header-left {
  width: 80%;
  display: flex;
}
.transport-header-home {
  width: 10%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.transport-header-bus {
  width: 15%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.transport-header-taxi {
  width: 15%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.transport-header-subway {
  width: 15%;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
}
.transportactive {
  color: blue;
}

.transport-header-right {
  width: 20%;
  display: flex;
}
.transport-header-profile {
  width: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
}
.profile-back {
  width: 20%;
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
  cursor: pointer;
}
.profile-back img {
  width: 50%;
  height: 40%;
}
.profile-image {
  width: 20%;
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
  cursor: pointer;
}
.profile-image img {
  width: 50%;
  height: 40%;
}
.profile-name {
  width: 60%;
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
}

.transport-body {
  display: none;
}
.Bus {
  display: block;
}
.Taxi {
  display: block;
}
.Subway {
  display: block;
}
</style>
