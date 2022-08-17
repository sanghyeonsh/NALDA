import { validFlight, inputFlight } from '../api/flight'
import { login, mypage, modifyMember } from '@/api/user'

export const state = () => ({
  loginMember: null,
  flightNum: '',
  seatInfo: null,
  memberDetail: null,
  terms: {
    termService: 'N',
    privacyPolicy: 'N',
    locationBased: 'N',
    promotionalInfo: 'N',
  },
})

export const mutations = {
  AGREE_TERMS(state, terms) {
    state.terms.termService = terms.termService ? 'Y' : 'N'
    state.terms.privacyPolicy = terms.privacyPolicy ? 'Y' : 'N'
    state.terms.locationBased = terms.locationBased ? 'Y' : 'N'
    state.terms.promotionalInfo = terms.promotionalInfo ? 'Y' : 'N'
  },
  SET_FLIGHTNUM(state, flightNum) {
    state.flightNum = flightNum
  },
  CLEAR_FLIGHTNUM(state) {
    state.flightNum = ''
  },
  SET_SEATINFO(state, info) {
    state.seatInfo = info
  },
  CLEAR_SEATINFO(state) {
    state.seatInfo = null
  },
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
    return !(state.loginMember === null)
  },
}

export const actions = {
  async inputLogin({ commit }, object) {
    await validFlight(object.flightNum, async ({ data }) => {
      if (data.msg === '유효한 항공편명입니다.') {
        commit('SET_FLIGHTNUM', object.flightNum)
        await login(
          {
            username: object.id,
            password: object.password,
          },
          ({ headers, data }) => {
            sessionStorage.setItem('Authorization', headers.authorization)
            if (data.msg === '로그인 성공') {
              commit('SET_LOGIN_MEMBER', data.userInfo)
              if (data.userInfo.userRole !== 'ROLE_ATTENDANT') {
                commit('SET_SEATINFO', data.seatInfo)
              }
            }
          },
          (error) => {
            console.log(error)
          }
        )
      } else {
        await login(
          {
            username: object.id,
            password: object.password,
          },
          async ({ headers, data }) => {
            if (
              data.userInfo.userRole === 'ROLE_ATTENDANT' &&
              data.msg === '로그인 성공'
            ) {
              commit('SET_FLIGHTNUM', object.flightNum)
              const flightObject = {
                flightNum: object.flightNum,
                airplaneKind: data.seatInfo.airplaneKind,
                status: 'PROGRESS',
              }
              await inputFlight(
                flightObject,
                ({ data }) => {
                  console.log(data.msg)
                },
                (error) => {
                  console.log(error)
                }
              )
              sessionStorage.setItem('Authorization', headers.authorization)
              commit('SET_LOGIN_MEMBER', data.userInfo)
            }
          }
        )
      }
    })
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
