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
          this.$router.push('/customs/thirdparty')
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
