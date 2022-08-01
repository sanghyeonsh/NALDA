import { saveDeclaration } from '../api/customdeclaration'

export const state = () => ({
  declaration: {
    username: '',
    travelPeriod: {
      startDate: '',
      endDate: '',
    },
    purposeTravel: '',
    flightNum: '',
    accompany: 0,
    dutyfreeExceed: '',
    dutyfreeExceedValue: 0,
    paymentExceedValue: 0,
    preferentialTariff: '',
    paymentExceed: '',
    prohibitGoods: '',
    livestockVisited: '',
    salesGoods: '',
    cigarette: '',
    perfumes: '',
    alcohols: {
      num: 0,
      liter: 0,
      daller: 0,
    },
    etcExceeds: [],
    visitedCountries: [],
  },
})

export const mutations = {
  SAVE_DECLARATION(state, declaration) {
    state.declaration = declaration
  },
  MODIFY_DUTYFREEEXCEEDVALUE(state, value) {
    state.declaration.dutyfreeExceedValue = value
  },
  MODIFY_PAYMENTEXCEEDVALUE(state, value) {
    state.declaration.paymentExceedValue = value
  },
  MODIFY_USERNAME(state, username) {
    state.declaration.username = username
  },
  MODIFY_TRAVELPERIOD(state, travelPeriod) {
    state.declaration.travelPeriod = travelPeriod
  },
  MODIFY_PURPOSETRAVEL(state, purposeTravel) {
    state.declaration.purposeTravel = purposeTravel
  },
  MODIFY_FLIGHTNUM(state, flightNum) {
    state.declaration.flightNum = flightNum
  },
  MODIFY_ACCOMPANY(state, accompany) {
    state.declaration.accompany = accompany
  },
  MODIFY_DUTYFREEEXCEED(state, dutyfreeExceed) {
    state.declaration.dutyfreeExceed = dutyfreeExceed
  },
  MODIFY_PREFERENTIALTARIFF(state, preferentialTariff) {
    state.declaration.preferentialTariff = preferentialTariff
  },
  MODIFY_PAYMENTEXCEED(state, paymentExceed) {
    state.declaration.paymentExceed = paymentExceed
  },
  MODIFY_PROHIBITGOODS(state, prohibitGoods) {
    state.declaration.prohibitGoods = prohibitGoods
  },
  MODIFY_LIVESTOCKVISITED(state, livestockVisited) {
    state.declaration.livestockVisited = livestockVisited
  },
  MODIFY_SALESGOODS(state, salesGoods) {
    state.declaration.salesGoods = salesGoods
  },
  MODIFY_CIGARETTE(state, cigarette) {
    state.declaration.cigarette = cigarette
  },
  MODIFY_PERFUMES(state, perfumes) {
    state.declaration.perfumes = perfumes
  },
  MODIFY_ETCEXCEEDS(state, etcExceeds) {
    state.declaration.etcExceeds = etcExceeds
  },
  MODIFY_VISITEDCOUNTRIES(state, visitedCountries) {
    state.declaration.visitedCountries = visitedCountries
  },
}

export const getters = {}

export const actions = {
  saveDeclaration({ commit }, declaration) {
    saveDeclaration(
      declaration,
      (response) => {
        console.log(response)
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
