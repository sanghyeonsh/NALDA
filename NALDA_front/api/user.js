import { apiInstance } from '.'

const api = apiInstance()

async function login(user, success, fail) {
  await api.post(`/login`, JSON.stringify(user)).then(success).catch(fail)
}
async function signup(user, success, fail) {
  await api.post(`/user/join`, JSON.stringify(user)).then(success).catch(fail)
}

export { login, signup }
