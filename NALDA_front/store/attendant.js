import {
  listServices,
  selectServices,
  //   choiceMeal,
} from '@/api/attendant'

export const state = () => ({
  serviceList: [],
  snackList: [],
  alcoholsList: [],
  nonalcoholosList: [],
  amenityList: [],
})

export const mutations = {
  SET_SERVICE_LIST(state, data) {
    console.log(data)
    state.serviceList = data
    state.snackList = []
    state.alcoholsList = []
    state.nonalcoholosList = []
    state.amenityList = []

    for (let i = 0; i < data.length; i++) {
      if (data[i].serviceClass === 'SNACK') {
        state.snackList.push(data[i])
      } else if (data[i].serviceClass === 'ALCOHOLS') {
        state.alcoholsList.push(data[i])
      } else if (data[i].serviceClass === 'NON-ALCOHOLS') {
        state.nonalcoholosList.push(data[i])
      } else if (data[i].serviceClass === 'AMENITY') {
        state.amenityList.push(data[i])
      }
    }
  },

  SET_STOCK_AMOUNT(state, data) {},
}

export const getters = {}

// console.log eslint rule수정 충돌방지
export const actions = {
  getServiceList({ commit }) {
    listServices(
      ({ data }) => {
        commit('SET_SERVICE_LIST', data.serviceList)
        // console.log(data)
        // console.log(data.serviceList)
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
        console.log(data)
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
