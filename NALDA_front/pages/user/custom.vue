<template>
  <div class="mycustom-container">
    <div class="user-nav">
      <user-navs></user-navs>
    </div>
    <div class="custom-declaration-wrap">
      <div class="mycustom-subindex-item">
        <h3>세관신고서 목록</h3>
        <div class="mycustom-subindex-bluebox">
          <div class="overflow-auto">
            <p class="mt-3">현재 페이지: {{ currentPage }}</p>
            <b-table
              id="my-table"
              :items="items"
              :per-page="perPage"
              :current-page="currentPage"
              small
              @click="customDetail(item)"
            ></b-table>
            <b-pagination
              v-model="currentPage"
              :total-rows="rows"
              :per-page="perPage"
              pills
              variant="info"
              size="sm"
            ></b-pagination>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import UserNavs from '../../components/UserNavs.vue'
export default {
  name: 'MyCustom',
  components: { UserNavs },
  data() {
    return {
      // rows: '',
      perPage: 10,
      currentPage: 1,
      items: [
        { no: 1, journey: 'Madrid', date: '2019-01-24' },
        { no: 2, journey: 'Madrid', date: '2019-01-24' },
        { no: 3, journey: 'Madrid', date: '2019-01-24' },
        { no: 4, journey: 'Madrid', date: '2019-01-24' },
        { no: 5, journey: 'Madrid', date: '2019-01-24' },
        { no: 1, journey: 'Madrid', date: '2019-01-24' },
        { no: 2, journey: 'Madrid', date: '2019-01-24' },
        { no: 3, journey: 'Madrid', date: '2019-01-24' },
        { no: 4, journey: 'Madrid', date: '2019-01-24' },
        { no: 5, journey: 'Madrid', date: '2019-01-24' },
        { no: 1, journey: 'Madrid', date: '2019-01-24' },
        { no: 2, journey: 'Madrid', date: '2019-01-24' },
        { no: 3, journey: 'Madrid', date: '2019-01-24' },
        { no: 4, journey: 'Madrid', date: '2019-01-24' },
        { no: 5, journey: 'Madrid', date: '2019-01-24' },
        { no: 1, journey: 'Madrid', date: '2019-01-24' },
        { no: 2, journey: 'Madrid', date: '2019-01-24' },
        { no: 3, journey: 'Madrid', date: '2019-01-24' },
        { no: 4, journey: 'Madrid', date: '2019-01-24' },
        { no: 5, journey: 'Madrid', date: '2019-01-24' },
      ],
    }
  },
  mathods: {
    customDetail(payload) {
      console.log(payload.no)
      console.log(payload.hourney)
      console.log(payload.date)
    },
  },
  computed: {
    rows() {
      return this.items.length
    },
  },
}
</script>

<style>
@font-face {
  font-family: 'twayfly';
  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_tway@1.0/twayfly.woff')
    format('woff');
  font-weight: normal;
  font-style: normal;
}

:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
}

* {
  margin: 0;
  padding: 0;
  font-family: 'twayfly';
}

ol,
ul {
  list-style: none;
  padding-left: 0;
}

.custom-declaration-wrap {
  display: flex;
  justify-content: center;
  align-items: center;
}

.mycustom-container {
  display: flex;
  flex-direction: row;
}
.mycustom-subindex-item h3 {
  text-align: center;
  margin-bottom: 20px;
}

.mycustom-subindex-bluebox {
  width: 800px;
  padding: 20px 50px;
  border-radius: 12px;
  box-shadow: 17px 17px 29px 0 rgb(0 164 73 / 8%);
  border: solid 1px #24919b;
  background-color: #fff;
  box-sizing: border-box;
}

.overflow-auto {
  text-align: center;
}

tr {
  cursor: pointer;
}
.page-item .page-link {
  color: #0f374b;
}

.page-item.active .page-link {
  background-color: var(--nalda-blue-color);
}

#my-table {
  color: #0f374b;
}
</style>