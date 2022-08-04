export const state = () => ({
  info: [],
  time: [],
  stop: [],
})

export const mutations = {
  SET_INFO_LIST(state, info) {
    state.info = info
  },
  SET_TIME_LIST(state, time) {
    state.time.push(time)
  },
  SET_STOP_LIST(state, stop) {
    state.stop = stop
  },
  CLEAR_INFO_LIST(state) {
    state.info = []
  },
  CLEAR_TIME_LIST(state) {
    state.time = []
  },
  CLEAR_STOP_LIST(state) {
    state.stop = []
  },
}

export const getters = {}

export const actions = {
  async getInfo({ commit }, area) {
    let url = 'http://apis.data.go.kr/B551177/BusInformation/getBusInfo'
    const key =
      '5R6TrpQSR9qAqoXkN7jJvtnhJ3TcQ%2F3Ua3%2FgpSIdBrc2wN%2FDeNYoOyC50DZRlR9cyOLRNV2yximCIyiQZQqM4g%3D%3D'
    commit('CLEAR_INFO_LIST')
    url += '?' + encodeURIComponent('serviceKey') + '=' + key
    url +=
      '&' + encodeURIComponent('numOfRows') + '=' + encodeURIComponent('100')
    url += '&' + encodeURIComponent('pageNo') + '=' + encodeURIComponent('1')
    url += '&' + encodeURIComponent('area') + '=' + encodeURIComponent(area)
    url += '&' + encodeURIComponent('type') + '=' + encodeURIComponent('json')
    await fetch(url)
      .then((res) => res.json())
      .then((data) => {
        console.log(data.response.body)
        commit('SET_INFO_LIST', data.response.body)
      })
  },
  //   test({ state }) {
  //     console.log(state.info)
  //   },
  getTime({ state, commit }, busNum) {
    commit('CLEAR_TIME_LIST')
    for (let i = 0; i < state.info.totalCount; i++) {
      if (busNum === state.info.items[i].busnumber) {
        commit('SET_TIME_LIST', state.info.items[i].t1wdayt)
        commit('SET_TIME_LIST', state.info.items[i].t1wt)
        commit('SET_TIME_LIST', state.info.items[i].t2wdayt)
        commit('SET_TIME_LIST', state.info.items[i].t2wt)
      }
    }
    console.log(state.time)
  },
  getStop({ state, commit }, busNum) {
    commit('CLEAR_STOP_LIST')
    for (let i = 0; i < state.info.totalCount; i++) {
      if (busNum === state.info.items[i].busnumber) {
        commit('SET_STOP_LIST', state.info.items[i].routeinfo)
      }
    }
    // console.log(state.stop)
  },
}
