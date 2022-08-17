import { apiInstance } from '.'

const api = apiInstance()

async function getToiletLog(airplaneKind, success, fail) {
  await api.get(`/toilet/${airplaneKind}`).then(success).catch(fail)
}

export { getToiletLog }
