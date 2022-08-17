<template>
  <div class="meal-list-wrap">
    <div v-if="section === 'First'" class="seats-first-container">
      <h1>{{ section }}</h1>
      <div v-bind="firstClass" class="seat-wrap1">
        <div class="seat-row-first">
          <div
            class="seat-first"
            :class="{
              Acourse: firstClass[0].음식 === 'Acourse',
              Bcourse: firstClass[0].음식 === 'Bcourse',
              Ccourse: firstClass[0].음식 === 'Ccourse',
              Dcourse: firstClass[0].음식 === 'Dcourse',
              Ecourse: firstClass[0].음식 === 'Ecourse',
              Fcourse: firstClass[0].음식 === 'Fcourse',
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
              Ccourse: firstClass[1].음식 === 'Ccourse',
              Dcourse: firstClass[1].음식 === 'Dcourse',
              Ecourse: firstClass[1].음식 === 'Ecourse',
              Fcourse: firstClass[1].음식 === 'Fcourse',
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
              Ccourse: firstClass[2].음식 === 'Ccourse',
              Dcourse: firstClass[2].음식 === 'Dcourse',
              Ecourse: firstClass[2].음식 === 'Ecourse',
              Fcourse: firstClass[2].음식 === 'Fcourse',
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
              Ccourse: firstClass[3].음식 === 'Ccourse',
              Dcourse: firstClass[3].음식 === 'Dcourse',
              Ecourse: firstClass[3].음식 === 'Ecourse',
              Fcourse: firstClass[3].음식 === 'Fcourse',
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
              Ccourse: firstClass[4].음식 === 'Ccourse',
              Dcourse: firstClass[4].음식 === 'Dcourse',
              Ecourse: firstClass[4].음식 === 'Ecourse',
              Fcourse: firstClass[4].음식 === 'Fcourse',
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
              Ccourse: firstClass[5].음식 === 'Ccourse',
              Dcourse: firstClass[5].음식 === 'Dcourse',
              Ecourse: firstClass[5].음식 === 'Ecourse',
              Fcourse: firstClass[5].음식 === 'Fcourse',
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
              Ccourse: firstClass[6].음식 === 'Ccourse',
              Dcourse: firstClass[6].음식 === 'Dcourse',
              Ecourse: firstClass[6].음식 === 'Ecourse',
              Fcourse: firstClass[6].음식 === 'Fcourse',
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
              Ccourse: firstClass[7].음식 === 'Ccourse',
              Dcourse: firstClass[7].음식 === 'Dcourse',
              Ecourse: firstClass[7].음식 === 'Ecourse',
              Fcourse: firstClass[7].음식 === 'Fcourse',
            }"
          >
            {{ firstClass[7].좌석 }}
          </div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'Business'" class="seats-business-container">
      <h1>{{ section }}</h1>
      <div v-bind="businessClass" class="seat-wrap2">
        <div class="seat-row-business">
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[0].음식 === 'Acourse',
              Bcourse: businessClass[0].음식 === 'Bcourse',
              Ccourse: businessClass[0].음식 === 'Ccourse',
              Dcourse: businessClass[0].음식 === 'Dcourse',
              Ecourse: businessClass[0].음식 === 'Ecourse',
              Fcourse: businessClass[0].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[0].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[1].음식 === 'Acourse',
              Bcourse: businessClass[1].음식 === 'Bcourse',
              Ccourse: businessClass[1].음식 === 'Ccourse',
              Dcourse: businessClass[1].음식 === 'Dcourse',
              Ecourse: businessClass[1].음식 === 'Ecourse',
              Fcourse: businessClass[1].음식 === 'Fcourse',
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
              Ccourse: businessClass[2].음식 === 'Ccourse',
              Dcourse: businessClass[2].음식 === 'Dcourse',
              Ecourse: businessClass[2].음식 === 'Ecourse',
              Fcourse: businessClass[2].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[2].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[3].음식 === 'Acourse',
              Bcourse: businessClass[3].음식 === 'Bcourse',
              Ccourse: businessClass[3].음식 === 'Ccourse',
              Dcourse: businessClass[3].음식 === 'Dcourse',
              Ecourse: businessClass[3].음식 === 'Ecourse',
              Fcourse: businessClass[3].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[3].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[4].음식 === 'Acourse',
              Bcourse: businessClass[4].음식 === 'Bcourse',
              Ccourse: businessClass[4].음식 === 'Ccourse',
              Dcourse: businessClass[4].음식 === 'Dcourse',
              Ecourse: businessClass[4].음식 === 'Ecourse',
              Fcourse: businessClass[4].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[4].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[5].음식 === 'Acourse',
              Bcourse: businessClass[5].음식 === 'Bcourse',
              Ccourse: businessClass[5].음식 === 'Ccourse',
              Dcourse: businessClass[5].음식 === 'Dcourse',
              Ecourse: businessClass[5].음식 === 'Ecourse',
              Fcourse: businessClass[5].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[5].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[6].음식 === 'Acourse',
              Bcourse: businessClass[6].음식 === 'Bcourse',
              Ccourse: businessClass[6].음식 === 'Ccourse',
              Dcourse: businessClass[6].음식 === 'Dcourse',
              Ecourse: businessClass[6].음식 === 'Ecourse',
              Fcourse: businessClass[6].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[6].좌석 }}
          </div>
        </div>
        <div class="seat-row-business">
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[7].음식 === 'Acourse',
              Bcourse: businessClass[7].음식 === 'Bcourse',
              Ccourse: businessClass[7].음식 === 'Ccourse',
              Dcourse: businessClass[7].음식 === 'Dcourse',
              Ecourse: businessClass[7].음식 === 'Ecourse',
              Fcourse: businessClass[7].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[7].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[8].음식 === 'Acourse',
              Bcourse: businessClass[8].음식 === 'Bcourse',
              Ccourse: businessClass[8].음식 === 'Ccourse',
              Dcourse: businessClass[8].음식 === 'Dcourse',
              Ecourse: businessClass[8].음식 === 'Ecourse',
              Fcourse: businessClass[8].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[8].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[9].음식 === 'Acourse',
              Bcourse: businessClass[9].음식 === 'Bcourse',
              Ccourse: businessClass[9].음식 === 'Ccourse',
              Dcourse: businessClass[9].음식 === 'Dcourse',
              Ecourse: businessClass[9].음식 === 'Ecourse',
              Fcourse: businessClass[9].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[9].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[10].음식 === 'Acourse',
              Bcourse: businessClass[10].음식 === 'Bcourse',
              Ccourse: businessClass[10].음식 === 'Ccourse',
              Dcourse: businessClass[10].음식 === 'Dcourse',
              Ecourse: businessClass[10].음식 === 'Ecourse',
              Fcourse: businessClass[10].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[10].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[11].음식 === 'Acourse',
              Bcourse: businessClass[11].음식 === 'Bcourse',
              Ccourse: businessClass[11].음식 === 'Ccourse',
              Dcourse: businessClass[11].음식 === 'Dcourse',
              Ecourse: businessClass[11].음식 === 'Ecourse',
              Fcourse: businessClass[11].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[11].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[12].음식 === 'Acourse',
              Bcourse: businessClass[12].음식 === 'Bcourse',
              Ccourse: businessClass[12].음식 === 'Ccourse',
              Dcourse: businessClass[12].음식 === 'Dcourse',
              Ecourse: businessClass[12].음식 === 'Ecourse',
              Fcourse: businessClass[12].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[12].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[13].음식 === 'Acourse',
              Bcourse: businessClass[13].음식 === 'Bcourse',
              Ccourse: businessClass[13].음식 === 'Ccourse',
              Dcourse: businessClass[13].음식 === 'Dcourse',
              Ecourse: businessClass[13].음식 === 'Ecourse',
              Fcourse: businessClass[13].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[13].좌석 }}
          </div>
        </div>
        <div class="seat-row-business">
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[14].음식 === 'Acourse',
              Bcourse: businessClass[14].음식 === 'Bcourse',
              Ccourse: businessClass[14].음식 === 'Ccourse',
              Dcourse: businessClass[14].음식 === 'Dcourse',
              Ecourse: businessClass[14].음식 === 'Ecourse',
              Fcourse: businessClass[14].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[14].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[15].음식 === 'Acourse',
              Bcourse: businessClass[15].음식 === 'Bcourse',
              Ccourse: businessClass[15].음식 === 'Ccourse',
              Dcourse: businessClass[15].음식 === 'Dcourse',
              Ecourse: businessClass[15].음식 === 'Ecourse',
              Fcourse: businessClass[15].음식 === 'Fcourse',
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
              Ccourse: businessClass[16].음식 === 'Ccourse',
              Dcourse: businessClass[16].음식 === 'Dcourse',
              Ecourse: businessClass[16].음식 === 'Ecourse',
              Fcourse: businessClass[16].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[16].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[17].음식 === 'Acourse',
              Bcourse: businessClass[17].음식 === 'Bcourse',
              Ccourse: businessClass[17].음식 === 'Ccourse',
              Dcourse: businessClass[17].음식 === 'Dcourse',
              Ecourse: businessClass[17].음식 === 'Ecourse',
              Fcourse: businessClass[17].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[17].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[18].음식 === 'Acourse',
              Bcourse: businessClass[18].음식 === 'Bcourse',
              Ccourse: businessClass[18].음식 === 'Ccourse',
              Dcourse: businessClass[18].음식 === 'Dcourse',
              Ecourse: businessClass[18].음식 === 'Ecourse',
              Fcourse: businessClass[18].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[18].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[19].음식 === 'Acourse',
              Bcourse: businessClass[19].음식 === 'Bcourse',
              Ccourse: businessClass[19].음식 === 'Ccourse',
              Dcourse: businessClass[19].음식 === 'Dcourse',
              Ecourse: businessClass[19].음식 === 'Ecourse',
              Fcourse: businessClass[19].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[19].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[20].음식 === 'Acourse',
              Bcourse: businessClass[20].음식 === 'Bcourse',
              Ccourse: businessClass[20].음식 === 'Ccourse',
              Dcourse: businessClass[20].음식 === 'Dcourse',
              Ecourse: businessClass[20].음식 === 'Ecourse',
              Fcourse: businessClass[20].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[20].좌석 }}
          </div>
        </div>
        <div class="seat-row-business">
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[21].음식 === 'Acourse',
              Bcourse: businessClass[21].음식 === 'Bcourse',
              Ccourse: businessClass[21].음식 === 'Ccourse',
              Dcourse: businessClass[21].음식 === 'Dcourse',
              Ecourse: businessClass[21].음식 === 'Ecourse',
              Fcourse: businessClass[21].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[21].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[22].음식 === 'Acourse',
              Bcourse: businessClass[22].음식 === 'Bcourse',
              Ccourse: businessClass[22].음식 === 'Ccourse',
              Dcourse: businessClass[22].음식 === 'Dcourse',
              Ecourse: businessClass[22].음식 === 'Ecourse',
              Fcourse: businessClass[22].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[22].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[23].음식 === 'Acourse',
              Bcourse: businessClass[23].음식 === 'Bcourse',
              Ccourse: businessClass[23].음식 === 'Ccourse',
              Dcourse: businessClass[23].음식 === 'Dcourse',
              Ecourse: businessClass[23].음식 === 'Ecourse',
              Fcourse: businessClass[23].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[23].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[24].음식 === 'Acourse',
              Bcourse: businessClass[24].음식 === 'Bcourse',
              Ccourse: businessClass[24].음식 === 'Ccourse',
              Dcourse: businessClass[24].음식 === 'Dcourse',
              Ecourse: businessClass[24].음식 === 'Ecourse',
              Fcourse: businessClass[24].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[24].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[25].음식 === 'Acourse',
              Bcourse: businessClass[25].음식 === 'Bcourse',
              Ccourse: businessClass[25].음식 === 'Ccourse',
              Dcourse: businessClass[25].음식 === 'Dcourse',
              Ecourse: businessClass[25].음식 === 'Ecourse',
              Fcourse: businessClass[25].음식 === 'Fcourse',
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
              Ccourse: businessClass[26].음식 === 'Ccourse',
              Dcourse: businessClass[26].음식 === 'Dcourse',
              Ecourse: businessClass[26].음식 === 'Ecourse',
              Fcourse: businessClass[26].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[26].좌석 }}
          </div>
          <div
            class="seat-business"
            :class="{
              Acourse: businessClass[27].음식 === 'Acourse',
              Bcourse: businessClass[27].음식 === 'Bcourse',
              Ccourse: businessClass[27].음식 === 'Ccourse',
              Dcourse: businessClass[27].음식 === 'Dcourse',
              Ecourse: businessClass[27].음식 === 'Ecourse',
              Fcourse: businessClass[27].음식 === 'Fcourse',
            }"
          >
            {{ businessClass[27].좌석 }}
          </div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'EconomyA'" class="seats-econnomy-A-container">
      <h1>{{ section }}</h1>
      <div v-bind="economyClass" class="seat-wrap3">
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[0].음식 === 'Acourse',
              Bcourse: economyClass[0].음식 === 'Bcourse',
              Ccourse: economyClass[0].음식 === 'Ccourse',
              Dcourse: economyClass[0].음식 === 'Dcourse',
              Ecourse: economyClass[0].음식 === 'Ecourse',
              Fcourse: economyClass[0].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[0].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[1].음식 === 'Acourse',
              Bcourse: economyClass[1].음식 === 'Bcourse',
              Ccourse: economyClass[1].음식 === 'Ccourse',
              Dcourse: economyClass[1].음식 === 'Dcourse',
              Ecourse: economyClass[1].음식 === 'Ecourse',
              Fcourse: economyClass[1].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[1].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[2].음식 === 'Acourse',
              Bcourse: economyClass[2].음식 === 'Bcourse',
              Ccourse: economyClass[2].음식 === 'Ccourse',
              Dcourse: economyClass[2].음식 === 'Dcourse',
              Ecourse: economyClass[2].음식 === 'Ecourse',
              Fcourse: economyClass[2].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[2].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[3].음식 === 'Acourse',
              Bcourse: economyClass[3].음식 === 'Bcourse',
              Ccourse: economyClass[3].음식 === 'Ccourse',
              Dcourse: economyClass[3].음식 === 'Dcourse',
              Ecourse: economyClass[3].음식 === 'Ecourse',
              Fcourse: economyClass[3].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[3].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[4].음식 === 'Acourse',
              Bcourse: economyClass[4].음식 === 'Bcourse',
              Ccourse: economyClass[4].음식 === 'Ccourse',
              Dcourse: economyClass[4].음식 === 'Dcourse',
              Ecourse: economyClass[4].음식 === 'Ecourse',
              Fcourse: economyClass[4].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[4].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[5].음식 === 'Acourse',
              Bcourse: economyClass[5].음식 === 'Bcourse',
              Ccourse: economyClass[5].음식 === 'Ccourse',
              Dcourse: economyClass[5].음식 === 'Dcourse',
              Ecourse: economyClass[5].음식 === 'Ecourse',
              Fcourse: economyClass[5].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[5].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[6].음식 === 'Acourse',
              Bcourse: economyClass[6].음식 === 'Bcourse',
              Ccourse: economyClass[6].음식 === 'Ccourse',
              Dcourse: economyClass[6].음식 === 'Dcourse',
              Ecourse: economyClass[6].음식 === 'Ecourse',
              Fcourse: economyClass[6].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[6].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[7].음식 === 'Acourse',
              Bcourse: economyClass[7].음식 === 'Bcourse',
              Ccourse: economyClass[7].음식 === 'Ccourse',
              Dcourse: economyClass[7].음식 === 'Dcourse',
              Ecourse: economyClass[7].음식 === 'Ecourse',
              Fcourse: economyClass[7].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[7].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[8].음식 === 'Acourse',
              Bcourse: economyClass[8].음식 === 'Bcourse',
              Ccourse: economyClass[8].음식 === 'Ccourse',
              Dcourse: economyClass[8].음식 === 'Dcourse',
              Ecourse: economyClass[8].음식 === 'Ecourse',
              Fcourse: economyClass[8].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[8].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[9].음식 === 'Acourse',
              Bcourse: economyClass[9].음식 === 'Bcourse',
              Ccourse: economyClass[9].음식 === 'Ccourse',
              Dcourse: economyClass[9].음식 === 'Dcourse',
              Ecourse: economyClass[9].음식 === 'Ecourse',
              Fcourse: economyClass[9].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[9].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[10].음식 === 'Acourse',
              Bcourse: economyClass[10].음식 === 'Bcourse',
              Ccourse: economyClass[10].음식 === 'Ccourse',
              Dcourse: economyClass[10].음식 === 'Dcourse',
              Ecourse: economyClass[10].음식 === 'Ecourse',
              Fcourse: economyClass[10].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[10].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[11].음식 === 'Acourse',
              Bcourse: economyClass[11].음식 === 'Bcourse',
              Ccourse: economyClass[11].음식 === 'Ccourse',
              Dcourse: economyClass[11].음식 === 'Dcourse',
              Ecourse: economyClass[11].음식 === 'Ecourse',
              Fcourse: economyClass[11].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[11].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[12].음식 === 'Acourse',
              Bcourse: economyClass[12].음식 === 'Bcourse',
              Ccourse: economyClass[12].음식 === 'Ccourse',
              Dcourse: economyClass[12].음식 === 'Dcourse',
              Ecourse: economyClass[12].음식 === 'Ecourse',
              Fcourse: economyClass[12].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[12].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[13].음식 === 'Acourse',
              Bcourse: economyClass[13].음식 === 'Bcourse',
              Ccourse: economyClass[13].음식 === 'Ccourse',
              Dcourse: economyClass[13].음식 === 'Dcourse',
              Ecourse: economyClass[13].음식 === 'Ecourse',
              Fcourse: economyClass[13].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[13].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[14].음식 === 'Acourse',
              Bcourse: economyClass[14].음식 === 'Bcourse',
              Ccourse: economyClass[14].음식 === 'Ccourse',
              Dcourse: economyClass[14].음식 === 'Dcourse',
              Ecourse: economyClass[14].음식 === 'Ecourse',
              Fcourse: economyClass[14].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[14].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[15].음식 === 'Acourse',
              Bcourse: economyClass[15].음식 === 'Bcourse',
              Ccourse: economyClass[15].음식 === 'Ccourse',
              Dcourse: economyClass[15].음식 === 'Dcourse',
              Ecourse: economyClass[15].음식 === 'Ecourse',
              Fcourse: economyClass[15].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[15].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[16].음식 === 'Acourse',
              Bcourse: economyClass[16].음식 === 'Bcourse',
              Ccourse: economyClass[16].음식 === 'Ccourse',
              Dcourse: economyClass[16].음식 === 'Dcourse',
              Ecourse: economyClass[16].음식 === 'Ecourse',
              Fcourse: economyClass[16].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[16].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[17].음식 === 'Acourse',
              Bcourse: economyClass[17].음식 === 'Bcourse',
              Ccourse: economyClass[17].음식 === 'Ccourse',
              Dcourse: economyClass[17].음식 === 'Dcourse',
              Ecourse: economyClass[17].음식 === 'Ecourse',
              Fcourse: economyClass[17].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[17].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[18].음식 === 'Acourse',
              Bcourse: economyClass[18].음식 === 'Bcourse',
              Ccourse: economyClass[18].음식 === 'Ccourse',
              Dcourse: economyClass[18].음식 === 'Dcourse',
              Ecourse: economyClass[18].음식 === 'Ecourse',
              Fcourse: economyClass[18].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[18].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[19].음식 === 'Acourse',
              Bcourse: economyClass[19].음식 === 'Bcourse',
              Ccourse: economyClass[19].음식 === 'Ccourse',
              Dcourse: economyClass[19].음식 === 'Dcourse',
              Ecourse: economyClass[19].음식 === 'Ecourse',
              Fcourse: economyClass[19].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[19].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[20].음식 === 'Acourse',
              Bcourse: economyClass[20].음식 === 'Bcourse',
              Ccourse: economyClass[20].음식 === 'Ccourse',
              Dcourse: economyClass[20].음식 === 'Dcourse',
              Ecourse: economyClass[20].음식 === 'Ecourse',
              Fcourse: economyClass[20].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[20].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[21].음식 === 'Acourse',
              Bcourse: economyClass[21].음식 === 'Bcourse',
              Ccourse: economyClass[21].음식 === 'Ccourse',
              Dcourse: economyClass[21].음식 === 'Dcourse',
              Ecourse: economyClass[21].음식 === 'Ecourse',
              Fcourse: economyClass[21].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[21].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[22].음식 === 'Acourse',
              Bcourse: economyClass[22].음식 === 'Bcourse',
              Ccourse: economyClass[22].음식 === 'Ccourse',
              Dcourse: economyClass[22].음식 === 'Dcourse',
              Ecourse: economyClass[22].음식 === 'Ecourse',
              Fcourse: economyClass[22].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[22].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[23].음식 === 'Acourse',
              Bcourse: economyClass[23].음식 === 'Bcourse',
              Ccourse: economyClass[23].음식 === 'Ccourse',
              Dcourse: economyClass[23].음식 === 'Dcourse',
              Ecourse: economyClass[23].음식 === 'Ecourse',
              Fcourse: economyClass[23].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[23].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[24].음식 === 'Acourse',
              Bcourse: economyClass[24].음식 === 'Bcourse',
              Ccourse: economyClass[24].음식 === 'Ccourse',
              Dcourse: economyClass[24].음식 === 'Dcourse',
              Ecourse: economyClass[24].음식 === 'Ecourse',
              Fcourse: economyClass[24].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[24].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[25].음식 === 'Acourse',
              Bcourse: economyClass[25].음식 === 'Bcourse',
              Ccourse: economyClass[25].음식 === 'Ccourse',
              Dcourse: economyClass[25].음식 === 'Dcourse',
              Ecourse: economyClass[25].음식 === 'Ecourse',
              Fcourse: economyClass[25].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[25].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[26].음식 === 'Acourse',
              Bcourse: economyClass[26].음식 === 'Bcourse',
              Ccourse: economyClass[26].음식 === 'Ccourse',
              Dcourse: economyClass[26].음식 === 'Dcourse',
              Ecourse: economyClass[26].음식 === 'Ecourse',
              Fcourse: economyClass[26].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[26].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[27].음식 === 'Acourse',
              Bcourse: economyClass[27].음식 === 'Bcourse',
              Ccourse: economyClass[27].음식 === 'Ccourse',
              Dcourse: economyClass[27].음식 === 'Dcourse',
              Ecourse: economyClass[27].음식 === 'Ecourse',
              Fcourse: economyClass[27].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[27].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[28].음식 === 'Acourse',
              Bcourse: economyClass[28].음식 === 'Bcourse',
              Ccourse: economyClass[28].음식 === 'Ccourse',
              Dcourse: economyClass[28].음식 === 'Dcourse',
              Ecourse: economyClass[28].음식 === 'Ecourse',
              Fcourse: economyClass[28].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[28].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[29].음식 === 'Acourse',
              Bcourse: economyClass[29].음식 === 'Bcourse',
              Ccourse: economyClass[29].음식 === 'Ccourse',
              Dcourse: economyClass[29].음식 === 'Dcourse',
              Ecourse: economyClass[29].음식 === 'Ecourse',
              Fcourse: economyClass[29].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[29].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[30].음식 === 'Acourse',
              Bcourse: economyClass[30].음식 === 'Bcourse',
              Ccourse: economyClass[30].음식 === 'Ccourse',
              Dcourse: economyClass[30].음식 === 'Dcourse',
              Ecourse: economyClass[30].음식 === 'Ecourse',
              Fcourse: economyClass[30].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[30].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[31].음식 === 'Acourse',
              Bcourse: economyClass[31].음식 === 'Bcourse',
              Ccourse: economyClass[31].음식 === 'Ccourse',
              Dcourse: economyClass[31].음식 === 'Dcourse',
              Ecourse: economyClass[31].음식 === 'Ecourse',
              Fcourse: economyClass[31].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[31].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[32].음식 === 'Acourse',
              Bcourse: economyClass[32].음식 === 'Bcourse',
              Ccourse: economyClass[32].음식 === 'Ccourse',
              Dcourse: economyClass[32].음식 === 'Dcourse',
              Ecourse: economyClass[32].음식 === 'Ecourse',
              Fcourse: economyClass[32].음식 === 'Fcourse',
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
              Ccourse: economyClass[33].음식 === 'Ccourse',
              Dcourse: economyClass[33].음식 === 'Dcourse',
              Ecourse: economyClass[33].음식 === 'Ecourse',
              Fcourse: economyClass[33].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[33].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[34].음식 === 'Acourse',
              Bcourse: economyClass[34].음식 === 'Bcourse',
              Ccourse: economyClass[34].음식 === 'Ccourse',
              Dcourse: economyClass[34].음식 === 'Dcourse',
              Ecourse: economyClass[34].음식 === 'Ecourse',
              Fcourse: economyClass[34].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[34].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[35].음식 === 'Acourse',
              Bcourse: economyClass[35].음식 === 'Bcourse',
              Ccourse: economyClass[35].음식 === 'Ccourse',
              Dcourse: economyClass[35].음식 === 'Dcourse',
              Ecourse: economyClass[35].음식 === 'Ecourse',
              Fcourse: economyClass[35].음식 === 'Fcourse',
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
              Ccourse: economyClass[36].음식 === 'Ccourse',
              Dcourse: economyClass[36].음식 === 'Dcourse',
              Ecourse: economyClass[36].음식 === 'Ecourse',
              Fcourse: economyClass[36].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[36].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[37].음식 === 'Acourse',
              Bcourse: economyClass[37].음식 === 'Bcourse',
              Ccourse: economyClass[37].음식 === 'Ccourse',
              Dcourse: economyClass[37].음식 === 'Dcourse',
              Ecourse: economyClass[37].음식 === 'Ecourse',
              Fcourse: economyClass[37].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[37].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[38].음식 === 'Acourse',
              Bcourse: economyClass[38].음식 === 'Bcourse',
              Ccourse: economyClass[38].음식 === 'Ccourse',
              Dcourse: economyClass[38].음식 === 'Dcourse',
              Ecourse: economyClass[38].음식 === 'Ecourse',
              Fcourse: economyClass[38].음식 === 'Fcourse',
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
              Ccourse: economyClass[39].음식 === 'Ccourse',
              Dcourse: economyClass[39].음식 === 'Dcourse',
              Ecourse: economyClass[39].음식 === 'Ecourse',
              Fcourse: economyClass[39].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[39].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[40].음식 === 'Acourse',
              Bcourse: economyClass[40].음식 === 'Bcourse',
              Ccourse: economyClass[40].음식 === 'Ccourse',
              Dcourse: economyClass[40].음식 === 'Dcourse',
              Ecourse: economyClass[40].음식 === 'Ecourse',
              Fcourse: economyClass[40].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[40].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[41].음식 === 'Acourse',
              Bcourse: economyClass[41].음식 === 'Bcourse',
              Ccourse: economyClass[41].음식 === 'Ccourse',
              Dcourse: economyClass[41].음식 === 'Dcourse',
              Ecourse: economyClass[41].음식 === 'Ecourse',
              Fcourse: economyClass[41].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[41].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[42].음식 === 'Acourse',
              Bcourse: economyClass[42].음식 === 'Bcourse',
              Ccourse: economyClass[42].음식 === 'Ccourse',
              Dcourse: economyClass[42].음식 === 'Dcourse',
              Ecourse: economyClass[42].음식 === 'Ecourse',
              Fcourse: economyClass[42].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[42].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[43].음식 === 'Acourse',
              Bcourse: economyClass[43].음식 === 'Bcourse',
              Ccourse: economyClass[43].음식 === 'Ccourse',
              Dcourse: economyClass[43].음식 === 'Dcourse',
              Ecourse: economyClass[43].음식 === 'Ecourse',
              Fcourse: economyClass[43].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[43].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[44].음식 === 'Acourse',
              Bcourse: economyClass[44].음식 === 'Bcourse',
              Ccourse: economyClass[44].음식 === 'Ccourse',
              Dcourse: economyClass[44].음식 === 'Dcourse',
              Ecourse: economyClass[44].음식 === 'Ecourse',
              Fcourse: economyClass[44].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[44].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[45].음식 === 'Acourse',
              Bcourse: economyClass[45].음식 === 'Bcourse',
              Ccourse: economyClass[45].음식 === 'Ccourse',
              Dcourse: economyClass[45].음식 === 'Dcourse',
              Ecourse: economyClass[45].음식 === 'Ecourse',
              Fcourse: economyClass[45].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[45].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[46].음식 === 'Acourse',
              Bcourse: economyClass[46].음식 === 'Bcourse',
              Ccourse: economyClass[46].음식 === 'Ccourse',
              Dcourse: economyClass[46].음식 === 'Dcourse',
              Ecourse: economyClass[46].음식 === 'Ecourse',
              Fcourse: economyClass[46].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[46].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[47].음식 === 'Acourse',
              Bcourse: economyClass[47].음식 === 'Bcourse',
              Ccourse: economyClass[47].음식 === 'Ccourse',
              Dcourse: economyClass[47].음식 === 'Dcourse',
              Ecourse: economyClass[47].음식 === 'Ecourse',
              Fcourse: economyClass[47].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[47].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[48].음식 === 'Acourse',
              Bcourse: economyClass[48].음식 === 'Bcourse',
              Ccourse: economyClass[48].음식 === 'Ccourse',
              Dcourse: economyClass[48].음식 === 'Dcourse',
              Ecourse: economyClass[48].음식 === 'Ecourse',
              Fcourse: economyClass[48].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[48].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[49].음식 === 'Acourse',
              Bcourse: economyClass[49].음식 === 'Bcourse',
              Ccourse: economyClass[49].음식 === 'Ccourse',
              Dcourse: economyClass[49].음식 === 'Dcourse',
              Ecourse: economyClass[49].음식 === 'Ecourse',
              Fcourse: economyClass[49].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[49].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[50].음식 === 'Acourse',
              Bcourse: economyClass[50].음식 === 'Bcourse',
              Ccourse: economyClass[50].음식 === 'Ccourse',
              Dcourse: economyClass[50].음식 === 'Dcourse',
              Ecourse: economyClass[50].음식 === 'Ecourse',
              Fcourse: economyClass[50].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[50].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[51].음식 === 'Acourse',
              Bcourse: economyClass[51].음식 === 'Bcourse',
              Ccourse: economyClass[51].음식 === 'Ccourse',
              Dcourse: economyClass[51].음식 === 'Dcourse',
              Ecourse: economyClass[51].음식 === 'Ecourse',
              Fcourse: economyClass[51].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[51].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[52].음식 === 'Acourse',
              Bcourse: economyClass[52].음식 === 'Bcourse',
              Ccourse: economyClass[52].음식 === 'Ccourse',
              Dcourse: economyClass[52].음식 === 'Dcourse',
              Ecourse: economyClass[52].음식 === 'Ecourse',
              Fcourse: economyClass[52].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[52].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[53].음식 === 'Acourse',
              Bcourse: economyClass[53].음식 === 'Bcourse',
              Ccourse: economyClass[53].음식 === 'Ccourse',
              Dcourse: economyClass[53].음식 === 'Dcourse',
              Ecourse: economyClass[53].음식 === 'Ecourse',
              Fcourse: economyClass[53].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[53].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[54].음식 === 'Acourse',
              Bcourse: economyClass[54].음식 === 'Bcourse',
              Ccourse: economyClass[54].음식 === 'Ccourse',
              Dcourse: economyClass[54].음식 === 'Dcourse',
              Ecourse: economyClass[54].음식 === 'Ecourse',
              Fcourse: economyClass[54].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[54].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[55].음식 === 'Acourse',
              Bcourse: economyClass[55].음식 === 'Bcourse',
              Ccourse: economyClass[55].음식 === 'Ccourse',
              Dcourse: economyClass[55].음식 === 'Dcourse',
              Ecourse: economyClass[55].음식 === 'Ecourse',
              Fcourse: economyClass[55].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[55].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[56].음식 === 'Acourse',
              Bcourse: economyClass[56].음식 === 'Bcourse',
              Ccourse: economyClass[56].음식 === 'Ccourse',
              Dcourse: economyClass[56].음식 === 'Dcourse',
              Ecourse: economyClass[56].음식 === 'Ecourse',
              Fcourse: economyClass[56].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[56].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[57].음식 === 'Acourse',
              Bcourse: economyClass[57].음식 === 'Bcourse',
              Ccourse: economyClass[57].음식 === 'Ccourse',
              Dcourse: economyClass[57].음식 === 'Dcourse',
              Ecourse: economyClass[57].음식 === 'Ecourse',
              Fcourse: economyClass[57].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[57].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[58].음식 === 'Acourse',
              Bcourse: economyClass[58].음식 === 'Bcourse',
              Ccourse: economyClass[58].음식 === 'Ccourse',
              Dcourse: economyClass[58].음식 === 'Dcourse',
              Ecourse: economyClass[58].음식 === 'Ecourse',
              Fcourse: economyClass[58].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[58].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[59].음식 === 'Acourse',
              Bcourse: economyClass[59].음식 === 'Bcourse',
              Ccourse: economyClass[59].음식 === 'Ccourse',
              Dcourse: economyClass[59].음식 === 'Dcourse',
              Ecourse: economyClass[59].음식 === 'Ecourse',
              Fcourse: economyClass[59].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[59].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[60].음식 === 'Acourse',
              Bcourse: economyClass[60].음식 === 'Bcourse',
              Ccourse: economyClass[60].음식 === 'Ccourse',
              Dcourse: economyClass[60].음식 === 'Dcourse',
              Ecourse: economyClass[60].음식 === 'Ecourse',
              Fcourse: economyClass[60].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[60].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[61].음식 === 'Acourse',
              Bcourse: economyClass[61].음식 === 'Bcourse',
              Ccourse: economyClass[61].음식 === 'Ccourse',
              Dcourse: economyClass[61].음식 === 'Dcourse',
              Ecourse: economyClass[61].음식 === 'Ecourse',
              Fcourse: economyClass[61].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[61].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[62].음식 === 'Acourse',
              Bcourse: economyClass[62].음식 === 'Bcourse',
              Ccourse: economyClass[62].음식 === 'Ccourse',
              Dcourse: economyClass[62].음식 === 'Dcourse',
              Ecourse: economyClass[62].음식 === 'Ecourse',
              Fcourse: economyClass[62].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[62].좌석 }}
          </div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'EconomyB'" class="seats-econnomy-B-container">
      <h1>{{ section }}</h1>
      <div v-bind="economyClass" class="seat-wrap3">
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[63].음식 === 'Acourse',
              Bcourse: economyClass[63].음식 === 'Bcourse',
              Ccourse: economyClass[63].음식 === 'Ccourse',
              Dcourse: economyClass[63].음식 === 'Dcourse',
              Ecourse: economyClass[63].음식 === 'Ecourse',
              Fcourse: economyClass[63].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[63].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[64].음식 === 'Acourse',
              Bcourse: economyClass[64].음식 === 'Bcourse',
              Ccourse: economyClass[64].음식 === 'Ccourse',
              Dcourse: economyClass[64].음식 === 'Dcourse',
              Ecourse: economyClass[64].음식 === 'Ecourse',
              Fcourse: economyClass[64].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[64].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[65].음식 === 'Acourse',
              Bcourse: economyClass[65].음식 === 'Bcourse',
              Ccourse: economyClass[65].음식 === 'Ccourse',
              Dcourse: economyClass[65].음식 === 'Dcourse',
              Ecourse: economyClass[65].음식 === 'Ecourse',
              Fcourse: economyClass[65].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[65].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[66].음식 === 'Acourse',
              Bcourse: economyClass[66].음식 === 'Bcourse',
              Ccourse: economyClass[66].음식 === 'Ccourse',
              Dcourse: economyClass[66].음식 === 'Dcourse',
              Ecourse: economyClass[66].음식 === 'Ecourse',
              Fcourse: economyClass[66].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[66].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[67].음식 === 'Acourse',
              Bcourse: economyClass[67].음식 === 'Bcourse',
              Ccourse: economyClass[67].음식 === 'Ccourse',
              Dcourse: economyClass[67].음식 === 'Dcourse',
              Ecourse: economyClass[67].음식 === 'Ecourse',
              Fcourse: economyClass[67].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[67].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[68].음식 === 'Acourse',
              Bcourse: economyClass[68].음식 === 'Bcourse',
              Ccourse: economyClass[68].음식 === 'Ccourse',
              Dcourse: economyClass[68].음식 === 'Dcourse',
              Ecourse: economyClass[68].음식 === 'Ecourse',
              Fcourse: economyClass[68].음식 === 'Fcourse',
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
              Ccourse: economyClass[69].음식 === 'Ccourse',
              Dcourse: economyClass[69].음식 === 'Dcourse',
              Ecourse: economyClass[69].음식 === 'Ecourse',
              Fcourse: economyClass[69].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[69].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[70].음식 === 'Acourse',
              Bcourse: economyClass[70].음식 === 'Bcourse',
              Ccourse: economyClass[70].음식 === 'Ccourse',
              Dcourse: economyClass[70].음식 === 'Dcourse',
              Ecourse: economyClass[70].음식 === 'Ecourse',
              Fcourse: economyClass[70].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[70].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[71].음식 === 'Acourse',
              Bcourse: economyClass[71].음식 === 'Bcourse',
              Ccourse: economyClass[71].음식 === 'Ccourse',
              Dcourse: economyClass[71].음식 === 'Dcourse',
              Ecourse: economyClass[71].음식 === 'Ecourse',
              Fcourse: economyClass[71].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[71].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[72].음식 === 'Acourse',
              Bcourse: economyClass[72].음식 === 'Bcourse',
              Ccourse: economyClass[72].음식 === 'Ccourse',
              Dcourse: economyClass[72].음식 === 'Dcourse',
              Ecourse: economyClass[72].음식 === 'Ecourse',
              Fcourse: economyClass[72].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[72].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[73].음식 === 'Acourse',
              Bcourse: economyClass[73].음식 === 'Bcourse',
              Ccourse: economyClass[73].음식 === 'Ccourse',
              Dcourse: economyClass[73].음식 === 'Dcourse',
              Ecourse: economyClass[73].음식 === 'Ecourse',
              Fcourse: economyClass[73].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[73].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[74].음식 === 'Acourse',
              Bcourse: economyClass[74].음식 === 'Bcourse',
              Ccourse: economyClass[74].음식 === 'Ccourse',
              Dcourse: economyClass[74].음식 === 'Dcourse',
              Ecourse: economyClass[74].음식 === 'Ecourse',
              Fcourse: economyClass[74].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[74].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[75].음식 === 'Acourse',
              Bcourse: economyClass[75].음식 === 'Bcourse',
              Ccourse: economyClass[75].음식 === 'Ccourse',
              Dcourse: economyClass[75].음식 === 'Dcourse',
              Ecourse: economyClass[75].음식 === 'Ecourse',
              Fcourse: economyClass[75].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[75].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[76].음식 === 'Acourse',
              Bcourse: economyClass[76].음식 === 'Bcourse',
              Ccourse: economyClass[76].음식 === 'Ccourse',
              Dcourse: economyClass[76].음식 === 'Dcourse',
              Ecourse: economyClass[76].음식 === 'Ecourse',
              Fcourse: economyClass[76].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[76].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[77].음식 === 'Acourse',
              Bcourse: economyClass[77].음식 === 'Bcourse',
              Ccourse: economyClass[77].음식 === 'Ccourse',
              Dcourse: economyClass[77].음식 === 'Dcourse',
              Ecourse: economyClass[77].음식 === 'Ecourse',
              Fcourse: economyClass[77].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[77].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[78].음식 === 'Acourse',
              Bcourse: economyClass[78].음식 === 'Bcourse',
              Ccourse: economyClass[78].음식 === 'Ccourse',
              Dcourse: economyClass[78].음식 === 'Dcourse',
              Ecourse: economyClass[78].음식 === 'Ecourse',
              Fcourse: economyClass[78].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[78].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[79].음식 === 'Acourse',
              Bcourse: economyClass[79].음식 === 'Bcourse',
              Ccourse: economyClass[79].음식 === 'Ccourse',
              Dcourse: economyClass[79].음식 === 'Dcourse',
              Ecourse: economyClass[79].음식 === 'Ecourse',
              Fcourse: economyClass[79].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[79].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[80].음식 === 'Acourse',
              Bcourse: economyClass[80].음식 === 'Bcourse',
              Ccourse: economyClass[80].음식 === 'Ccourse',
              Dcourse: economyClass[80].음식 === 'Dcourse',
              Ecourse: economyClass[80].음식 === 'Ecourse',
              Fcourse: economyClass[80].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[80].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[81].음식 === 'Acourse',
              Bcourse: economyClass[81].음식 === 'Bcourse',
              Ccourse: economyClass[81].음식 === 'Ccourse',
              Dcourse: economyClass[81].음식 === 'Dcourse',
              Ecourse: economyClass[81].음식 === 'Ecourse',
              Fcourse: economyClass[81].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[81].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[82].음식 === 'Acourse',
              Bcourse: economyClass[82].음식 === 'Bcourse',
              Ccourse: economyClass[82].음식 === 'Ccourse',
              Dcourse: economyClass[82].음식 === 'Dcourse',
              Ecourse: economyClass[82].음식 === 'Ecourse',
              Fcourse: economyClass[82].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[82].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[83].음식 === 'Acourse',
              Bcourse: economyClass[83].음식 === 'Bcourse',
              Ccourse: economyClass[83].음식 === 'Ccourse',
              Dcourse: economyClass[83].음식 === 'Dcourse',
              Ecourse: economyClass[83].음식 === 'Ecourse',
              Fcourse: economyClass[83].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[83].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[84].음식 === 'Acourse',
              Bcourse: economyClass[84].음식 === 'Bcourse',
              Ccourse: economyClass[84].음식 === 'Ccourse',
              Dcourse: economyClass[84].음식 === 'Dcourse',
              Ecourse: economyClass[84].음식 === 'Ecourse',
              Fcourse: economyClass[84].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[84].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[85].음식 === 'Acourse',
              Bcourse: economyClass[85].음식 === 'Bcourse',
              Ccourse: economyClass[85].음식 === 'Ccourse',
              Dcourse: economyClass[85].음식 === 'Dcourse',
              Ecourse: economyClass[85].음식 === 'Ecourse',
              Fcourse: economyClass[85].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[85].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[86].음식 === 'Acourse',
              Bcourse: economyClass[86].음식 === 'Bcourse',
              Ccourse: economyClass[86].음식 === 'Ccourse',
              Dcourse: economyClass[86].음식 === 'Dcourse',
              Ecourse: economyClass[86].음식 === 'Ecourse',
              Fcourse: economyClass[86].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[86].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[87].음식 === 'Acourse',
              Bcourse: economyClass[87].음식 === 'Bcourse',
              Ccourse: economyClass[87].음식 === 'Ccourse',
              Dcourse: economyClass[87].음식 === 'Dcourse',
              Ecourse: economyClass[87].음식 === 'Ecourse',
              Fcourse: economyClass[87].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[87].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[88].음식 === 'Acourse',
              Bcourse: economyClass[88].음식 === 'Bcourse',
              Ccourse: economyClass[88].음식 === 'Ccourse',
              Dcourse: economyClass[88].음식 === 'Dcourse',
              Ecourse: economyClass[88].음식 === 'Ecourse',
              Fcourse: economyClass[88].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[88].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[89].음식 === 'Acourse',
              Bcourse: economyClass[89].음식 === 'Bcourse',
              Ccourse: economyClass[89].음식 === 'Ccourse',
              Dcourse: economyClass[89].음식 === 'Dcourse',
              Ecourse: economyClass[89].음식 === 'Ecourse',
              Fcourse: economyClass[89].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[89].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[90].음식 === 'Acourse',
              Bcourse: economyClass[90].음식 === 'Bcourse',
              Ccourse: economyClass[90].음식 === 'Ccourse',
              Dcourse: economyClass[90].음식 === 'Dcourse',
              Ecourse: economyClass[90].음식 === 'Ecourse',
              Fcourse: economyClass[90].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[90].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[91].음식 === 'Acourse',
              Bcourse: economyClass[91].음식 === 'Bcourse',
              Ccourse: economyClass[91].음식 === 'Ccourse',
              Dcourse: economyClass[91].음식 === 'Dcourse',
              Ecourse: economyClass[91].음식 === 'Ecourse',
              Fcourse: economyClass[91].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[91].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[92].음식 === 'Acourse',
              Bcourse: economyClass[92].음식 === 'Bcourse',
              Ccourse: economyClass[92].음식 === 'Ccourse',
              Dcourse: economyClass[92].음식 === 'Dcourse',
              Ecourse: economyClass[92].음식 === 'Ecourse',
              Fcourse: economyClass[92].음식 === 'Fcourse',
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
              Ccourse: economyClass[93].음식 === 'Ccourse',
              Dcourse: economyClass[93].음식 === 'Dcourse',
              Ecourse: economyClass[93].음식 === 'Ecourse',
              Fcourse: economyClass[93].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[93].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[94].음식 === 'Acourse',
              Bcourse: economyClass[94].음식 === 'Bcourse',
              Ccourse: economyClass[94].음식 === 'Ccourse',
              Dcourse: economyClass[94].음식 === 'Dcourse',
              Ecourse: economyClass[94].음식 === 'Ecourse',
              Fcourse: economyClass[94].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[94].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[95].음식 === 'Acourse',
              Bcourse: economyClass[95].음식 === 'Bcourse',
              Ccourse: economyClass[95].음식 === 'Ccourse',
              Dcourse: economyClass[95].음식 === 'Dcourse',
              Ecourse: economyClass[95].음식 === 'Ecourse',
              Fcourse: economyClass[95].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[95].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[96].음식 === 'Acourse',
              Bcourse: economyClass[96].음식 === 'Bcourse',
              Ccourse: economyClass[96].음식 === 'Ccourse',
              Dcourse: economyClass[96].음식 === 'Dcourse',
              Ecourse: economyClass[96].음식 === 'Ecourse',
              Fcourse: economyClass[96].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[96].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[97].음식 === 'Acourse',
              Bcourse: economyClass[97].음식 === 'Bcourse',
              Ccourse: economyClass[97].음식 === 'Ccourse',
              Dcourse: economyClass[97].음식 === 'Dcourse',
              Ecourse: economyClass[97].음식 === 'Ecourse',
              Fcourse: economyClass[97].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[97].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[98].음식 === 'Acourse',
              Bcourse: economyClass[98].음식 === 'Bcourse',
              Ccourse: economyClass[98].음식 === 'Ccourse',
              Dcourse: economyClass[98].음식 === 'Dcourse',
              Ecourse: economyClass[98].음식 === 'Ecourse',
              Fcourse: economyClass[98].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[98].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[99].음식 === 'Acourse',
              Bcourse: economyClass[99].음식 === 'Bcourse',
              Ccourse: economyClass[99].음식 === 'Ccourse',
              Dcourse: economyClass[99].음식 === 'Dcourse',
              Ecourse: economyClass[99].음식 === 'Ecourse',
              Fcourse: economyClass[99].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[99].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[100].음식 === 'Acourse',
              Bcourse: economyClass[100].음식 === 'Bcourse',
              Ccourse: economyClass[100].음식 === 'Ccourse',
              Dcourse: economyClass[100].음식 === 'Dcourse',
              Ecourse: economyClass[100].음식 === 'Ecourse',
              Fcourse: economyClass[100].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[100].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[101].음식 === 'Acourse',
              Bcourse: economyClass[101].음식 === 'Bcourse',
              Ccourse: economyClass[101].음식 === 'Ccourse',
              Dcourse: economyClass[101].음식 === 'Dcourse',
              Ecourse: economyClass[101].음식 === 'Ecourse',
              Fcourse: economyClass[101].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[101].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[102].음식 === 'Acourse',
              Bcourse: economyClass[102].음식 === 'Bcourse',
              Ccourse: economyClass[102].음식 === 'Ccourse',
              Dcourse: economyClass[102].음식 === 'Dcourse',
              Ecourse: economyClass[102].음식 === 'Ecourse',
              Fcourse: economyClass[102].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[102].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[103].음식 === 'Acourse',
              Bcourse: economyClass[103].음식 === 'Bcourse',
              Ccourse: economyClass[103].음식 === 'Ccourse',
              Dcourse: economyClass[103].음식 === 'Dcourse',
              Ecourse: economyClass[103].음식 === 'Ecourse',
              Fcourse: economyClass[103].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[103].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[104].음식 === 'Acourse',
              Bcourse: economyClass[104].음식 === 'Bcourse',
              Ccourse: economyClass[104].음식 === 'Ccourse',
              Dcourse: economyClass[104].음식 === 'Dcourse',
              Ecourse: economyClass[104].음식 === 'Ecourse',
              Fcourse: economyClass[104].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[104].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[105].음식 === 'Acourse',
              Bcourse: economyClass[105].음식 === 'Bcourse',
              Ccourse: economyClass[105].음식 === 'Ccourse',
              Dcourse: economyClass[105].음식 === 'Dcourse',
              Ecourse: economyClass[105].음식 === 'Ecourse',
              Fcourse: economyClass[105].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[105].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[106].음식 === 'Acourse',
              Bcourse: economyClass[106].음식 === 'Bcourse',
              Ccourse: economyClass[106].음식 === 'Ccourse',
              Dcourse: economyClass[106].음식 === 'Dcourse',
              Ecourse: economyClass[106].음식 === 'Ecourse',
              Fcourse: economyClass[106].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[106].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[107].음식 === 'Acourse',
              Bcourse: economyClass[107].음식 === 'Bcourse',
              Ccourse: economyClass[107].음식 === 'Ccourse',
              Dcourse: economyClass[107].음식 === 'Dcourse',
              Ecourse: economyClass[107].음식 === 'Ecourse',
              Fcourse: economyClass[107].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[107].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[108].음식 === 'Acourse',
              Bcourse: economyClass[108].음식 === 'Bcourse',
              Ccourse: economyClass[108].음식 === 'Ccourse',
              Dcourse: economyClass[108].음식 === 'Dcourse',
              Ecourse: economyClass[108].음식 === 'Ecourse',
              Fcourse: economyClass[108].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[108].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[109].음식 === 'Acourse',
              Bcourse: economyClass[109].음식 === 'Bcourse',
              Ccourse: economyClass[109].음식 === 'Ccourse',
              Dcourse: economyClass[109].음식 === 'Dcourse',
              Ecourse: economyClass[109].음식 === 'Ecourse',
              Fcourse: economyClass[109].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[109].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[110].음식 === 'Acourse',
              Bcourse: economyClass[110].음식 === 'Bcourse',
              Ccourse: economyClass[110].음식 === 'Ccourse',
              Dcourse: economyClass[110].음식 === 'Dcourse',
              Ecourse: economyClass[110].음식 === 'Ecourse',
              Fcourse: economyClass[110].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[110].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[111].음식 === 'Acourse',
              Bcourse: economyClass[111].음식 === 'Bcourse',
              Ccourse: economyClass[111].음식 === 'Ccourse',
              Dcourse: economyClass[111].음식 === 'Dcourse',
              Ecourse: economyClass[111].음식 === 'Ecourse',
              Fcourse: economyClass[111].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[111].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[112].음식 === 'Acourse',
              Bcourse: economyClass[112].음식 === 'Bcourse',
              Ccourse: economyClass[112].음식 === 'Ccourse',
              Dcourse: economyClass[112].음식 === 'Dcourse',
              Ecourse: economyClass[112].음식 === 'Ecourse',
              Fcourse: economyClass[112].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[112].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[113].음식 === 'Acourse',
              Bcourse: economyClass[113].음식 === 'Bcourse',
              Ccourse: economyClass[113].음식 === 'Ccourse',
              Dcourse: economyClass[113].음식 === 'Dcourse',
              Ecourse: economyClass[113].음식 === 'Ecourse',
              Fcourse: economyClass[113].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[113].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[114].음식 === 'Acourse',
              Bcourse: economyClass[114].음식 === 'Bcourse',
              Ccourse: economyClass[114].음식 === 'Ccourse',
              Dcourse: economyClass[114].음식 === 'Dcourse',
              Ecourse: economyClass[114].음식 === 'Ecourse',
              Fcourse: economyClass[114].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[114].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[115].음식 === 'Acourse',
              Bcourse: economyClass[115].음식 === 'Bcourse',
              Ccourse: economyClass[115].음식 === 'Ccourse',
              Dcourse: economyClass[115].음식 === 'Dcourse',
              Ecourse: economyClass[115].음식 === 'Ecourse',
              Fcourse: economyClass[115].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[115].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[116].음식 === 'Acourse',
              Bcourse: economyClass[116].음식 === 'Bcourse',
              Ccourse: economyClass[116].음식 === 'Ccourse',
              Dcourse: economyClass[116].음식 === 'Dcourse',
              Ecourse: economyClass[116].음식 === 'Ecourse',
              Fcourse: economyClass[116].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[116].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[117].음식 === 'Acourse',
              Bcourse: economyClass[117].음식 === 'Bcourse',
              Ccourse: economyClass[117].음식 === 'Ccourse',
              Dcourse: economyClass[117].음식 === 'Dcourse',
              Ecourse: economyClass[117].음식 === 'Ecourse',
              Fcourse: economyClass[117].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[117].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[118].음식 === 'Acourse',
              Bcourse: economyClass[118].음식 === 'Bcourse',
              Ccourse: economyClass[118].음식 === 'Ccourse',
              Dcourse: economyClass[118].음식 === 'Dcourse',
              Ecourse: economyClass[118].음식 === 'Ecourse',
              Fcourse: economyClass[118].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[118].좌석 }}
          </div>
          <div class="seat-economy-space"></div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[119].음식 === 'Acourse',
              Bcourse: economyClass[119].음식 === 'Bcourse',
              Ccourse: economyClass[119].음식 === 'Ccourse',
              Dcourse: economyClass[119].음식 === 'Dcourse',
              Ecourse: economyClass[119].음식 === 'Ecourse',
              Fcourse: economyClass[119].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[119].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[120].음식 === 'Acourse',
              Bcourse: economyClass[120].음식 === 'Bcourse',
              Ccourse: economyClass[120].음식 === 'Ccourse',
              Dcourse: economyClass[120].음식 === 'Dcourse',
              Ecourse: economyClass[120].음식 === 'Ecourse',
              Fcourse: economyClass[120].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[120].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[121].음식 === 'Acourse',
              Bcourse: economyClass[121].음식 === 'Bcourse',
              Ccourse: economyClass[121].음식 === 'Ccourse',
              Dcourse: economyClass[121].음식 === 'Dcourse',
              Ecourse: economyClass[121].음식 === 'Ecourse',
              Fcourse: economyClass[121].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[121].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy-space"></div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'EconomyC'" class="seats-econnomy-C-container">
      <h1>{{ section }}</h1>
      <div v-bind="economyClass" class="seat-wrap3">
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[122].음식 === 'Acourse',
              Bcourse: economyClass[122].음식 === 'Bcourse',
              Ccourse: economyClass[122].음식 === 'Ccourse',
              Dcourse: economyClass[122].음식 === 'Dcourse',
              Ecourse: economyClass[122].음식 === 'Ecourse',
              Fcourse: economyClass[122].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[122].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[123].음식 === 'Acourse',
              Bcourse: economyClass[123].음식 === 'Bcourse',
              Ccourse: economyClass[123].음식 === 'Ccourse',
              Dcourse: economyClass[123].음식 === 'Dcourse',
              Ecourse: economyClass[123].음식 === 'Ecourse',
              Fcourse: economyClass[123].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[123].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[124].음식 === 'Acourse',
              Bcourse: economyClass[124].음식 === 'Bcourse',
              Ccourse: economyClass[124].음식 === 'Ccourse',
              Dcourse: economyClass[124].음식 === 'Dcourse',
              Ecourse: economyClass[124].음식 === 'Ecourse',
              Fcourse: economyClass[124].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[124].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[125].음식 === 'Acourse',
              Bcourse: economyClass[125].음식 === 'Bcourse',
              Ccourse: economyClass[125].음식 === 'Ccourse',
              Dcourse: economyClass[125].음식 === 'Dcourse',
              Ecourse: economyClass[125].음식 === 'Ecourse',
              Fcourse: economyClass[125].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[125].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[126].음식 === 'Acourse',
              Bcourse: economyClass[126].음식 === 'Bcourse',
              Ccourse: economyClass[126].음식 === 'Ccourse',
              Dcourse: economyClass[126].음식 === 'Dcourse',
              Ecourse: economyClass[126].음식 === 'Ecourse',
              Fcourse: economyClass[126].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[126].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[127].음식 === 'Acourse',
              Bcourse: economyClass[127].음식 === 'Bcourse',
              Ccourse: economyClass[127].음식 === 'Ccourse',
              Dcourse: economyClass[127].음식 === 'Dcourse',
              Ecourse: economyClass[127].음식 === 'Ecourse',
              Fcourse: economyClass[127].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[127].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[128].음식 === 'Acourse',
              Bcourse: economyClass[128].음식 === 'Bcourse',
              Ccourse: economyClass[128].음식 === 'Ccourse',
              Dcourse: economyClass[128].음식 === 'Dcourse',
              Ecourse: economyClass[128].음식 === 'Ecourse',
              Fcourse: economyClass[128].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[128].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[129].음식 === 'Acourse',
              Bcourse: economyClass[129].음식 === 'Bcourse',
              Ccourse: economyClass[129].음식 === 'Ccourse',
              Dcourse: economyClass[129].음식 === 'Dcourse',
              Ecourse: economyClass[129].음식 === 'Ecourse',
              Fcourse: economyClass[129].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[129].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[130].음식 === 'Acourse',
              Bcourse: economyClass[130].음식 === 'Bcourse',
              Ccourse: economyClass[130].음식 === 'Ccourse',
              Dcourse: economyClass[130].음식 === 'Dcourse',
              Ecourse: economyClass[130].음식 === 'Ecourse',
              Fcourse: economyClass[130].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[130].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[131].음식 === 'Acourse',
              Bcourse: economyClass[131].음식 === 'Bcourse',
              Ccourse: economyClass[131].음식 === 'Ccourse',
              Dcourse: economyClass[131].음식 === 'Dcourse',
              Ecourse: economyClass[131].음식 === 'Ecourse',
              Fcourse: economyClass[131].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[131].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[132].음식 === 'Acourse',
              Bcourse: economyClass[132].음식 === 'Bcourse',
              Ccourse: economyClass[132].음식 === 'Ccourse',
              Dcourse: economyClass[132].음식 === 'Dcourse',
              Ecourse: economyClass[132].음식 === 'Ecourse',
              Fcourse: economyClass[132].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[132].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[133].음식 === 'Acourse',
              Bcourse: economyClass[133].음식 === 'Bcourse',
              Ccourse: economyClass[133].음식 === 'Ccourse',
              Dcourse: economyClass[133].음식 === 'Dcourse',
              Ecourse: economyClass[133].음식 === 'Ecourse',
              Fcourse: economyClass[133].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[133].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[134].음식 === 'Acourse',
              Bcourse: economyClass[134].음식 === 'Bcourse',
              Ccourse: economyClass[134].음식 === 'Ccourse',
              Dcourse: economyClass[134].음식 === 'Dcourse',
              Ecourse: economyClass[134].음식 === 'Ecourse',
              Fcourse: economyClass[134].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[134].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[135].음식 === 'Acourse',
              Bcourse: economyClass[135].음식 === 'Bcourse',
              Ccourse: economyClass[135].음식 === 'Ccourse',
              Dcourse: economyClass[135].음식 === 'Dcourse',
              Ecourse: economyClass[135].음식 === 'Ecourse',
              Fcourse: economyClass[135].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[135].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[136].음식 === 'Acourse',
              Bcourse: economyClass[136].음식 === 'Bcourse',
              Ccourse: economyClass[136].음식 === 'Ccourse',
              Dcourse: economyClass[136].음식 === 'Dcourse',
              Ecourse: economyClass[136].음식 === 'Ecourse',
              Fcourse: economyClass[136].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[136].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[137].음식 === 'Acourse',
              Bcourse: economyClass[137].음식 === 'Bcourse',
              Ccourse: economyClass[137].음식 === 'Ccourse',
              Dcourse: economyClass[137].음식 === 'Dcourse',
              Ecourse: economyClass[137].음식 === 'Ecourse',
              Fcourse: economyClass[137].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[137].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[138].음식 === 'Acourse',
              Bcourse: economyClass[138].음식 === 'Bcourse',
              Ccourse: economyClass[138].음식 === 'Ccourse',
              Dcourse: economyClass[138].음식 === 'Dcourse',
              Ecourse: economyClass[138].음식 === 'Ecourse',
              Fcourse: economyClass[138].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[138].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[139].음식 === 'Acourse',
              Bcourse: economyClass[139].음식 === 'Bcourse',
              Ccourse: economyClass[139].음식 === 'Ccourse',
              Dcourse: economyClass[139].음식 === 'Dcourse',
              Ecourse: economyClass[139].음식 === 'Ecourse',
              Fcourse: economyClass[139].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[139].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[140].음식 === 'Acourse',
              Bcourse: economyClass[140].음식 === 'Bcourse',
              Ccourse: economyClass[140].음식 === 'Ccourse',
              Dcourse: economyClass[140].음식 === 'Dcourse',
              Ecourse: economyClass[140].음식 === 'Ecourse',
              Fcourse: economyClass[140].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[140].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[141].음식 === 'Acourse',
              Bcourse: economyClass[141].음식 === 'Bcourse',
              Ccourse: economyClass[141].음식 === 'Ccourse',
              Dcourse: economyClass[141].음식 === 'Dcourse',
              Ecourse: economyClass[141].음식 === 'Ecourse',
              Fcourse: economyClass[141].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[141].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[142].음식 === 'Acourse',
              Bcourse: economyClass[142].음식 === 'Bcourse',
              Ccourse: economyClass[142].음식 === 'Ccourse',
              Dcourse: economyClass[142].음식 === 'Dcourse',
              Ecourse: economyClass[142].음식 === 'Ecourse',
              Fcourse: economyClass[142].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[142].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[143].음식 === 'Acourse',
              Bcourse: economyClass[143].음식 === 'Bcourse',
              Ccourse: economyClass[143].음식 === 'Ccourse',
              Dcourse: economyClass[143].음식 === 'Dcourse',
              Ecourse: economyClass[143].음식 === 'Ecourse',
              Fcourse: economyClass[143].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[143].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[144].음식 === 'Acourse',
              Bcourse: economyClass[144].음식 === 'Bcourse',
              Ccourse: economyClass[144].음식 === 'Ccourse',
              Dcourse: economyClass[144].음식 === 'Dcourse',
              Ecourse: economyClass[144].음식 === 'Ecourse',
              Fcourse: economyClass[144].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[144].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[145].음식 === 'Acourse',
              Bcourse: economyClass[145].음식 === 'Bcourse',
              Ccourse: economyClass[145].음식 === 'Ccourse',
              Dcourse: economyClass[145].음식 === 'Dcourse',
              Ecourse: economyClass[145].음식 === 'Ecourse',
              Fcourse: economyClass[145].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[145].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[146].음식 === 'Acourse',
              Bcourse: economyClass[146].음식 === 'Bcourse',
              Ccourse: economyClass[146].음식 === 'Ccourse',
              Dcourse: economyClass[146].음식 === 'Dcourse',
              Ecourse: economyClass[146].음식 === 'Ecourse',
              Fcourse: economyClass[146].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[146].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[147].음식 === 'Acourse',
              Bcourse: economyClass[147].음식 === 'Bcourse',
              Ccourse: economyClass[147].음식 === 'Ccourse',
              Dcourse: economyClass[147].음식 === 'Dcourse',
              Ecourse: economyClass[147].음식 === 'Ecourse',
              Fcourse: economyClass[147].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[147].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[148].음식 === 'Acourse',
              Bcourse: economyClass[148].음식 === 'Bcourse',
              Ccourse: economyClass[148].음식 === 'Ccourse',
              Dcourse: economyClass[148].음식 === 'Dcourse',
              Ecourse: economyClass[148].음식 === 'Ecourse',
              Fcourse: economyClass[148].음식 === 'Fcourse',
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
              Ccourse: economyClass[149].음식 === 'Ccourse',
              Dcourse: economyClass[149].음식 === 'Dcourse',
              Ecourse: economyClass[149].음식 === 'Ecourse',
              Fcourse: economyClass[149].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[149].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[150].음식 === 'Acourse',
              Bcourse: economyClass[150].음식 === 'Bcourse',
              Ccourse: economyClass[150].음식 === 'Ccourse',
              Dcourse: economyClass[150].음식 === 'Dcourse',
              Ecourse: economyClass[150].음식 === 'Ecourse',
              Fcourse: economyClass[150].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[150].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[151].음식 === 'Acourse',
              Bcourse: economyClass[151].음식 === 'Bcourse',
              Ccourse: economyClass[151].음식 === 'Ccourse',
              Dcourse: economyClass[151].음식 === 'Dcourse',
              Ecourse: economyClass[151].음식 === 'Ecourse',
              Fcourse: economyClass[151].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[151].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[152].음식 === 'Acourse',
              Bcourse: economyClass[152].음식 === 'Bcourse',
              Ccourse: economyClass[152].음식 === 'Ccourse',
              Dcourse: economyClass[152].음식 === 'Dcourse',
              Ecourse: economyClass[152].음식 === 'Ecourse',
              Fcourse: economyClass[152].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[152].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[153].음식 === 'Acourse',
              Bcourse: economyClass[153].음식 === 'Bcourse',
              Ccourse: economyClass[153].음식 === 'Ccourse',
              Dcourse: economyClass[153].음식 === 'Dcourse',
              Ecourse: economyClass[153].음식 === 'Ecourse',
              Fcourse: economyClass[153].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[153].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[154].음식 === 'Acourse',
              Bcourse: economyClass[154].음식 === 'Bcourse',
              Ccourse: economyClass[154].음식 === 'Ccourse',
              Dcourse: economyClass[154].음식 === 'Dcourse',
              Ecourse: economyClass[154].음식 === 'Ecourse',
              Fcourse: economyClass[154].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[154].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[155].음식 === 'Acourse',
              Bcourse: economyClass[155].음식 === 'Bcourse',
              Ccourse: economyClass[155].음식 === 'Ccourse',
              Dcourse: economyClass[155].음식 === 'Dcourse',
              Ecourse: economyClass[155].음식 === 'Ecourse',
              Fcourse: economyClass[155].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[155].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[156].음식 === 'Acourse',
              Bcourse: economyClass[156].음식 === 'Bcourse',
              Ccourse: economyClass[156].음식 === 'Ccourse',
              Dcourse: economyClass[156].음식 === 'Dcourse',
              Ecourse: economyClass[156].음식 === 'Ecourse',
              Fcourse: economyClass[156].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[156].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[157].음식 === 'Acourse',
              Bcourse: economyClass[157].음식 === 'Bcourse',
              Ccourse: economyClass[157].음식 === 'Ccourse',
              Dcourse: economyClass[157].음식 === 'Dcourse',
              Ecourse: economyClass[157].음식 === 'Ecourse',
              Fcourse: economyClass[157].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[157].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[158].음식 === 'Acourse',
              Bcourse: economyClass[158].음식 === 'Bcourse',
              Ccourse: economyClass[158].음식 === 'Ccourse',
              Dcourse: economyClass[158].음식 === 'Dcourse',
              Ecourse: economyClass[158].음식 === 'Ecourse',
              Fcourse: economyClass[158].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[158].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[159].음식 === 'Acourse',
              Bcourse: economyClass[159].음식 === 'Bcourse',
              Ccourse: economyClass[159].음식 === 'Ccourse',
              Dcourse: economyClass[159].음식 === 'Dcourse',
              Ecourse: economyClass[159].음식 === 'Ecourse',
              Fcourse: economyClass[159].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[159].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[160].음식 === 'Acourse',
              Bcourse: economyClass[160].음식 === 'Bcourse',
              Ccourse: economyClass[160].음식 === 'Ccourse',
              Dcourse: economyClass[160].음식 === 'Dcourse',
              Ecourse: economyClass[160].음식 === 'Ecourse',
              Fcourse: economyClass[160].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[160].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[161].음식 === 'Acourse',
              Bcourse: economyClass[161].음식 === 'Bcourse',
              Ccourse: economyClass[161].음식 === 'Ccourse',
              Dcourse: economyClass[161].음식 === 'Dcourse',
              Ecourse: economyClass[161].음식 === 'Ecourse',
              Fcourse: economyClass[161].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[161].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[162].음식 === 'Acourse',
              Bcourse: economyClass[162].음식 === 'Bcourse',
              Ccourse: economyClass[162].음식 === 'Ccourse',
              Dcourse: economyClass[162].음식 === 'Dcourse',
              Ecourse: economyClass[162].음식 === 'Ecourse',
              Fcourse: economyClass[162].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[162].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[163].음식 === 'Acourse',
              Bcourse: economyClass[163].음식 === 'Bcourse',
              Ccourse: economyClass[163].음식 === 'Ccourse',
              Dcourse: economyClass[163].음식 === 'Dcourse',
              Ecourse: economyClass[163].음식 === 'Ecourse',
              Fcourse: economyClass[163].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[163].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[164].음식 === 'Acourse',
              Bcourse: economyClass[164].음식 === 'Bcourse',
              Ccourse: economyClass[164].음식 === 'Ccourse',
              Dcourse: economyClass[164].음식 === 'Dcourse',
              Ecourse: economyClass[164].음식 === 'Ecourse',
              Fcourse: economyClass[164].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[164].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[165].음식 === 'Acourse',
              Bcourse: economyClass[165].음식 === 'Bcourse',
              Ccourse: economyClass[165].음식 === 'Ccourse',
              Dcourse: economyClass[165].음식 === 'Dcourse',
              Ecourse: economyClass[165].음식 === 'Ecourse',
              Fcourse: economyClass[165].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[165].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[166].음식 === 'Acourse',
              Bcourse: economyClass[166].음식 === 'Bcourse',
              Ccourse: economyClass[166].음식 === 'Ccourse',
              Dcourse: economyClass[166].음식 === 'Dcourse',
              Ecourse: economyClass[166].음식 === 'Ecourse',
              Fcourse: economyClass[166].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[166].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[167].음식 === 'Acourse',
              Bcourse: economyClass[167].음식 === 'Bcourse',
              Ccourse: economyClass[167].음식 === 'Ccourse',
              Dcourse: economyClass[167].음식 === 'Dcourse',
              Ecourse: economyClass[167].음식 === 'Ecourse',
              Fcourse: economyClass[167].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[167].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[168].음식 === 'Acourse',
              Bcourse: economyClass[168].음식 === 'Bcourse',
              Ccourse: economyClass[168].음식 === 'Ccourse',
              Dcourse: economyClass[168].음식 === 'Dcourse',
              Ecourse: economyClass[168].음식 === 'Ecourse',
              Fcourse: economyClass[168].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[168].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[169].음식 === 'Acourse',
              Bcourse: economyClass[169].음식 === 'Bcourse',
              Ccourse: economyClass[169].음식 === 'Ccourse',
              Dcourse: economyClass[169].음식 === 'Dcourse',
              Ecourse: economyClass[169].음식 === 'Ecourse',
              Fcourse: economyClass[169].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[169].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[170].음식 === 'Acourse',
              Bcourse: economyClass[170].음식 === 'Bcourse',
              Ccourse: economyClass[170].음식 === 'Ccourse',
              Dcourse: economyClass[170].음식 === 'Dcourse',
              Ecourse: economyClass[170].음식 === 'Ecourse',
              Fcourse: economyClass[170].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[170].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[171].음식 === 'Acourse',
              Bcourse: economyClass[171].음식 === 'Bcourse',
              Ccourse: economyClass[171].음식 === 'Ccourse',
              Dcourse: economyClass[171].음식 === 'Dcourse',
              Ecourse: economyClass[171].음식 === 'Ecourse',
              Fcourse: economyClass[171].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[171].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[172].음식 === 'Acourse',
              Bcourse: economyClass[172].음식 === 'Bcourse',
              Ccourse: economyClass[172].음식 === 'Ccourse',
              Dcourse: economyClass[172].음식 === 'Dcourse',
              Ecourse: economyClass[172].음식 === 'Ecourse',
              Fcourse: economyClass[172].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[172].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[173].음식 === 'Acourse',
              Bcourse: economyClass[173].음식 === 'Bcourse',
              Ccourse: economyClass[173].음식 === 'Ccourse',
              Dcourse: economyClass[173].음식 === 'Dcourse',
              Ecourse: economyClass[173].음식 === 'Ecourse',
              Fcourse: economyClass[173].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[173].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[174].음식 === 'Acourse',
              Bcourse: economyClass[174].음식 === 'Bcourse',
              Ccourse: economyClass[174].음식 === 'Ccourse',
              Dcourse: economyClass[174].음식 === 'Dcourse',
              Ecourse: economyClass[174].음식 === 'Ecourse',
              Fcourse: economyClass[174].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[174].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[175].음식 === 'Acourse',
              Bcourse: economyClass[175].음식 === 'Bcourse',
              Ccourse: economyClass[175].음식 === 'Ccourse',
              Dcourse: economyClass[175].음식 === 'Dcourse',
              Ecourse: economyClass[175].음식 === 'Ecourse',
              Fcourse: economyClass[175].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[175].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[176].음식 === 'Acourse',
              Bcourse: economyClass[176].음식 === 'Bcourse',
              Ccourse: economyClass[176].음식 === 'Ccourse',
              Dcourse: economyClass[176].음식 === 'Dcourse',
              Ecourse: economyClass[176].음식 === 'Ecourse',
              Fcourse: economyClass[176].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[176].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[177].음식 === 'Acourse',
              Bcourse: economyClass[177].음식 === 'Bcourse',
              Ccourse: economyClass[177].음식 === 'Ccourse',
              Dcourse: economyClass[177].음식 === 'Dcourse',
              Ecourse: economyClass[177].음식 === 'Ecourse',
              Fcourse: economyClass[177].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[177].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[178].음식 === 'Acourse',
              Bcourse: economyClass[178].음식 === 'Bcourse',
              Ccourse: economyClass[178].음식 === 'Ccourse',
              Dcourse: economyClass[178].음식 === 'Dcourse',
              Ecourse: economyClass[178].음식 === 'Ecourse',
              Fcourse: economyClass[178].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[178].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[179].음식 === 'Acourse',
              Bcourse: economyClass[179].음식 === 'Bcourse',
              Ccourse: economyClass[179].음식 === 'Ccourse',
              Dcourse: economyClass[179].음식 === 'Dcourse',
              Ecourse: economyClass[179].음식 === 'Ecourse',
              Fcourse: economyClass[179].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[179].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[180].음식 === 'Acourse',
              Bcourse: economyClass[180].음식 === 'Bcourse',
              Ccourse: economyClass[180].음식 === 'Ccourse',
              Dcourse: economyClass[180].음식 === 'Dcourse',
              Ecourse: economyClass[180].음식 === 'Ecourse',
              Fcourse: economyClass[180].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[180].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[181].음식 === 'Acourse',
              Bcourse: economyClass[181].음식 === 'Bcourse',
              Ccourse: economyClass[181].음식 === 'Ccourse',
              Dcourse: economyClass[181].음식 === 'Dcourse',
              Ecourse: economyClass[181].음식 === 'Ecourse',
              Fcourse: economyClass[181].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[181].좌석 }}
          </div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'EconomyD'" class="seats-econnomy-D-container">
      <h1>{{ section }}</h1>
      <div v-bind="economyClass" class="seat-wrap3">
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[182].음식 === 'Acourse',
              Bcourse: economyClass[182].음식 === 'Bcourse',
              Ccourse: economyClass[182].음식 === 'Ccourse',
              Dcourse: economyClass[182].음식 === 'Dcourse',
              Ecourse: economyClass[182].음식 === 'Ecourse',
              Fcourse: economyClass[182].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[182].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[183].음식 === 'Acourse',
              Bcourse: economyClass[183].음식 === 'Bcourse',
              Ccourse: economyClass[183].음식 === 'Ccourse',
              Dcourse: economyClass[183].음식 === 'Dcourse',
              Ecourse: economyClass[183].음식 === 'Ecourse',
              Fcourse: economyClass[183].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[183].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[184].음식 === 'Acourse',
              Bcourse: economyClass[184].음식 === 'Bcourse',
              Ccourse: economyClass[184].음식 === 'Ccourse',
              Dcourse: economyClass[184].음식 === 'Dcourse',
              Ecourse: economyClass[184].음식 === 'Ecourse',
              Fcourse: economyClass[184].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[184].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[185].음식 === 'Acourse',
              Bcourse: economyClass[185].음식 === 'Bcourse',
              Ccourse: economyClass[185].음식 === 'Ccourse',
              Dcourse: economyClass[185].음식 === 'Dcourse',
              Ecourse: economyClass[185].음식 === 'Ecourse',
              Fcourse: economyClass[185].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[185].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[186].음식 === 'Acourse',
              Bcourse: economyClass[186].음식 === 'Bcourse',
              Ccourse: economyClass[186].음식 === 'Ccourse',
              Dcourse: economyClass[186].음식 === 'Dcourse',
              Ecourse: economyClass[186].음식 === 'Ecourse',
              Fcourse: economyClass[186].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[186].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[187].음식 === 'Acourse',
              Bcourse: economyClass[187].음식 === 'Bcourse',
              Ccourse: economyClass[187].음식 === 'Ccourse',
              Dcourse: economyClass[187].음식 === 'Dcourse',
              Ecourse: economyClass[187].음식 === 'Ecourse',
              Fcourse: economyClass[187].음식 === 'Fcourse',
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
              Ccourse: economyClass[188].음식 === 'Ccourse',
              Dcourse: economyClass[188].음식 === 'Dcourse',
              Ecourse: economyClass[188].음식 === 'Ecourse',
              Fcourse: economyClass[188].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[188].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[189].음식 === 'Acourse',
              Bcourse: economyClass[189].음식 === 'Bcourse',
              Ccourse: economyClass[189].음식 === 'Ccourse',
              Dcourse: economyClass[189].음식 === 'Dcourse',
              Ecourse: economyClass[189].음식 === 'Ecourse',
              Fcourse: economyClass[189].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[189].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[190].음식 === 'Acourse',
              Bcourse: economyClass[190].음식 === 'Bcourse',
              Ccourse: economyClass[190].음식 === 'Ccourse',
              Dcourse: economyClass[190].음식 === 'Dcourse',
              Ecourse: economyClass[190].음식 === 'Ecourse',
              Fcourse: economyClass[190].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[190].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[191].음식 === 'Acourse',
              Bcourse: economyClass[191].음식 === 'Bcourse',
              Ccourse: economyClass[191].음식 === 'Ccourse',
              Dcourse: economyClass[191].음식 === 'Dcourse',
              Ecourse: economyClass[191].음식 === 'Ecourse',
              Fcourse: economyClass[191].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[191].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[192].음식 === 'Acourse',
              Bcourse: economyClass[192].음식 === 'Bcourse',
              Ccourse: economyClass[192].음식 === 'Ccourse',
              Dcourse: economyClass[192].음식 === 'Dcourse',
              Ecourse: economyClass[192].음식 === 'Ecourse',
              Fcourse: economyClass[192].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[192].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[193].음식 === 'Acourse',
              Bcourse: economyClass[193].음식 === 'Bcourse',
              Ccourse: economyClass[193].음식 === 'Ccourse',
              Dcourse: economyClass[193].음식 === 'Dcourse',
              Ecourse: economyClass[193].음식 === 'Ecourse',
              Fcourse: economyClass[193].음식 === 'Fcourse',
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
              Ccourse: economyClass[194].음식 === 'Ccourse',
              Dcourse: economyClass[194].음식 === 'Dcourse',
              Ecourse: economyClass[194].음식 === 'Ecourse',
              Fcourse: economyClass[194].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[194].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[195].음식 === 'Acourse',
              Bcourse: economyClass[195].음식 === 'Bcourse',
              Ccourse: economyClass[195].음식 === 'Ccourse',
              Dcourse: economyClass[195].음식 === 'Dcourse',
              Ecourse: economyClass[195].음식 === 'Ecourse',
              Fcourse: economyClass[195].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[195].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[196].음식 === 'Acourse',
              Bcourse: economyClass[196].음식 === 'Bcourse',
              Ccourse: economyClass[196].음식 === 'Ccourse',
              Dcourse: economyClass[196].음식 === 'Dcourse',
              Ecourse: economyClass[196].음식 === 'Ecourse',
              Fcourse: economyClass[196].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[196].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[197].음식 === 'Acourse',
              Bcourse: economyClass[197].음식 === 'Bcourse',
              Ccourse: economyClass[197].음식 === 'Ccourse',
              Dcourse: economyClass[197].음식 === 'Dcourse',
              Ecourse: economyClass[197].음식 === 'Ecourse',
              Fcourse: economyClass[197].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[197].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[198].음식 === 'Acourse',
              Bcourse: economyClass[198].음식 === 'Bcourse',
              Ccourse: economyClass[198].음식 === 'Ccourse',
              Dcourse: economyClass[198].음식 === 'Dcourse',
              Ecourse: economyClass[198].음식 === 'Ecourse',
              Fcourse: economyClass[198].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[198].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[199].음식 === 'Acourse',
              Bcourse: economyClass[199].음식 === 'Bcourse',
              Ccourse: economyClass[199].음식 === 'Ccourse',
              Dcourse: economyClass[199].음식 === 'Dcourse',
              Ecourse: economyClass[199].음식 === 'Ecourse',
              Fcourse: economyClass[199].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[199].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[200].음식 === 'Acourse',
              Bcourse: economyClass[200].음식 === 'Bcourse',
              Ccourse: economyClass[200].음식 === 'Ccourse',
              Dcourse: economyClass[200].음식 === 'Dcourse',
              Ecourse: economyClass[200].음식 === 'Ecourse',
              Fcourse: economyClass[200].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[200].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[201].음식 === 'Acourse',
              Bcourse: economyClass[201].음식 === 'Bcourse',
              Ccourse: economyClass[201].음식 === 'Ccourse',
              Dcourse: economyClass[201].음식 === 'Dcourse',
              Ecourse: economyClass[201].음식 === 'Ecourse',
              Fcourse: economyClass[201].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[201].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[202].음식 === 'Acourse',
              Bcourse: economyClass[202].음식 === 'Bcourse',
              Ccourse: economyClass[202].음식 === 'Ccourse',
              Dcourse: economyClass[202].음식 === 'Dcourse',
              Ecourse: economyClass[202].음식 === 'Ecourse',
              Fcourse: economyClass[202].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[202].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[203].음식 === 'Acourse',
              Bcourse: economyClass[203].음식 === 'Bcourse',
              Ccourse: economyClass[203].음식 === 'Ccourse',
              Dcourse: economyClass[203].음식 === 'Dcourse',
              Ecourse: economyClass[203].음식 === 'Ecourse',
              Fcourse: economyClass[203].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[203].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[204].음식 === 'Acourse',
              Bcourse: economyClass[204].음식 === 'Bcourse',
              Ccourse: economyClass[204].음식 === 'Ccourse',
              Dcourse: economyClass[204].음식 === 'Dcourse',
              Ecourse: economyClass[204].음식 === 'Ecourse',
              Fcourse: economyClass[204].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[204].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[205].음식 === 'Acourse',
              Bcourse: economyClass[205].음식 === 'Bcourse',
              Ccourse: economyClass[205].음식 === 'Ccourse',
              Dcourse: economyClass[205].음식 === 'Dcourse',
              Ecourse: economyClass[205].음식 === 'Ecourse',
              Fcourse: economyClass[205].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[205].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[206].음식 === 'Acourse',
              Bcourse: economyClass[206].음식 === 'Bcourse',
              Ccourse: economyClass[206].음식 === 'Ccourse',
              Dcourse: economyClass[206].음식 === 'Dcourse',
              Ecourse: economyClass[206].음식 === 'Ecourse',
              Fcourse: economyClass[206].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[206].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[207].음식 === 'Acourse',
              Bcourse: economyClass[207].음식 === 'Bcourse',
              Ccourse: economyClass[207].음식 === 'Ccourse',
              Dcourse: economyClass[207].음식 === 'Dcourse',
              Ecourse: economyClass[207].음식 === 'Ecourse',
              Fcourse: economyClass[207].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[207].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[208].음식 === 'Acourse',
              Bcourse: economyClass[208].음식 === 'Bcourse',
              Ccourse: economyClass[208].음식 === 'Ccourse',
              Dcourse: economyClass[208].음식 === 'Dcourse',
              Ecourse: economyClass[208].음식 === 'Ecourse',
              Fcourse: economyClass[208].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[208].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[209].음식 === 'Acourse',
              Bcourse: economyClass[209].음식 === 'Bcourse',
              Ccourse: economyClass[209].음식 === 'Ccourse',
              Dcourse: economyClass[209].음식 === 'Dcourse',
              Ecourse: economyClass[209].음식 === 'Ecourse',
              Fcourse: economyClass[209].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[209].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[210].음식 === 'Acourse',
              Bcourse: economyClass[210].음식 === 'Bcourse',
              Ccourse: economyClass[210].음식 === 'Ccourse',
              Dcourse: economyClass[210].음식 === 'Dcourse',
              Ecourse: economyClass[210].음식 === 'Ecourse',
              Fcourse: economyClass[210].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[210].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[211].음식 === 'Acourse',
              Bcourse: economyClass[211].음식 === 'Bcourse',
              Ccourse: economyClass[211].음식 === 'Ccourse',
              Dcourse: economyClass[211].음식 === 'Dcourse',
              Ecourse: economyClass[211].음식 === 'Ecourse',
              Fcourse: economyClass[211].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[211].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[212].음식 === 'Acourse',
              Bcourse: economyClass[212].음식 === 'Bcourse',
              Ccourse: economyClass[212].음식 === 'Ccourse',
              Dcourse: economyClass[212].음식 === 'Dcourse',
              Ecourse: economyClass[212].음식 === 'Ecourse',
              Fcourse: economyClass[212].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[212].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[213].음식 === 'Acourse',
              Bcourse: economyClass[213].음식 === 'Bcourse',
              Ccourse: economyClass[213].음식 === 'Ccourse',
              Dcourse: economyClass[213].음식 === 'Dcourse',
              Ecourse: economyClass[213].음식 === 'Ecourse',
              Fcourse: economyClass[213].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[213].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[214].음식 === 'Acourse',
              Bcourse: economyClass[214].음식 === 'Bcourse',
              Ccourse: economyClass[214].음식 === 'Ccourse',
              Dcourse: economyClass[214].음식 === 'Dcourse',
              Ecourse: economyClass[214].음식 === 'Ecourse',
              Fcourse: economyClass[214].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[214].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[215].음식 === 'Acourse',
              Bcourse: economyClass[215].음식 === 'Bcourse',
              Ccourse: economyClass[215].음식 === 'Ccourse',
              Dcourse: economyClass[215].음식 === 'Dcourse',
              Ecourse: economyClass[215].음식 === 'Ecourse',
              Fcourse: economyClass[215].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[215].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[216].음식 === 'Acourse',
              Bcourse: economyClass[216].음식 === 'Bcourse',
              Ccourse: economyClass[216].음식 === 'Ccourse',
              Dcourse: economyClass[216].음식 === 'Dcourse',
              Ecourse: economyClass[216].음식 === 'Ecourse',
              Fcourse: economyClass[216].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[216].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[217].음식 === 'Acourse',
              Bcourse: economyClass[217].음식 === 'Bcourse',
              Ccourse: economyClass[217].음식 === 'Ccourse',
              Dcourse: economyClass[217].음식 === 'Dcourse',
              Ecourse: economyClass[217].음식 === 'Ecourse',
              Fcourse: economyClass[217].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[217].좌석 }}
          </div>
        </div>
        <div class="seat-row-economy">
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[218].음식 === 'Acourse',
              Bcourse: economyClass[218].음식 === 'Bcourse',
              Ccourse: economyClass[218].음식 === 'Ccourse',
              Dcourse: economyClass[218].음식 === 'Dcourse',
              Ecourse: economyClass[218].음식 === 'Ecourse',
              Fcourse: economyClass[218].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[218].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[219].음식 === 'Acourse',
              Bcourse: economyClass[219].음식 === 'Bcourse',
              Ccourse: economyClass[219].음식 === 'Ccourse',
              Dcourse: economyClass[219].음식 === 'Dcourse',
              Ecourse: economyClass[219].음식 === 'Ecourse',
              Fcourse: economyClass[219].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[219].좌석 }}
          </div>
          <div class="seat-economy-space"></div>
          <div class="seat-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[220].음식 === 'Acourse',
              Bcourse: economyClass[220].음식 === 'Bcourse',
              Ccourse: economyClass[220].음식 === 'Ccourse',
              Dcourse: economyClass[220].음식 === 'Dcourse',
              Ecourse: economyClass[220].음식 === 'Ecourse',
              Fcourse: economyClass[220].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[220].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[221].음식 === 'Acourse',
              Bcourse: economyClass[221].음식 === 'Bcourse',
              Ccourse: economyClass[221].음식 === 'Ccourse',
              Dcourse: economyClass[221].음식 === 'Dcourse',
              Ecourse: economyClass[221].음식 === 'Ecourse',
              Fcourse: economyClass[221].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[221].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[222].음식 === 'Acourse',
              Bcourse: economyClass[222].음식 === 'Bcourse',
              Ccourse: economyClass[222].음식 === 'Ccourse',
              Dcourse: economyClass[222].음식 === 'Dcourse',
              Ecourse: economyClass[222].음식 === 'Ecourse',
              Fcourse: economyClass[222].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[222].좌석 }}
          </div>
          <div class="seat-space"></div>
          <div class="seat-economy-space"></div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[223].음식 === 'Acourse',
              Bcourse: economyClass[223].음식 === 'Bcourse',
              Ccourse: economyClass[223].음식 === 'Ccourse',
              Dcourse: economyClass[223].음식 === 'Dcourse',
              Ecourse: economyClass[223].음식 === 'Ecourse',
              Fcourse: economyClass[223].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[223].좌석 }}
          </div>
          <div
            class="seat-economy"
            :class="{
              Acourse: economyClass[224].음식 === 'Acourse',
              Bcourse: economyClass[224].음식 === 'Bcourse',
              Ccourse: economyClass[224].음식 === 'Ccourse',
              Dcourse: economyClass[224].음식 === 'Dcourse',
              Ecourse: economyClass[224].음식 === 'Ecourse',
              Fcourse: economyClass[224].음식 === 'Fcourse',
            }"
          >
            {{ economyClass[224].좌석 }}
          </div>
        </div>
      </div>
    </div>

    <div class="meal-btn-group">
      <b-button @click="showFirstClass">First Class</b-button>
      <b-button @click="showBusinessClass">Business Class</b-button>
      <b-button @click="showSectionA">Economy Section A</b-button>
      <b-button @click="showSectionB">Economy Section B</b-button>
      <b-button @click="showSectionC">Economy Section C</b-button>
      <b-button @click="showSectionD">Economy Section D</b-button>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
