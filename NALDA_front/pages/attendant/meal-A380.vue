<template>
  <div class="meal-list-wrap">
    <!-- <PageLoader />123 -->
    <div v-if="floor === 'first'" class="first-floor">
      <div v-if="section === 'First'" class="seats-first-container">
        <!-- <div class="first-meal-wrap">
        <div class="course-wrap">
          <div class="A-course">dd</div>
          <h5>A코스</h5>
          <div class="B-course">dd</div>
          <h5>B코스</h5>
          <div class="special-course">dd</div>
        </div>
        </div>-->
        <h1>{{ section }}</h1>
        <div v-bind="firstClass" class="seat-wrap1">
          <div class="seat-row-first">
            <div
              class="seat-first"
              :class="{
                Acourse: firstClass[0].음식 === 'Acourse',
                Bcourse: firstClass[0].음식 === 'Bcourse',
              }"
            >
              {{ firstClass[0].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-first"
              :class="{
                Acourse: firstClass[1].음식 === 'Acourse',
                Bcourse: firstClass[1].음식 === 'Bcourse',
              }"
            >
              {{ firstClass[1].좌석 }}
            </div>
            <div class="space"></div>
            <div
              class="seat-first"
              :class="{
                Acourse: firstClass[2].음식 === 'Acourse',
                Bcourse: firstClass[2].음식 === 'Bcourse',
              }"
            >
              {{ firstClass[2].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-first"
              :class="{
                Acourse: firstClass[3].음식 === 'Acourse',
                Bcourse: firstClass[3].음식 === 'Bcourse',
              }"
            >
              {{ firstClass[3].좌석 }}
            </div>
          </div>
          <div class="seat-row-first">
            <div
              class="seat-first"
              :class="{
                Acourse: firstClass[4].음식 === 'Acourse',
                Bcourse: firstClass[4].음식 === 'Bcourse',
              }"
            >
              {{ firstClass[4].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-first"
              :class="{
                Acourse: firstClass[5].음식 === 'Acourse',
                Bcourse: firstClass[5].음식 === 'Bcourse',
              }"
            >
              {{ firstClass[5].좌석 }}
            </div>
            <div class="space"></div>
            <div
              class="seat-first"
              :class="{
                Acourse: firstClass[6].음식 === 'Acourse',
                Bcourse: firstClass[6].음식 === 'Bcourse',
              }"
            >
              {{ firstClass[6].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-first"
              :class="{
                Acourse: firstClass[7].음식 === 'Acourse',
                Bcourse: firstClass[7].음식 === 'Bcourse',
              }"
            >
              {{ firstClass[7].좌석 }}
            </div>
          </div>
          <div class="seat-row-first">
            <div
              class="seat-first"
              :class="{
                Acourse: firstClass[8].음식 === 'Acourse',
                Bcourse: firstClass[8].음식 === 'Bcourse',
              }"
            >
              {{ firstClass[8].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-first"
              :class="{
                Acourse: firstClass[9].음식 === 'Acourse',
                Bcourse: firstClass[9].음식 === 'Bcourse',
              }"
            >
              {{ firstClass[9].좌석 }}
            </div>
            <div class="space"></div>
            <div
              class="seat-first"
              :class="{
                Acourse: firstClass[10].음식 === 'Acourse',
                Bcourse: firstClass[10].음식 === 'Bcourse',
              }"
            >
              {{ firstClass[10].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-first"
              :class="{
                Acourse: firstClass[11].음식 === 'Acourse',
                Bcourse: firstClass[11].음식 === 'Bcourse',
              }"
            >
              {{ firstClass[11].좌석 }}
            </div>
          </div>
        </div>
      </div>

      <div
        v-else-if="section === 'EconomyA'"
        class="seats-econnomy-A-container"
      >
        <h1>{{ section }}</h1>
        <div v-bind="economyClass" class="seat-wrap3">
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[0].음식 === 'Acourse',
                Bcourse: economyClass[0].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[0].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[1].음식 === 'Acourse',
                Bcourse: economyClass[1].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[1].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[2].음식 === 'Acourse',
                Bcourse: economyClass[2].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[2].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[3].음식 === 'Acourse',
                Bcourse: economyClass[3].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[3].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[4].음식 === 'Acourse',
                Bcourse: economyClass[4].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[4].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[5].음식 === 'Acourse',
                Bcourse: economyClass[5].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[5].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[6].음식 === 'Acourse',
                Bcourse: economyClass[6].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[6].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[7].음식 === 'Acourse',
                Bcourse: economyClass[7].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[7].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[8].음식 === 'Acourse',
                Bcourse: economyClass[8].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[8].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[9].음식 === 'Acourse',
                Bcourse: economyClass[9].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[9].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[10].음식 === 'Acourse',
                Bcourse: economyClass[10].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[10].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[11].음식 === 'Acourse',
                Bcourse: economyClass[11].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[11].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[12].음식 === 'Acourse',
                Bcourse: economyClass[12].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[12].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[13].음식 === 'Acourse',
                Bcourse: economyClass[13].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[13].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[14].음식 === 'Acourse',
                Bcourse: economyClass[14].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[14].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[15].음식 === 'Acourse',
                Bcourse: economyClass[15].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[15].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[16].음식 === 'Acourse',
                Bcourse: economyClass[16].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[16].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[17].음식 === 'Acourse',
                Bcourse: economyClass[17].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[17].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[18].음식 === 'Acourse',
                Bcourse: economyClass[18].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[18].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[19].음식 === 'Acourse',
                Bcourse: economyClass[19].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[19].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[20].음식 === 'Acourse',
                Bcourse: economyClass[20].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[20].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[21].음식 === 'Acourse',
                Bcourse: economyClass[21].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[21].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[22].음식 === 'Acourse',
                Bcourse: economyClass[22].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[22].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[23].음식 === 'Acourse',
                Bcourse: economyClass[23].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[23].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[24].음식 === 'Acourse',
                Bcourse: economyClass[24].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[24].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[25].음식 === 'Acourse',
                Bcourse: economyClass[25].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[25].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[26].음식 === 'Acourse',
                Bcourse: economyClass[26].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[26].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[27].음식 === 'Acourse',
                Bcourse: economyClass[27].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[27].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[28].음식 === 'Acourse',
                Bcourse: economyClass[28].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[28].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[29].음식 === 'Acourse',
                Bcourse: economyClass[29].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[29].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[30].음식 === 'Acourse',
                Bcourse: economyClass[30].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[30].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[31].음식 === 'Acourse',
                Bcourse: economyClass[31].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[31].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[32].음식 === 'Acourse',
                Bcourse: economyClass[32].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[32].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[33].음식 === 'Acourse',
                Bcourse: economyClass[33].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[33].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[34].음식 === 'Acourse',
                Bcourse: economyClass[34].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[34].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[35].음식 === 'Acourse',
                Bcourse: economyClass[35].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[35].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[36].음식 === 'Acourse',
                Bcourse: economyClass[36].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[36].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[37].음식 === 'Acourse',
                Bcourse: economyClass[37].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[37].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[38].음식 === 'Acourse',
                Bcourse: economyClass[38].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[38].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[39].음식 === 'Acourse',
                Bcourse: economyClass[39].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[39].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[40].음식 === 'Acourse',
                Bcourse: economyClass[40].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[40].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[41].음식 === 'Acourse',
                Bcourse: economyClass[41].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[41].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[42].음식 === 'Acourse',
                Bcourse: economyClass[42].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[42].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[43].음식 === 'Acourse',
                Bcourse: economyClass[43].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[43].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[44].음식 === 'Acourse',
                Bcourse: economyClass[44].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[44].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[45].음식 === 'Acourse',
                Bcourse: economyClass[45].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[45].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[46].음식 === 'Acourse',
                Bcourse: economyClass[46].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[46].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[47].음식 === 'Acourse',
                Bcourse: economyClass[47].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[47].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[48].음식 === 'Acourse',
                Bcourse: economyClass[48].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[48].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[49].음식 === 'Acourse',
                Bcourse: economyClass[49].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[49].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[50].음식 === 'Acourse',
                Bcourse: economyClass[50].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[50].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[51].음식 === 'Acourse',
                Bcourse: economyClass[51].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[51].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[52].음식 === 'Acourse',
                Bcourse: economyClass[52].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[52].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[53].음식 === 'Acourse',
                Bcourse: economyClass[53].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[53].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[54].음식 === 'Acourse',
                Bcourse: economyClass[54].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[54].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[55].음식 === 'Acourse',
                Bcourse: economyClass[55].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[55].좌석 }}
            </div>
          </div>
        </div>
      </div>

      <div
        v-else-if="section === 'EconomyB'"
        class="seats-econnomy-B-container"
      >
        <h1>{{ section }}</h1>
        <div v-bind="economyClass" class="seat-wrap3">
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[56].음식 === 'Acourse',
                Bcourse: economyClass[56].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[56].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[57].음식 === 'Acourse',
                Bcourse: economyClass[57].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[57].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[58].음식 === 'Acourse',
                Bcourse: economyClass[58].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[58].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[59].음식 === 'Acourse',
                Bcourse: economyClass[59].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[59].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[60].음식 === 'Acourse',
                Bcourse: economyClass[60].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[60].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[61].음식 === 'Acourse',
                Bcourse: economyClass[61].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[61].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[62].음식 === 'Acourse',
                Bcourse: economyClass[62].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[62].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[63].음식 === 'Acourse',
                Bcourse: economyClass[63].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[63].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[64].음식 === 'Acourse',
                Bcourse: economyClass[64].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[64].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[65].음식 === 'Acourse',
                Bcourse: economyClass[65].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[65].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[66].음식 === 'Acourse',
                Bcourse: economyClass[66].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[66].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[67].음식 === 'Acourse',
                Bcourse: economyClass[67].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[67].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[68].음식 === 'Acourse',
                Bcourse: economyClass[68].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[68].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[69].음식 === 'Acourse',
                Bcourse: economyClass[69].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[69].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[70].음식 === 'Acourse',
                Bcourse: economyClass[70].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[70].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[71].음식 === 'Acourse',
                Bcourse: economyClass[71].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[71].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[72].음식 === 'Acourse',
                Bcourse: economyClass[72].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[72].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[73].음식 === 'Acourse',
                Bcourse: economyClass[73].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[73].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[74].음식 === 'Acourse',
                Bcourse: economyClass[74].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[74].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[75].음식 === 'Acourse',
                Bcourse: economyClass[75].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[75].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[76].음식 === 'Acourse',
                Bcourse: economyClass[76].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[76].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[77].음식 === 'Acourse',
                Bcourse: economyClass[77].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[77].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[78].음식 === 'Acourse',
                Bcourse: economyClass[78].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[78].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[79].음식 === 'Acourse',
                Bcourse: economyClass[79].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[79].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[80].음식 === 'Acourse',
                Bcourse: economyClass[80].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[80].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[81].음식 === 'Acourse',
                Bcourse: economyClass[81].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[81].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[82].음식 === 'Acourse',
                Bcourse: economyClass[82].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[82].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[83].음식 === 'Acourse',
                Bcourse: economyClass[83].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[83].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[84].음식 === 'Acourse',
                Bcourse: economyClass[84].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[84].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[85].음식 === 'Acourse',
                Bcourse: economyClass[85].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[85].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[86].음식 === 'Acourse',
                Bcourse: economyClass[86].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[86].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[87].음식 === 'Acourse',
                Bcourse: economyClass[87].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[87].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[88].음식 === 'Acourse',
                Bcourse: economyClass[88].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[88].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[89].음식 === 'Acourse',
                Bcourse: economyClass[89].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[89].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[90].음식 === 'Acourse',
                Bcourse: economyClass[90].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[90].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[91].음식 === 'Acourse',
                Bcourse: economyClass[91].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[91].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[92].음식 === 'Acourse',
                Bcourse: economyClass[92].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[92].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[93].음식 === 'Acourse',
                Bcourse: economyClass[93].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[93].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[94].음식 === 'Acourse',
                Bcourse: economyClass[94].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[94].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[95].음식 === 'Acourse',
                Bcourse: economyClass[95].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[95].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[96].음식 === 'Acourse',
                Bcourse: economyClass[96].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[96].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[97].음식 === 'Acourse',
                Bcourse: economyClass[97].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[97].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[98].음식 === 'Acourse',
                Bcourse: economyClass[98].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[98].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[99].음식 === 'Acourse',
                Bcourse: economyClass[99].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[99].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[100].음식 === 'Acourse',
                Bcourse: economyClass[100].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[100].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[101].음식 === 'Acourse',
                Bcourse: economyClass[101].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[101].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[102].음식 === 'Acourse',
                Bcourse: economyClass[102].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[102].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[103].음식 === 'Acourse',
                Bcourse: economyClass[103].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[103].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[104].음식 === 'Acourse',
                Bcourse: economyClass[104].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[104].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[105].음식 === 'Acourse',
                Bcourse: economyClass[105].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[105].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[106].음식 === 'Acourse',
                Bcourse: economyClass[106].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[106].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[107].음식 === 'Acourse',
                Bcourse: economyClass[107].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[107].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[108].음식 === 'Acourse',
                Bcourse: economyClass[108].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[108].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[109].음식 === 'Acourse',
                Bcourse: economyClass[109].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[109].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[110].음식 === 'Acourse',
                Bcourse: economyClass[110].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[110].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[111].음식 === 'Acourse',
                Bcourse: economyClass[111].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[111].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[112].음식 === 'Acourse',
                Bcourse: economyClass[112].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[112].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[113].음식 === 'Acourse',
                Bcourse: economyClass[113].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[113].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[114].음식 === 'Acourse',
                Bcourse: economyClass[114].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[114].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[115].음식 === 'Acourse',
                Bcourse: economyClass[115].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[115].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[116].음식 === 'Acourse',
                Bcourse: economyClass[116].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[116].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[117].음식 === 'Acourse',
                Bcourse: economyClass[117].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[117].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[118].음식 === 'Acourse',
                Bcourse: economyClass[118].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[118].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[119].음식 === 'Acourse',
                Bcourse: economyClass[119].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[119].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[120].음식 === 'Acourse',
                Bcourse: economyClass[120].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[120].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[121].음식 === 'Acourse',
                Bcourse: economyClass[121].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[121].좌석 }}
            </div>
          </div>
        </div>
      </div>

      <div
        v-else-if="section === 'EconomyC'"
        class="seats-econnomy-C-container"
      >
        <h1>{{ section }}</h1>
        <div v-bind="economyClass" class="seat-wrap3">
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[122].음식 === 'Acourse',
                Bcourse: economyClass[122].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[122].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[123].음식 === 'Acourse',
                Bcourse: economyClass[123].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[123].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[124].음식 === 'Acourse',
                Bcourse: economyClass[124].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[124].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[125].음식 === 'Acourse',
                Bcourse: economyClass[125].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[125].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[126].음식 === 'Acourse',
                Bcourse: economyClass[126].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[126].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[127].음식 === 'Acourse',
                Bcourse: economyClass[127].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[127].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[128].음식 === 'Acourse',
                Bcourse: economyClass[128].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[128].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[129].음식 === 'Acourse',
                Bcourse: economyClass[129].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[129].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[130].음식 === 'Acourse',
                Bcourse: economyClass[130].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[130].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[131].음식 === 'Acourse',
                Bcourse: economyClass[131].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[131].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[132].음식 === 'Acourse',
                Bcourse: economyClass[132].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[132].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[133].음식 === 'Acourse',
                Bcourse: economyClass[133].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[133].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[134].음식 === 'Acourse',
                Bcourse: economyClass[134].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[134].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[135].음식 === 'Acourse',
                Bcourse: economyClass[135].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[135].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[136].음식 === 'Acourse',
                Bcourse: economyClass[136].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[136].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[137].음식 === 'Acourse',
                Bcourse: economyClass[137].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[137].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[138].음식 === 'Acourse',
                Bcourse: economyClass[138].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[138].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[139].음식 === 'Acourse',
                Bcourse: economyClass[139].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[139].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[140].음식 === 'Acourse',
                Bcourse: economyClass[140].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[140].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[141].음식 === 'Acourse',
                Bcourse: economyClass[141].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[141].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[142].음식 === 'Acourse',
                Bcourse: economyClass[142].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[142].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[143].음식 === 'Acourse',
                Bcourse: economyClass[143].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[143].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[144].음식 === 'Acourse',
                Bcourse: economyClass[144].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[144].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[145].음식 === 'Acourse',
                Bcourse: economyClass[145].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[145].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[146].음식 === 'Acourse',
                Bcourse: economyClass[146].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[146].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[147].음식 === 'Acourse',
                Bcourse: economyClass[147].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[147].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[148].음식 === 'Acourse',
                Bcourse: economyClass[148].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[148].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[149].음식 === 'Acourse',
                Bcourse: economyClass[149].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[149].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[150].음식 === 'Acourse',
                Bcourse: economyClass[150].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[150].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[151].음식 === 'Acourse',
                Bcourse: economyClass[151].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[151].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[152].음식 === 'Acourse',
                Bcourse: economyClass[152].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[152].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[153].음식 === 'Acourse',
                Bcourse: economyClass[153].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[153].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[154].음식 === 'Acourse',
                Bcourse: economyClass[154].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[154].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[155].음식 === 'Acourse',
                Bcourse: economyClass[155].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[155].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[156].음식 === 'Acourse',
                Bcourse: economyClass[156].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[156].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[157].음식 === 'Acourse',
                Bcourse: economyClass[157].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[157].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[158].음식 === 'Acourse',
                Bcourse: economyClass[158].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[158].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[159].음식 === 'Acourse',
                Bcourse: economyClass[159].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[159].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[160].음식 === 'Acourse',
                Bcourse: economyClass[160].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[160].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[161].음식 === 'Acourse',
                Bcourse: economyClass[161].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[161].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[162].음식 === 'Acourse',
                Bcourse: economyClass[162].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[162].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[163].음식 === 'Acourse',
                Bcourse: economyClass[163].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[163].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[164].음식 === 'Acourse',
                Bcourse: economyClass[164].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[164].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div class="seat-economy-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[165].음식 === 'Acourse',
                Bcourse: economyClass[165].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[165].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[166].음식 === 'Acourse',
                Bcourse: economyClass[166].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[166].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[167].음식 === 'Acourse',
                Bcourse: economyClass[167].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[167].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[168].음식 === 'Acourse',
                Bcourse: economyClass[168].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[168].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[169].음식 === 'Acourse',
                Bcourse: economyClass[169].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[169].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[170].음식 === 'Acourse',
                Bcourse: economyClass[170].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[170].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[171].음식 === 'Acourse',
                Bcourse: economyClass[171].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[171].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[172].음식 === 'Acourse',
                Bcourse: economyClass[172].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[172].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[173].음식 === 'Acourse',
                Bcourse: economyClass[173].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[173].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[174].음식 === 'Acourse',
                Bcourse: economyClass[174].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[174].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[175].음식 === 'Acourse',
                Bcourse: economyClass[175].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[175].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[176].음식 === 'Acourse',
                Bcourse: economyClass[176].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[176].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[177].음식 === 'Acourse',
                Bcourse: economyClass[177].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[177].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[178].음식 === 'Acourse',
                Bcourse: economyClass[178].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[178].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[179].음식 === 'Acourse',
                Bcourse: economyClass[179].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[179].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[180].음식 === 'Acourse',
                Bcourse: economyClass[180].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[180].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[181].음식 === 'Acourse',
                Bcourse: economyClass[181].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[181].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[182].음식 === 'Acourse',
                Bcourse: economyClass[182].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[182].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[183].음식 === 'Acourse',
                Bcourse: economyClass[183].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[183].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[184].음식 === 'Acourse',
                Bcourse: economyClass[184].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[184].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[185].음식 === 'Acourse',
                Bcourse: economyClass[185].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[185].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[186].음식 === 'Acourse',
                Bcourse: economyClass[186].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[186].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[187].음식 === 'Acourse',
                Bcourse: economyClass[187].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[187].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[188].음식 === 'Acourse',
                Bcourse: economyClass[188].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[188].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[189].음식 === 'Acourse',
                Bcourse: economyClass[189].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[189].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[190].음식 === 'Acourse',
                Bcourse: economyClass[190].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[190].좌석 }}
            </div>
          </div>
        </div>
      </div>

      <div
        v-else-if="section === 'EconomyD'"
        class="seats-econnomy-D-container"
      >
        <h1>{{ section }}</h1>
        <div v-bind="economyClass" class="seat-wrap3">
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[191].음식 === 'Acourse',
                Bcourse: economyClass[191].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[191].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[192].음식 === 'Acourse',
                Bcourse: economyClass[192].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[192].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[193].음식 === 'Acourse',
                Bcourse: economyClass[193].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[193].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[194].음식 === 'Acourse',
                Bcourse: economyClass[194].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[194].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[195].음식 === 'Acourse',
                Bcourse: economyClass[195].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[195].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[196].음식 === 'Acourse',
                Bcourse: economyClass[196].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[196].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[197].음식 === 'Acourse',
                Bcourse: economyClass[197].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[197].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[198].음식 === 'Acourse',
                Bcourse: economyClass[198].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[198].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[199].음식 === 'Acourse',
                Bcourse: economyClass[199].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[199].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[200].음식 === 'Acourse',
                Bcourse: economyClass[200].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[200].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[201].음식 === 'Acourse',
                Bcourse: economyClass[201].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[201].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[202].음식 === 'Acourse',
                Bcourse: economyClass[202].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[202].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[203].음식 === 'Acourse',
                Bcourse: economyClass[203].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[203].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[204].음식 === 'Acourse',
                Bcourse: economyClass[204].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[204].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[205].음식 === 'Acourse',
                Bcourse: economyClass[205].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[205].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[206].음식 === 'Acourse',
                Bcourse: economyClass[206].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[206].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[207].음식 === 'Acourse',
                Bcourse: economyClass[207].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[207].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[208].음식 === 'Acourse',
                Bcourse: economyClass[208].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[208].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[209].음식 === 'Acourse',
                Bcourse: economyClass[209].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[209].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[210].음식 === 'Acourse',
                Bcourse: economyClass[210].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[210].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[211].음식 === 'Acourse',
                Bcourse: economyClass[211].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[211].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[212].음식 === 'Acourse',
                Bcourse: economyClass[212].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[212].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[213].음식 === 'Acourse',
                Bcourse: economyClass[213].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[213].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[214].음식 === 'Acourse',
                Bcourse: economyClass[214].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[214].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[215].음식 === 'Acourse',
                Bcourse: economyClass[215].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[215].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[216].음식 === 'Acourse',
                Bcourse: economyClass[216].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[216].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[217].음식 === 'Acourse',
                Bcourse: economyClass[217].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[217].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[218].음식 === 'Acourse',
                Bcourse: economyClass[218].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[218].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[219].음식 === 'Acourse',
                Bcourse: economyClass[219].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[219].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[220].음식 === 'Acourse',
                Bcourse: economyClass[220].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[220].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[221].음식 === 'Acourse',
                Bcourse: economyClass[221].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[221].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[222].음식 === 'Acourse',
                Bcourse: economyClass[222].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[222].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[223].음식 === 'Acourse',
                Bcourse: economyClass[223].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[223].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[224].음식 === 'Acourse',
                Bcourse: economyClass[224].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[224].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[225].음식 === 'Acourse',
                Bcourse: economyClass[225].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[225].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[226].음식 === 'Acourse',
                Bcourse: economyClass[226].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[226].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[227].음식 === 'Acourse',
                Bcourse: economyClass[227].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[227].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[228].음식 === 'Acourse',
                Bcourse: economyClass[228].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[228].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[229].음식 === 'Acourse',
                Bcourse: economyClass[229].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[229].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[230].음식 === 'Acourse',
                Bcourse: economyClass[230].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[230].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[231].음식 === 'Acourse',
                Bcourse: economyClass[231].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[231].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[232].음식 === 'Acourse',
                Bcourse: economyClass[232].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[232].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[233].음식 === 'Acourse',
                Bcourse: economyClass[233].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[233].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[234].음식 === 'Acourse',
                Bcourse: economyClass[234].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[234].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[235].음식 === 'Acourse',
                Bcourse: economyClass[235].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[235].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[236].음식 === 'Acourse',
                Bcourse: economyClass[236].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[236].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[237].음식 === 'Acourse',
                Bcourse: economyClass[237].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[237].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[238].음식 === 'Acourse',
                Bcourse: economyClass[238].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[238].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[239].음식 === 'Acourse',
                Bcourse: economyClass[239].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[239].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[240].음식 === 'Acourse',
                Bcourse: economyClass[240].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[240].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[241].음식 === 'Acourse',
                Bcourse: economyClass[241].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[241].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[242].음식 === 'Acourse',
                Bcourse: economyClass[242].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[242].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[243].음식 === 'Acourse',
                Bcourse: economyClass[243].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[243].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[244].음식 === 'Acourse',
                Bcourse: economyClass[244].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[244].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[245].음식 === 'Acourse',
                Bcourse: economyClass[245].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[245].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[246].음식 === 'Acourse',
                Bcourse: economyClass[246].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[246].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[247].음식 === 'Acourse',
                Bcourse: economyClass[247].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[247].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[248].음식 === 'Acourse',
                Bcourse: economyClass[248].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[248].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[249].음식 === 'Acourse',
                Bcourse: economyClass[249].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[249].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[250].음식 === 'Acourse',
                Bcourse: economyClass[250].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[250].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[251].음식 === 'Acourse',
                Bcourse: economyClass[251].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[251].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[252].음식 === 'Acourse',
                Bcourse: economyClass[252].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[252].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[253].음식 === 'Acourse',
                Bcourse: economyClass[253].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[253].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[254].음식 === 'Acourse',
                Bcourse: economyClass[254].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[254].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[255].음식 === 'Acourse',
                Bcourse: economyClass[255].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[255].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[256].음식 === 'Acourse',
                Bcourse: economyClass[256].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[256].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[257].음식 === 'Acourse',
                Bcourse: economyClass[257].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[257].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[258].음식 === 'Acourse',
                Bcourse: economyClass[258].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[258].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[259].음식 === 'Acourse',
                Bcourse: economyClass[259].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[259].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[260].음식 === 'Acourse',
                Bcourse: economyClass[260].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[260].좌석 }}
            </div>
          </div>
        </div>
      </div>
      <div
        v-else-if="section === 'EconomyE'"
        class="seats-econnomy-D-container"
      >
        <h1>{{ section }}</h1>
        <div v-bind="economyClass" class="seat-wrap3">
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[261].음식 === 'Acourse',
                Bcourse: economyClass[261].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[261].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[262].음식 === 'Acourse',
                Bcourse: economyClass[262].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[262].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[263].음식 === 'Acourse',
                Bcourse: economyClass[263].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[263].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[264].음식 === 'Acourse',
                Bcourse: economyClass[264].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[264].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[265].음식 === 'Acourse',
                Bcourse: economyClass[265].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[265].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[266].음식 === 'Acourse',
                Bcourse: economyClass[266].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[266].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[267].음식 === 'Acourse',
                Bcourse: economyClass[267].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[267].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[268].음식 === 'Acourse',
                Bcourse: economyClass[268].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[268].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[269].음식 === 'Acourse',
                Bcourse: economyClass[269].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[269].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[270].음식 === 'Acourse',
                Bcourse: economyClass[270].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[270].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[271].음식 === 'Acourse',
                Bcourse: economyClass[271].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[271].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[272].음식 === 'Acourse',
                Bcourse: economyClass[272].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[272].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[273].음식 === 'Acourse',
                Bcourse: economyClass[273].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[273].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[274].음식 === 'Acourse',
                Bcourse: economyClass[274].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[274].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[275].음식 === 'Acourse',
                Bcourse: economyClass[275].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[275].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[276].음식 === 'Acourse',
                Bcourse: economyClass[276].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[276].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[277].음식 === 'Acourse',
                Bcourse: economyClass[277].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[277].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[278].음식 === 'Acourse',
                Bcourse: economyClass[278].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[278].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[279].음식 === 'Acourse',
                Bcourse: economyClass[279].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[279].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[280].음식 === 'Acourse',
                Bcourse: economyClass[280].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[280].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[281].음식 === 'Acourse',
                Bcourse: economyClass[281].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[281].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[282].음식 === 'Acourse',
                Bcourse: economyClass[282].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[282].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[283].음식 === 'Acourse',
                Bcourse: economyClass[283].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[283].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[284].음식 === 'Acourse',
                Bcourse: economyClass[284].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[284].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[285].음식 === 'Acourse',
                Bcourse: economyClass[285].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[285].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[286].음식 === 'Acourse',
                Bcourse: economyClass[286].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[286].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[287].음식 === 'Acourse',
                Bcourse: economyClass[287].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[287].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[288].음식 === 'Acourse',
                Bcourse: economyClass[288].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[288].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[289].음식 === 'Acourse',
                Bcourse: economyClass[289].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[289].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[290].음식 === 'Acourse',
                Bcourse: economyClass[290].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[290].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[291].음식 === 'Acourse',
                Bcourse: economyClass[291].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[291].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[292].음식 === 'Acourse',
                Bcourse: economyClass[292].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[292].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[293].음식 === 'Acourse',
                Bcourse: economyClass[293].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[293].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[294].음식 === 'Acourse',
                Bcourse: economyClass[294].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[294].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[295].음식 === 'Acourse',
                Bcourse: economyClass[295].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[295].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[296].음식 === 'Acourse',
                Bcourse: economyClass[296].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[296].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[297].음식 === 'Acourse',
                Bcourse: economyClass[297].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[297].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[298].음식 === 'Acourse',
                Bcourse: economyClass[298].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[298].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[299].음식 === 'Acourse',
                Bcourse: economyClass[299].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[299].좌석 }}
            </div>
            <div
              class="seat-economy"
              :class="{
                Acourse: economyClass[300].음식 === 'Acourse',
                Bcourse: economyClass[300].음식 === 'Bcourse',
              }"
            >
              {{ economyClass[300].좌석 }}
            </div>
          </div>
          <div class="seat-row-economy">
            <div class="seat-economy-space"></div>
          </div>

          <div class="seat-row-economy">
            <div class="seat-economy-space"></div>
          </div>
          <div class="seat-row-economy">
            <div class="seat-economy-space"></div>
          </div>
        </div>
      </div>

      <div class="meal-btn-group">
        <b-button @click="showFirstClass">First Class</b-button>
        <b-button @click="showSectionA">Economy A</b-button>
        <b-button @click="showSectionB">Economy B</b-button>
        <b-button @click="showSectionC">Economy C</b-button>
        <b-button @click="showSectionD">Economy D</b-button>
        <b-button @click="showSectionE">Economy E</b-button>
        <b-button variant="warning" @click="dataCheck">test</b-button>
      </div>
    </div>
    <div v-else-if="floor === 'second'" class="second-floor">
      <div v-if="section === 'BusinessA'" class="seats-business-container">
        <h1>{{ section }}</h1>
        <div v-bind="businessClass" class="seat-wrap2">
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[0].음식 === 'Acourse',
                Bcourse: businessClass[0].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[0].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[1].음식 === 'Acourse',
                Bcourse: businessClass[1].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[1].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[2].음식 === 'Acourse',
                Bcourse: businessClass[2].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[2].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[3].음식 === 'Acourse',
                Bcourse: businessClass[3].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[3].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[4].음식 === 'Acourse',
                Bcourse: businessClass[4].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[4].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[5].음식 === 'Acourse',
                Bcourse: businessClass[5].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[5].좌석 }}
            </div>
          </div>
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[6].음식 === 'Acourse',
                Bcourse: businessClass[6].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[6].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[7].음식 === 'Acourse',
                Bcourse: businessClass[7].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[7].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[8].음식 === 'Acourse',
                Bcourse: businessClass[8].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[8].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[9].음식 === 'Acourse',
                Bcourse: businessClass[9].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[9].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[10].음식 === 'Acourse',
                Bcourse: businessClass[10].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[10].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[11].음식 === 'Acourse',
                Bcourse: businessClass[11].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[11].좌석 }}
            </div>
          </div>
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[12].음식 === 'Acourse',
                Bcourse: businessClass[12].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[12].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[13].음식 === 'Acourse',
                Bcourse: businessClass[13].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[13].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[14].음식 === 'Acourse',
                Bcourse: businessClass[14].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[14].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[15].음식 === 'Acourse',
                Bcourse: businessClass[15].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[15].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[16].음식 === 'Acourse',
                Bcourse: businessClass[16].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[16].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[17].음식 === 'Acourse',
                Bcourse: businessClass[17].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[17].좌석 }}
            </div>
          </div>
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[18].음식 === 'Acourse',
                Bcourse: businessClass[18].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[18].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[19].음식 === 'Acourse',
                Bcourse: businessClass[19].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[19].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div class="seat-business-space"></div>
            <div class="seat-business-space"></div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[20].음식 === 'Acourse',
                Bcourse: businessClass[20].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[20].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[21].음식 === 'Acourse',
                Bcourse: businessClass[21].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[21].좌석 }}
            </div>
          </div>
        </div>
      </div>
      <div v-if="section === 'BusinessB'" class="seats-business-container">
        <h1>{{ section }}</h1>
        <div v-bind="businessClass" class="seat-wrap2">
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[22].음식 === 'Acourse',
                Bcourse: businessClass[22].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[22].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[23].음식 === 'Acourse',
                Bcourse: businessClass[23].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[23].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[24].음식 === 'Acourse',
                Bcourse: businessClass[24].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[24].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[25].음식 === 'Acourse',
                Bcourse: businessClass[25].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[25].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[26].음식 === 'Acourse',
                Bcourse: businessClass[26].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[26].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[27].음식 === 'Acourse',
                Bcourse: businessClass[27].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[27].좌석 }}
            </div>
          </div>
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[28].음식 === 'Acourse',
                Bcourse: businessClass[28].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[28].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[29].음식 === 'Acourse',
                Bcourse: businessClass[29].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[29].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[30].음식 === 'Acourse',
                Bcourse: businessClass[30].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[30].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[31].음식 === 'Acourse',
                Bcourse: businessClass[31].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[31].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[32].음식 === 'Acourse',
                Bcourse: businessClass[32].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[32].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[33].음식 === 'Acourse',
                Bcourse: businessClass[33].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[33].좌석 }}
            </div>
          </div>
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[34].음식 === 'Acourse',
                Bcourse: businessClass[34].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[34].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[35].음식 === 'Acourse',
                Bcourse: businessClass[35].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[35].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[36].음식 === 'Acourse',
                Bcourse: businessClass[36].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[36].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[37].음식 === 'Acourse',
                Bcourse: businessClass[37].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[37].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[38].음식 === 'Acourse',
                Bcourse: businessClass[38].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[38].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[39].음식 === 'Acourse',
                Bcourse: businessClass[39].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[39].좌석 }}
            </div>
          </div>
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[40].음식 === 'Acourse',
                Bcourse: businessClass[40].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[40].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[41].음식 === 'Acourse',
                Bcourse: businessClass[41].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[41].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[42].음식 === 'Acourse',
                Bcourse: businessClass[42].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[42].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[43].음식 === 'Acourse',
                Bcourse: businessClass[43].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[43].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[42].음식 === 'Acourse',
                Bcourse: businessClass[44].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[44].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[43].음식 === 'Acourse',
                Bcourse: businessClass[45].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[45].좌석 }}
            </div>
          </div>
        </div>
      </div>
      <div v-if="section === 'BusinessC'" class="seats-business-container">
        <h1>{{ section }}</h1>
        <div v-bind="businessClass" class="seat-wrap2">
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[44].음식 === 'Acourse',
                Bcourse: businessClass[46].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[46].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[45].음식 === 'Acourse',
                Bcourse: businessClass[47].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[47].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[46].음식 === 'Acourse',
                Bcourse: businessClass[48].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[48].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[47].음식 === 'Acourse',
                Bcourse: businessClass[49].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[49].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[48].음식 === 'Acourse',
                Bcourse: businessClass[50].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[50].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[49].음식 === 'Acourse',
                Bcourse: businessClass[51].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[51].좌석 }}
            </div>
          </div>
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[50].음식 === 'Acourse',
                Bcourse: businessClass[52].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[52].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[51].음식 === 'Acourse',
                Bcourse: businessClass[53].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[53].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[52].음식 === 'Acourse',
                Bcourse: businessClass[54].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[54].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[53].음식 === 'Acourse',
                Bcourse: businessClass[55].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[55].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[54].음식 === 'Acourse',
                Bcourse: businessClass[56].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[56].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[55].음식 === 'Acourse',
                Bcourse: businessClass[57].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[57].좌석 }}
            </div>
          </div>
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[56].음식 === 'Acourse',
                Bcourse: businessClass[58].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[58].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[57].음식 === 'Acourse',
                Bcourse: businessClass[59].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[59].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[58].음식 === 'Acourse',
                Bcourse: businessClass[60].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[60].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[59].음식 === 'Acourse',
                Bcourse: businessClass[61].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[61].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[60].음식 === 'Acourse',
                Bcourse: businessClass[62].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[62].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[61].음식 === 'Acourse',
                Bcourse: businessClass[63].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[63].좌석 }}
            </div>
          </div>
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[62].음식 === 'Acourse',
                Bcourse: businessClass[64].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[64].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[63].음식 === 'Acourse',
                Bcourse: businessClass[65].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[65].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[64].음식 === 'Acourse',
                Bcourse: businessClass[66].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[66].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[65].음식 === 'Acourse',
                Bcourse: businessClass[67].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[67].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[66].음식 === 'Acourse',
                Bcourse: businessClass[68].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[68].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[67].음식 === 'Acourse',
                Bcourse: businessClass[69].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[69].좌석 }}
            </div>
          </div>
        </div>
      </div>
      <div v-if="section === 'BusinessD'" class="seats-business-container">
        <h1>{{ section }}</h1>
        <div v-bind="businessClass" class="seat-wrap2">
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[68].음식 === 'Acourse',
                Bcourse: businessClass[70].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[70].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[69].음식 === 'Acourse',
                Bcourse: businessClass[71].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[71].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[70].음식 === 'Acourse',
                Bcourse: businessClass[72].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[72].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[71].음식 === 'Acourse',
                Bcourse: businessClass[73].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[73].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[72].음식 === 'Acourse',
                Bcourse: businessClass[74].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[74].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[73].음식 === 'Acourse',
                Bcourse: businessClass[75].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[75].좌석 }}
            </div>
          </div>
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[74].음식 === 'Acourse',
                Bcourse: businessClass[76].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[76].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[75].음식 === 'Acourse',
                Bcourse: businessClass[77].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[77].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[76].음식 === 'Acourse',
                Bcourse: businessClass[78].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[78].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[77].음식 === 'Acourse',
                Bcourse: businessClass[79].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[79].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[78].음식 === 'Acourse',
                Bcourse: businessClass[80].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[80].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[79].음식 === 'Acourse',
                Bcourse: businessClass[81].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[81].좌석 }}
            </div>
          </div>
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[80].음식 === 'Acourse',
                Bcourse: businessClass[82].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[82].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[81].음식 === 'Acourse',
                Bcourse: businessClass[83].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[83].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[82].음식 === 'Acourse',
                Bcourse: businessClass[84].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[84].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[83].음식 === 'Acourse',
                Bcourse: businessClass[85].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[85].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[84].음식 === 'Acourse',
                Bcourse: businessClass[86].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[86].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[85].음식 === 'Acourse',
                Bcourse: businessClass[87].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[87].좌석 }}
            </div>
          </div>
          <div class="seat-row-business">
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[86].음식 === 'Acourse',
                Bcourse: businessClass[88].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[88].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[87].음식 === 'Acourse',
                Bcourse: businessClass[89].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[89].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[88].음식 === 'Acourse',
                Bcourse: businessClass[90].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[90].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[89].음식 === 'Acourse',
                Bcourse: businessClass[91].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[91].좌석 }}
            </div>
            <div class="seat-space"></div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[90].음식 === 'Acourse',
                Bcourse: businessClass[92].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[92].좌석 }}
            </div>
            <div
              class="seat-business"
              :class="{
                Acourse: businessClass[91].음식 === 'Acourse',
                Bcourse: businessClass[93].음식 === 'Bcourse',
              }"
            >
              {{ businessClass[93].좌석 }}
            </div>
          </div>
        </div>
      </div>
      <div class="meal-btn-group">
        <b-button @click="showBusinessA">Business Class A</b-button>
        <b-button @click="showBusinessB">Business Class B</b-button>
        <b-button @click="showBusinessC">Business Class C</b-button>
        <b-button @click="showBusinessD">Business Class D</b-button>
        <b-button variant="warning" @click="dataCheck">test</b-button>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
