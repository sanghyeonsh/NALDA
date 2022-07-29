import {
  listServices,
  selectServices,
  //   choiceMeal,
} from '@/api/attendant'

export const state = () => ({
  serviceItems: [],
})

export const mutations = {
  GET_SERVICE_LIST(state, data) {},

  SET_STOCK_AMOUNT(state, data) {},
}

export const getters = {}

// console.log eslint rule수정 충돌방지
export const actions = {
  getServiceList({ commit }) {
    listServices(
      ({ data }) => {
        commit('GET_SERVICE_LIST', data)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  setStockAmount({ commit }) {
    selectServices(
      ({ data }) => {
        commit('SET_STOCK_AMOUNT', data)
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
