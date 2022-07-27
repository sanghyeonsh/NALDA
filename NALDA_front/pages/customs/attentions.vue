<template>
  <div>
    <b-tabs pills>
      <b-tab title="1page" active>
        <div class="custom-allowance-container1">
          <div class="dutyfree-allowance-wrap">
            <h2>1. 휴대품 면세 범위</h2>
            <div class="apc-wrap">
              <h4>▶ 주류ㆍ향수ㆍ담배</h4>
              <table class="apc-allowance-table">
                <thead>
                  <td style="border-right: 1px solid #444444;">주류</td>
                  <td style="border-right: 1px solid #444444;">향수</td>
                  <td>담배</td>
                </thead>
                <tr>
                  <td style="border-right: 1px solid #444444;">
                    1병
                    <br />(1ℓ 이하로서 US $400 이하)
                  </td>
                  <td style="border-right: 1px solid #444444;">60㎖</td>
                  <td>200개비</td>
                </tr>
                <tr>
                  <td colspan="3" style="text-align: left;">* 만 19세 미만인 사람에게는 주류 및 담배를 면세하지 않습니다.</td>
                </tr>
              </table>
            </div>
            <div class="etc-wrap">
              <h4>▶ 기타 물품</h4>
              <table class="etc-allowance-table">
                <tr>
                  <td colspan="3">
                    <div class="etc-detail">
                      <div>
                        US $600 이하
                        <br />(자가 사용, 선물용, 신변용품 등으로 한정합니다.)
                      </div>
                      <div>
                        <strong>*다만, 농림축산물, 한약재 등은 10만원 이하로 한정하여, 품목별로 수량 또는 중량에 제한이 있습니다.</strong>
                      </div>
                    </div>
                  </td>
                </tr>
              </table>
            </div>
          </div>
          <div class="prohibit-goods-wrap">
            <div>
              <h2>2. 반입이 금지되거나 제한되는 물품</h2>
            </div>
            <div class="prohibit-list">
              <ul>
                <li>- 총포(모의총포)ㆍ도검 등 무기류, 실탄 및 화약류, 방사성물질, 감청설비 등</li>
                <li>- 메트암페타민ㆍ아편ㆍ헤로인ㆍ대마 등 마약류 및 오ㆍ남용 우려 의약품</li>
                <li>- 헌법질서ㆍ공공의 안녕질서ㆍ풍속을 해치는 물품 및 정부의 기밀을 누설하거나 첩보활동에 사용되는 물품</li>
                <li>- 위조(가짜)상품 등 지식재산권 침해물품, 위조지폐 및 위ㆍ변조된 유가증권</li>
                <li>- 웅담, 사향, 녹용, 악어 가죽, 상아 등 멸종위기에 처한 야생 동식물 및 관련 제품</li>
              </ul>
            </div>
          </div>
        </div>
      </b-tab>
      <b-tab title="2page">
        <div class="custom-allowance-container2">
          <div class="quarantine-goods-wrap">
            <div class="quarantine-goods-detail">
              <div>
                <h2>3. 반입이 금지되거나 제한되는 물품</h2>
              </div>
              <div class="quarantine-list">
                <ul>
                  <li>살아있는 동물(반려견 등) 및 수산동물(물고기) 등, 고기, 육포, 소시지, 햄, 치즈 등 육가공품</li>
                  <li>흙, 호두, 장뇌삼, 송이, 망고ㆍ오렌지ㆍ체리 등 생과일, 견과류 및 채소류</li>
                </ul>
              </div>
            </div>
          </div>
          <div class="attention-wrap">
            <div class="attention-detail">
              <div>
                <h2>※ 유의사항</h2>
              </div>
              <div class="attention-list">
                <ul>
                  <li>
                    <b>성명</b>은 여권의
                    <b>한글</b> 또는
                    <b>영문명</b>으로 적으시기 바랍니다.
                  </li>
                  <li>
                    신고 대상 물품을 신고하지 않거나 허위신고 또는 대리반입하는 경우 「관세법」에 따라
                    <b style="color: red;">
                      5년 이하의 징역 또는 해당물품
                      유치, 가산세 부과(납부세역의 40%, 2년이내 2회 초과할 경우에는 60%), 통고처분 및 해당물품 몰수
                    </b> 등 불이익을 받게 됩니다.
                  </li>
                  <li>
                    <b>FTA 협정</b>등에 따라 일정 요건을 갖춘 물품은
                    <b>특혜 관세를 적용</b>받을 수 있으며, 다만
                    <b>사후에 특혜관세를 신청</b>하려는
                    경우에는
                    <b>일반 수입신고가 필요</b>합니다.
                  </li>
                  <br />
                  <li>그 밖의 궁금하신 사항은 세관공무원 또는 ☏125로 문의하시기 바랍니다.</li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </b-tab>
    </b-tabs>
  </div>
