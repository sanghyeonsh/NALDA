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
          <div
            class="seat-first"
            :class="{Acourse: firstClass[0].음식=== 'Acourse', Bcourse: firstClass[0].음식==='Bcourse'}"
          >{{firstClass[0].좌석}}</div>
          <div class="seat-space"></div>
          <div
            class="seat-first"
            :class="{Acourse: firstClass[1].음식=== 'Acourse', Bcourse: firstClass[1].음식==='Bcourse'}"
          >{{firstClass[1].좌석}}</div>
          <div class="space"></div>
          <div
            class="seat-first"
            :class="{Acourse: firstClass[2].음식=== 'Acourse', Bcourse: firstClass[2].음식==='Bcourse'}"
          >{{firstClass[2].좌석}}</div>
          <div class="seat-space"></div>
          <div
            class="seat-first"
            :class="{Acourse: firstClass[3].음식=== 'Acourse', Bcourse: firstClass[3].음식==='Bcourse'}"
          >{{firstClass[3].좌석}}</div>
        </div>
        <div class="seat-row-first">
          <div
            class="seat-first"
            :class="{Acourse: firstClass[4].음식=== 'Acourse', Bcourse: firstClass[4].음식==='Bcourse'}"
          >{{firstClass[4].좌석}}</div>
          <div class="seat-space"></div>
          <div
            class="seat-first"
            :class="{Acourse: firstClass[5].음식=== 'Acourse', Bcourse: firstClass[5].음식==='Bcourse'}"
          >{{firstClass[5].좌석}}</div>
          <div class="space"></div>
          <div
            class="seat-first"
            :class="{Acourse: firstClass[6].음식=== 'Acourse', Bcourse: firstClass[6].음식==='Bcourse'}"
          >{{firstClass[6].좌석}}</div>
          <div class="seat-space"></div>
          <div
            class="seat-first"
            :class="{Acourse: firstClass[7].음식=== 'Acourse', Bcourse: firstClass[7].음식==='Bcourse'}"
          >{{firstClass[7].좌석}}</div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'Business'" class="seats-business-container">
      <h1>{{section}}</h1>
      <div v-bind="businessClass" class="seat-wrap2">
        <div class="seat-row-business">
          <div
            class="seat-business"
            :class="{Acourse: businessClass[0].음식=== 'Acourse', Bcourse: businessClass[0].음식==='Bcourse'}"
          >{{businessClass[0].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[1].음식=== 'Acourse', Bcourse: businessClass[1].음식==='Bcourse'}"
          >{{businessClass[1].좌석}}</div>
          <div class="seat-space"></div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[2].음식=== 'Acourse', Bcourse: businessClass[2].음식==='Bcourse'}"
          >{{businessClass[2].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[3].음식=== 'Acourse', Bcourse: businessClass[3].음식==='Bcourse'}"
          >{{businessClass[3].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[4].음식=== 'Acourse', Bcourse: businessClass[4].음식==='Bcourse'}"
          >{{businessClass[4].좌석}}</div>
          <div class="seat-space"></div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[5].음식=== 'Acourse', Bcourse: businessClass[5].음식==='Bcourse'}"
          >{{businessClass[5].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[6].음식=== 'Acourse', Bcourse: businessClass[6].음식==='Bcourse'}"
          >{{businessClass[6].좌석}}</div>
        </div>
        <div class="seat-row-business">
          <div
            class="seat-business"
            :class="{Acourse: businessClass[7].음식=== 'Acourse', Bcourse: businessClass[7].음식==='Bcourse'}"
          >{{businessClass[7].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[8].음식=== 'Acourse', Bcourse: businessClass[8].음식==='Bcourse'}"
          >{{businessClass[8].좌석}}</div>
          <div class="seat-space"></div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[9].음식=== 'Acourse', Bcourse: businessClass[9].음식==='Bcourse'}"
          >{{businessClass[9].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[10].음식=== 'Acourse', Bcourse: businessClass[10].음식==='Bcourse'}"
          >{{businessClass[10].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[11].음식=== 'Acourse', Bcourse: businessClass[11].음식==='Bcourse'}"
          >{{businessClass[11].좌석}}</div>
          <div class="seat-space"></div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[12].음식=== 'Acourse', Bcourse: businessClass[12].음식==='Bcourse'}"
          >{{businessClass[12].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[13].음식=== 'Acourse', Bcourse: businessClass[13].음식==='Bcourse'}"
          >{{businessClass[13].좌석}}</div>
        </div>
        <div class="seat-row-business">
          <div
            class="seat-business"
            :class="{Acourse: businessClass[14].음식=== 'Acourse', Bcourse: businessClass[14].음식==='Bcourse'}"
          >{{businessClass[14].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[15].음식=== 'Acourse', Bcourse: businessClass[15].음식==='Bcourse'}"
          >{{businessClass[15].좌석}}</div>
          <div class="seat-space"></div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[16].음식=== 'Acourse', Bcourse: businessClass[16].음식==='Bcourse'}"
          >{{businessClass[16].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[17].음식=== 'Acourse', Bcourse: businessClass[17].음식==='Bcourse'}"
          >{{businessClass[17].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[18].음식=== 'Acourse', Bcourse: businessClass[18].음식==='Bcourse'}"
          >{{businessClass[18].좌석}}</div>
          <div class="seat-space"></div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[19].음식=== 'Acourse', Bcourse: businessClass[19].음식==='Bcourse'}"
          >{{businessClass[19].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[20].음식=== 'Acourse', Bcourse: businessClass[20].음식==='Bcourse'}"
          >{{businessClass[20].좌석}}</div>
        </div>
        <div class="seat-row-business">
          <div
            class="seat-business"
            :class="{Acourse: businessClass[21].음식=== 'Acourse', Bcourse: businessClass[21].음식==='Bcourse'}"
          >{{businessClass[21].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[22].음식=== 'Acourse', Bcourse: businessClass[22].음식==='Bcourse'}"
          >{{businessClass[22].좌석}}</div>
          <div class="seat-space"></div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[23].음식=== 'Acourse', Bcourse: businessClass[23].음식==='Bcourse'}"
          >{{businessClass[23].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[24].음식=== 'Acourse', Bcourse: businessClass[24].음식==='Bcourse'}"
          >{{businessClass[24].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[25].음식=== 'Acourse', Bcourse: businessClass[25].음식==='Bcourse'}"
          >{{businessClass[25].좌석}}</div>
          <div class="seat-space"></div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[26].음식=== 'Acourse', Bcourse: businessClass[26].음식==='Bcourse'}"
          >{{businessClass[26].좌석}}</div>
          <div
            class="seat-business"
            :class="{Acourse: businessClass[27].음식=== 'Acourse', Bcourse: businessClass[27].음식==='Bcourse'}"
          >{{businessClass[27].좌석}}</div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'EconomyA'" class="seats-econnomy-A-container">
      <h1>{{section}}</h1>
      <div v-bind="economyClass" class="seat-wrap3">
        <div class="seat-row-economy">
          <div>28</div>
          <div class="seat-economy">{{economyClass[0].좌석}}</div>
          <div class="seat-economy">{{economyClass[1].좌석}}</div>
          <div class="seat-economy">{{economyClass[2].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[3].좌석}}</div>
          <div class="seat-economy">{{economyClass[4].좌석}}</div>
          <div class="seat-economy">{{economyClass[5].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[6].좌석}}</div>
          <div class="seat-economy">{{economyClass[7].좌석}}</div>
          <div class="seat-economy">{{economyClass[8].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>29</div>
          <div class="seat-economy">{{economyClass[9].좌석}}</div>
          <div class="seat-economy">{{economyClass[10].좌석}}</div>
          <div class="seat-economy">{{economyClass[11].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[12].좌석}}</div>
          <div class="seat-economy">{{economyClass[13].좌석}}</div>
          <div class="seat-economy">{{economyClass[14].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[15].좌석}}</div>
          <div class="seat-economy">{{economyClass[16].좌석}}</div>
          <div class="seat-economy">{{economyClass[17].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>30</div>
          <div class="seat-economy">{{economyClass[18].좌석}}</div>
          <div class="seat-economy">{{economyClass[19].좌석}}</div>
          <div class="seat-economy">{{economyClass[20].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[21].좌석}}</div>
          <div class="seat-economy">{{economyClass[22].좌석}}</div>
          <div class="seat-economy">{{economyClass[23].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[24].좌석}}</div>
          <div class="seat-economy">{{economyClass[25].좌석}}</div>
          <div class="seat-economy">{{economyClass[26].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>31</div>
          <div class="seat-economy">{{economyClass[27].좌석}}</div>
          <div class="seat-economy">{{economyClass[28].좌석}}</div>
          <div class="seat-economy">{{economyClass[29].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[30].좌석}}</div>
          <div class="seat-economy">{{economyClass[31].좌석}}</div>
          <div class="seat-economy">{{economyClass[32].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[33].좌석}}</div>
          <div class="seat-economy">{{economyClass[34].좌석}}</div>
          <div class="seat-economy">{{economyClass[35].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>32</div>
          <div class="seat-economy">{{economyClass[36].좌석}}</div>
          <div class="seat-economy">{{economyClass[37].좌석}}</div>
          <div class="seat-economy">{{economyClass[38].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[39].좌석}}</div>
          <div class="seat-economy">{{economyClass[40].좌석}}</div>
          <div class="seat-economy">{{economyClass[41].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[42].좌석}}</div>
          <div class="seat-economy">{{economyClass[43].좌석}}</div>
          <div class="seat-economy">{{economyClass[44].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>33</div>
          <div class="seat-economy">{{economyClass[45].좌석}}</div>
          <div class="seat-economy">{{economyClass[46].좌석}}</div>
          <div class="seat-economy">{{economyClass[47].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[48].좌석}}</div>
          <div class="seat-economy">{{economyClass[49].좌석}}</div>
          <div class="seat-economy">{{economyClass[50].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[51].좌석}}</div>
          <div class="seat-economy">{{economyClass[52].좌석}}</div>
          <div class="seat-economy">{{economyClass[53].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>34</div>
          <div class="seat-economy">{{economyClass[54].좌석}}</div>
          <div class="seat-economy">{{economyClass[55].좌석}}</div>
          <div class="seat-economy">{{economyClass[56].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[57].좌석}}</div>
          <div class="seat-economy">{{economyClass[58].좌석}}</div>
          <div class="seat-economy">{{economyClass[59].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[60].좌석}}</div>
          <div class="seat-economy">{{economyClass[61].좌석}}</div>
          <div class="seat-economy">{{economyClass[62].좌석}}</div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'EconomyB'" class="seats-econnomy-B-container">
      <h1>{{section}}</h1>
      <div v-bind="economyClass" class="seat-wrap3">
        <div class="seat-row-economy">
          <div>35</div>
          <div class="seat-economy">{{economyClass[63].좌석}}</div>
          <div class="seat-economy">{{economyClass[64].좌석}}</div>
          <div class="seat-economy">{{economyClass[65].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[66].좌석}}</div>
          <div class="seat-economy">{{economyClass[67].좌석}}</div>
          <div class="seat-economy">{{economyClass[68].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[69].좌석}}</div>
          <div class="seat-economy">{{economyClass[70].좌석}}</div>
          <div class="seat-economy">{{economyClass[71].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>36</div>
          <div class="seat-economy">{{economyClass[72].좌석}}</div>
          <div class="seat-economy">{{economyClass[73].좌석}}</div>
          <div class="seat-economy">{{economyClass[74].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[75].좌석}}</div>
          <div class="seat-economy">{{economyClass[76].좌석}}</div>
          <div class="seat-economy">{{economyClass[77].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[78].좌석}}</div>
          <div class="seat-economy">{{economyClass[79].좌석}}</div>
          <div class="seat-economy">{{economyClass[80].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>37</div>
          <div class="seat-economy">{{economyClass[81].좌석}}</div>
          <div class="seat-economy">{{economyClass[82].좌석}}</div>
          <div class="seat-economy">{{economyClass[83].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[84].좌석}}</div>
          <div class="seat-economy">{{economyClass[85].좌석}}</div>
          <div class="seat-economy">{{economyClass[86].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[87].좌석}}</div>
          <div class="seat-economy">{{economyClass[88].좌석}}</div>
          <div class="seat-economy">{{economyClass[89].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>38</div>
          <div class="seat-economy">{{economyClass[90].좌석}}</div>
          <div class="seat-economy">{{economyClass[91].좌석}}</div>
          <div class="seat-economy">{{economyClass[92].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[93].좌석}}</div>
          <div class="seat-economy">{{economyClass[94].좌석}}</div>
          <div class="seat-economy">{{economyClass[95].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[96].좌석}}</div>
          <div class="seat-economy">{{economyClass[97].좌석}}</div>
          <div class="seat-economy">{{economyClass[98].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>39</div>
          <div class="seat-economy">{{economyClass[99].좌석}}</div>
          <div class="seat-economy">{{economyClass[100].좌석}}</div>
          <div class="seat-economy">{{economyClass[101].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[102].좌석}}</div>
          <div class="seat-economy">{{economyClass[103].좌석}}</div>
          <div class="seat-economy">{{economyClass[104].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[105].좌석}}</div>
          <div class="seat-economy">{{economyClass[106].좌석}}</div>
          <div class="seat-economy">{{economyClass[107].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>40</div>
          <div class="seat-economy">{{economyClass[108].좌석}}</div>
          <div class="seat-economy">{{economyClass[109].좌석}}</div>
          <div class="seat-economy">{{economyClass[110].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[111].좌석}}</div>
          <div class="seat-economy">{{economyClass[112].좌석}}</div>
          <div class="seat-economy">{{economyClass[113].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[114].좌석}}</div>
          <div class="seat-economy">{{economyClass[115].좌석}}</div>
          <div class="seat-economy">{{economyClass[116].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>41</div>
          <div class="seat-economy">{{economyClass[117].좌석}}</div>
          <div class="seat-economy">{{economyClass[118].좌석}}</div>
          <div class="seat-economy-space"></div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[119].좌석}}</div>
          <div class="seat-economy">{{economyClass[120].좌석}}</div>
          <div class="seat-economy">{{economyClass[121].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy-space"></div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'EconomyC'" class="seats-econnomy-C-container">
      <h1>{{section}}</h1>
      <div v-bind="economyClass" class="seat-wrap3">
        <div class="seat-row-economy">
          <div>42</div>
          <div class="seat-economy">{{economyClass[122].좌석}}</div>
          <div class="seat-economy">{{economyClass[123].좌석}}</div>
          <div class="seat-economy">{{economyClass[124].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[125].좌석}}</div>
          <div class="seat-economy">{{economyClass[126].좌석}}</div>
          <div class="seat-economy">{{economyClass[127].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>43</div>
          <div class="seat-economy">{{economyClass[128].좌석}}</div>
          <div class="seat-economy">{{economyClass[129].좌석}}</div>
          <div class="seat-economy">{{economyClass[130].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[131].좌석}}</div>
          <div class="seat-economy">{{economyClass[132].좌석}}</div>
          <div class="seat-economy">{{economyClass[133].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[134].좌석}}</div>
          <div class="seat-economy">{{economyClass[135].좌석}}</div>
          <div class="seat-economy">{{economyClass[136].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>44</div>
          <div class="seat-economy">{{economyClass[137].좌석}}</div>
          <div class="seat-economy">{{economyClass[138].좌석}}</div>
          <div class="seat-economy">{{economyClass[139].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[140].좌석}}</div>
          <div class="seat-economy">{{economyClass[141].좌석}}</div>
          <div class="seat-economy">{{economyClass[142].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[143].좌석}}</div>
          <div class="seat-economy">{{economyClass[144].좌석}}</div>
          <div class="seat-economy">{{economyClass[145].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>45</div>
          <div class="seat-economy">{{economyClass[146].좌석}}</div>
          <div class="seat-economy">{{economyClass[147].좌석}}</div>
          <div class="seat-economy">{{economyClass[148].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[149].좌석}}</div>
          <div class="seat-economy">{{economyClass[150].좌석}}</div>
          <div class="seat-economy">{{economyClass[151].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[152].좌석}}</div>
          <div class="seat-economy">{{economyClass[153].좌석}}</div>
          <div class="seat-economy">{{economyClass[154].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>46</div>
          <div class="seat-economy">{{economyClass[155].좌석}}</div>
          <div class="seat-economy">{{economyClass[156].좌석}}</div>
          <div class="seat-economy">{{economyClass[157].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[158].좌석}}</div>
          <div class="seat-economy">{{economyClass[159].좌석}}</div>
          <div class="seat-economy">{{economyClass[160].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[161].좌석}}</div>
          <div class="seat-economy">{{economyClass[162].좌석}}</div>
          <div class="seat-economy">{{economyClass[163].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>47</div>
          <div class="seat-economy">{{economyClass[164].좌석}}</div>
          <div class="seat-economy">{{economyClass[165].좌석}}</div>
          <div class="seat-economy">{{economyClass[166].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[167].좌석}}</div>
          <div class="seat-economy">{{economyClass[168].좌석}}</div>
          <div class="seat-economy">{{economyClass[169].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[170].좌석}}</div>
          <div class="seat-economy">{{economyClass[171].좌석}}</div>
          <div class="seat-economy">{{economyClass[172].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>48</div>
          <div class="seat-economy">{{economyClass[173].좌석}}</div>
          <div class="seat-economy">{{economyClass[174].좌석}}</div>
          <div class="seat-economy">{{economyClass[175].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[176].좌석}}</div>
          <div class="seat-economy">{{economyClass[177].좌석}}</div>
          <div class="seat-economy">{{economyClass[178].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[179].좌석}}</div>
          <div class="seat-economy">{{economyClass[180].좌석}}</div>
          <div class="seat-economy">{{economyClass[181].좌석}}</div>
        </div>
      </div>
    </div>

    <div v-else-if="section === 'EconomyD'" class="seats-econnomy-D-container">
      <h1>{{section}}</h1>
      <div v-bind="economyClass" class="seat-wrap3">
        <div class="seat-row-economy">
          <div>49</div>
          <div class="seat-economy">{{economyClass[182].좌석}}</div>
          <div class="seat-economy">{{economyClass[183].좌석}}</div>
          <div class="seat-economy">{{economyClass[184].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[185].좌석}}</div>
          <div class="seat-economy">{{economyClass[186].좌석}}</div>
          <div class="seat-economy">{{economyClass[187].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[188].좌석}}</div>
          <div class="seat-economy">{{economyClass[189].좌석}}</div>
          <div class="seat-economy">{{economyClass[190].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>50</div>
          <div class="seat-economy">{{economyClass[191].좌석}}</div>
          <div class="seat-economy">{{economyClass[192].좌석}}</div>
          <div class="seat-economy">{{economyClass[193].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[194].좌석}}</div>
          <div class="seat-economy">{{economyClass[195].좌석}}</div>
          <div class="seat-economy">{{economyClass[196].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[197].좌석}}</div>
          <div class="seat-economy">{{economyClass[198].좌석}}</div>
          <div class="seat-economy">{{economyClass[199].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>51</div>
          <div class="seat-economy">{{economyClass[200].좌석}}</div>
          <div class="seat-economy">{{economyClass[201].좌석}}</div>
          <div class="seat-economy">{{economyClass[202].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[203].좌석}}</div>
          <div class="seat-economy">{{economyClass[204].좌석}}</div>
          <div class="seat-economy">{{economyClass[205].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[206].좌석}}</div>
          <div class="seat-economy">{{economyClass[207].좌석}}</div>
          <div class="seat-economy">{{economyClass[208].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>52</div>
          <div class="seat-economy">{{economyClass[209].좌석}}</div>
          <div class="seat-economy">{{economyClass[210].좌석}}</div>
          <div class="seat-economy">{{economyClass[211].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[212].좌석}}</div>
          <div class="seat-economy">{{economyClass[213].좌석}}</div>
          <div class="seat-economy">{{economyClass[214].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[215].좌석}}</div>
          <div class="seat-economy">{{economyClass[216].좌석}}</div>
          <div class="seat-economy">{{economyClass[217].좌석}}</div>
        </div>
        <div class="seat-row-economy">
          <div>53</div>
          <div class="seat-economy">{{economyClass[218].좌석}}</div>
          <div class="seat-economy">{{economyClass[219].좌석}}</div>
          <div class="seat-economy-space"></div>
          <div class="seat-space"></div>
          <div class="seat-economy">{{economyClass[220].좌석}}</div>
          <div class="seat-economy">{{economyClass[221].좌석}}</div>
          <div class="seat-economy">{{economyClass[222].좌석}}</div>
          <div class="seat-space"></div>
          <div class="seat-economy-space"></div>
          <div class="seat-economy">{{economyClass[223].좌석}}</div>
          <div class="seat-economy">{{economyClass[224].좌석}}</div>
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
      attachA: false,
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
    })
    console.log('vue에서' + this.seatMealList.length)
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
      console.log(this.seatMealList)

      this.attachA = !this.attachA
      this.firstClass[0].음식 = 'Acourse'
      this.firstClass[1].음식 = 'Bcourse'
      this.firstClass[2].음식 = 'Acourse'
      this.businessClass[0].음식 = 'Acourse'
      this.businessClass[1].음식 = 'Bcourse'
      // for (let i = 0; i < this.seatMealList.length; i++) {
      //   console.log(1)
      //   for (let idx = 0; idx < this.firstClass.length; idx) {
      //     if (this.seatMealList[i].seatNum === this.firstClass[idx].좌석) {
      //       this.firstClass[idx].음식 = this.seatMealList[i].mealMenu
      //     }
      //   }
      //   for (let idx = 0; idx < this.businessClass.length; idx) {
      //     if (this.seatMealList[i].seatNum === this.businessClass[idx].좌석) {
      //       this.businessClass[idx].음식 = this.seatMealList[i].mealMenu
      //     }
      //   }
      //   for (let idx = 0; idx < this.economyClass.length; idx) {
      //     if (this.seatMealList[i].seatNum === this.economyClass[idx].좌석) {
      //       console.log(1)
      //       this.economyClass[idx].음식 = this.seatMealList[i].mealMenu
      //     }
      //   }
      // }
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
  height: 37%;
  display: flex;
  margin-bottom: 1%;
  flex-direction: row;
  justify-content: center;
}
.seat-business {
  background-color: #316dd5;
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
  background-color: #8e6fe5;
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
  background-color: #f0a523;
  /* height: 100%;
  width: 10%;
  padding: 2%;
  border-top-left-radius: 40px;
  border-top-right-radius: 40px; */
}
.Bcourse {
  background-color: #7029f4;
  /* height: 100%;
  width: 10%;
  padding: 2%;
  border-top-left-radius: 40px;
  border-top-right-radius: 40px; */
}
</style>