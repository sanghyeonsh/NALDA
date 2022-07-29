<template>
  <div class="stock-input-wrap">
    <div class="stock-table">
      <b-table-simple
        id="stocks-table"
        hover
        small
        caption-top
        responsive
        :items="items"
        :per-page="perPage"
        :current-page="currentPage"
      >
        <caption>
          <h2>재고 목록:</h2>
        </caption>
        <colgroup>
          <col />
          <col />
        </colgroup>
        <colgroup>
          <col />
          <col />
          <col />
        </colgroup>
        <!-- <colgroup>
          <col />
          <col />
        </colgroup>-->
        <b-thead head-variant="dark">
          <b-tr>
            <b-th colspan="3">Stocks</b-th>
            <b-th colspan="3">Item List</b-th>
          </b-tr>
          <b-tr>
            <b-th>Service Title</b-th>
            <b-th>Classification</b-th>
            <b-th>Service Code</b-th>
            <b-th>Name</b-th>
          </b-tr>
        </b-thead>
        <b-tbody>
          <b-tr>
            <b-th rowspan="3">Snacks</b-th>
            <b-th class="text-right">나쵸</b-th>
            <b-th>A001</b-th>
            <b-td>56</b-td>
          </b-tr>
          <b-tr>
            <b-th class="text-right">믹스넛</b-th>
            <b-th>A002</b-th>
            <b-td>46</b-td>
          </b-tr>
          <b-tr>
            <b-th class="text-right">포스틱</b-th>
            <b-th>A003</b-th>
            <b-td>51</b-td>
          </b-tr>
          <b-tr>
            <b-th rowspan="2">Alcohols</b-th>

            <b-th class="text-right">발렌타인 17년</b-th>
            <b-th>A101</b-th>
            <b-td variant="success">89</b-td>
          </b-tr>
          <b-tr>
            <b-th class="text-right">레드와인</b-th>
            <b-th>A102</b-th>
            <b-td>80</b-td>
          </b-tr>
          <b-tr>
            <b-th rowspan="2">Non-Alcohols</b-th>

            <b-th class="text-right">코카콜라</b-th>
            <b-th>A201</b-th>
            <b-td variant="success">89</b-td>
          </b-tr>
          <b-tr>
            <b-th class="text-right">펩시</b-th>
            <b-th>A202</b-th>
            <b-td>80</b-td>
          </b-tr>
        </b-tbody>
        <b-tfoot>
          <b-tr>
            <b-td colspan="7" variant="secondary" class="text-right">
              Total Rows:
              <b>5</b>
            </b-td>
          </b-tr>
        </b-tfoot>
      </b-table-simple>
      <b-pagination
        v-model="currentPage"
        :total-rows="rows"
        :per-page="perPage"
        size="sm"
        align="center"
        class="mt-4"
        aria-controls="stocks-table"
      ></b-pagination>
    </div>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
export default {
  name: 'AttendantStock',
  data() {
    return {
      perPage: 10,
      currentPage: 1,
      items: [],
    }
  },
  computed: {
    rows() {
      return this.items.length
    },
    ...mapState('attendant', ['serviceItems']),
  },
  methods: {
    ...mapActions('attendant', ['setStockAmount']),
  },
}
</script>

<style scoped>
@font-face {
  font-family: 'twayfly';
  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_tway@1.0/twayfly.woff')
    format('woff');
  font-weight: normal;
  font-style: normal;
}

* {
  margin: 0;
  padding: 0;
  font-family: 'twayfly';
}
.stock-input-wrap {
  height: 70vh;
}
.stock-table {
  padding: 3%;
}
</style>