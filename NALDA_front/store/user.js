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
  clearMember({ commit }) {
    commit('CLEAR_LOGIN_MEMBER')
  },
  setLoginMember({ commit }, member) {
    commit('SET_LOGIN_MEMBER', member)
  },
}
