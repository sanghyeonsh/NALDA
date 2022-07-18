<template>
  <div>
    <h1>Snack</h1>
    <div>
      <b-card no-body>
        <b-tabs card>
          <b-tab title="간식">
            <div class="row row-cols-4">
              <div v-for="item in testdata" :key="item.id" class="col">
                <div class="card">
                  <img class="card-img-top" :src="item.download_url" alt="" />
                  <div class="card-body">
                    <h5 class="card-title">
                      <input
                        :id="item.id"
                        v-model="checkedsnacks"
                        type="checkbox"
                        :value="item.author"
                      />
                      <label :for="item.id">{{ item.author }}</label>
                    </h5>
                  </div>
                </div>
              </div>
            </div>
          </b-tab>

          <b-tab title="주류">
            <div class="row row-cols-4">
              <div class="col">
                <div class="card h-100">
                  <img src="../../static/nacho.jpg" alt="나쵸" />
                  <div class="card-body">
                    <h5 class="card-title">
                      <input
                        id="alchoal"
                        v-model="checkedsnacks"
                        type="checkbox"
                        value="alchoal"
                      />
                      <label for="alchoal">주류</label>
                    </h5>
                  </div>
                </div>
              </div>
            </div>
          </b-tab>

          <b-tab title="비주류">
            <div class="row row-cols-4">
              <div class="col">
                <div class="card h-100">
                  <img src="../../static/nacho.jpg" alt="나쵸" />

                  <div class="card-body">
                    <h5 class="card-title">
                      <input
                        id="nonalchoal"
                        v-model="checkedsnacks"
                        type="checkbox"
                        value="nonalchoal"
                      />
                      <label for="nonalchoal">비주류</label>
                    </h5>
                  </div>
                </div>
              </div>
            </div>
          </b-tab>
        </b-tabs>
      </b-card>
      <div class="d-flex">
        <h3>메뉴</h3>
        <h3>수량</h3>
      </div>
      <div>
        <li v-for="snack in checkedsnacks" :key="snack">
          {{ snack }}
        </li>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'OrderSnack',
  data() {
    return {
      checkedsnacks: [],
      testdata: [],
    }
  },
  created() {
    const test = this
    axios
      .get('https://picsum.photos/v2/list?page=2&limit=20')
      .then(function (response) {
        test.testdata = response.data
      })
      .catch(function (err) {
        console.log(err)
      })
  },
  methods: {},
}
</script>

<style>
.card-img-top {
  height: 15rem;
  object-fit: cover;
}
</style>
