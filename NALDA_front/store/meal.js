import {
  listMeal,
  inputMeal,
  listInput,
  detailMeal,
  allergyMeal,
  selectMeal,
} from '@/api/meal'

export const state = () => ({
  meals: [],
  flightMeals: [],
  selectedMeal: {},
  details: [],
  allergies: [],
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
    state.selectedMeal = {}
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
  getSelectedMeal({ commit }, mealMenu) {
    // commit('CLEAR_SELECTED_MEAL')
    selectMeal(
      mealMenu,
      ({ data }) => {
        console.log(data.mealInfo)
        commit('SET_SELECTED_MEAL', data.mealInfo)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  getDetail({ commit }, mealMenu) {
    commit('CLEAR_DETAIL_MEAL')
    detailMeal(
      mealMenu,
      ({ data }) => {
        // console.log(data.mealDetail)
        if (data.mealDetail.length > 0) {
          commit('SET_DETAIL_MEAL', data.mealDetail)
        }
      },
      (error) => {
        console.log(error)
      }
    )
  },
  getAllergy({ commit }, mealMenu) {
    commit('CLEAR_ALLERGY_MEAL')
    allergyMeal(
      mealMenu,
      ({ data }) => {
        // console.log(data.mealAllergy)
        if (data.mealAllergy.length > 0) {
          commit('SET_ALLERGY_MEAL', data.mealAllergy)
        }
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
