import {
  listMeal,
  inputMeal,
  listInput,
  selectMeal,
  detailMeal,
  allergyMeal,
  //   choiceMeal,
} from '@/api/meal'

export const state = () => ({
  meals: [],
  flightMeals: [],
  selectedMeal: {},
  details: [],
  allergies: ['땅콩', '계란', '육류'],
})

export const mutations = {
  SET_MEAL_LIST(state, meals) {
    state.meals.push(meals)
  },
  SET_FLIGHTMEAL_LIST(state, flightMeals) {
    state.flightMeals.push(flightMeals)
  },
  SET_SELECTED_MEAL(state, selectedMeal) {
    state.selectedMeal = selectedMeal
  },
  SET_DETAIL_MEAL(state, details) {
    state.details = details
  },
  SET_ALLERGY_MEAL(state, allergies) {
    state.allergies = allergies
  },

  CLEAR_MEAL_LIST(state) {
    state.meals = [{ menu: null, image: null }]
  },
  CLEAR_FLIGHTMEAL_LIST(state) {
    state.flightMeals = []
  },
  CLEAR_SELECTED_MEAL(state) {
    state.selectedMeal = null
  },
  CLEAR_DETAIL_MEAL(state) {
    state.details = []
  },
  CLEAR_ALLERGY_MEAL(state) {
    state.allergies = []
  },
}
export const getters = {}

// console.log eslint rule수정 충돌방지
export const actions = {
  getMeal({ commit }) {
    listMeal(
      ({ data }) => {
        console.log(data)
        commit('SET_MEAL_LIST', data)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  registFlightMeal({ commit }, info) {
    inputMeal(
      info,
      ({ data }) => {
        if (data.length > 0) {
          commit('SET_FLIGHTMEAL_LIST', data)
        }
      },
      (error) => {
        console.log(error)
      }
    )
  },
  getFlightMeal({ commit }, flightNum) {
    commit('CLEAR_FLIGHTMEAL_LIST')
    listInput(
      flightNum,
      ({ data }) => {
        if (data.meal.length > 0) {
          data.meal.forEach((meal) => {
            commit('SET_FLIGHTMEAL_LIST', {
              id: meal.mealId,
              menu: meal.mealMenu,
              image: meal.bytesdata,
            })
          })
        }
      },
      (error) => {
        console.log(error)
      }
    )
  },
  getSelectedMeal({ commit }, mealId) {
    // commit('CLEAR_SELECTED_MEAL')
    selectMeal(
      mealId,
      ({ data }) => {
        console.log(data.mealInfo)
        commit('SET_SELECTED_MEAL', data.mealInfo)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  getDetail({ commit }, mealId) {
    commit('CLEAR_DETAIL_MEAL')
    detailMeal(
      mealId,
      ({ data }) => {
        console.log(data)
        if (data.length > 0) {
          commit('SET_DETAIL_MEAL')
        }
      },
      (error) => {
        console.log(error)
      }
    )
  },
  getAllergy({ commit }, mealId) {
    commit('CLEAR_ALLERGY_MEAL')
    allergyMeal(
      mealId,
      ({ data }) => {
        console.log(data)
        if (data.length > 0) {
          commit('SET_ALLERGY_MEAL')
        }
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
