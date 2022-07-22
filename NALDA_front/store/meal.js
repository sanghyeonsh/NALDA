import {
  listMeal,
  inputMeal,
  listInput,
  detailMeal,
  allergyMeal,
  //   choiceMeal,
} from '@/api/meal'

export const state = () => ({
  meals: [{ menu: null, image: null }],
  flightMeals: [
    { menu: '치킨 스테이크', image: null },
    { menu: '낙지 덮밥', image: null },
  ],
  selectedMeal: null,
  details: ['치킨 스테이크', '푸딩', '스프', '콜라'],
  allergies: ['땅콩', '계란', '육류'],
})

export const mutations = {
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
    state.flightMeals = [{ menu: null, image: null }]
  },
  CLEAR_SELECTED_MEAL(state) {
    state.selectedMeal = null
  },
  CLEAR_DETAIL_MEAL(state, details) {
    state.details = []
  },
  CLEAR_ALLERGY_MEAL(state, allergies) {
    state.allergies = []
  },
}

export const getters = {}

// console.log eslint rule수정 충돌방지
export const actions = {
  getMeal({ commit }) {
    listMeal(
      ({ data }) => {
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
    listInput(
      flightNum,
      ({ data }) => {
        if (data.length > 0) {
          commit('SET_FLIGHTMEAL_LIST')
        }
      },
      (error) => {
        console.log(error)
      }
    )
  },
  getDetail({ commit }, mealNum) {
    detailMeal(
      mealNum,
      ({ data }) => {
        if (data.length > 0) {
          commit('SET_DETAIL_MEAL', { root: true })
        }
      },
      (error) => {
        console.log(error)
      }
    )
  },
  getAllergy({ commit }, mealNum) {
    allergyMeal(
      mealNum,
      ({ data }) => {
        if (data.length > 0) {
          commit('SET_ALLERGY_MEAL', { root: true })
        }
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
