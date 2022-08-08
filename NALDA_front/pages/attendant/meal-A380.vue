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
            <div>28</div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
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
            <div>29</div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
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
            <div>30</div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
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
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
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
            <div>35</div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
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
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-economy-space"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
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
            <div>42</div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
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
            <div class="seat-economy-space"></div>
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
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
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
            <div>49</div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
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
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
          </div>
          <div class="seat-row-economy">
            <div>54</div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
          </div>
          <div class="seat-row-economy">
            <div>55</div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
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
      <div
        v-else-if="section === 'EconomyE'"
        class="seats-econnomy-D-container"
      >
        <h1>{{ section }}</h1>
        <div v-bind="economyClass" class="seat-wrap3">
          <div class="seat-row-economy">
            <div>56</div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
          </div>
          <div class="seat-row-economy">
            <div>57</div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
          </div>
          <div class="seat-row-economy">
            <div>58</div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
          </div>
          <div class="seat-row-economy">
            <div>59</div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-space"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
            <div class="seat-economy"></div>
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
            <div class="seat-business"></div>
            <div class="seat-business"></div>
            <div class="seat-space"></div>
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
            <div class="seat-space"></div>
            <div class="seat-business"></div>
            <div class="seat-business"></div>
          </div>
          <div class="seat-row-business">
            <div class="seat-business"></div>
            <div class="seat-business"></div>
            <div class="seat-space"></div>
            <div class="seat-business-space"></div>
            <div class="seat-business-space"></div>
            <div class="seat-space"></div>
            <div class="seat-business"></div>
            <div class="seat-business"></div>
          </div>
        </div>
      </div>
      <div v-if="section === 'BusinessB'" class="seats-business-container">
        <h1>{{ section }}</h1>
        <div v-bind="businessClass" class="seat-wrap2">
          <div class="seat-row-business">
            <div class="seat-business"></div>
            <div class="seat-business"></div>
            <div class="seat-space"></div>
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
            <div class="seat-space"></div>
            <div class="seat-business"></div>
            <div class="seat-business"></div>
          </div>
        </div>
      </div>
      <div v-if="section === 'BusinessC'" class="seats-business-container">
        <h1>{{ section }}</h1>
        <div v-bind="businessClass" class="seat-wrap2">
          <div class="seat-row-business">
            <div class="seat-business"></div>
            <div class="seat-business"></div>
            <div class="seat-space"></div>
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
            <div class="seat-space"></div>
            <div class="seat-business"></div>
            <div class="seat-business"></div>
          </div>
        </div>
      </div>
      <div v-if="section === 'BusinessD'" class="seats-business-container">
        <h1>{{ section }}</h1>
        <div v-bind="businessClass" class="seat-wrap2">
          <div class="seat-row-business">
            <div class="seat-business"></div>
            <div class="seat-business"></div>
            <div class="seat-space"></div>
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
            <div class="seat-space"></div>
            <div class="seat-business"></div>
            <div class="seat-business"></div>
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
    }
  },
  computed: {
    ...mapState('meal', ['meals', 'flightMeals', 'choiceMeal', 'seatMealList']),
  },
  created() {
    const promise = new Promise((resolve, reject) => {
      resolve()
    })
    promise.then(async () => {
      await this.getMealList(1)
      console.log('vue에서' + this.seatMealList.length)
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
      console.log(this.seatMealList)

      console.log('저요' + this.economyClass[29].음식)
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
  align-items: center;
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
