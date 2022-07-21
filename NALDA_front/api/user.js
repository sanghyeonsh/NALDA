import { apiInstance } from '.'

const api = apiInstance()

async function login(user, success, fail) {
  await api.post(`/user/login`, JSON.stringify(user)).then(success).catch(fail)
}

export { login }
