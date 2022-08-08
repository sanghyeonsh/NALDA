import {
  saveDeclaration,
  listDeclaration,
  getOneDeclaration,
} from '../api/customdeclaration'

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
    date: '',
    paymentExceed: '',
    prohibitGoods: '',
    livestockVisited: '',
    salesGoods: '',
    cigarette: '',
    perfumes: '',
    alcohols: null,
    etcExceeds: [],
    visitedCountries: [],
  },
  declarationList: [],
  selectedDeclaration: {},
})

export const mutations = {
  CLEAR_DECLARATIONLIST(state) {
    state.declarationList = []
  },
  SET_DECLARATIONLIST(state, list) {
    state.declarationList = list
  },
  CLEAR_SELECTEDDECLARATION(state) {
    state.selectedDeclaration = null
  },
  SET_SELECTEDDECLARATION(state, declaration) {
    state.selectedDeclaration = declaration
  },
  CLEAR_DECLARATION(state) {
    state.declaration = {
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
      date: '',
      paymentExceed: '',
      prohibitGoods: '',
      livestockVisited: '',
      salesGoods: '',
      cigarette: '',
      perfumes: '',
      alcohols: null,
      etcExceeds: [],
      visitedCountries: [],
    }
  },
  SAVE_DECLARATION(state, declaration) {
    state.declaration = declaration
  },
  MODIFY_ALCOHOLS(state, alcohols) {
    state.declaration.alcohols = alcohols
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
  MODIFY_DATE(state, date) {
    state.declaration.date = date
  },
}

export const getters = {
  listTable(state) {
    const items = []
    for (let i = 0; i < state.declarationList.length; i++) {
      const item = {
        ID: state.declarationList[i].id,
        목적: state.declarationList[i].purposeTravel,
        편명: state.declarationList[i].flightNum,
        날짜: state.declarationList[i].date,
      }
      items.push(item)
    }
    return items
  },
}

export const actions = {
  saveDeclaration({ commit, state }) {
    saveDeclaration(
      state.declaration,
      (response) => {
        this.$router.push('/main')
        console.log(response)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  getDeclarationList({ commit }, username) {
    listDeclaration(
      username,
      ({ data }) => {
        commit('SET_DECLARATIONLIST', data.declarations)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  async getOneDeclaration({ commit }, id) {
    await getOneDeclaration(
      id,
      ({ data }) => {
        commit('SET_SELECTEDDECLARATION', data.declaration)
      },
      (error) => {
        console.log(error)
      }
    )
  },
}
