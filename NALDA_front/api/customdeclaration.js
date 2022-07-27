import { apiInstance } from '.'

const api = apiInstance()

async function saveDeclaration(declaration, success, fail) {
  await api
    .post(`/declaration/save`, JSON.stringify(declaration))
    .then(success)
    .catch(fail)
}

export { saveDeclaration }
