import { listSnack, listAlcohols, listNonAlcohols } from '@/api/menu'

export const state = () => ({
  // item: 물품 하나 선택하면 모달창에 띄우는 아이템
  item: [{ bytesdata: null, image: null, num: null }],
  // items: 전체 메뉴 가져옴.
  items: [],
  // selected_foods 장바구니에 담기.
  selected_foods: [],
  // 골랏는지 확인하는 것
  check_foods: [],
})

export const mutations = {
  SET_ITEM(state, select) {
    state.item.push(select)
  },
  SET_MENU_ITEMS(state, snacks) {
    snacks.service.forEach((snack) => {
      snack.num = '1'
      state.items.push(snack)
    })
  },
  SET_CHOICE_FOODS(state, choice) {
    if (!state.check_foods.includes(choice[0].serviceName)) {
      state.selected_foods.push(choice[0])
      state.check_foods.push(choice[0].serviceName)
    }
    const modal = document.getElementsByClassName('service-modal')[0]
    modal.style.display = 'none'
  },

  DELETE_CHOICE_FOODS(state, choice) {
    console.log(choice)
    for (let i = 0; i < state.selected_foods.length; i++) {
      if (state.selected_foods[i].serviceName === choice.serviceName) {
        state.selected_foods.splice(i, 1)
        state.check_foods.splice(i, 1)
      }
    }
    choice.num = '1'
  },

  PLUS_CHOICE_FOODS(state, choice) {
    choice.num = parseInt(choice.num) + 1
  },
  MINUS_CHOICE_FOODS(state, choice) {
    if (choice.num > 1) {
      choice.num = parseInt(choice.num) - 1
    }
  },

  CLEAR_ITEM(state) {
    state.item = []
  },
  CLEAR_ITEMS(state) {
    state.items = []
  },
  CLEAR_CHOICE_FOODS(state) {
    state.selected_foods = []
  },
  CLEAR_CHECK_FOODS(state) {
    state.check_foods = []
  },
}

export const getters = {}

export const actions = {
  getSnack({ commit }) {
    listSnack(
      ({ data }) => {
        console.log(data)
        commit('SET_MENU_ITEMS', data)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  getAlcohols({ commit }) {
    listAlcohols(
      ({ data }) => {
        console.log(data)
        commit('SET_MENU_ITEMS', data)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  getNonAlcohols({ commit }) {
    listNonAlcohols(
      ({ data }) => {
        console.log(data)
        commit('SET_MENU_ITEMS', data)
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
