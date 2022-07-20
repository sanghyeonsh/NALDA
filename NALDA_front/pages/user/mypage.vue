<template>
  <div class="mypage-container">
    <div class="user-nav">
      <user-navs></user-navs>
    </div>
    <div class="user-page-wrap">
      <div class="subindex-item">
        <h4>내 정보</h4>
        <div class="subindex-bluebox">
          <div class="myprofile-wrap">
            <div class="info-title">
              <div class="info-wrap">
                <div class="title-text">기본정보</div>
                <span>
                  <i class="fa-solid fa-circle-info"></i>
                </span>
              </div>
            </div>
            <ul class="myinfo-area">
              <li>
                <div class="myphoto">
                  <img
                    src="https://static.nid.naver.com/images/web/user/default.png"
                    width="56"
                    height="56"
                    alt="내 프로필 이미지"
                  />
                </div>
              </li>
              <li>
                <div class="myaccount" style="width: 651px">
                  <div class="myname">
                    <div class="name-text">익명규</div>
                    <div class="myId">anonymous-ku</div>
                  </div>
                  <button type="button" class="btn-edit">
                    <span class="text">수정</span>
                  </button>
                </div>
              </li>
            </ul>
          </div>

          <ul class="subindex-row">
            <li>
              <div class="row-item phone">
                <div>
                  <i class="fa-solid fa-mobile-button"></i>
                  <span class="item-text">+82 10-3***-7***</span>
                </div>
                <button type="button" class="btn-edit">
                  <span class="text">수정</span>
                </button>
              </div>
              <div class="row-item mail">
                <div>
                  <i class="fa-solid fa-envelope"></i>
                  <span class="item-text">jk******@n*******.com</span>
                </div>
                <button type="button" class="btn-edit">
                  <span class="text">수정</span>
                </button>
              </div>
              <!-- 만일 email 등록이 안되어 있을 경우 뜨게 할 부분 -->
              <!-- <div class="row-item mail not">
                        <div>
                            <i class="fa-solid fa-envelope"></i>
                            <span class="item-text">본인확인 이메일 없음</span>
                        </div>
                        <button type="button" class="btn-accent">
                            <span class="text">등록</span>
                        </button>
              </div>-->
              <div class="row-item gender">
                <div>
                  <i class="fa-solid fa-mobile-button"></i>
                  <span class="item-text">+82 10-3***-7***</span>
                </div>
                <button type="button" class="btn-edit">
                  <span class="text">수정</span>
                </button>
              </div>
              <div class="row-item address">
                <div>
                  <i class="fa-solid fa-location-dot"></i>
                  <span class="item-text">서울시 동대문구</span>
                </div>
                <button type="button" class="btn-edit">
                  <span class="text">수정</span>
                </button>
              </div>
              <div class="row-item passportnumber">
                <div>
                  <i class="fa-solid fa-passport"></i>
                  <span class="item-text">M77139987</span>
                </div>
                <button type="button" class="btn-edit">
                  <span class="text">수정</span>
                </button>
              </div>
              <div class="row-item job">
                <div>
                  <i class="fa-solid fa-briefcase"></i>
                  <span class="item-text">SW engineer</span>
                </div>
                <button type="button" class="btn-edit">
                  <span class="text">수정</span>
                </button>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import UserNavs from '../../components/UserNavs.vue'
export default {
  name: 'MyPage',
  components: { UserNavs },
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

.mypage-container {
  width: 100%;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
}

.user-page-wrap {
  height: auto;
  width: 80%;
  color: #1e3c4b;
  display: flex;
  justify-content: center;
  align-items: center;
}

/* mypage myprofile info CSS */

ol,
ul {
  list-style: none;
  padding-left: 0;
}

.user-page-wrap button {
  width: 80px;
  height: 30px;
  font-size: 11px;
  text-transform: uppercase;
  letter-spacing: 2.5px;
  font-weight: 500;
  background-color: #fff;
  color: #1e3c4b;
  border: none;
  border-radius: 15px;
  box-shadow: 5px 5px 10px rgba(0, 0, 0, 0.1);
  transition: all 0.3s ease 0s;
  cursor: pointer;
  outline: none;
}

.user-page-wrap button:hover {
  background-color: #88c0c5;
  box-shadow: 5px 5px 10px rgba(46, 205, 229, 0.4);
  color: #fff;
  transform: translateY(-7px);
}

.subindex-item h4 {
  text-align: right;
  margin-bottom: 20px;
}

.subindex-bluebox {
  width: 800px;
  padding: 20px 50px;
  border-radius: 12px;
  box-shadow: 17px 17px 29px 0 rgb(0 164 73 / 8%);
  border: solid 1px #24919b;
  background-color: #fff;
  box-sizing: border-box;
}

.myprofile-wrap {
  display: flex;
  flex-direction: column;
}

.info-title {
  display: flex;
  flex-direction: column;
  margin-top: 20px;
  margin-bottom: 10px;
}

.info-wrap {
  display: flex;
  flex-direction: row;
}

i {
  cursor: pointer;
}

.myinfo-area {
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-between;
}

.myinfo-area .myphoto img {
  box-shadow: 0 3px 6px 0 rgb(29 34 53 / 8%);
  border-radius: 50%;
  vertical-align: top;
}

.myaccount {
  display: flex;
  flex-direction: row;
  margin-left: 40px;
  align-items: center;
}

.btn-edit {
  align-items: flex-end;
}

.myname {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}

.subindex-row {
  margin-top: 30px;
  margin-bottom: 30px;
}

.subindex-row .row-item {
  margin-bottom: 10px;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
}
</style>
