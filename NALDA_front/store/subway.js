import { inputData } from '../api/subway'

export const state = () => ({
  info: [],
})

export const mutations = {
  SET_INFO_LIST(state, info) {
    state.info = info
  },
  CLEAR_INFO_LIST(state) {
    state.info = []
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
        // console.log(data.response.body)
        console.log(url)
        console.log(data)
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
}