export default {
  name: 'AttendantMealA380',
  data() {
    return {
      section: 'First',
      floor: 'first',
      firstClass: [
        {
          좌석: 'A01',
          음식: '',
        },
        {
          좌석: 'D01',
          음식: '',
        },
        {
          좌석: 'E01',
          음식: '',
        },
        {
          좌석: 'J01',
          음식: '',
        },
        {
          좌석: 'A02',
          음식: '',
        },
        {
          좌석: 'D02',
          음식: '',
        },
        {
          좌석: 'E02',
          음식: '',
        },
        {
          좌석: 'J02',
          음식: '',
        },
        {
          좌석: 'A03',
          음식: '',
        },
        {
          좌석: 'D03',
          음식: '',
        },
        {
          좌석: 'E03',
          음식: '',
        },
        {
          좌석: 'J03',
          음식: '',
        },
      ],
      businessClass: [
        {
          좌석: 'A07',
          음식: '',
        },
        {
          좌석: 'B07',
          음식: '',
        },
        {
          좌석: 'D07',
          음식: '',
        },
        {
          좌석: 'E07',
          음식: '',
        },
        {
          좌석: 'G07',
          음식: '',
        },
        {
          좌석: 'H07',
          음식: '',
        },
        {
          좌석: 'A08',
          음식: '',
        },
        {
          좌석: 'B08',
          음식: '',
        },
        {
          좌석: 'D08',
          음식: '',
        },
        {
          좌석: 'E08',
          음식: '',
        },
        {
          좌석: 'G08',
          음식: '',
        },
        {
          좌석: 'H08',
          음식: '',
        },
        {
          좌석: 'A09',
          음식: '',
        },
        {
          좌석: 'B09',
          음식: '',
        },
        {
          좌석: 'D09',
          음식: '',
        },
        {
          좌석: 'E09',
          음식: '',
        },
        {
          좌석: 'G09',
          음식: '',
        },
        {
          좌석: 'H09',
          음식: '',
        },
        {
          좌석: 'A10',
          음식: '',
        },
        {
          좌석: 'B10',
          음식: '',
        },
        {
          좌석: 'G10',
          음식: '',
        },
        {
          좌석: 'H10',
          음식: '',
        },
        {
          좌석: 'A11',
          음식: '',
        },
        {
          좌석: 'B11',
          음식: '',
        },
        {
          좌석: 'D11',
          음식: '',
        },
        {
          좌석: 'E11',
          음식: '',
        },
        {
          좌석: 'G11',
          음식: '',
        },
        {
          좌석: 'H11',
          음식: '',
        },
        {
          좌석: 'A12',
          음식: '',
        },
        {
          좌석: 'B12',
          음식: '',
        },
        {
          좌석: 'D12',
          음식: '',
        },
        {
          좌석: 'E12',
          음식: '',
        },
        {
          좌석: 'G12',
          음식: '',
        },
        {
          좌석: 'H12',
          음식: '',
        },
        {
          좌석: 'A13',
          음식: '',
        },
        {
          좌석: 'B13',
          음식: '',
        },
        {
          좌석: 'D13',
          음식: '',
        },
        {
          좌석: 'E13',
          음식: '',
        },
        {
          좌석: 'G13',
          음식: '',
        },
        {
          좌석: 'H13',
          음식: '',
        },
        {
          좌석: 'A14',
          음식: '',
        },
        {
          좌석: 'B14',
          음식: '',
        },
        {
          좌석: 'D14',
          음식: '',
        },
        {
          좌석: 'E14',
          음식: '',
        },
        {
          좌석: 'G14',
          음식: '',
        },
        {
          좌석: 'H14',
          음식: '',
        },
        {
          좌석: 'A15',
          음식: '',
        },
        {
          좌석: 'B15',
          음식: '',
        },
        {
          좌석: 'D15',
          음식: '',
        },
        {
          좌석: 'E15',
          음식: '',
        },
        {
          좌석: 'G15',
          음식: '',
        },
        {
          좌석: 'H15',
          음식: '',
        },
        {
          좌석: 'A16',
          음식: '',
        },
        {
          좌석: 'B16',
          음식: '',
        },
        {
          좌석: 'D16',
          음식: '',
        },
        {
          좌석: 'E16',
          음식: '',
        },
        {
          좌석: 'G16',
          음식: '',
        },
        {
          좌석: 'H16',
          음식: '',
        },
        {
          좌석: 'A17',
          음식: '',
        },
        {
          좌석: 'B17',
          음식: '',
        },
        {
          좌석: 'D17',
          음식: '',
        },
        {
          좌석: 'E17',
          음식: '',
        },
        {
          좌석: 'G17',
          음식: '',
        },
        {
          좌석: 'H17',
          음식: '',
        },
        {
          좌석: 'A18',
          음식: '',
        },
        {
          좌석: 'B18',
          음식: '',
        },
        {
          좌석: 'D18',
          음식: '',
        },
        {
          좌석: 'E18',
          음식: '',
        },
        {
          좌석: 'G18',
          음식: '',
        },
        {
          좌석: 'H18',
          음식: '',
        },
        {
          좌석: 'A19',
          음식: '',
        },
        {
          좌석: 'B19',
          음식: '',
        },
        {
          좌석: 'D19',
          음식: '',
        },
        {
          좌석: 'E19',
          음식: '',
        },
        {
          좌석: 'G19',
          음식: '',
        },
        {
          좌석: 'H19',
          음식: '',
        },
        {
          좌석: 'A20',
          음식: '',
        },
        {
          좌석: 'B20',
          음식: '',
        },
        {
          좌석: 'D20',
          음식: '',
        },
        {
          좌석: 'E20',
          음식: '',
        },
        {
          좌석: 'G20',
          음식: '',
        },
        {
          좌석: 'H20',
          음식: '',
        },
        {
          좌석: 'A21',
          음식: '',
        },
        {
          좌석: 'B21',
          음식: '',
        },
        {
          좌석: 'D21',
          음식: '',
        },
        {
          좌석: 'E21',
          음식: '',
        },
        {
          좌석: 'G21',
          음식: '',
        },
        {
          좌석: 'H21',
          음식: '',
        },
        {
          좌석: 'A22',
          음식: '',
        },
        {
          좌석: 'B22',
          음식: '',
        },
        {
          좌석: 'D22',
          음식: '',
        },
        {
          좌석: 'E22',
          음식: '',
        },
        {
          좌석: 'G22',
          음식: '',
        },
        {
          좌석: 'H22',
          음식: '',
        },
        {
          좌석: 'A23',
          음식: '',
        },
        {
          좌석: 'B23',
          음식: '',
        },
        {
          좌석: 'D23',
          음식: '',
        },
        {
          좌석: 'E23',
          음식: '',
        },
        {
          좌석: 'G23',
          음식: '',
        },
        {
          좌석: 'H23',
          음식: '',
        },
      ],
      economyClass: [
        {
          좌석: 'A28',
          음식: '',
        },
        {
          좌석: 'B28',
          음식: '',
        },
        {
          좌석: 'C28',
          음식: '',
        },
        {
          좌석: 'A29',
          음식: '',
        },
        {
          좌석: 'B29',
          음식: '',
        },
        {
          좌석: 'C29',
          음식: '',
        },
        {
          좌석: 'A30',
          음식: '',
        },
        {
          좌석: 'B30',
          음식: '',
        },
        {
          좌석: 'C30',
          음식: '',
        },
        {
          좌석: 'D30',
          음식: '',
        },
        {
          좌석: 'E30',
          음식: '',
        },
        {
          좌석: 'F30',
          음식: '',
        },
        {
          좌석: 'G30',
          음식: '',
        },
        {
          좌석: 'H30',
          음식: '',
        },
        {
          좌석: 'J30',
          음식: '',
        },
        {
          좌석: 'K30',
          음식: '',
        },
        {
          좌석: 'A31',
          음식: '',
        },
        {
          좌석: 'B31',
          음식: '',
        },
        {
          좌석: 'C31',
          음식: '',
        },
        {
          좌석: 'D31',
          음식: '',
        },
        {
          좌석: 'E31',
          음식: '',
        },
        {
          좌석: 'F31',
          음식: '',
        },
        {
          좌석: 'G31',
          음식: '',
        },
        {
          좌석: 'H31',
          음식: '',
        },
        {
          좌석: 'J31',
          음식: '',
        },
        {
          좌석: 'K31',
          음식: '',
        },
        {
          좌석: 'A32',
          음식: '',
        },
        {
          좌석: 'B32',
          음식: '',
        },
        {
          좌석: 'C32',
          음식: '',
        },
        {
          좌석: 'D32',
          음식: '',
        },
        {
          좌석: 'E32',
          음식: '',
        },
        {
          좌석: 'F32',
          음식: '',
        },
        {
          좌석: 'G32',
          음식: '',
        },
        {
          좌석: 'H32',
          음식: '',
        },
        {
          좌석: 'J32',
          음식: '',
        },
        {
          좌석: 'K32',
          음식: '',
        },
        {
          좌석: 'A33',
          음식: '',
        },
        {
          좌석: 'B33',
          음식: '',
        },
        {
          좌석: 'C33',
          음식: '',
        },
        {
          좌석: 'D33',
          음식: '',
        },
        {
          좌석: 'E33',
          음식: '',
        },
        {
          좌석: 'F33',
          음식: '',
        },
        {
          좌석: 'G33',
          음식: '',
        },
        {
          좌석: 'H33',
          음식: '',
        },
        {
          좌석: 'J33',
          음식: '',
        },
        {
          좌석: 'K33',
          음식: '',
        },
        {
          좌석: 'A34',
          음식: '',
        },
        {
          좌석: 'B34',
          음식: '',
        },
        {
          좌석: 'C34',
          음식: '',
        },
        {
          좌석: 'D34',
          음식: '',
        },
        {
          좌석: 'E34',
          음식: '',
        },
        {
          좌석: 'F34',
          음식: '',
        },
        {
          좌석: 'G34',
          음식: '',
        },
        {
          좌석: 'H34',
          음식: '',
        },
        {
          좌석: 'J34',
          음식: '',
        },
        {
          좌석: 'K34',
          음식: '',
        },
        {
          좌석: 'A35',
          음식: '',
        },
        {
          좌석: 'B35',
          음식: '',
        },
        {
          좌석: 'C35',
          음식: '',
        },
        {
          좌석: 'D35',
          음식: '',
        },
        {
          좌석: 'E35',
          음식: '',
        },
        {
          좌석: 'F35',
          음식: '',
        },
        {
          좌석: 'G35',
          음식: '',
        },
        {
          좌석: 'H35',
          음식: '',
        },
        {
          좌석: 'J35',
          음식: '',
        },
        {
          좌석: 'K35',
          음식: '',
        },
        {
          좌석: 'A36',
          음식: '',
        },
        {
          좌석: 'B36',
          음식: '',
        },
        {
          좌석: 'C36',
          음식: '',
        },
        {
          좌석: 'D36',
          음식: '',
        },
        {
          좌석: 'E36',
          음식: '',
        },
        {
          좌석: 'F36',
          음식: '',
        },
        {
          좌석: 'G36',
          음식: '',
        },
        {
          좌석: 'H36',
          음식: '',
        },
        {
          좌석: 'J36',
          음식: '',
        },
        {
          좌석: 'K36',
          음식: '',
        },
        {
          좌석: 'A37',
          음식: '',
        },
        {
          좌석: 'B37',
          음식: '',
        },
        {
          좌석: 'C37',
          음식: '',
        },
        {
          좌석: 'D37',
          음식: '',
        },
        {
          좌석: 'E37',
          음식: '',
        },
        {
          좌석: 'F37',
          음식: '',
        },
        {
          좌석: 'G37',
          음식: '',
        },
        {
          좌석: 'H37',
          음식: '',
        },
        {
          좌석: 'J37',
          음식: '',
        },
        {
          좌석: 'K37',
          음식: '',
        },
        {
          좌석: 'A38',
          음식: '',
        },
        {
          좌석: 'B38',
          음식: '',
        },
        {
          좌석: 'C38',
          음식: '',
        },
        {
          좌석: 'D38',
          음식: '',
        },
        {
          좌석: 'E38',
          음식: '',
        },
        {
          좌석: 'F38',
          음식: '',
        },
        {
          좌석: 'G38',
          음식: '',
        },
        {
          좌석: 'H38',
          음식: '',
        },
        {
          좌석: 'J38',
          음식: '',
        },
        {
          좌석: 'K38',
          음식: '',
        },
        {
          좌석: 'A39',
          음식: '',
        },
        {
          좌석: 'B39',
          음식: '',
        },
        {
          좌석: 'C39',
          음식: '',
        },
        {
          좌석: 'D39',
          음식: '',
        },
        {
          좌석: 'E39',
          음식: '',
        },
        {
          좌석: 'F39',
          음식: '',
        },
        {
          좌석: 'G39',
          음식: '',
        },
        {
          좌석: 'H39',
          음식: '',
        },
        {
          좌석: 'J39',
          음식: '',
        },
        {
          좌석: 'K39',
          음식: '',
        },
        {
          좌석: 'A40',
          음식: '',
        },
        {
          좌석: 'B40',
          음식: '',
        },
        {
          좌석: 'C40',
          음식: '',
        },
        {
          좌석: 'D40',
          음식: '',
        },
        {
          좌석: 'E40',
          음식: '',
        },
        {
          좌석: 'F40',
          음식: '',
        },
        {
          좌석: 'G40',
          음식: '',
        },
        {
          좌석: 'H40',
          음식: '',
        },
        {
          좌석: 'J40',
          음식: '',
        },
        {
          좌석: 'K40',
          음식: '',
        },
        {
          좌석: 'A41',
          음식: '',
        },
        {
          좌석: 'B41',
          음식: '',
        },
        {
          좌석: 'C41',
          음식: '',
        },
        {
          좌석: 'H41',
          음식: '',
        },
        {
          좌석: 'J41',
          음식: '',
        },
        {
          좌석: 'K41',
          음식: '',
        },
        {
          좌석: 'A42',
          음식: '',
        },
        {
          좌석: 'B42',
          음식: '',
        },
        {
          좌석: 'C42',
          음식: '',
        },
        {
          좌석: 'D42',
          음식: '',
        },
        {
          좌석: 'E42',
          음식: '',
        },
        {
          좌석: 'F42',
          음식: '',
        },
        {
          좌석: 'G42',
          음식: '',
        },
        {
          좌석: 'H42',
          음식: '',
        },
        {
          좌석: 'J42',
          음식: '',
        },
        {
          좌석: 'K42',
          음식: '',
        },
        {
          좌석: 'A43',
          음식: '',
        },
        {
          좌석: 'B43',
          음식: '',
        },
        {
          좌석: 'C43',
          음식: '',
        },
        {
          좌석: 'D43',
          음식: '',
        },
        {
          좌석: 'E43',
          음식: '',
        },
        {
          좌석: 'F43',
          음식: '',
        },
        {
          좌석: 'G43',
          음식: '',
        },
        {
          좌석: 'H43',
          음식: '',
        },
        {
          좌석: 'J43',
          음식: '',
        },
        {
          좌석: 'K43',
          음식: '',
        },
        {
          좌석: 'A44',
          음식: '',
        },
        {
          좌석: 'B44',
          음식: '',
        },
        {
          좌석: 'C44',
          음식: '',
        },
        {
          좌석: 'D44',
          음식: '',
        },
        {
          좌석: 'E44',
          음식: '',
        },
        {
          좌석: 'F44',
          음식: '',
        },
        {
          좌석: 'G44',
          음식: '',
        },
        {
          좌석: 'H44',
          음식: '',
        },
        {
          좌석: 'J44',
          음식: '',
        },
        {
          좌석: 'K44',
          음식: '',
        },
        {
          좌석: 'A45',
          음식: '',
        },
        {
          좌석: 'B45',
          음식: '',
        },
        {
          좌석: 'C45',
          음식: '',
        },
        {
          좌석: 'D45',
          음식: '',
        },
        {
          좌석: 'E45',
          음식: '',
        },
        {
          좌석: 'F45',
          음식: '',
        },
        {
          좌석: 'G45',
          음식: '',
        },
        {
          좌석: 'H45',
          음식: '',
        },
        {
          좌석: 'J45',
          음식: '',
        },
        {
          좌석: 'K45',
          음식: '',
        },
        {
          좌석: 'A46',
          음식: '',
        },
        {
          좌석: 'B46',
          음식: '',
        },
        {
          좌석: 'C46',
          음식: '',
        },
        {
          좌석: 'E46',
          음식: '',
        },
        {
          좌석: 'F46',
          음식: '',
        },
        {
          좌석: 'G46',
          음식: '',
        },
        {
          좌석: 'H46',
          음식: '',
        },
        {
          좌석: 'J46',
          음식: '',
        },
        {
          좌석: 'K46',
          음식: '',
        },
        {
          좌석: 'A47',
          음식: '',
        },
        {
          좌석: 'B47',
          음식: '',
        },
        {
          좌석: 'C47',
          음식: '',
        },
        {
          좌석: 'D47',
          음식: '',
        },
        {
          좌석: 'E47',
          음식: '',
        },
        {
          좌석: 'F47',
          음식: '',
        },
        {
          좌석: 'G47',
          음식: '',
        },
        {
          좌석: 'H47',
          음식: '',
        },
        {
          좌석: 'J47',
          음식: '',
        },
        {
          좌석: 'K47',
          음식: '',
        },
        {
          좌석: 'A48',
          음식: '',
        },
        {
          좌석: 'B48',
          음식: '',
        },
        {
          좌석: 'C48',
          음식: '',
        },
        {
          좌석: 'D48',
          음식: '',
        },
        {
          좌석: 'E48',
          음식: '',
        },
        {
          좌석: 'F48',
          음식: '',
        },
        {
          좌석: 'G48',
          음식: '',
        },
        {
          좌석: 'H48',
          음식: '',
        },
        {
          좌석: 'J48',
          음식: '',
        },
        {
          좌석: 'K48',
          음식: '',
        },
        {
          좌석: 'A49',
          음식: '',
        },
        {
          좌석: 'B49',
          음식: '',
        },
        {
          좌석: 'C49',
          음식: '',
        },
        {
          좌석: 'D49',
          음식: '',
        },
        {
          좌석: 'E49',
          음식: '',
        },
        {
          좌석: 'F49',
          음식: '',
        },
        {
          좌석: 'G49',
          음식: '',
        },
        {
          좌석: 'H49',
          음식: '',
        },
        {
          좌석: 'J49',
          음식: '',
        },
        {
          좌석: 'K49',
          음식: '',
        },
        {
          좌석: 'A50',
          음식: '',
        },
        {
          좌석: 'B50',
          음식: '',
        },
        {
          좌석: 'C50',
          음식: '',
        },
        {
          좌석: 'D50',
          음식: '',
        },
        {
          좌석: 'E50',
          음식: '',
        },
        {
          좌석: 'F50',
          음식: '',
        },
        {
          좌석: 'G50',
          음식: '',
        },
        {
          좌석: 'H50',
          음식: '',
        },
        {
          좌석: 'J50',
          음식: '',
        },
        {
          좌석: 'K50',
          음식: '',
        },
        {
          좌석: 'A51',
          음식: '',
        },
        {
          좌석: 'B51',
          음식: '',
        },
        {
          좌석: 'C51',
          음식: '',
        },
        {
          좌석: 'D51',
          음식: '',
        },
        {
          좌석: 'E51',
          음식: '',
        },
        {
          좌석: 'F51',
          음식: '',
        },
        {
          좌석: 'G51',
          음식: '',
        },
        {
          좌석: 'H51',
          음식: '',
        },
        {
          좌석: 'J51',
          음식: '',
        },
        {
          좌석: 'K51',
          음식: '',
        },
        {
          좌석: 'A52',
          음식: '',
        },
        {
          좌석: 'B52',
          음식: '',
        },
        {
          좌석: 'C52',
          음식: '',
        },
        {
          좌석: 'D52',
          음식: '',
        },
        {
          좌석: 'E52',
          음식: '',
        },
        {
          좌석: 'F52',
          음식: '',
        },
        {
          좌석: 'G52',
          음식: '',
        },
        {
          좌석: 'H52',
          음식: '',
        },
        {
          좌석: 'J52',
          음식: '',
        },
        {
          좌석: 'K52',
          음식: '',
        },
        {
          좌석: 'A53',
          음식: '',
        },
        {
          좌석: 'B53',
          음식: '',
        },
        {
          좌석: 'C53',
          음식: '',
        },
        {
          좌석: 'D53',
          음식: '',
        },
        {
          좌석: 'E53',
          음식: '',
        },
        {
          좌석: 'F53',
          음식: '',
        },
        {
          좌석: 'G53',
          음식: '',
        },
        {
          좌석: 'H53',
          음식: '',
        },
        {
          좌석: 'J53',
          음식: '',
        },
        {
          좌석: 'K53',
          음식: '',
        },
        {
          좌석: 'A54',
          음식: '',
        },
        {
          좌석: 'B54',
          음식: '',
        },
        {
          좌석: 'C54',
          음식: '',
        },
        {
          좌석: 'D54',
          음식: '',
        },
        {
          좌석: 'E54',
          음식: '',
        },
        {
          좌석: 'F54',
          음식: '',
        },
        {
          좌석: 'G54',
          음식: '',
        },
        {
          좌석: 'H54',
          음식: '',
        },
        {
          좌석: 'J54',
          음식: '',
        },
        {
          좌석: 'K54',
          음식: '',
        },
        {
          좌석: 'A55',
          음식: '',
        },
        {
          좌석: 'B55',
          음식: '',
        },
        {
          좌석: 'C55',
          음식: '',
        },
        {
          좌석: 'D55',
          음식: '',
        },
        {
          좌석: 'E55',
          음식: '',
        },
        {
          좌석: 'F55',
          음식: '',
        },
        {
          좌석: 'G55',
          음식: '',
        },
        {
          좌석: 'H55',
          음식: '',
        },
        {
          좌석: 'J55',
          음식: '',
        },
        {
          좌석: 'K55',
          음식: '',
        },
        {
          좌석: 'A56',
          음식: '',
        },
        {
          좌석: 'B56',
          음식: '',
        },
        {
          좌석: 'C56',
          음식: '',
        },
        {
          좌석: 'D56',
          음식: '',
        },
        {
          좌석: 'E56',
          음식: '',
        },
        {
          좌석: 'F56',
          음식: '',
        },
        {
          좌석: 'G56',
          음식: '',
        },
        {
          좌석: 'H56',
          음식: '',
        },
        {
          좌석: 'J56',
          음식: '',
        },
        {
          좌석: 'K56',
          음식: '',
        },
        {
          좌석: 'A57',
          음식: '',
        },
        {
          좌석: 'B57',
          음식: '',
        },
        {
          좌석: 'C57',
          음식: '',
        },
        {
          좌석: 'D57',
          음식: '',
        },
        {
          좌석: 'E57',
          음식: '',
        },
        {
          좌석: 'F57',
          음식: '',
        },
        {
          좌석: 'G57',
          음식: '',
        },
        {
          좌석: 'H57',
          음식: '',
        },
        {
          좌석: 'J57',
          음식: '',
        },
        {
          좌석: 'K57',
          음식: '',
        },
        {
          좌석: 'A58',
          음식: '',
        },
        {
          좌석: 'B58',
          음식: '',
        },
        {
          좌석: 'C58',
          음식: '',
        },
        {
          좌석: 'D58',
          음식: '',
        },
        {
          좌석: 'E58',
          음식: '',
        },
        {
          좌석: 'F58',
          음식: '',
        },
        {
          좌석: 'G58',
          음식: '',
        },
        {
          좌석: 'H58',
          음식: '',
        },
        {
          좌석: 'J58',
          음식: '',
        },
        {
          좌석: 'K58',
          음식: '',
        },
        {
          좌석: 'A59',
          음식: '',
        },
        {
          좌석: 'B59',
          음식: '',
        },
        {
          좌석: 'C59',
          음식: '',
        },
        {
          좌석: 'D59',
          음식: '',
        },
        {
          좌석: 'E59',
          음식: '',
        },
        {
          좌석: 'F59',
          음식: '',
        },
        {
          좌석: 'G59',
          음식: '',
        },
        {
          좌석: 'H59',
          음식: '',
        },
        {
          좌석: 'J59',
          음식: '',
        },
        {
          좌석: 'K59',
          음식: '',
        },
      ],
    }
  },
  computed: {
    ...mapState('meal', ['meals', 'flightMeals', 'choiceMeal', 'seatMealList']),
    ...mapState('user', ['loginMember', 'flightNum']),
  },
  created() {
    const promise = new Promise((resolve, reject) => {
      resolve()
    })
    promise.then(async () => {
      await this.getMealList(this.flightNum)
      this.seatMealList.forEach((seatMeal) => {
        this.firstClass.forEach((seat) => {
          if (seatMeal.seatNum === seat.좌석) {
            seat.음식 = seatMeal.mealMenu
            if (seat.음식 === '제육덮밥') {
              seat.음식 = 'Acourse'
            } else if (seat.음식 === '카레라이스') {
              seat.음식 = 'Bcourse'
            }
          }
        })
        this.businessClass.forEach((seat) => {
          if (seatMeal.seatNum === seat.좌석) {
            seat.음식 = seatMeal.mealMenu
            if (seat.음식 === '제육덮밥') {
              seat.음식 = 'Acourse'
            } else if (seat.음식 === '카레라이스') {
              seat.음식 = 'Bcourse'
            }
          }
        })
        this.economyClass.forEach((seat) => {
          if (seatMeal.seatNum === seat.좌석) {
            seat.음식 = seatMeal.mealMenu
            if (seat.음식 === '제육덮밥') {
              seat.음식 = 'Acourse'
            } else if (seat.음식 === '카레라이스') {
              seat.음식 = 'Bcourse'
            }
          }
        })
      })
    })
  },
  methods: {
    ...mapActions('meal', [
      'getMeal',
      'getFlightMeal',
      'getChoiceMeal',
      'getMealList',
    ]),
    showFirstClass() {
      this.section = 'First'
    },
    showBusinessA() {
      this.section = 'BusinessA'
    },
    showBusinessB() {
      this.section = 'BusinessB'
    },
    showBusinessC() {
      this.section = 'BusinessC'
    },
    showBusinessD() {
      this.section = 'BusinessD'
    },
    showSectionA() {
      this.section = 'EconomyA'
    },
    showSectionB() {
      this.section = 'EconomyB'
    },
    showSectionC() {
      this.section = 'EconomyC'
    },
    showSectionD() {
      this.section = 'EconomyD'
    },
    showSectionE() {
      this.section = 'EconomyE'
    },
    showSectionF() {
      this.section = 'EconomyF'
    },
    dataCheck() {
      if (this.floor === 'first') {
        this.floor = 'second'
        this.section = 'BusinessA'
      } else if (this.floor === 'second') {
        this.floor = 'first'
        this.section = 'First'
      }
    },
  },
}
</script>

