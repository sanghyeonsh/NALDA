<template>
  <div class="meal-list-wrap">
    <!-- <PageLoader />123 -->
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
      <h1>{{section}}</h1>
      <div v-bind="firstClass" class="seat-wrap1">
        <div class="seat-row-first">
          <div class="seat-first">{{firstClass[0].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-first">{{firstClass[1].좌석}}</div>
          <div class="space"></div>
          <div class="seat-first">{{firstClass[2].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-first">{{firstClass[3].좌석}}</div>
        </div>
        <div class="seat-row-first">
          <div class="seat-first">{{firstClass[4].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-first">{{firstClass[5].좌석}}</div>
          <div class="space"></div>
          <div class="seat-first">{{firstClass[6].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-first">{{firstClass[7].좌석}}</div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'Business'" class="seats-business-container">
      <h1>{{section}}</h1>
      <div class="seat-wrap2">
        <div class="seat-row-business">
          <div class="seat-business"></div>
          <div class="seat-business"></div>
          <div class="seat-space"></div>
          <div class="seat-business"></div>
          <div class="seat-business"></div>
          <div class="seat-business"></div>
          <div class="seat-space"></div>
          <div class="seat-business"></div>
          <div class="seat-business"></div>
        </div>
        <div class="seat-row-business">
          <div class="seat-business"></div>
          <div class="seat-business"></div>
          <div class="seat-space"></div>
          <div class="seat-business"></div>
          <div class="seat-business"></div>
          <div class="seat-business"></div>
          <div class="seat-space"></div>
          <div class="seat-business"></div>
          <div class="seat-business"></div>
        </div>
        <div class="seat-row-business">
          <div class="seat-business"></div>
          <div class="seat-business"></div>
          <div class="seat-space"></div>
          <div class="seat-business"></div>
          <div class="seat-business"></div>
          <div class="seat-business"></div>
          <div class="seat-space"></div>
          <div class="seat-business"></div>
          <div class="seat-business"></div>
        </div>
        <div class="seat-row-business">
          <div class="seat-business"></div>
          <div class="seat-business"></div>
          <div class="seat-space"></div>
          <div class="seat-business"></div>
          <div class="seat-business"></div>
          <div class="seat-business"></div>
          <div class="seat-space"></div>
          <div class="seat-business"></div>
          <div class="seat-business"></div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'EconomyA'" class="seats-econnomy-A-container">
      <h1>{{section}}</h1>
      <div class="seat-wrap3">
        <div class="seat-row-economy">
          <div>28</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>29</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>30</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>31</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>32</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>33</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>34</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'EconomyB'" class="seats-econnomy-B-container">
      <h1>{{section}}</h1>
      <div class="seat-wrap3">
        <div class="seat-row-economy">
          <div>35</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>36</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>37</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>38</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>39</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>40</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>41</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy-space"></div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'EconomyC'" class="seats-econnomy-C-container">
      <h1>{{section}}</h1>
      <div class="seat-wrap3">
        <div class="seat-row-economy">
          <div>42</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>43</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>44</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>45</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>46</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>47</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>48</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'EconomyD'" class="seats-econnomy-D-container">
      <h1>{{section}}</h1>
      <div class="seat-wrap3">
        <div class="seat-row-economy">
          <div>49</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>50</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>51</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>52</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
        </div>
        <div class="seat-row-economy">
          <div>53</div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
          <div class="seat-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy"></div>
          <div class="seat-economy"></div>
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
      <b-button variant="warning" @click="dataCheck">test</b-button>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
// import PageLoader from '../../components/PageLoader.vue'
export default {
  name: 'AttendantMeal',
  // components: { PageLoader },
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
    }
  },
  computed: {
    ...mapState('meal', ['meals', 'flightMeals', 'choiceMeal', 'seatMealList']),
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
    dataCheck() {
      this.getMealList(1)
      console.log(this.seatMealList)
    },
  },
}
</script>

<style scoped>
.meal-list-wrap {
  height: 70vh;
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
  background-color: #31d5d5;
  height: 100%;
  width: 5%;
  border-top-left-radius: 35px;
  border-top-right-radius: 35px;
}

.B-course {
  background-color: #31acd5;
  height: 100%;
  width: 5%;
  border-top-left-radius: 35px;
  border-top-right-radius: 35px;
}

.special-course {
  background-color: #31acd5;
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
  background-color: #31acd5;
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
  height: 30%;
  display: flex;
  margin-bottom: 2%;
  flex-direction: row;
  justify-content: center;
}
.seat-business {
  background-color: #316dd5;
  height: 100%;
  width: 5%;
  margin: 0.2%;
  padding: 2%;
  border-top-left-radius: 25px;
  border-top-right-radius: 25px;
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
  height: 10.5%;
  display: flex;
  margin-bottom: 0.7%;
  flex-direction: row;
  justify-content: center;
}

.seat-economy {
  background-color: #8e6fe5;
  color: aliceblue;
  text-align: center;
  height: 100%;
  width: 3%;
  margin: 0.2%;
  padding: 1%;
  border-top-left-radius: 16px;
  border-top-right-radius: 16px;
}
.seat-economy-space {
  background-color: #ffffff00;
  height: 100%;
  width: 3%;
  margin: 0.2%;
  padding: 1%;
  border-top-left-radius: 16px;
  border-top-right-radius: 16px;
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
</style>