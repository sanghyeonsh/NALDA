<template>
  <div id="app">
    <v-app id="inspire">
      <div class="food-box">
        <v-card class="mx-auto my-12" max-width="374">
          <template slot="progress">
            <v-progress-linear
              color=""
              height="10"
              indeterminate
            ></v-progress-linear>
          </template>

          <v-img height="250" src="/meal/chicken-steak.jpg"></v-img>

          <v-card-title style="display: flex; justify-content: center"
            >치킨스테이크</v-card-title
          >

          <v-card-text>
            <div>
              굽기만 해도 맛있는 촉촉한 치킨스테이크 지방과 살의 적당한 비율과
              촉촉한 육즙으로 많은 이들의 사랑을 받는 부위, 치킨 다리살입니다.
              스테이크용으로 먹기 좋게 손질해서 시즈닝했으니 간편하게 구워내
              식사해보세요.
            </div>
          </v-card-text>

          <v-divider class="mx-4"></v-divider>

          <v-card-actions>
            <v-spacer></v-spacer>

            <div>
              <v-btn text color="teal accent-4" @click="reveal1 = true">
                세부사항
              </v-btn>

              <v-btn @click="test">선택</v-btn>
            </div>
          </v-card-actions>

          <v-expand-transition>
            <v-card
              v-if="reveal1"
              class="transition-fast-in-fast-out v-card--reveal"
              style="height: 100%"
            >
              <v-card-text class="pb-0">
                <div class="text-h4 text--primary">세부목록</div>
                <div>고기</div>
                <div>치킨</div>
                <div>토마토</div>
                <div>쌈장</div>
                <hr />
                <div class="text-h4 text--primary">알레르기</div>
                <div>알</div>
                <div>레</div>
                <div>르</div>
                <div>기</div>

                <hr />
              </v-card-text>

              <v-card-actions class="pt-0">
                <v-spacer></v-spacer>
                <v-btn
                  text
                  color="teal accent-4"
                  style="position: relative; top: 130px; right: 10px"
                  @click="reveal1 = false"
                >
                  Close
                </v-btn>
              </v-card-actions>
            </v-card>
          </v-expand-transition>
        </v-card>

        <!-- <v-card class="mx-auto my-12" max-width="374">
          <template slot="progress">
            <v-progress-linear
              color=""
              height="10"
              indeterminate
            ></v-progress-linear>
          </template>

          <v-img height="250" src="/meal/nakji-deopbap.png"></v-img>

          <v-card-title style="display: flex; justify-content: center"
            >낙지덮밥</v-card-title
          >

          <v-card-text>
            <div>
              간편하고 든든한 매콤 낙지 덮밥 집 밥처럼 맛있게 즐기는 매콤
              낙지덮밥입니다. 큼직한 야채와 낙지 건더기가 들어가 뛰어난 맛과
              식감을 자랑한답니다. 식사를 챙기기 번거로울 때 간편하게
              드셔보세요.
            </div>
          </v-card-text>

          <v-divider class="mx-4"></v-divider>

          <v-card-actions>
            <v-spacer></v-spacer>

            <div>
              <v-btn text color="teal accent-4" @click="reveal2 = true">
                세부사항
              </v-btn>
            </div>
          </v-card-actions>

          <v-expand-transition>
            <v-card
              v-if="reveal2"
              class="transition-fast-in-fast-out v-card--reveal"
              style="height: 100%"
            >
              <v-card-text class="pb-0">
                <div class="text-h4 text--primary">세부목록</div>
                <div>고기</div>
                <div>치킨</div>
                <div>토마토</div>
                <div>쌈장</div>
                <hr />
                <div class="text-h4 text--primary">알레르기</div>
                <div>알</div>
                <div>레</div>
                <div>르</div>
                <div>기</div>

                <hr />
              </v-card-text>

              <v-card-actions class="pt-0">
                <v-spacer></v-spacer>
                <v-btn
                  text
                  color="teal accent-4"
                  style="position: relative; top: 130px; right: 10px"
                  @click="reveal2 = false"
                >
                  Close
                </v-btn>
              </v-card-actions>
            </v-card>
          </v-expand-transition>
        </v-card> -->
      </div>
    </v-app>
  </div>
</template>

<script>
export default {
  name: 'TestPage',
  data: () => ({
    reveal1: false,
    reveal2: false,
  }),
  methods: {
    test() {
      console.log(document.getElementsByClassName('mx-auto my-12')[0])
      document.getElementsByClassName('mx-auto my-12')[0].style.filter =
        'brightness(50%)'
    },
  },
}
</script>

<style scoped>
.v-card--reveal {
  bottom: 0;
  opacity: 1 !important;
  position: absolute;
  width: 100%;
}
.food-box {
  display: flex;
  justify-content: space-between;
}
</style>
