<template>
  <div>
    <div id="app">
      <v-app id="inspire">
        <v-card style="height: 100%">
          <v-tabs
            v-model="tab"
            background-color="rgb(69, 169, 200)"
            color="rgb(69, 169, 200)"
            grow
            height="15vh"
          >
            <div style="color: white; width: 11%; height: 100%">
              <img
                src="/logohome.png"
                alt=""
                style="width: 100%; height: 100%"
                @click="MoveHome"
              />
            </div>
            <v-tab
              v-for="(item, idx) in items"
              :key="idx"
              class="white--text"
              style="font-weight: bold"
              color="#ffe26f"
            >
              {{ item }}
            </v-tab>
            <v-spacer></v-spacer>
            <v-spacer></v-spacer>
            <v-spacer></v-spacer>
            <v-spacer></v-spacer>
            <div class="header-container-userprofile" @click="MoveMypage">
              <div class="profile-back">
                <img
                  class="previous-icon"
                  src="/main/previous.png"
                  alt=""
                  @click="Movefrom"
                />
              </div>
              <div class="profile-img">
                <img src="/main/user_profile_w.png" alt="profile-img" />
              </div>
              <div class="profile-name">{{ fullname }}</div>
            </div>
            <v-tab-item>
              <v-card>
                <TransportationBus />
              </v-card>
            </v-tab-item>
            <v-tab-item>
              <v-card>
                <TransportationTaxi />
              </v-card>
            </v-tab-item>
            <v-tab-item>
              <v-card>
                <TransportationSubway />
              </v-card>
            </v-tab-item>
          </v-tabs>
        </v-card>
      </v-app>
    </div>
  </div>
</template>

<script>
import { mapState } from 'vuex'

export default {
  name: 'TestPage',
  data() {
    return {
      tab: null,
      items: ['공항리무진', '택시승강장', '공항철도'],
      tabitem: [
        'TransportationBus',
        'TransportationTaxi',
        'TransportationSubway',
      ],
    }
  },
  computed: {
    ...mapState('user', ['loginMember']),
    fullname() {
      if (this.loginMember == null) return '비회원'
      let fullname = ''
      this.loginMember.fullName.firstName &&
        (fullname += this.loginMember.fullName.firstName)
      this.loginMember.fullName.middleName &&
        (fullname += this.loginMember.fullName.middleName)
      this.loginMember.fullName.lastName &&
        (fullname += this.loginMember.fullName.lastName)
      return fullname
    },
  },
  mounted() {
    this.tab = 0
  },
  methods: {
    MoveMypage() {
      if (this.loginMember != null) {
        this.$router.push('/user/mypage')
      } else {
        this.$router.push('/user/login')
      }
    },
    Movefrom() {
      this.$router.push(this.$nuxt.context.from.path)
    },
    MoveHome() {
      this.$router.push('/main')
    },
  },
}
</script>

<style scoped>
::-webkit-scrollbar {
  display: none;
}

.v-tab--active {
  color: #ffe26f !important;
}
.white--text {
  font-size: 25px;
}
.profile-img img {
  width: 100%;
}
.header-container-userprofile {
  width: 20%;
  height: 100%;
  display: flex;
  align-items: center;
  color: azure;
  cursor: pointer;
}

.profile-back {
  height: 80%;
  width: 30%;
  display: flex;
  justify-content: flex-end;
  align-items: center;
  margin-right: 13%;
}
.previous-icon {
  width: 50%;
  height: 35%;
}

.profile-img {
  width: 20%;
  height: 100%;
  display: flex;
  justify-content: flex-end;
  align-items: center;
}
.profile-img img {
  width: 80%;
  height: 30%;
}

.profile-name {
  width: 40%;
  height: 100%;
  display: flex;
  justify-content: flex-end;
  align-items: center;
  font-size: 30px;
  margin-right: 7%;
}
</style>
