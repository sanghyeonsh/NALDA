<template>
  <div class="customs-input-container">
    <div class="customs-nav">
      <custom-navs></custom-navs>
    </div>
    <div class="customform-wrap">
      <div class="customform-main-container">
        <div class="customform-container">
          <div class="customform-title">여행자 휴대품 신고서</div>
          <div class="sign-wrap">
            <div id="confirm-msg">
              <div>
                <h4>본인은 이 신고서를 사실대로 성실하게 작성하였습니다.</h4>
              </div>
              <div class="sign-date">
                <h4>
                  <input id="date-detail" type="text" placeholder="yyyy" />년
                  <input id="date-detail" type="text" placeholder="mm" />월
                  <input id="date-detail" type="text" placeholder="dd" />일
                </h4>
              </div>
            </div>
            <div>
              <h4 class="sign">
                신고인 :
                <input type="text" placeholder="이름" />(서명)
              </h4>
            </div>
          </div>
        </div>
        <div class="next-btn-wrap">
          <div>
            <b-button class="next-page" variant="info">next</b-button>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import CustomNavs from '../../components/CustomNavs.vue'
export default {
  name: 'CustomsComplete',
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

.customs-input-container {
  width: 100%;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
}
.customform-main-container {
  width: 100%;
  height: 100%;
  padding: 3%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.customform-wrap {
  height: 100%;
  width: 80%;
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

/* sign wrap CSS */

.sign-wrap {
  width: 100%;
  padding: 2%;
  background-color: #e0e1e3;
  box-shadow: 10px 10px 15px rgba(65, 65, 65, 0.1);
  transition: all 0.3s ease 0s;
  border-radius: 4px;
}

.sign-wrap input {
  background-color: #e0e1e3;
  outline: none;
  border-top: none;
  border-left: none;
  border-right: none;
}

#confirm-msg {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}

#confirm-msg div {
  width: 100%;
}

.sign {
  margin-top: 2%;
  margin-bottom: 2%;
  text-align: right;
}

.sign-date {
  width: 40%;
  text-align: center;
}

#date-detail {
  width: 20%;
}

.next-page {
  width: 200%;
  height: 140%;
}
.next-btn-wrap {
  margin-top: 2%;
  display: flex;
  flex-direction: row;
  align-content: flex-end;
}
</style>