<template>
  <div class="main-container">
    <div class="main-wrap">
      <header>
        <div class="sel-lang-wrap">
          <select class="lang-select">
            <option>Korean</option>
            <option>English</option>
          </select>
        </div>
      </header>
      <section class="terms-section-wrap">
        <div class="all-terms-wrap">
          <div class="terms-title" :class="{ active: !isActive }" @click="agreeAll">
            <!-- <span class="input-chk">
                            <i class="far fa-check-circle"></i>
                            <label for="terms-service"> 날다 이용약관, 개인정보 수집 및 이용, 위치기반서비스 이용약관(선택), 프로모션 정보 수신(선택)에 모두
                                동의합니다.</label>
            </span> ---->
            <!-- <div> 원래거
                <i class="far fa-check-circle"></i> 
            </div>-->
            <div class="check-icon-wrap">
              <img class="check-all-icon" src="../../static/icon/check_mark.png" alt="check-icon" />
            </div>
            <div>
              &nbsp;날다 이용약관, 개인정보 수집 및 이용, 위치기반서비스
              이용약관(선택), 프로모션 정보 수신(선택)에 모두 동의합니다.
            </div>
          </div>
        </div>
        <div class="necessary-terms-wrap">
          <div class="terms-title" :class="{active : !isActive}">
            <div class="check-icon-wrap">
              <img class="check-mark-icon" src="../../static/icon/check_mark.png" alt="check-icon" />
            </div>
            <div>&nbsp;개인정보 3자 제공 수집 및 이용 동의 (필수)</div>
          </div>
          <div class="terms-box">
            <div class="policy-summary">
              <p class="policy-summary-text">
                개인정보보호법에 따라 날다에 회원가입 신청하시는 분께 수집하는
                개인정보의 항목, 개인정보의 수집 및 이용목적, 개인정보의 보유
                및 이용기간, 동의 거부권 및 동의 거부 시 불이익에 관한 사항을
                안내 드리오니 자세히 읽은 후 동의하여 주시기 바랍니다.
              </p>
            </div>
            <div class="article">
              <h3 class="article-title">1. 수집하는 개인정보</h3>
              <p class="article-text">
                이용자는 회원가입을 하지 않아도 정보 검색, 뉴스 보기 등
                대부분의 날다 서비스를 회원과 동일하게 이용할 수 있습니다.
                이용자가 메일, 캘린더, 카페, 블로그 등과 같이 개인화 혹은
                회원제 서비스를 이용하기 위해 회원가입을 할 경우, 날다는
                서비스 이용을 위해 필요한 최소한의 개인정보를 수집합니다.
              </p>
              <div class="clause">
                <h4 class="clause-title">
                  회원가입 시점에 날다가 이용자로부터 수집하는 개인정보는
                  아래와 같습니다.
                </h4>
                <ul class="sections">
                  <li class="sections-section">
                    회원 가입 시에 ‘아이디, 비밀번호, 이름, 생년월일, 성별,
                    휴대전화번호’를 필수항목으로 수집합니다. 만약 이용자가
                    입력하는 생년월일이 만14세 미만 아동일 경우에는 법정대리인
                    정보(법정대리인의 이름, 생년월일, 성별,
                    중복가입확인정보(DI), 휴대전화번호)를 추가로 수집합니다.
                    그리고 선택항목으로 이메일 주소를 수집합니다.
                  </li>
                  <li class="sections-section">
                    단체아이디로 회원가입 시 단체아이디, 비밀번호, 단체이름,
                    이메일주소, 휴대전화번호를 필수항목으로 수집합니다. 그리고
                    단체 대표자명을 선택항목으로 수집합니다.
                  </li>
                </ul>
                <h4 class="clause-title">
                  서비스 이용 과정에서 이용자로부터 수집하는 개인정보는 아래와
                  같습니다.
                </h4>
                <p class="clause-text">
                  회원정보 또는 개별 서비스에서 프로필 정보(별명, 프로필
                  사진)를 설정할 수 있습니다. 회원정보에 별명을 입력하지 않은
                  경우에는 마스킹 처리된 아이디가 별명으로 자동 입력됩니다.
                </p>
                <p class="clause-text">
                  날다 내의 개별 서비스 이용, 이벤트 응모 및 경품 신청
                  과정에서 해당 서비스의 이용자에 한해 추가 개인정보 수집이
                  발생할 수 있습니다. 추가로 개인정보를 수집할 경우에는 해당
                  개인정보 수집 시점에서 이용자에게 ‘수집하는 개인정보 항목,
                  개인정보의 수집 및 이용목적, 개인정보의 보관기간’에 대해
                  안내 드리고 동의를 받습니다.
                </p>
                <h4 class="clause-title">
                  서비스 이용 과정에서 IP 주소, 쿠키, 서비스 이용 기록,
                  기기정보, 위치정보가 생성되어 수집될 수 있습니다. 또한
                  이미지 및 음성을 이용한 검색 서비스 등에서 이미지나 음성이
                  수집될 수 있습니다.
                </h4>
                <p class="clause-text">
                  구체적으로 1) 서비스 이용 과정에서 이용자에 관한 정보를
                  자동화된 방법으로 생성하여 이를 저장(수집)하거나,
                  <br />2) 이용자 기기의 고유한 정보를 원래의 값을 확인하지 못
                  하도록 안전하게 변환하여 수집합니다. 서비스 이용 과정에서
                  위치정보가 수집될 수 있으며,
                  <br />날다에서 제공하는
                  위치기반 서비스에 대해서는 '날다 위치기반서비스
                  이용약관'에서 자세하게 규정하고 있습니다.
                  <br />이와 같이
                  수집된 정보는 개인정보와의 연계 여부 등에 따라 개인정보에
                  해당할 수 있고, 개인정보에 해당하지 않을 수도 있습니다.
                </p>
              </div>
            </div>
            <div class="article">
              <h3 class="article-title">2. 수집한 개인정보의 이용</h3>
              <p class="article-text">
                날다 및 날다 관련 제반 서비스(모바일 웹/앱 포함)의 회원관리,
                서비스 개발・제공 및 향상, 안전한 인터넷 이용환경 구축 등
                아래의 목적으로만 개인정보를 이용합니다.
              </p>
              <ul class="sections">
                <li class="sections-section">
                  회원 가입 의사의 확인, 연령 확인 및 법정대리인 동의 진행,
                  이용자 및 법정대리인의 본인 확인, 이용자 식별, 회원탈퇴
                  의사의 확인 등 회원관리를 위하여 개인정보를 이용합니다.
                </li>
                <li class="sections-section">
                  콘텐츠 등 기존 서비스 제공(광고 포함)에 더하여, 인구통계학적
                  분석, 서비스 방문 및 이용기록의 분석, 개인정보 및 관심에
                  기반한 이용자간 관계의 형성, 지인 및 관심사 등에 기반한
                  맞춤형 서비스 제공 등 신규 서비스 요소의 발굴 및 기존 서비스
                  개선 등을 위하여 개인정보를 이용합니다.
                </li>
                <li class="sections-section">
                  법령 및 날다 이용약관을 위반하는 회원에 대한 이용 제한 조치,
                  부정 이용 행위를 포함하여 서비스의 원활한 운영에 지장을 주는
                  행위에 대한 방지 및 제재, 계정도용 및 부정거래 방지, 약관
                  개정 등의 고지사항 전달, 분쟁조정을 위한 기록 보존, 민원처리
                  등 이용자 보호 및 서비스 운영을 위하여 개인정보를
                  이용합니다.
                </li>
                <li class="sections-section">
                  유료 서비스 제공에 따르는 본인인증, 구매 및 요금 결제, 상품
                  및 서비스의 배송을 위하여 개인정보를 이용합니다.
                </li>
                <li class="sections-section">
                  이벤트 정보 및 참여기회 제공, 광고성 정보 제공 등 마케팅 및
                  프로모션 목적으로 개인정보를 이용합니다.
                </li>
                <li class="sections-section">
                  서비스 이용기록과 접속 빈도 분석, 서비스 이용에 대한 통계,
                  서비스 분석 및 통계에 따른 맞춤 서비스 제공 및 광고 게재
                  등에 개인정보를 이용합니다.
                </li>
                <li class="sections-section">
                  보안, 프라이버시, 안전 측면에서 이용자가 안심하고 이용할 수
                  있는 서비스 이용환경 구축을 위해 개인정보를 이용합니다.
                </li>
              </ul>
            </div>
            <div class="article">
              <h3 class="article-title">
                <strong>3. 개인정보의 보관기간</strong>
              </h3>
              <div class="clause large">
                <h4 class="clause-title">
                  <strong>
                    회사는 원칙적으로 이용자의 개인정보를 회원 탈퇴 시
                    지체없이 파기하고 있습니다.
                  </strong>
                </h4>
                <p class="clause-text">
                  <strong>
                    단, 이용자에게 개인정보 보관기간에 대해 별도의 동의를 얻은
                    경우, 또는 법령에서 일정 기간 정보보관 의무를 부과하는
                    경우에는 해당 기간 동안 개인정보를 안전하게 보관합니다.
                  </strong>
                </p>
              </div>
              <div class="clause">
                <h4 class="clause-title">
                  이용자에게 개인정보 보관기간에 대해 회원가입 시 또는 서비스
                  가입 시 동의를 얻은 경우는 아래와 같습니다.
                </h4>
                <ul class="sections">
                  <li class="sections-section">
                    부정 가입 및 이용 방지
                    <br />부정 이용자의 가입인증 휴대전화번호 또는 DI (만14세
                    미만의 경우 법정대리인DI) : 탈퇴일로부터 6개월 보관
                    <br />탈퇴한 이용자의 휴대전화번호(복호화가 불가능한
                    일방향 암호화(해시처리)) : 탈퇴일로부터 6개월 보관
                  </li>
                  <li class="sections-section">
                    QR코드 복구 요청 대응
                    <br />QR코드 등록 정보:삭제 시점으로부터6개월 보관
                  </li>
                  <li class="sections-section">
                    스마트플레이스 분쟁 조정 및 고객문의 대응
                    <br />휴대전화번호:등록/수정/삭제 요청 시로부터 최대1년
                  </li>
                  <li class="sections-section">
                    날다 플러스 멤버십 서비스 혜택 중복 제공 방지
                    <br />암호화처리(해시처리)한DI :혜택 제공
                    종료일로부터6개월 보관
                  </li>
                  <li class="sections-section">
                    Flyin eXpert 재가입 신청 및 부정 이용 방지
                    <br />eXpert 서비스 및 eXpert 센터 가입 등록정보 :
                    신청일로부터 6개월(등록 거절 시, 거절 의사 표시한 날로부터
                    30일) 보관
                  </li>
                </ul>
              </div>
              <div class="clause">
                <h4 class="clause-title">
                  전자상거래 등에서의 소비자 보호에 관한 법률, 전자문서 및
                  전자거래 기본법, 통신비밀보호법 등 법령에서 일정기간 정보의
                  보관을 규정하는 경우는 아래와 같습니다. 날다는 이 기간 동안
                  법령의 규정에 따라 개인정보를 보관하며, 본 정보를 다른
                  목적으로는 절대 이용하지 않습니다.
                </h4>
                <ul class="sections">
                  <li class="sections-section">
                    전자상거래 등에서 소비자 보호에 관한 법률
                    <br />계약 또는 청약철회 등에 관한 기록: 5년 보관
                    <br />대금결제 및 재화 등의 공급에 관한 기록: 5년 보관
                    <br />소비자의 불만 또는 분쟁처리에 관한 기록: 3년 보관
                  </li>
                  <li class="sections-section">
                    전자문서 및 전자거래 기본법
                    <br />공인전자주소를 통한 전자문서 유통에 관한 기록 : 10년
                    보관
                  </li>
                  <li class="sections-section">
                    전자서명 인증 업무
                    <br />인증서와 인증 업무에 관한 기록: 인증서 효력
                    상실일로부터 10년 보관
                  </li>
                  <li class="sections-section">
                    통신비밀보호법
                    <br />로그인 기록: 3개월
                    <br />
                    <br />
                  </li>
                </ul>
                <p class="clause-text"></p>
                <p class="clause-text">
                  참고로 날다는 ‘개인정보 유효기간제’에 따라 1년간 서비스를
                  이용하지 않은 회원의 개인정보를 별도로 분리 보관하여
                  관리하고 있습니다.
                </p>
              </div>
            </div>
          </div>
        </div>

        <div class="terms-button-wrap">
          <b-button id="btn-group" @click="goBack">back</b-button>
          <b-button
            id="btn-group"
            variant="outline-primary"
            @click="moveDeclaration"
          >agree and start</b-button>
        </div>
      </section>
      <!-- <footer>
          <div class="copyright-wrap">
            <div>
              <span>이용약관 | 개인정보처리방침 | 책임의 한계와 고지 | 회원정보 고객센터</span>
            </div>
            <div>
              <span>Copyright © NALDA Corp. All Rights Reserved.</span>
            </div>
          </div>
      </footer>-->
    </div>
  </div>
