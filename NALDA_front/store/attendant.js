import {
  listServices,
  selectServices,
  listOrders,
  updateStatus,
  modifyServices,
  //   choiceMeal,
} from '@/api/attendant'

export const state = () => ({
  serviceList: [],
  snackList: [],
  alcoholsList: [],
  nonalcoholosList: [],
  amenityList: [],
  ordersList: [],
  completeList: [],
  setStock: false,
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
    state.setStock = true
    // console.log(state.setStock)
    console.log(data)
  },

  SET_ORDERS_LIST(state, data) {
    // console.log('데이터' + data)
    state.orderList = []
    state.completeList = []
    console.log('store입니다 ' + data.length)
    for (let i = 0; i < data.length; i++) {
      if (data[i].classification === 'SNACK&DRINK') {
        data[i].classification = '취식 및 음료'
      } else if (data[i].classification === 'MEDICAL') {
        data[i].classification = '의료'
      } else if (data[i].classification === 'AMENITY') {
        data[i].classification = '편의물품'
      }
      if (data[i].status === 'PROGRESS') {
        state.ordersList.push(data[i])
      } else if (data[i].status === 'DONE') {
        state.completeList.push(data[i])
      }
    }
    console.log('store입니다 ' + state.orderList)
    console.log('store입니다 ' + state.completeList)
  },
}

export const getters = {
  ordersObject(state) {
    const request = []
    console.log(state.ordersList.length)
    if (state.ordersList.length > 0)
      for (let i = 0; i < state.ordersList.length; i++) {
        const order = {
          id: state.ordersList[i].id,
          좌석: state.ordersList[i].seatNum,
          분류: state.ordersList[i].classification,
          요청사항: '',
          요청시각: state.ordersList[i].orderTime.split('T')[1],
          상태: state.ordersList[i].status,
          주문상세: state.ordersList[i].orderList,
        }
        request.push(order)
      }
    return request
  },
  completeObject(state) {
    const complete = []
    console.log(state.completeList.length)
    if (state.completeList.length > 0)
      for (let i = 0; i < state.completeList.length; i++) {
        let orderDetail = ''
        if (state.completeList[i].orderList.length > 1) {
          orderDetail =
            state.completeList[i].orderList[0].orderName +
            ' 외 ' +
            (state.completeList[i].orderList.length - 1)
        } else {
          orderDetail = state.completeList[i].orderList[0].orderName
        }
        const order = {
          id: state.completeList[i].id,
          좌석: state.completeList[i].seatNum,
          분류: state.completeList[i].classification,
          요청사항: orderDetail,
          요청시각: state.completeList[i].orderTime.split('T')[1],
          상태: state.completeList[i].status,
          주문상세: state.completeList[i].orderList,
        }
        complete.push(order)
      }
    return complete
  },
}

// console.log eslint rule수정 충돌방지
export const actions = {
  getServiceList({ commit }) {
    listServices(
      ({ data }) => {
        commit('SET_SERVICE_LIST', data.serviceList)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  setStockAmount({ commit }, totalQuantity) {
    console.log('나 재고입력 왔쩌염')
    selectServices(
      totalQuantity,
      ({ data }) => {
        commit('SET_STOCK_AMOUNT', data)
        console.log('성공')
      },
      (error) => {
        console.log(error)
      }
    )
  },
  modifyStockAmount({ commit }, totalQuantity) {
    console.log('나 재고수정 왔쩌염')
    modifyServices(
      totalQuantity,
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
        console.log('store입니다 ' + JSON.stringify(data))
        console.log('store입니다 ' + data)
        commit('SET_ORDERS_LIST', data.serviceList)
        console.log('성공')
      },
      (error) => {
        console.log(error)
      }
    )
  },
  updateOrderStatus(orderId) {
    console.log(11111111111)
    console.log(orderId)
    updateStatus(
      orderId,
      ({ data }) => {
        console.log(data)
        console.log('성공')
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
