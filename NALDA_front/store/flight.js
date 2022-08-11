import { inputFlight, infoFlight, endFlight } from '@/api/flight'

export const state = () => ({
  validMsg: null,
})

export const mutations = {
  SET_FLIGHT_INFO(state, validMsg) {
    state.validMsg = validMsg
  },
  CLEAR_FLIGHT_INFO(state) {
    state.validMsg = null
  },
}

export const getters = {}

export const actions = {
  registFlight(info) {
    inputFlight(
      info,
      ({ data }) => {
        console.log(data)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  getFlight({ commit }, flightNum) {
    commit('CLEAR_FLIGHT_INFO')
    infoFlight(
      flightNum,
      ({ data }) => {
        console.log(data.msg)
        commit('SET_FLIGHT_INFO', data.msg)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  modifyFlight(flightNum) {
    endFlight(
      flightNum,
      ({ data }) => {
        console.log(data)
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
