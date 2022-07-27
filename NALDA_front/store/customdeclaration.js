export const state = () => ({
  declaration: [],
})

export const mutations = {
  SAVE_DECLARATION(state, declaration) {
    state.declaration = declaration
  },
}

export const getters = {}

export const actions = {
  saveDeclaration({ commit }) {
    commit('SAVE_DECLARATION')
  },
}
