import { getToiletLog } from '../api/toilet'

export const state = () => ({
  toilet: [],
})

export const mutations = {
  CLEAR_TOILET(state) {
    state.toilet = []
  },
  SET_TOILET(state, toilet) {
    state.toilet = toilet
  },
}

export const getters = {}

export const actions = {
  async callToiletLog({ commit }, airplaneKind) {
    await getToiletLog(
      airplaneKind,
      ({ data }) => {
        commit('SET_TOILET', data.toiletLog)
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
