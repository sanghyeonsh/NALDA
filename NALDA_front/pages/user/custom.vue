<template>
  <div class="mycustom-container">
    <user-navs></user-navs>
    <div class="custom-declaration-wrap">
      <div class="mycustom-subindex-item">
        <h4>세관신고서 목록</h4>
        <div class="mycustom-subindex-bluebox">
          <!-- <div class="overflow-auto"> -->
          <v-data-table
            id="my-table"
            :items="listTable"
            :headers="headers"
            :loading="loading"
            loading-text="Loading... Please wait"
            :items-per-page="perPage"
            :page="currentPage"
            hide-default-footer
            class="elevation-1"
            small
            @click:row="customDetail"
          ></v-data-table>
          <v-pagination
            v-model="currentPage"
            :length="pageCount"
            :total-visivle="totalVisible"
          >
          </v-pagination>
          <!-- </div> -->
        </div>
      </div>
    </div>

    <b-modal id="check-modal" size="xl" hide-footer centered>
      <template #modal-title> 상세 정보 </template>
      <div class="d-block">편명 : {{ declaration.flightNum }}</div>
      <div class="d-block">날짜 : {{ declaration.date }}</div>
      <div class="d-block">목적 : {{ declaration.purposeTravel }}</div>

      <b-button class="mt-3" block @click="$bvModal.hide('check-modal')"
        >Close Me</b-button
      >
    </b-modal>
  </div>
</template>

<script>
import axios from 'axios'
import { mapState, mapActions, mapGetters } from 'vuex'
import UserNavs from '../../components/UserNavs.vue'
export default {
  name: 'MyCustom',
  components: { UserNavs },
  data() {
    return {
      perPage: 6,
      currentPage: 1,
      loading: true,
      totalVisible: 10,
      headers: [
        { text: 'ID', align: 'center', sortable: false, value: 'ID' },
        { text: '목적', align: 'center', sortable: false, value: '목적' },
        { text: '편명', align: 'center', sortable: false, value: '편명' },
        { text: '날짜', align: 'center', sortable: false, value: '날짜' },
      ],
      declaration: {},
    }
  },
  computed: {
    ...mapGetters('customdeclaration', ['listTable']),
    ...mapState('user', ['loginMember']),
    ...mapState('customdeclaration', [
      'declarationList',
      'selectedDeclaration',
    ]),
    rows() {
      return this.listTable.length
    },
    pageCount() {
      return this.listTable.length % this.perPage === 0
        ? this.listTable.length / this.perPage
        : this.listTable.length / this.perPage + 1
    },
  },
  created() {
    axios.get('https://api.ipify.org?format=json').then((response) => {
      console.log(response)
    })
    this.getDeclarationList(this.loginMember.username)
  },
  methods: {
    ...mapActions('customdeclaration', [
      'getDeclarationList',
      'getOneDeclaration',
    ]),
    getIP(json) {
      console.log(json)
    },
    customDetail(event, { item }) {
      const promise = new Promise((resolve, reject) => {
        resolve()
      })
      promise.then(async () => {
        await this.getOneDeclaration(item.ID)
        this.declaration = this.selectedDeclaration
        this.$bvModal.show('check-modal')
      })
    },
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

.d-block {
  font-size: 30px;
}

.elevation-1 {
  width: 100%;
}
.mycustom-container {
  width: 100%;
  height: 70vh;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  /* background-color: orange; */
}

ol,
ul {
  list-style: none;
  padding-left: 0;
}

.pagination {
  justify-content: center;
}
.custom-declaration-wrap {
  height: 100%;
  width: 100%;
  display: flex;
  /* flex-direction: column; */
  justify-content: center;
  align-items: center;
}

.mycustom-subindex-item {
  height: 75%;
  width: 80%;
  /* display: flex; */
  /* flex-direction: column;
  justify-content: center;
  align-items: center; */
}
.mycustom-subindex-item h4 {
  text-align: right;
}

.mycustom-subindex-bluebox {
  /* width: 80%; */
  width: 100%;
  height: 100%;
  padding: 2% 6% 2% 6%;
  border-radius: 12px;
  box-shadow: 17px 17px 29px 0 rgb(0 164 73 / 8%);
  border: solid 1px #24919b;
  background-color: #fff;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  box-sizing: border-box;
  text-align: center;
}

.overflow-auto {
  width: 100%;
  height: 100%;
  /* margin: 2%; */
  text-align: center;
}

.page-item .page-link {
  color: #0f374b;
}

.page-item.active .page-link {
  background-color: var(--nalda-blue-color);
}

#my-table {
  color: #0f374b;
  cursor: pointer;
}
</style>
