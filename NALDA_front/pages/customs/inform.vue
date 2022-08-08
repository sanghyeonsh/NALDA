<template>
  <div class="customs-input-container">
    <custom-navs></custom-navs>
    <div class="customform-wrap">
      <div class="customform-main-container">
        <div class="customform-container">
          <div class="customform-title">여행자 휴대품 신고서</div>
          <div class="warn-wrap">
            <ul>
              <li>
                모든 입국자는 관세법에 따라 신고서를 작성, 제출하여야 하며,
                세관공무원이 지정하는 경우에는 휴대폰 검사를 받아야 합니다.
              </li>
              <li>가족여행인 경우에는 1명이 대표로 신고할 수 있습니다.</li>
              <li>신고서 작성 전에 반드시 뒷면의 유의사항을 읽어보시기 바랍니다.</li>
            </ul>
          </div>
        </div>
        <div class="next-btn-wrap">
          <b-button
            class="next-page"
            variant="info"
            @click="$router.push('/customs/basic')"
            >확인했습니다.</b-button
          >
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import CustomNavs from '../../components/CustomNavs.vue'
export default {
  name: 'CustomsInform',
  components: { CustomNavs },
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

.customs-input-container {
  width: 100%;
  height: 70vh;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
}
.customform-main-container {
  width: 90%;
  height: auto;
  padding: 3%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.customform-wrap {
  height: auto;
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.customform-container {
  width: 100%;
  height: 80%;
  padding: 2%;
  border: solid 2px #104b69;
  box-shadow: 10px 10px 15px rgba(15, 61, 107, 0.1);
  transition: all 0.3s ease 0s;
  display: flex;
  flex-direction: column;
}
.customform-title {
  font-size: xx-large;
  font-weight: bolder;
  text-align: center;
  color: #004568;
  margin-bottom: 7%;
}
/* 세관신고서 최상단 경고 wrap CSS*/

.warn-wrap {
  width: 100%;
  height: 50%;
  padding: 7%;
  background-color: #ffeab2;
  box-shadow: 10px 10px 15px rgba(234, 142, 71, 0.1);
  transition: all 0.3s ease 0s;
  border-radius: 4px;
  align-content: center;
  font-size: larger;
}

.next-page {
  width: 30%;
  height: 5vh;
}

.next-btn-wrap {
  width: 80%;
  margin-top: 2%;
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
}
</style>
