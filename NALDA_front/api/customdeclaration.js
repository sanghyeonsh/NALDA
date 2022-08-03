import { apiInstance } from '.'

const api = apiInstance()

async function saveDeclaration(declaration, success, fail) {
  await api
    .post(`/declaration/save`, JSON.stringify(declaration))
    .then(success)
    .catch(fail)
}

async function listDeclaration(username, success, fail) {
  await api.get(`/declaration/${username}`).then(success).catch(fail)
}

async function getOneDeclaration(id, success, fail) {
  await api.get(`/declaration/getOne/${id}`).then(success).catch(fail)
}

export { saveDeclaration, listDeclaration, getOneDeclaration }