</template>

<script>
export default {
  name: 'CustomsThirdpartyTerms',
  data() {
    return {
      isActive: true,
    }
  },
  methods: {
    agreeAll() {
      this.isActive = !this.isActive
    },
    moveDeclaration() {
      this.$router.push('/customs/basic')
    },
    goBack() {
      this.$router.go(-1)
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
  src: local();
}

* {
  margin: 0;
  padding: 0;
  font-family: 'twayfly';
}

.main-container {
  width: 100%;
  height: 70vh;
  display: flex;
  flex-direction: column;
  align-items: center;
  overflow: scroll;
}

.main-container::-webkit-scrollbar {
  display: none; /* Chrome, Safari, Opera*/
}

.main-container .main-wrap {
  width: 768px;
}

.main-container .main-wrap .sel-lang-wrap .lang-select {
  width: 96px;
  height: 30px;
  color: #4e4e4e;
  border: solid 1px #dadada;
}

.main-container .main-wrap header .sel-lang-wrap {
  display: flex;
  justify-content: flex-end;
  margin-top: 2%;
}

/* 약관 시작 CSS */

.terms-section-wrap {
  padding-top: 40px;
  padding-bottom: 60px;
  display: flex;
  flex-direction: column;
  /* align-items: center; */
  /* background-color: var(--body-background-color); */
}

/* 필수, 전체, 선택 공통적으로 들어가는 CSS */

.necessary-terms-wrap,
.all-terms-wrap {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  margin-top: 25px;
}

/* 전체 동의 CSS */
.all-terms-wrap {
  font-size: larger;
  margin-left: 25px;
  margin-right: 25px;
  margin-bottom: 25px;
}

.terms-title {
  display: flex;
  flex-direction: row;
  cursor: pointer;
  /* flex-direction: column; */
  /* justify-content: space-; */
  align-items: center;
}

.active {
  text-shadow: 5px 5px 10px rgba(219, 152, 35, 0.61);
  color: rgba(224, 145, 26, 0.943);
}

.terms-title:hover {
  /* background-color: #88c0c5; */
  /* text-shadow: 5px 5px 10px rgba(46, 205, 229, 0.4);
  color: var(--nalda-blue-color);
  transform: translateY(-7px); */
  text-shadow: 5px 5px 10px rgba(234, 163, 42, 0.61);
  color: rgba(224, 145, 26, 0.943);
  transform: translateY(-7px);
}

/* 약관들 중 overflow지정한 부분들 중간 3개 */

.terms-box {
  position: relative;
  overflow: auto;
  height: 88px;
  margin-top: 10px;
  padding-top: 10px;
  padding-bottom: 10px;
  padding-left: 30px;
  padding-right: 30px;
  border: 1px solid #dadada;
  background: #fff;
  box-sizing: border-box;
  border-radius: 10px;
}

/* 날다 이용약관 동의 부분 CSS */
.article-title {
  font-size: 13px;
  font-weight: bolder;
  margin-bottom: 15px;
  margin-top: 10px;
}

.article-text {
  margin-top: 5px;
  margin-bottom: 5px;
}

.article-text-list {
  position: relative;
  margin-top: 10px;
  margin-bottom: 10px;
}

.event-terms {
  margin-top: 10px;
}

/* 개인정보 수집 및 이용 동의 부분 CSS */

.article,
.policy-summary {
  font-size: 12px;
  line-height: 16px;
  color: #666;
}

p {
  display: block;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
}

.clause .clause-title {
  margin-top: 10px;
}
.clause-title {
  font-size: 13px;
  font-weight: bolder;
}

/* terms-button-wrap CSS */
.terms-button-wrap {
  padding-top: 50px;
  display: flex;
  justify-content: center;
  /* width: 200px;
  height: 48px;
  font-size: 18px;
  border-radius: 10px;
  margin: 10px;
  cursor: pointer; */
}

#btn-group {
  width: 200px;
  height: 48px;
  align-items: center;
  font-size: 18px;
  margin: 10px;
  cursor: pointer;
  border-radius: 10px;
}

/* 왜 색이 자꾸 적용이 안되는 것인가. */
/* #terms-back-btn,
#terms-agree-btn {
  width: 200px;
  height: 48px;
  align-items: center;
  font-size: 18px;
  background: var(--nalda-blue-color); */
/* color: white; */
/* border: solid 1px var(--nalda-blue-border-color);
  border-radius: 10px;
  margin: 10px;
  cursor: pointer;
} */

.check-mark-icon {
  width: 20px;
  height: 20px;
}

.check-all-icon {
  width: 30px;
  height: 30px;
}
</style>
