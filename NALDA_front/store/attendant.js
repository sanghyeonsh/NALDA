import {
  listServices,
  selectServices,
  listOrders,
  //   choiceMeal,
} from '@/api/attendant'

export const state = () => ({
  serviceList: [],
  snackList: [],
  alcoholsList: [],
  nonalcoholosList: [],
  amenityList: [],
  ordersList: [],
})

export const mutations = {
  SET_SERVICE_LIST(state, data) {
    state.serviceList = data
    state.snackList = []
    state.alcoholsList = []
    state.nonalcoholosList = []
    state.amenityList = []

    for (let i = 0; i < data.length; i++) {
      const value = {
        serviceClass: data[i].serviceClass,
        serviceCode: data[i].serviceCode,
        serviceName: data[i].serviceName,
        serviceQuantity: 0,
      }
      if (value.serviceClass === 'SNACK') {
        state.snackList.push(value)
      } else if (value.serviceClass === 'ALCOHOLS') {
        state.alcoholsList.push(value)
      } else if (value.serviceClass === 'NON-ALCOHOLS') {
        state.nonalcoholosList.push(value)
      } else if (value.serviceClass === 'AMENITY') {
        state.amenityList.push(value)
      }
    }
  },

  SET_STOCK_AMOUNT(state, data) {
    console.log(state)
    console.log(data)
  },

  SET_ORDERS_LIST(state, data) {
    console.log('데이터' + data)
    state.ordersList = data
    console.log('데이터터' + state.ordersList)
  },
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
  setStockAmount({ commit }, data) {
    console.log('나 일단 여기 왔쩌염')
    // const stockList = []
    // if(data) {
    //   stockList.push(data)
    // }
    selectServices(
      ({ data }) => {
        commit('SET_STOCK_AMOUNT', data)
        console.log('성공')
      },
      (error) => {
        console.log(error)
      }
    )
  },
  getListOrders({ commit }, flightNum) {
    listOrders(
      flightNum,
      ({ data }) => {
        console.log('나야나' + data.serviceList)
        commit('SET_ORDERS_LIST', data.serviceList)
        console.log('성공')
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