export default {
  name: 'AttendantMeal777200ER',
  data() {
    return {
      section: 'First',

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
          좌석: 'F07',
          음식: '',
        },
        {
          좌석: 'H07',
          음식: '',
        },
        {
          좌석: 'J07',
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
          좌석: 'F08',
          음식: '',
        },
        {
          좌석: 'H08',
          음식: '',
        },
        {
          좌석: 'J08',
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
          좌석: 'F09',
          음식: '',
        },
        {
          좌석: 'H09',
          음식: '',
        },
        {
          좌석: 'J09',
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
          좌석: 'D10',
          음식: '',
        },
        {
          좌석: 'E10',
          음식: '',
        },
        {
          좌석: 'F10',
          음식: '',
        },
        {
          좌석: 'H10',
          음식: '',
        },
        {
          좌석: 'J10',
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
          좌석: 'D28',
          음식: '',
        },
        {
          좌석: 'E28',
          음식: '',
        },
        {
          좌석: 'F28',
          음식: '',
        },
        {
          좌석: 'G28',
          음식: '',
        },
        {
          좌석: 'H28',
          음식: '',
        },
        {
          좌석: 'J28',
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
          좌석: 'D29',
          음식: '',
        },
        {
          좌석: 'E29',
          음식: '',
        },
        {
          좌석: 'F29',
          음식: '',
        },
        {
          좌석: 'G29',
          음식: '',
        },
        {
          좌석: 'H29',
          음식: '',
        },
        {
          좌석: 'J29',
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
          좌석: 'A41',
          음식: '',
        },
        {
          좌석: 'B41',
          음식: '',
        },
        {
          좌석: 'D41',
          음식: '',
        },
        {
          좌석: 'E41',
          음식: '',
        },
        {
          좌석: 'F41',
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
          좌석: 'D46',
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
          좌석: 'A53',
          음식: '',
        },
        {
          좌석: 'B53',
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
          좌석: 'H53',
          음식: '',
        },
        {
          좌석: 'J53',
          음식: '',
        },
      ],
      tempFirstClass: [
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
      ],
      tempBusinessClass: [
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
          좌석: 'F07',
          음식: '',
        },
        {
          좌석: 'H07',
          음식: '',
        },
        {
          좌석: 'J07',
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
          좌석: 'F08',
          음식: '',
        },
        {
          좌석: 'H08',
          음식: '',
        },
        {
          좌석: 'J08',
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
          좌석: 'F09',
          음식: '',
        },
        {
          좌석: 'H09',
          음식: '',
        },
        {
          좌석: 'J09',
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
          좌석: 'D10',
          음식: '',
        },
        {
          좌석: 'E10',
          음식: '',
        },
        {
          좌석: 'F10',
          음식: '',
        },
        {
          좌석: 'H10',
          음식: '',
        },
        {
          좌석: 'J10',
          음식: '',
        },
      ],
      tempEconomyClass: [
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
          좌석: 'D28',
          음식: '',
        },
        {
          좌석: 'E28',
          음식: '',
        },
        {
          좌석: 'F28',
          음식: '',
        },
        {
          좌석: 'G28',
          음식: '',
        },
        {
          좌석: 'H28',
          음식: '',
        },
        {
          좌석: 'J28',
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
          좌석: 'D29',
          음식: '',
        },
        {
          좌석: 'E29',
          음식: '',
        },
        {
          좌석: 'F29',
          음식: '',
        },
        {
          좌석: 'G29',
          음식: '',
        },
        {
          좌석: 'H29',
          음식: '',
        },
        {
          좌석: 'J29',
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
          좌석: 'A41',
          음식: '',
        },
        {
          좌석: 'B41',
          음식: '',
        },
        {
          좌석: 'D41',
          음식: '',
        },
        {
          좌석: 'E41',
          음식: '',
        },
        {
          좌석: 'F41',
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
          좌석: 'D46',
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
          좌석: 'A53',
          음식: '',
        },
        {
          좌석: 'B53',
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
          좌석: 'H53',
          음식: '',
        },
        {
          좌석: 'J53',
          음식: '',
        },
      ],
      mealList: {
        Acourse: '',
        Bcourse: '',
      },
    }
  },
  computed: {
    checkChange() {
      return this.seatMealList
    },
    ...mapState('meal', [
      'meals',
      'flightMeals',
      'choiceMeal',
      'seatMealList',
      'details',
      'allergies',
      'validMsg',
      'flightMealList',
    ]),
    ...mapState('user', ['loginMember', 'flightNum']),
  },
  watch: {
    checkChange(seatMealList) {
      if (seatMealList.length === 0) {
        this.firstClass.forEach((seat) => {
          seat.음식 = ''
        })
        this.businessClass.forEach((seat) => {
          seat.음식 = ''
        })
        this.economyClass.forEach((seat) => {
          seat.음식 = ''
        })
      }
    },
  },
  created() {
    const promise = new Promise((resolve, reject) => {
      resolve()
    })
    promise.then(async () => {
      await this.getMealList(this.flightNum)
      // this.seatMealList?.forEach((seatMeal) => {
      //   if (seatMeal.음식 !== null && seatMeal.음식 !== this.mealList.Acourse) {
      //     this.mealList.Acourse = seatMeal.음식
      //   } else {
      //     this.mealList.Bcourse = seatMeal.음식
      //   }
      // })
      // this.seatMealList.forEach((seatMeal) => {
      //   this.firstClass.forEach((seat) => {
      //     if (seatMeal.seatNum === seat.좌석) {
      //       seat.음식 = seatMeal.mealMenu
      //       if (seat.음식 === this.mealList.Acourse) {
      //         seat.음식 = 'Acourse'
      //       } else if (seat.음식 === this.mealList.Bcourse) {
      //         seat.음식 = 'Bcourse'
      //       }
      //     }
      //   })
      //   this.businessClass.forEach((seat) => {
      //     if (seatMeal.seatNum === seat.좌석) {
      //       seat.음식 = seatMeal.mealMenu
      //       if (seat.음식 === this.mealList.Acourse) {
      //         seat.음식 = 'Acourse'
      //       } else if (seat.음식 === this.mealList.Bcourse) {
      //         seat.음식 = 'Bcourse'
      //       }
      //     }
      //   })
      //   this.economyClass.forEach((seat) => {
      //     if (seatMeal.seatNum === seat.좌석) {
      //       seat.음식 = seatMeal.mealMenu
      //       if (seat.음식 === this.mealList.Acourse) {
      //         seat.음식 = 'Acourse'
      //       } else if (seat.음식 === this.mealList.Bcourse) {
      //         seat.음식 = 'Bcourse'
      //       }
      //     }
      //   })
      // })
      if (this.seatMealList?.length > 0)
        this.seatMealList.forEach((seatMeal) => {
          this.firstClass.forEach((seat) => {
            if (seatMeal.seatNum === seat.좌석) {
              seat.음식 = seatMeal.mealMenu
              if (seat.음식 === '제육덮밥') {
                seat.음식 = 'Acourse'
              } else if (seat.음식 === '카레라이스') {
                seat.음식 = 'Bcourse'
              } else if (seat.음식 === '소불고기비빔밥') {
                seat.음식 = 'Ccourse'
              } else if (seat.음식 === '치킨스테이크') {
                seat.음식 = 'Dcourse'
              } else if (seat.음식 === '새우파스타') {
                seat.음식 = 'Ecourse'
              } else if (seat.음식 === '두부버섯샐러드') {
                seat.음식 = 'Fcourse'
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
              } else if (seat.음식 === '소불고기비빔밥') {
                seat.음식 = 'Ccourse'
              } else if (seat.음식 === '치킨스테이크') {
                seat.음식 = 'Dcourse'
              } else if (seat.음식 === '새우파스타') {
                seat.음식 = 'Ecourse'
              } else if (seat.음식 === '두부버섯샐러드') {
                seat.음식 = 'Fcourse'
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
              } else if (seat.음식 === '소불고기비빔밥') {
                seat.음식 = 'Ccourse'
              } else if (seat.음식 === '치킨스테이크') {
                seat.음식 = 'Dcourse'
              } else if (seat.음식 === '새우파스타') {
                seat.음식 = 'Ecourse'
              } else if (seat.음식 === '두부버섯샐러드') {
                seat.음식 = 'Fcourse'
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
    showBusinessClass() {
      this.section = 'Business'
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
  },
}
</script>

<style scoped>
.meal-list-wrap {
  height: 85vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  background-color: rgba(239, 239, 239, 0.511);
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
  margin-bottom: 2%;
}
/* first Class chair*/
.seats-first-container {
  height: 52%;
}
.seat-wrap1 {
  height: 50%;
  /* background-color: black; */
}
.seat-row-first {
  height: 75%;
  display: flex;
  margin-bottom: 3%;
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
  width: 10%;
  padding: 2%;
  border-top-left-radius: 40px;
  border-top-right-radius: 40px;
}
/* business Class chair */
.seats-business-container {
  height: 52%;
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
  width: 5%;
  margin: 0.2%;
  padding: 0.8%;
  border-top-left-radius: 20px;
  border-top-right-radius: 20px;
  text-align: center;
  font-size: larger;
  font-weight: bold;
  color: white;
}

/* economy class chair */
.seats-econnomy-D-container,
.seats-econnomy-C-container,
.seats-econnomy-B-container,
.seats-econnomy-A-container {
  height: 52%;
}

.seat-wrap3 {
  height: 100%;
}
.seat-row-economy {
  height: 11%;
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
  width: 4.5%;
  margin: 0.2%;
  font-weight: bold;
  font-size: large;
  border-top-left-radius: 13px;
  border-top-right-radius: 13px;
}
.seat-economy-space {
  background-color: #ffffff00;
  height: 100%;
  width: 4.5%;
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
  margin-top: 6%;
  text-align: center;
  color: aliceblue;
}
.btn-secondary {
  font-size: small;
  height: 100%;
  width: 9%;
  background-color: #206e95;
  border-color: #206e95;
}
.btn-warning {
  font-size: small;
  height: 100%;
  width: 9%;
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

.Ccourse {
  background-color: #deff24;
}

.Dcourse {
  background-color: #9b37ff;
}

.Ecourse {
  background-color: #374eff;
}

.Fcourse {
  background-color: #3c959b;
}
</style>
