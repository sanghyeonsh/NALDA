import { apiInstance } from '.'

const api = apiInstance()

async function validFlight(flightNum, success, fail) {
  await api.get(`/flight/${flightNum}`).then(success).catch(fail)
}
async function inputFlight(flightObject, success, fail) {
  await api
    .post(`flight`, JSON.stringify(flightObject))
    .then(success)
    .then(fail)
}
async function endFlight(flightNum, success, fail) {
  await api.put(`/flight/${flightNum}`).then(success).catch(fail)
}

export { validFlight, inputFlight, endFlight }
