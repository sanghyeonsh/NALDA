import axios from 'axios'

export const state = () => ({
  items: [],
  selected_foods: [],
  check_foods: [],
})

export const mutations = {
  SET_MENU_ITEMS(state, snacks) {
    snacks.forEach((snack) => {
      state.items.push(snack)
    })
  },
  SET_CHOICE_FOODS(state, choice) {
    if (!state.check_foods.includes(choice)) {
      state.selected_foods.push({ name: choice, num: 1 })
      state.check_foods.push(choice)
    }
  },
  DELETE_CHOICE_FOODS(state, choice) {
    for (let i = 0; i < state.selected_foods.length; i++) {
      if (state.selected_foods[i].name === choice) {
        state.selected_foods.splice(i, 1)
        state.check_foods.splice(i, 1)
      }
    }
  },
  PLUS_CHOICE_FOODS(state, choice) {
    for (let i = 0; i < state.selected_foods.length; i++) {
      if (state.selected_foods[i].name === choice) {
        state.selected_foods[i].num += 1
      }
    }
  },
  MINUS_CHOICE_FOODS(state, choice) {
    for (let i = 0; i < state.selected_foods.length; i++) {
      if (
        state.selected_foods[i].name === choice &&
        state.selected_foods[i].num > 1
      ) {
        state.selected_foods[i].num -= 1
      }
    }
  },
  CLEAR_CHOICE_FOODS(state) {
    state.selected_foods = []
  },
  CLEAR_ITEMS(state) {
    state.items = []
  },
}

export const getters = {}

export const actions = {
  getsnack({ commit }) {
    axios
      // 서버켰을때 조정
      // .get('http://localhost:8080/orders/SNACK')
      // 실험할때
      .get('https://picsum.photos/v2/list?page=2&limit=1')
      .then(function (response) {
        commit('SET_MENU_ITEMS', response.data)
      })
      .catch(function (error) {
        console.log(error)
      })
  },
  getalcohol({ commit }) {
    axios
      // 서버켰을때 조정
      // .get('http://localhost:3000/orders/ALCOHOL')
      // 실험할때
      .get('https://picsum.photos/v2/list?page=2&limit=2')
      .then(function (response) {
        commit('SET_MENU_ITEMS', response.data)
      })
      .catch(function (error) {
        console.log(error)
      })
  },
  getnonalcohol({ commit }) {
    axios
      // 서버켰을때 조정
      // .get('http://localhost:3000/orders/nonalcohol')
      // 실험할때
      .get('https://picsum.photos/v2/list?page=2&limit=3')
      .then(function (response) {
        commit('SET_MENU_ITEMS', response.data)
      })
      .catch(function (error) {
        console.log(error)
      })
  },
}
