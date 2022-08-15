import { apiInstance } from '.'

const api = apiInstance()

async function inputData(info, success, fail) {
  await api.post(`/subway`, JSON.stringify(info)).then(success).catch(fail)
}
async function getSubway(success, fail) {
  await api.get('/subway').then(success).catch(fail)
}
export { inputData, getSubway }
