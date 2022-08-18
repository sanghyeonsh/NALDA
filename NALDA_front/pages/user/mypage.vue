<template>
  <div class="mypage-container">
    <user-navs></user-navs>
    <div class="user-page-wrap fadeInUp">
      <div class="subindex-item">
        <div class="myInfo">내 정보</div>
        <div class="subindex-bluebox">
          <div class="myprofile-wrap">
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
                    <!-- <div class="name-text">익명규</div> -->
                    <div class="myId" v-text="'성명 : ' + fullName"></div>
                  </div>
                </div>
              </li>
            </ul>
          </div>

          <ul class="subindex-row">
            <div class="row-item phone">
              <i class="fa-solid fa-mobile-button"></i>
              <span class="item-text" v-text="'전화번호 : ' + tel"></span>
            </div>
            <div class="row-item mail">
              <i class="fa-solid fa-envelope"></i>
              <span class="item-text" v-text="'이메일 : ' + email"></span>
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
              <i class="fa-solid fa-mobile-button"></i>
              <span class="item-text" v-text="'성별 : ' + gender"></span>
            </div>
            <div class="row-item address">
              <i class="fa-solid fa-location-dot"></i>
              <span class="item-text" v-text="'주소 : ' + mainAddress + ' ' + detailAddress"></span>
            </div>
            <div class="row-item passportnumber">
              <i class="fa-solid fa-passport"></i>
              <span class="item-text" v-text="'여권번호 : ' + passportNum"></span>
            </div>
            <div class="row-item job">
              <i class="fa-solid fa-briefcase"></i>
              <span class="item-text" v-text="'직업 : ' + job"></span>
            </div>
            <div class="row-item nationality">
              <i class="fa-solid fa-briefcase"></i>
              <span class="item-text" v-text="'국적 : ' + nationality"></span>
            </div>
          </ul>
        </div>
      </div>
    </div>
  </div>
</template>

<script scoped>
import { mapState, mapActions } from 'vuex'
import UserNavs from '../../components/UserNavs.vue'
export default {
  name: 'MyPage',
  components: { UserNavs },
  data() {
    return {
      tel: '',
      email: '',
      gender: '',
      mainAddress: '',
      detailAddress: '',
      passportNum: '',
      job: '',
      nationality: '',
    }
  },
  computed: {
    ...mapState('user', ['loginMember', 'memberDetail']),
    fullName() {
      let fullName = ''
      this.loginMember?.fullName?.lastName &&
        (fullName += this.loginMember?.fullName?.lastName)
      this.loginMember.fullName.middleName &&
        (fullName += this.loginMember?.fullName?.middleName)
      this.loginMember.fullName.firstName &&
        (fullName += this.loginMember?.fullName?.firstName)

      return fullName
    },
  },

  created() {
    const promise = new Promise((resolve, reject) => {
      resolve()
    })
    promise.then(async () => {
      await this.callMemberDetail(this.loginMember?.username)
      this.tel = this.memberDetail?.tel
      this.email = this.memberDetail?.email
      this.gender = this.memberDetail?.gender
      this.mainAddress = this.memberDetail?.address?.mainAddress
      this.detailAddress = this.memberDetail?.address?.detailAddress
      this.passportNum = this.memberDetail?.passportNum
      this.job = this.memberDetail?.job
      this.nationality = this.memberDetail?.nationality
    })
  },
  methods: {
    ...mapActions('user', ['callMemberDetail']),
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
  font-family: 'twayfly';
}
.myInfo {
  font-size: xx-large;
  margin-bottom: 5px;
}
.mypage-container {
  width: 100vw;
  height: 70vh;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  /* background-color: orange; */
}

.user-page-wrap {
  height: auto;
  width: 100%;
  color: #1e3c4b;
  display: flex;
  justify-content: center;
  align-items: center;
  margin-bottom: 5%;
}

/* mypage myprofile info CSS */

ol,
ul {
  list-style: none;
  padding-left: 0;
}

.user-page-wrap button {
  width: 10%;
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

.subindex-item {
  height: 75%;
  width: 80%;
}
.subindex-item h4 {
  text-align: right;
  /* margin-bottom: 1%; */
}

.subindex-bluebox {
  /* width: 80%; */
  height: 100%;
  padding: 0% 3% 2% 6%;
  border-radius: 12px;
  box-shadow: 17px 17px 29px 0 rgb(0 164 73 / 8%);
  border: solid 1px #24919b;
  background-color: #fff;
  box-sizing: border-box;
  display: flex;
  flex-direction: column;
  align-items: flex-start;
}

.myprofile-wrap {
  display: flex;
  flex-direction: column;
}

.info-title {
  display: flex;
  flex-direction: column;
  margin-top: 2%;
  margin-bottom: 2%;
}

.info-wrap {
  display: flex;
  flex-direction: row;
}

i {
  cursor: pointer;
}

.myinfo-area {
  margin-top: 3%;
  margin-bottom: 3%;
  width: 100%;
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
  width: 100%;
  display: flex;
  flex-direction: row;
  margin-left: 3%;
  align-items: center;
}

.btn-edit {
  align-items: flex-end;
}

.myname {
  font-size: large;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}

.subindex-row {
  /* margin-top: 1%;
  margin-bottom: 1%; */
  font-size: large;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: space-around;
}

/* .subindex-row .row-item {
  margin-bottom: 0.5%;
  display: flex;
  flex-direction: row;
} */

.fadeInUp {
  animation: fadeInUp 2s ease backwards;
}
@keyframes fadeInUp {
  0% {
    transform: translate(0px, 100px);
    opacity: 0;
  }
  100% {
    transform: translate(0px, 0);
    opacity: 1;
  }
}
</style>
