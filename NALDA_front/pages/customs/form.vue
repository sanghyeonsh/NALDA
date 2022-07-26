<template>
  <div class="customs-input-container">
    <div class="customs-nav">
      <custom-navs></custom-navs>
    </div>
    <div class="customform-wrap">
      <div class="customform-main-container">
        <div class="customform-container">
          <div class="customform-title">여행자 휴대품 신고서</div>
          <div class="warn-wrap">
            <ul>
              <li>모든 입국자는 관세법에 따라 신고서를 작성, 제출하여야 하며, 세관공무원이 지정하는 경우에는 휴대폰 검사를 받아야 합니다.</li>
              <li>가족여행인 경우에는 1명이 대표로 신고할 수 있습니다.</li>
              <li>신고서 작성 전에 반드시 뒷면의 유의사항을 읽어보시기 바랍니다.</li>
            </ul>
          </div>
          <div class="custom-info-wrap">
            <table class="custom-info-table">
              <tr>
                <td id="col-name">성명</td>
                <td colspan="3">
                  <input type="text" placeholder="이름을 입력해주세요." />
                </td>
              </tr>
              <tr>
                <!-- 첫번째 줄 시작 -->
                <td id="col-name">생년월일</td>
                <td>
                  <input type="date" />
                </td>
                <td id="col-name">여권번호</td>
                <td>
                  <input type="text" placeholder="여권번호를 입력해주세요." />
                </td>
              </tr>
              <!-- 첫번째 줄 끝 -->
              <tr>
                <!-- 두번째 줄 시작 -->
                <td id="col-name">직업</td>
                <td>
                  <input type="text" placeholder="직업을 입력해주세요." />
                </td>
                <td id="col-name">여행기간</td>
                <td>
                  <input type="text" placeholder="여행기간을 입력해주세요." /> (일)
                </td>
              </tr>
              <!-- 두번째 줄 끝 -->
              <tr>
                <td id="col-name">여행목적</td>
                <td colspan="3">
                  <label>
                    <input type="checkbox" value="travel" checked />여행
                  </label>
                  <label>
                    <input type="checkbox" value="business" />사업
                  </label>
                  <label>
                    <input type="checkbox" value="visitfamily" />친지방문
                  </label>
                  <label>
                    <input type="checkbox" value="public" />공무
                  </label>
                  <label>
                    <input type="checkbox" value="etc" />기타
                  </label>
                </td>
              </tr>
              <tr>
                <td id="col-name">항공편명</td>
                <td>
                  <input type="text" placeholder="항공편을 입력해주세요." />
                </td>
                <td id="col-name">동반가족수</td>
                <td>
                  <input class="family-num" type="text" placeholder="00" /> 명
                </td>
              </tr>
              <tr>
                <td colspan="4">
                  대한민국에 입국하기전 방문했던 국가 (총
                  <input
                    class="visit-country-num"
                    type="text"
                    placeholder="방문했던 국가 총 수"
                  /> 개국)
                  <br />
                  <div class="visited-countries">
                    <div>
                      1.
                      <input class="visited-country-name" type="text" />
                    </div>
                    <div>
                      3.
                      <input class="visited-country-name" type="text" />
                    </div>
                    <div>
                      2.
                      <input class="visited-country-name" type="text" />
                    </div>
                  </div>
                </td>
              </tr>
              <tr>
                <td id="col-name">국내주소</td>
                <td colspan="3">asdf</td>
              </tr>
              <tr>
                <td id="col-name">전화번호</td>
                <td colspan="3">☎ asdf</td>
              </tr>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import CustomNavs from '../../components/CustomNavs.vue'
export default {
  name: 'CustomsForm',
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
  display: flex;
  flex-direction: row;
  justify-content: space-between;
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
  height: auto;
  width: 80%;
  display: flex;
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
  margin-bottom: 3%;
}
/* 세관신고서 최상단 경고 wrap CSS*/

.warn-wrap {
  width: 100%;
  height: 40%;
  padding: 2%;
  margin-bottom: 1%;
  background-color: #ffeab2;
  box-shadow: 10px 10px 15px rgba(234, 142, 71, 0.1);
  transition: all 0.3s ease 0s;
  border-radius: 4px;
  align-content: center;
}

.custom-info-wrap {
  padding: 3%;
  background-color: #dadada;
  border-radius: 4px;
}

.custom-info-wrap input {
  background-color: #dadada;
  border: none;
  outline: none;
}

table tr,
td {
  padding: 10px;
  border: 1px solid #104b69;
}

.custom-info-table {
  width: 100%;
  border: 1px solid#104b69;
  border-style: hidden;
}

/* .custom-info-wrap .custom-info-table tr,td{
  padding: 10px;
  border: 1px solid #444444;
} */

#col-name {
  width: 25%;
  text-align: justify;
}

.family-num {
  width: 50%;
  background-color: white;
  outline: none;
  border-top: none;
  border-left: none;
  border-right: none;
}

.visit-country-num {
  background-color: white;
  width: 15%;
  outline: none;
  border-top: none;
  border-left: none;
  border-right: none;
}
.visited-country-name {
  background-color: white;
  width: 80%;
  outline: none;
  border-top: none;
  border-left: none;
  border-right: none;
}

.visited-countries {
  display: flex;
  flex-direction: row;
  justify-content: space-around;
}
</style>