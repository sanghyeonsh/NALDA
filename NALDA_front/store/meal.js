import {
  listMeal,
  inputMeal,
  //   listInput,
  //   detailMeal,
  //   choiceMeal,
} from '@/api/meal'

export const state = () => ({
  meals: [{ menu: null, image: null }],
  flightMeals: [{ menu: null, image: null }],
  selected: null,
  detail: [],
})

export const mutation = {
  SET_MEAL_LIST(state, meals) {
    meals.forEach((meal) => {
      state.meals.push({ menu: meal.menu, image: meal.image })
    })
  },
  SET_FLIGHTMEAL_LIST(state, flightMeals) {
    flightMeals.forEach((flightMeal) => {
      state.flightMeal.push({ menu: flightMeal.menu, image: flightMeal.image })
    })
  },
  SET_CHOICE_MEAL(state, choice) {
    state.selected = choice
  },
  CLEAR_MEAL_LIST(state) {
    state.meals = [{ menu: null, image: null }]
  },
  CLEAR_FLIGHTMEAL_LIST(state) {
    state.flightMeals = [{ menu: null, image: null }]
  },
  CLEAR_CHOICE_MEAL(state) {
    state.selected = null
  },
}

export const getters = {}

// console.log eslint rule수정 충돌방지
export const actions = {
  getMeal({ commit }) {
    listMeal(
      commit('SET_MEAL_LIST')
      // , (error) => {
      // //   console.log(error)
      // }
    )
  },
  registFlightMeal({ commit }, info) {
    inputMeal(
      info,
      ({ data }) => {
        if (data.length > 0) {
          commit('SET_FLIGHTMEAL_LIST', data)
        }
      }
      //   (error) => {
      //     console.log(error)
      //   }
    )
  },
}
