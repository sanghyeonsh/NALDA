<template>
  <div class="customs-input-container">
    <custom-navs></custom-navs>
    <div class="customform-wrap">
      <div class="customform-main-container">
        <div class="customform-container">
          <div class="customform-title">여행자 휴대품 신고서</div>
          <div class="declaration-detail-wrap">
            <div class="alcohols-perfume-cigarette">
              <h4>
                ▶주류ㆍ향수ㆍ담배
                <small>(면세범위가 초과되는 경우에는 전체 반입량을 적습니다.)</small>
              </h4>
              <table class="apc-table-wrap">
                <tr id="alcohols">
                  <td>주류</td>
                  <td colspan="3">
                    <input id="alcohols" type="text" name="cnt" />병,
                    <input id="alcohols" type="text" name="alcohols" />ℓ,
                    <input id="alcohols" type="text" name="alcohols" />$
                  </td>
                </tr>
                <tr id="perfume-cigarette">
                  <td>담배</td>
                  <td>
                    <input id="cigarette" type="text" name="cigarette" />갑(20개비 기준)
                  </td>
                  <td>향수</td>
                  <td>
                    <input id="perfume" type="text" name="perfume" />㎖
                  </td>
                </tr>
              </table>
            </div>
            <div class="etc-exceed-wrap">
              <h4>▶그 밖의 면세범위 (US $600) 초과 물품</h4>
              <table class="etc-exceed-table">
                <thead>
                  <td>품명</td>
                  <td>수(증)량</td>
                  <td>금액</td>
                </thead>
                <tr>
                  <td>
                    <input id="goods-name" type="text" />
                  </td>
                  <td>
                    <input id="goods-cnt" type="text" />
                  </td>
                  <td>
                    <input id="goods-price" type="text" />
                  </td>
                </tr>
                <tr>
                  <td>
                    <input id="goods-name" type="text" />
                  </td>
                  <td>
                    <input id="goods-cnt" type="text" />
                  </td>
                  <td>
                    <input id="goods-price" type="text" />
                  </td>
                </tr>
                <tr>
                  <td>
                    <input id="goods-name" type="text" />
                  </td>
                  <td>
                    <input id="goods-cnt" type="text" />
                  </td>
                  <td>
                    <input id="goods-price" type="text" />
                  </td>
                </tr>
                <tr>
                  <td>
                    <input id="goods-name" type="text" />
                  </td>
                  <td>
                    <input id="goods-cnt" type="text" />
                  </td>
                  <td>
                    <input id="goods-price" type="text" />
                  </td>
                </tr>
              </table>
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
  name: 'CustomsDetail',
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
/* declaration-detail-wrap CSS */

table {
  width: 100%;
  height: 100%;
}

table tr,
td {
  padding: 10px;
  border: 1px solid #444444;
}

.declaration-detail-wrap {
  border: solid 1.4px black;
  display: flex;
  padding: 2%;
  flex-direction: column;
}

/* apc table wrap CSS */

.alcohols-perfume-cigarette h4 {
  margin-bottom: 1.5%;
}
.apc-table-wrap {
  padding: 2%;
  text-align: center;
  width: 100%;
}

#alcohols input {
  width: 22%;
  margin-left: 2%;
  margin-right: 2%;
  border-left: none;
  border-right: none;
  border-top: none;
  outline: none;
}

#perfume-cigarette input {
  width: 40%;
  margin-left: 3%;
  margin-right: 3%;
  border-left: none;
  border-right: none;
  border-top: none;
  outline: none;
}

/* etc exceed wrap CSS */
.etc-exceed-wrap h4 {
  margin-top: 2%;
  margin-bottom: 1.5%;
}

.etc-exceed-table {
  text-align: center;
  width: 100%;
}

.etc-exceed-wrap input {
  width: 80%;
  border: none;
  outline: none;
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