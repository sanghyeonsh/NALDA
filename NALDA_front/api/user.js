import { apiInstance } from '.'

const api = apiInstance()

async function login(user, success, fail) {
  await api.post(`/login`, JSON.stringify(user)).then(success).catch(fail)
}
async function signup(user, success, fail) {
  await api.post(`/user/join`, JSON.stringify(user)).then(success).catch(fail)
}
async function idCheck(userid, success, fail) {
  await api.get(`/user/join/${userid}`).then(success).catch(fail)
}

async function mypage(userid, success, fail) {
  // eslint-disable-next-line dot-notation
  api.defaults.headers['Authorization'] =
    sessionStorage.getItem('Authorization')
  await api.get(`/user/userDetail/${userid}`).then(success).catch(fail)
}

async function modifyMember(userObject, success, fail) {
  // eslint-disable-next-line dot-notation
  api.defaults.headers['Authorization'] =
    sessionStorage.getItem('Authorization')
  await api
    .put('/user/userDetail', JSON.stringify(userObject))
    .then(success)
    .catch(fail)
}

export { login, signup, idCheck, mypage, modifyMember }
