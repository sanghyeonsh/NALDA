export const state = () => ({
  meal: [],
})

export const mutations = {
  SET_MEAL(state, meal) {
    state.meal = meal
  },
  CLEAR_MEAL(state) {
    state.meal = []
  },
  ADD(state, text) {
    state.meal.push({
      text,
    })
  },
}

export const getters = {}

export const actions = {}
