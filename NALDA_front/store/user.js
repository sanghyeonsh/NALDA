import { login } from '@/api/user'

export const state = () => ({
  loginMember: null,
})

export const mutations = {
  SET_LOGIN_MEMBER(state, member) {
    state.loginMember = member
  },
  CLEAR_LOGIN_MEMBER(state) {
    state.loginMember = null
  },
}

export const getters = {}

export const actions = {
  inputLogin({ commit, state }) {
    console.log(this.id + ' ' + this.password)
    login(
      {
        username: this.id,
        password: this.password,
      },
      ({ headers, data }) => {
        // const jwtToken = headers.get('Authorization')
        // console.log(jwtToken)
        sessionStorage.setItem('Authorization', headers.authorization)
        if (data.msg === '로그인 성공') {
          commit('SET_LOGIN_MEMBER', data)
          console.log(this.state.loginMember)
          // 세관신고서로 넘어가야함(임시)
        } else {
          alert('실패')
        }
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
