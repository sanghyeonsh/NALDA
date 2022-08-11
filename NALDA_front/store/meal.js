import {
  listMeal,
  inputMeal,
  listInput,
  detailMeal,
  allergyMeal,
  selectMeal,
  choiceMeal,
  getSeatMeal,
} from '@/api/meal'

export const state = () => ({
  meals: [],
  flightMeals: [],
  selectedMeal: {},
  details: [],
  allergies: [],
  choiceMeal: [],
  seatMealList: [],
})

export const mutations = {
  updateCheck(state, check) {
    for (let i = 0; i < state.flightMeals.length; i++) {
      if (state.flightMeals[i].menu === check.menu) {
        if (check.check === false) {
          check.check = true
        } else {
          check.check = false
        }
      }
    }
  },
  SET_MEAL_LIST(state, meals) {
    state.meals.push(meals)
  },
  SET_FLIGHTMEAL_LIST(state, flightMeals) {
    state.flightMeals.push(flightMeals)
  },
  SET_SELECTED_MEAL(state, selectedMeal) {
    state.selectedMeal = selectedMeal
  },
  SET_DETAIL_MEAL(state, data) {
    for (let i = 0; i < state.flightMeals.length; i++) {
      if (state.flightMeals[i].id === data[1].id) {
        state.flightMeals[i].details = data[0]
      }
    }
  },
  SET_ALLERGY_MEAL(state, data) {
    // state.allergies = allergies
    for (let i = 0; i < state.flightMeals.length; i++) {
      if (state.flightMeals[i].id === data[1].id) {
        state.flightMeals[i].allergies = data[0]
      }
    }
  },
  SET_CHOICE_MEAL(state, choiceMeal) {
    state.choiceMeal = choiceMeal
  },
  SET_SEATMEAL_LIST(state, seatMealList) {
    state.seatMealList = seatMealList
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
  CLEAR_CHOICE_MEAL(state) {
    state.choiceMeal = []
  },
  CLEAR_SEATMEAL_LIST(state) {
    state.seatMealList = []
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
  async getFlightMeal({ commit }, flightNum) {
    commit('CLEAR_FLIGHTMEAL_LIST')
    await listInput(
      flightNum,
      ({ data }) => {
        if (data.meal.length > 0) {
          data.meal.forEach((meal) => {
            commit('SET_FLIGHTMEAL_LIST', {
              id: meal.mealId,
              menu: meal.mealMenu,
              image: meal.bytesdata,
              check: false,
              details: null,
              allergies: null,
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
  getDetail({ commit }, flightMeals) {
    commit('CLEAR_DETAIL_MEAL')
    for (let i = 0; i < flightMeals.length; i++) {
      detailMeal(
        flightMeals[i].id,
        ({ data }) => {
          if (data.mealDetail.length > 0) {
            const datas = [data.mealDetail, flightMeals[i]]
            commit('SET_DETAIL_MEAL', datas)
          }
        },
        (error) => {
          console.log(error)
        }
      )
    }
  },
  getAllergy({ commit }, flightMeals) {
    commit('CLEAR_ALLERGY_MEAL')
    for (let i = 0; i < flightMeals.length; i++) {
      allergyMeal(
        flightMeals[i].id,
        ({ data }) => {
          if (data.mealAllergy.length > 0) {
            const datas = [data.mealAllergy, flightMeals[i]]
            commit('SET_ALLERGY_MEAL', datas)
          }
        },
        (error) => {
          console.log(error)
        }
      )
    }
  },
  getChoiceMeal({ commit }) {
    commit('CLEAR_CHOICE_MEAL')
    choiceMeal(
      ({ data }) => {
        console.log(data)
        if (data.length > 0) {
          console.log('store입니다 ' + data.length)
          console.log('store입니다 ' + data)
          commit('SET_CHOICE_MEAL', data)
        }
      },
      (error) => {
        console.log(error)
      }
    )
  },
  async getMealList({ commit }, flightNum) {
    commit('CLEAR_SEATMEAL_LIST')
    await getSeatMeal(
      flightNum,
      ({ data }) => {
        console.log(data.seatMeal)
        // console.log(data.seatMeal.length)
        if (data.seatMeal.length > 0) {
          // console.log('store입니다 ' + data.seatMeal.length)
          // console.log('store입니다 ' + data.seatMeal)
          commit('SET_SEATMEAL_LIST', data.seatMeal)
        }
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
