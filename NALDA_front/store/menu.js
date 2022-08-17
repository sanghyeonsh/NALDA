import {
  listSnack,
  listAlcohols,
  listNonAlcohols,
  inputOrders,
  listServiceCnt,
  listOrderCnt,
} from '@/api/menu'

export const state = () => ({
  // item: 물품 하나 선택하면 모달창에 띄우는 아이템
  item: { bytesdata: null, image: null, num: null },
  // items: 전체 메뉴 가져옴.
  items: {},
  stock: {},
  total: {},
  // selectedItem 장바구니에 담기.
  selectedItem: [],
})

export const mutations = {
  ADD_SELECTED_FOODS(state, select) {
    if (state.selectedItem.some((v) => v.serviceCode === select.serviceCode)) {
      for (let i = 0; i < state.selectedItem.length; i++) {
        if (state.selectedItem[i].serviceCode === select.serviceCode) {
          state.selectedItem.splice(i, 1)
          state.selectedItem.push(select)
        }
      }
    } else {
      state.selectedItem.push(select)
    }
  },
  SET_ITEM(state, select) {
    select.num = 1
    state.item = select
  },
  SET_STOCK(state, stock) {
    state.stock = stock
  },
  SET_TOTAL(state, total) {
    state.total = total
  },
  SET_SNACK(state, snacks) {
    state.items.snack = snacks
  },
  SET_ALCOHOL(state, alcohol) {
    state.items.alcohol = alcohol
  },
  SET_NON_ALCOHOL(state, nonAlcohol) {
    state.items.nonAlcohol = nonAlcohol
  },
  PLUS_SELECTED_ITEM(state, item) {
    state.selectedItem.forEach((element) => {
      if (element.serviceCode === item.serviceCode) {
        element.num += 1
      }
    })
  },
  MINUS_SELECTED_ITEM(state, item) {
    state.selectedItem.forEach((element) => {
      if (element.serviceCode === item.serviceCode && element.num > 1) {
        element.num -= 1
      }
    })
  },
  DELETE_SELECTED_ITEM(state, item) {
    for (let i = 0; i < state.selectedItem.length; i++) {
      if (state.selectedItem[i].serviceCode === item.serviceCode)
        state.selectedItem.splice(i, 1)
    }
  },
  PLUS_CHOICE_FOODS(state) {
    state.item.num += 1
  },
  MINUS_CHOICE_FOODS(state) {
    if (state.item.num > 1) {
      state.item.num -= 1
    }
  },
  CALC_STOCK(state) {
    for (let i = 0; i < state.items.snack.length; i++) {
      state.items.snack[i].cnt = state.stock[i].total
      for (let j = 0; j < state.total.length; j++) {
        if (state.stock[i].serviceCode === state.total[j].serviceCode) {
          state.items.snack[i].cnt -= state.total[j].total
          break
        }
      }
    }
    for (let i = 0; i < state.items.alcohol.length; i++) {
      state.items.alcohol[i].cnt =
        state.stock[i + state.items.snack.length].total
      for (let j = 0; j < state.total.length; j++) {
        if (
          state.stock[i + state.items.snack.length].serviceCode ===
          state.total[j].serviceCode
        ) {
          state.items.alcohol[i].cnt -= state.total[j].total
        }
      }
    }
    for (let i = 0; i < state.items.nonAlcohol.length; i++) {
      state.items.nonAlcohol[i].cnt =
        state.stock[
          i + state.items.snack.length + state.items.alcohol.length
        ].total
      for (let j = 0; j < state.total.length; j++) {
        if (
          state.stock[i + state.items.snack.length + state.items.alcohol.length]
            .serviceCode === state.total[j].serviceCode
        ) {
          state.items.nonAlcohol[i].cnt -= state.total[j].total
        }
      }
    }
  },

  CLEAR_ITEM(state) {
    state.item = []
  },
  CLEAR_ITEMS(state) {
    state.items = []
  },
  CLEAR_CHOICE_FOODS(state) {
    state.selectedItem = []
  },
  CLEAR_STOCK(state) {
    state.stock = {}
  },
  CLEAR_TOTAL(state) {
    state.total = {}
  },
}

export const getters = {}

export const actions = {
  async getSnack({ commit, state }) {
    await listSnack(
      ({ data }) => {
        commit('SET_SNACK', data.service)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  async getAlcohols({ commit }) {
    await listAlcohols(
      ({ data }) => {
        commit('SET_ALCOHOL', data.service)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  async getNonAlcohols({ commit }) {
    await listNonAlcohols(
      ({ data }) => {
        commit('SET_NON_ALCOHOL', data.service)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  postOrders({ commit }, orders) {
    inputOrders(
      orders,
      ({ data }) => {
        console.log(data)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  async getOrderCnt({ commit }, flightNum) {
    commit('CLEAR_TOTAL')
    await listOrderCnt(
      flightNum,
      ({ data }) => {
        commit('SET_TOTAL', data.orderCnt)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  async getServiceCnt({ commit }, flightNum) {
    commit('CLEAR_STOCK')
    await listServiceCnt(
      flightNum,
      ({ data }) => {
        commit('SET_STOCK', data.cntList)
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
