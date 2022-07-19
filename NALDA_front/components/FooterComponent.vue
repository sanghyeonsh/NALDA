<template>
  <div>
    <div class="footer-container">
      <div class="service-btn-wrap">
        <button class="toilet-wrap">
          <img src="../static/toilet_navy.png" alt="toilet" />
          <h3>화장실</h3>
        </button>
        <button class="service-wrap" style="background-color: var(--nalda-blue-color);">
          <img src="../static/flight_attendant_w.png" alt="toilet" />
          <h3>승무원호출</h3>
        </button>
      </div>
      <footer>
        <div class="copyright-wrap">
          <!-- <div><img src="logo.png"></div> -->
          <div>
            <span>이용약관 | 개인정보처리방침 | 책임의 한계와 고지 | 회원정보 고객센터</span>
          </div>
          <div>
            <span>Copyright © NALDA Corp. All Rights Reserved.</span>
          </div>
        </div>
      </footer>
    </div>
  </div>
</template>

<script>
export default {
  name: 'FooterComponent',
  methods: {},
}
</script>

<style scoped>
:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-background-blue-color: #45a9c8;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
  --nalda-navy-color: #1b2f40;
}

* {
  margin: 0;
  padding: 0;
}

body {
  background: var(--body-background-color);
}

.service-btn-wrap {
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
  margin: 20px;
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
  color: var(--nalda-navy-color);
}

.service-wrap img {
  width: 50px;
  height: 50px;
}

.service-wrap {
  margin-left: 10px;
  background-color: var(--nalda-blue-color);
  color: white;
}

.footer-container {
  width: 100%;
  display: flex;
  flex-direction: column;
  /* align-items: center; */
  margin-top: 10px;
}

footer {
  margin-bottom: 10px;
  text-align: center;
  font-size: smaller;
}
</style>