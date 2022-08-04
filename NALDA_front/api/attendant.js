import { apiInstance } from '.'

const api = apiInstance()

// 전제 서비스 아이템 목록 조회
async function listServices(success, fail) {
  await api.get(`/orders/input`).then(success).catch(fail)
}

// 서비스 재고 등록
async function selectServices(stocks, success, fail) {
  await api
    .post(`/orders/input`, JSON.stringify(stocks))
    .then(success)
    .catch(fail)
}

// 서비스 재고 수정
async function modifyServices(stocks, success, fail) {
  await api
    .put(`/orders/input`, JSON.stringify(stocks))
    .then(success)
    .catch(fail)
}

// 전체 승객 요청 목록 조회 (처리 전)
async function listOrders(flightNum, success, fail) {
  await api.get(`orders/input/${flightNum}`).then(success).catch(fail)
}

// 승객 요청 완료 처리 (처리 후)
async function updateStatus(orderId, success, fail) {
  await api.put(`/orders/status/${orderId}`).then(success).catch(fail)
}

export {
  listServices,
  selectServices,
  listOrders,
  updateStatus,
  modifyServices,
}
