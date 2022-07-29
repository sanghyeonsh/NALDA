<template>
  <div class="request-container">
    <div class="request-uncomplete-wrap">
      <h4>uncomplete</h4>
      <b-pagination
        v-model="currentPage"
        :total-rows="rows"
        :per-page="perPage"
        size="sm"
        align="center"
        class="mt-4"
      ></b-pagination>
      <p class="mt-3">Current Page: {{ currentPage }}</p>
      <b-table
        id="my-table"
        striped
        hover
        :items="items"
        :per-page="perPage"
        :current-page="currentPage"
        small
      ></b-table>

      <b-table
        hover
        :items="items"
        :fields="fields"
        :per-page="perPage"
        :current-page="currentPage"
        small
        responsive="sm"
      >
        <template #cell(show_details)="row">
          <b-button
            size="sm"
            class="mr-2"
            @click="row.toggleDetails"
          >{{ row.detailsShowing ? 'Hide' : 'Show'}} Details</b-button>

          <!-- As `row.showDetails` is one-way, we call the toggleDetails function on @change -->
          <b-form-checkbox
            v-model="row.detailsShowing"
            @change="row.toggleDetails"
          >Details via check</b-form-checkbox>
        </template>

        <template #row-details="row">
          <b-card>
            <b-row class="mb-2">
              <b-col sm="3" class="text-sm-right">
                <b>Age:</b>
              </b-col>
              <b-col>{{ row.item.age }}</b-col>
            </b-row>

            <b-row class="mb-2">
              <b-col sm="3" class="text-sm-right">
                <b>Is Active:</b>
              </b-col>
              <b-col>{{ row.item.isActive }}</b-col>
            </b-row>

            <b-button size="sm" @click="row.toggleDetails">Hide Details</b-button>
          </b-card>
        </template>
      </b-table>
      <div>
        <h4>request detail</h4>
        <b-table striped hover :details="details"></b-table>
      </div>
    </div>
    <div class="request-complete-wrap">
      <h4>uncomplete</h4>
    </div>
  </div>
</template>

<script>
export default {
  name: 'AttendantRequest',
  data() {
    return {
      fields: [
        {
          key: '좌석',
          sortable: false,
        },
        {
          key: '분류',
          sortable: true,
        },
        {
          key: '요청사항',
          sortable: false,
        },
        {
          key: '요청시각',
          sortable: true,
        },
        {
          key: '상태',
          sortable: true,
        },
      ],
      perPage: 3,
      currentPage: 1,
      items: [
        {
          좌석: 'A08',
          분류: '의료',
          요청사항: '두통',
          요청시각: '2022.07.28 01:37',
          처리현황: false,
          승객등급: 'economy',
        },
        {
          좌석: 'B37',
          분류: '의료',
          요청사항: '두통',
          요청시각: '2022.07.28 01:37',
          처리현황: false,
          승객등급: 'economy',
        },
        {
          좌석: 'B37',
          분류: '의료',
          요청사항: '두통',
          요청시각: '2022.07.28 01:37',
          처리현황: false,
          승객등급: 'economy',
        },
        {
          좌석: 'B37',
          분류: '의료',
          요청사항: '두통',
          요청시각: '2022.07.28 01:37',
          처리현황: false,
          승객등급: 'economy',
        },
        {
          좌석: 'B37',
          분류: '의료',
          요청사항: '두통',
          요청시각: '2022.07.28 01:37',
          처리현황: false,
          승객등급: 'economy',
        },
        {
          좌석: 'B37',
          분류: '의료',
          요청사항: '두통',
          요청시각: '2022.07.28 01:37',
          처리현황: false,
          승객등급: 'economy',
        },
      ],
    }
  },
  computed: {
    rows() {
      return this.items.length
    },
  },
}
</script>

<style scoped>
.request-container {
  height: 70vh;
  display: flex;
  justify-content: space-between;
  padding: 4%;
}

.request-complete-wrap,
.request-uncomplete-wrap {
}

#__BVID__122 {
  height: 30%;
}
</style>