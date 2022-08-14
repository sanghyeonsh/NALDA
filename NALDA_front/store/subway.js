import { inputData, getSubway } from '../api/subway'

export const state = () => ({
  info: [],
  subways: [],
  byCondition: [],
})

export const mutations = {
  SET_INFO_LIST(state, info) {
    state.info = info
  },
  SET_SUBWAYS_LIST(state, subways) {
    state.subways = subways
  },
  SET_BYCONDITION_LIST(state, byCondition) {
    state.byCondition.push(byCondition)
  },
  CLEAR_INFO_LIST(state) {
    state.info = []
  },
  CLEAR_SUBWAYS_LIST(state) {
    state.subways = []
  },
  CLEAR_BYCONDITION_LIST(state) {
    state.byCondition = []
  },
}

export const getters = {}

export const actions = {
  async getInfo({ commit }) {
    let url =
      'http://apis.data.go.kr/1613000/SubwayInfoService/getSubwaySttnAcctoSchdulList'
    const key =
      '5R6TrpQSR9qAqoXkN7jJvtnhJ3TcQ%2F3Ua3%2FgpSIdBrc2wN%2FDeNYoOyC50DZRlR9cyOLRNV2yximCIyiQZQqM4g%3D%3D'
    commit('CLEAR_INFO_LIST')
    url += '?' + encodeURIComponent('serviceKey') + '=' + key
    url +=
      '&' + encodeURIComponent('numOfRows') + '=' + encodeURIComponent('125')
    url += '&' + encodeURIComponent('pageNo') + '=' + encodeURIComponent('1')
    url +=
      '&' +
      encodeURIComponent('subwayStationId') +
      '=' +
      encodeURIComponent('MTRARA1A10')
    url += '&' + encodeURIComponent('_type') + '=' + encodeURIComponent('json')
    url +=
      '&' + encodeURIComponent('dailyTypeCode') + '=' + encodeURIComponent('03')
    url +=
      '&' + encodeURIComponent('upDownTypeCode') + '=' + encodeURIComponent('U')
    // "인천공항1터미널: MTRARA1A10 인천공항2터미널: MTRARA1A11"
    await fetch(url)
      .then((res) => res.json())
      .then((data) => {
        commit('SET_INFO_LIST', data.response.body)
      })
  },
  postInfo({ commit }, info) {
    inputData(
      info,
      ({ data }) => {
        console.log(data)
      },
      (error) => {
        console.log(error)
      }
    )
  },
  async getSubway({ state, commit }) {
    await getSubway(
      ({ data }) => {
        commit('SET_SUBWAYS_LIST', data)
      },
      (error) => {
        console.log(error)
      }
    )
    // dispatch('getSubwayByCondition', condition)
  },
  async getSubwayByCondition({ state, commit }, condition) {
    commit('CLEAR_BYCONDITION_LIST')

    for (let i = 0; i < state.subways.subwayList.length; i++) {
      if (condition.terminal === 1 && condition.type === 1) {
        if (
          state.subways.subwayList[i].dayCode === '01' &&
          state.subways.subwayList[i].name === '인천공항1터미널'
        ) {
          await commit('SET_BYCONDITION_LIST', state.subways.subwayList[i])
        }
      }
      if (condition.terminal === 1 && condition.type === 2) {
        if (
          state.subways.subwayList[i].dayCode === '02' &&
          state.subways.subwayList[i].name === '인천공항1터미널'
        ) {
          await commit('SET_BYCONDITION_LIST', state.subways.subwayList[i])
        }
      }
      if (condition.terminal === 1 && condition.type === 3) {
        if (
          state.subways.subwayList[i].dayCode === '03' &&
          state.subways.subwayList[i].name === '인천공항1터미널'
        ) {
          await commit('SET_BYCONDITION_LIST', state.subways.subwayList[i])
        }
      }
      if (condition.terminal === 2 && condition.type === 1) {
        if (
          state.subways.subwayList[i].dayCode === '01' &&
          state.subways.subwayList[i].name === '인천공항2터미널'
        ) {
          await commit('SET_BYCONDITION_LIST', state.subways.subwayList[i])
        }
      }
      if (condition.terminal === 2 && condition.type === 2) {
        if (
          state.subways.subwayList[i].dayCode === '02' &&
          state.subways.subwayList[i].name === '인천공항2터미널'
        ) {
          await commit('SET_BYCONDITION_LIST', state.subways.subwayList[i])
        }
      }
      if (condition.terminal === 2 && condition.type === 3) {
        if (
          state.subways.subwayList[i].dayCode === '03' &&
          state.subways.subwayList[i].name === '인천공항2터미널'
        ) {
          await commit('SET_BYCONDITION_LIST', state.subways.subwayList[i])
        }
      }
    }
  },
}
