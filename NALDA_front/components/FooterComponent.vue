<template>
  <div class="footer-container">
    <div class="footer-wrap">
      <div class="service-btn-wrap">
        <button class="toilet-wrap" @click="MoveToilet">
          <img src="/main/toilet_navy.png" alt="toilet" />
          <h3>화장실</h3>
        </button>
        <button
          class="service-wrap"
          style="background-color: #206e95"
          @click="MoveHelpcall"
        >
          <img src="/main/flight_attendant_w.png" alt="toilet" />
          <h3>승무원호출</h3>
        </button>
      </div>
      <footer>
        <div class="copyright-wrap">
          <!-- <div><img src="logo.png"></div> -->
          <div>
            <span>
              이용약관 | 개인정보처리방침 | 책임의 한계와 고지 | 회원정보
              고객센터
            </span>
            <div>Copyright © NALDA Corp. All Rights Reserved.</div>
          </div>
        </div>
      </footer>
    </div>
  </div>
</template>

<script>
export default {
  name: 'FooterComponent',
  methods: {
    MoveHelpcall() {
      this.$router.push({ name: 'main-helpcall' })
    },
    MoveToilet() {
      this.$router.push('/attendant/toilet')
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
  /* margin: 0;
  padding: 0; */
  font-family: 'twayfly';
}

.footer-container {
  width: 100vw;
  height: 15vh;
  display: flex;
  flex-direction: column;
  background-color: rgba(239, 239, 239, 0.511);
  /* background-color: rgba(0, 0, 0, 0); */
}
.footer-container footer {
  width: 100%;
  text-align: center;
  font-size: smaller;
}

.footer-wrap {
  /* padding: 1%; */
}
.service-btn-wrap {
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
  /* padding: 1%; */
  margin-top: 1%;
  margin-right: 1%;
}
.service-btn-wrap h3 {
  font-size: medium;
}

button {
  width: 150px;
  height: 60px;
  border-radius: 60px;
  border: none;
}

button:hover {
  background-color: #88c0c5;
  box-shadow: 5px 5px 10px rgba(46, 205, 229, 0.4);
  color: #fff;
  transform: translateY(-7px);
}

.toilet-wrap,
.service-wrap {
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
}

.toilet-wrap img {
  width: 50px;
  height: 50px;
}

.toilet-wrap {
  background-color: #dadada;
  color: #1b2f40;
}

.service-wrap img {
  width: 50px;
  height: 50px;
}

.service-wrap {
  margin-left: 1%;
  background-color: #206e95;
  color: white;
}
</style>