</template>

<script>
export default {
  name: 'CustomsAttentions',
  data() {
    return {}
  },
  methods: {},
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

.custom-allowance-container1,
.custom-allowance-container2 {
  width: 100%;
  height: 100%;
  padding: 3%;
  display: flex;
  flex-direction: row;
  justify-content: space-around;
}

/* dutyfree allowance wrap CSS */

.dutyfree-allowance-wrap {
  width: 600px;
  height: 400px;
  padding: 4%;
  background-color: #fbe9cb;
  border-radius: 10px;
  display: flex;
  flex-direction: column;
  align-content: center;
  box-shadow: 10px 10px 15px rgba(234, 142, 71, 0.1);
  transition: all 0.3s ease 0s;
}

/* th,
  td {
    padding: 10px;
    border: 1px solid #444444;
  } */
.apc-wrap {
  margin-top: 3%;
  margin-bottom: 1%;
}
.apc-allowance-table {
  width: 100%;
  width: 100%;
  border-collapse: collapse;
  padding-top: 20px;
  padding-bottom: 20px;
  text-align: center;
}

.apc-allowance-table td {
  border: 1px solid #444444;
  border-left: none;
  border-right: none;
  border-block-end: none;
}

.etc-wrap {
  margin-top: 2%;
}
.etc-allowance-table {
  width: 100%;
  width: 100%;
  border-collapse: collapse;
  padding-top: 20px;
  padding-bottom: 20px;
}
.etc-allowance-table td {
  border: 1px solid #444444;
  border-left: none;
  border-right: none;
  border-block-end: none;
  padding: 1%;
}
.etc-detail {
  display: flex;
  flex-direction: column;
  font-size: small;
}

/* prohibit goods wrap CSS */
.prohibit-goods-wrap {
  width: 600px;
  height: 400px;
  background-color: #ffeab2;
  padding: 4%;
  border-radius: 10px;
  display: flex;
  flex-direction: column;
  align-content: center;
  box-shadow: 10px 10px 15px rgba(208, 110, 35, 0.1);
  transition: all 0.3s ease 0s;
}

.prohibit-list {
  margin-top: 4%;
  font-size: 16px;
}

/* quarantine-goods-wrap CSS */

.quarantine-goods-wrap {
  width: 600px;
  height: 400px;
  background-color: #e9f1c1;
  padding: 4%;
  border-radius: 10px;
  display: flex;
  flex-direction: column;
  align-content: center;
  box-shadow: 10px 10px 15px rgba(117, 193, 31, 0.1);
  transition: all 0.3s ease 0s;
}

.quarantine-list {
  margin-top: 4%;
  font-size: 16px;
}

/* attention-wrap CSS */
.attention-wrap {
  width: 600px;
  height: 400px;
  background-color: #fbe9cb;
  padding: 4%;
  border-radius: 10px;
  display: flex;
  flex-direction: column;
  align-content: center;
  box-shadow: 10px 10px 15px rgba(208, 110, 35, 0.1);
  transition: all 0.3s ease 0s;
}

.attention-list {
  margin-top: 4%;
}
</style>