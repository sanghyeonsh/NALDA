export const state = () => ({
  selected_foods: [],
  check_foods: [],
})

export const mutations = {
  SET_CHOICE_FOODS(state, choice) {
    if (!state.check_foods.includes(choice) && state.check_foods.length < 5) {
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
}

export const getters = {}

export const actions = {}
