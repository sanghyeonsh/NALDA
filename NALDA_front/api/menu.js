import { apiInstance } from '.'

const api = apiInstance()

// 서비스 part

async function listSnack(success, fail) {
  await api.get(`/orders/SNACK`).then(success).catch(fail)
}
async function listAlcohols(success, fail) {
  await api.get(`/orders/ALCOHOLS`).then(success).catch(fail)
}
async function listNonAlcohols(success, fail) {
  await api.get(`/orders/NON-ALCOHOLS`).then(success).catch(fail)
}

export { listSnack, listAlcohols, listNonAlcohols }
