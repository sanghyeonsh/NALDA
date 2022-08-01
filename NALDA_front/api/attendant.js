import { apiInstance } from '.'

const api = apiInstance()

// 요청 part
async function listServices(success, fail) {
  await api.get(`/orders/input`).then(success).catch(fail)
}

async function selectServices(stocks, success, fail) {
  await api
    .post(`/orders/input`, JSON.stringify(stocks))
    .then(success)
    .catch(fail)
}

export { listServices, selectServices }