<style scoped>
.meal-list-wrap {
  height: 75vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  background-color: rgba(239, 239, 239, 0.511);
}
/* 1층 */
.first-floor {
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
}
/* 2층 */
.second-floor {
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
}
/* 색 안내 */
.first-meal-wrap {
  width: 100%;
  display: flex;
  justify-content: center;
  text-align: center;
}

.course-wrap {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 50%;
  padding: 0.3%;
  background-color: #cdd1d386;
}
.course-wrap h5 {
  margin-right: 2%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.A-course {
  background-color: #a3d5d5;
  height: 100%;
  width: 5%;
  border-top-left-radius: 35px;
  border-top-right-radius: 35px;
}

.B-course {
  background-color: #a3d5d5;
  height: 100%;
  width: 5%;
  border-top-left-radius: 35px;
  border-top-right-radius: 35px;
}

.special-course {
  background-color: #a3d5d5;
  height: 100%;
  width: 5%;
  border-top-left-radius: 35px;
  border-top-right-radius: 35px;
}

.meal-list-wrap h1 {
  text-align: center;
  margin-bottom: 1%;
}
/* first Class chair*/
.seats-first-container {
  height: 65%;
}
.seat-wrap1 {
  height: 50%;
  margin-bottom: 7%;
  /* background-color: black; */
}
.seat-row-first {
  height: 55%;
  display: flex;
  margin-bottom: 1%;
  flex-direction: row;
  justify-content: center;
  text-align: center;
  font-size: x-large;
  font-weight: bold;
  color: aliceblue;
}
.seat-first {
  background-color: #c4dcdc;
  height: 100%;
  width: 12%;
  padding: 2%;
  border-top-left-radius: 40px;
  border-top-right-radius: 40px;
}
/* business Class chair */
.seats-business-container {
  height: 82%;
}
.seat-wrap2 {
  height: 50%;
}
.seat-row-business {
  height: 37%;
  display: flex;
  margin-bottom: 1%;
  flex-direction: row;
  justify-content: center;
}
.seat-business {
  background-color: #c4dcdc;
  height: 100%;
  width: 10%;
  margin: 0.2%;
  padding: 0.8%;
  border-top-left-radius: 20px;
  border-top-right-radius: 20px;
  text-align: center;
  font-size: larger;
  font-weight: bold;
  color: white;
}

.seat-business-space {
  background-color: #ffffff00;
  height: 100%;
  width: 10%;
  margin: 0.2%;
  padding: 0.8%;
  border-top-left-radius: 20px;
  border-top-right-radius: 20px;
}

/* economy class chair */
.seats-econnomy-D-container,
.seats-econnomy-C-container,
.seats-econnomy-B-container,
.seats-econnomy-A-container {
  height: 60%;
}

.seat-wrap3 {
  height: 60%;
}
.seat-row-economy {
  height: 17%;
  display: flex;
  margin-bottom: 0.7%;
  flex-direction: row;
  justify-content: center;
}

.seat-economy {
  background-color: #c4dcdc;
  color: aliceblue;
  text-align: center;
  height: 100%;
  width: 6%;
  margin: 0.2%;
  font-weight: bold;
  font-size: large;
  border-top-left-radius: 13px;
  border-top-right-radius: 13px;
}
.seat-economy-space {
  background-color: #ffffff00;
  height: 100%;
  width: 6%;
  margin: 0.2%;
  padding: 1%;
  border-top-left-radius: 13px;
  border-top-right-radius: 13px;
}

/* 자리 사이에 공간만들려고 만든거 */
.seat-space {
  background-color: #ffffff00;
  height: 50%;
  width: 5%;
  padding: 2%;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;
}
.space {
  background-color: #ffffff00;
  height: 50%;
  width: 1%;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;
}

.meal-btn-group {
  margin-top: 3%;
  text-align: center;
  color: aliceblue;
}
.btn-secondary {
  font-size: small;
  height: 100%;
  width: 12%;
  background-color: #206e95;
  border-color: #206e95;
}
.btn-warning {
  font-size: small;
  height: 100%;
  width: 12%;
}

.Acourse {
  background-color: #ffc107;
  /* height: 100%;
  width: 10%;
  padding: 2%;
  border-top-left-radius: 40px;
  border-top-right-radius: 40px; */
}
.Bcourse {
  background-color: #29d6f4;
  /* height: 100%;
  width: 10%;
  padding: 2%;
  border-top-left-radius: 40px;
  border-top-right-radius: 40px; */
}
</style>
