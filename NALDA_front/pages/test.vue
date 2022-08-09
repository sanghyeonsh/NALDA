<template>
  <div>
    <div id="app">
      <v-app id="inspire">
        <v-card style="height: 80%">
          <v-tabs
            v-model="tab"
            background-color="rgb(69, 169, 200)"
            color="white"
            grow
            height="15vh"
          >
            <v-tab v-for="item in items" :key="item" @click="check(item)">
              {{ item }}
            </v-tab>
            <v-spacer></v-spacer>
            <v-spacer></v-spacer>
            <v-spacer></v-spacer>
            <v-spacer></v-spacer>
            <div style="width: 20%; display: flex">
              <div
                style="
                  width: 25%;
                  display: flex;
                  justify-content: center;
                  align-items: center;
                "
              >
                뒤로가기
              </div>
              <div
                style="
                  width: 25%;
                  display: flex;
                  justify-content: center;
                  align-items: center;
                "
              >
                프로필
              </div>
              <div
                style="
                  width: 50%;
                  display: flex;
                  justify-content: center;
                  align-items: center;
                "
              >
                김익명
              </div>
            </div>
            <v-tab-item> </v-tab-item>

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
export default {
  name: 'TestPage',
  data() {
    return {
      tab: null,
      items: ['날다 HOME', '버스', '택시', '지하철'],
      tabitem: [
        'TransportationBus',
        'TransportationTaxi',
        'TransportationSubway',
      ],
    }
  },
  mounted() {
    this.tab = 1
  },
  methods: {
    check(event) {
      if (event === '날다 HOME') {
        this.$router.push('/main')
      }
    },
  },
}
</script>

<style scoped></style>
