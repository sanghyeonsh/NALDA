import { login, mypage, modifyMember } from '@/api/user'

export const state = () => ({
  loginMember: '',
  memberDetail: null,
})

export const mutations = {
  SET_LOGIN_MEMBER(state, member) {
    state.loginMember = member
  },
  CLEAR_LOGIN_MEMBER(state) {
    state.loginMember = null
  },
  SET_MEMBER_DETAIL(state, memberDetail) {
    state.memberDetail = memberDetail
  },
  CLEAR_MEMBER_DETAIL(state) {
    state.memberDetail = null
  },
  MODIFY_FULLNAME(state, fullName) {
    state.loginMember.fullName = fullName
  },
  MODIFY_JOB(state, job) {
    state.memberDetail.job = job
  },
  MODIFY_PASSPORTNUM(state, passportNum) {
    state.memberDetail.passportNum = passportNum
  },
  MODIFY_ADDRESS(state, address) {
    state.memberDetail.address = address
  },
  MODIFY_TEL(state, tel) {
    state.memberDetail.tel = tel
  },
  MODIFY_EMAIL(state, email) {
    state.memberDetail.email = email
  },
  MODIFY_GENDER(state, gender) {
    state.memberDetail.gender = gender
  },
  MODIFY_NATIONALITY(state, nationality) {
    state.memberDetail.nationality = nationality
  },
  MODIFY_BIRTHDAY(state, birthday) {
    state.loginMember.birthday = birthday
  },
}

export const getters = {
  isLogin(state) {
    return !state.loginMember === null
  },
}

export const actions = {
  inputLogin({ commit }, userInfo) {
    login(
      {
        username: userInfo.id,
        password: userInfo.password,
      },
      ({ headers, data }) => {
        // const jwtToken = headers.get('Authorization')
        // console.log(jwtToken)
        sessionStorage.setItem('Authorization', headers.authorization)
        if (data.msg === '로그인 성공') {
          commit('SET_LOGIN_MEMBER', data.userInfo)
          this.$router.push('/main')
          console.log(data.ip)
        } else {
          alert('실패')
        }
      },
      (error) => {
        console.log(error)
      }
    )
  },
  async callMemberDetail({ commit }, userid) {
    await mypage(
      userid,
      ({ data }) => {
        commit('SET_MEMBER_DETAIL', data.info)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  modifyMember({ commit }, userObject) {
    modifyMember(
      userObject,
      (response) => {
        const birthday = [
          userObject.birthday.split('-')[0],
          userObject.birthday.split('-')[1],
          userObject.birthday.split('-')[2],
        ]
        commit('MODIFY_BIRTHDAY', birthday)
        commit('MODIFY_FULLNAME', userObject.fullName)
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
