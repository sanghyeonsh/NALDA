import {
  listSnack,
  listAlcohols,
  listNonAlcohols,
  inputOrders,
} from '@/api/menu'

export const state = () => ({
  // item: 물품 하나 선택하면 모달창에 띄우는 아이템
  item: { bytesdata: null, image: null, num: null },
  // items: 전체 메뉴 가져옴.
  items: {},
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

  CLEAR_ITEM(state) {
    state.item = []
  },
  CLEAR_ITEMS(state) {
    state.items = []
  },
  CLEAR_CHOICE_FOODS(state) {
    state.selectedItem = []
  },
}

export const getters = {}

export const actions = {
  async getSnack({ commit }) {
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
}
