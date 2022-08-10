import { apiInstance } from '.'

const api = apiInstance()

async function inputFlight(info, success, fail) {
  await api.post(`/flight`, JSON.stringify(info)).then(success).catch(fail)
}

async function infoFlight(flightNum, success, fail) {
  await api.get(`/flight/${flightNum}`).then(success).catch(fail)
}

async function endFlight(flightNum, success, fail) {
  await api.put(`/flight/${flightNum}`).then(success).catch(fail)
}

export { inputFlight, infoFlight, endFlight }
