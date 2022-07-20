import { apiInstance } from '.'

const api = apiInstance()

async function listMeal(success, fail) {
  await api.get(`/meal`).then(success).catch(fail)
}

async function inputMeal(meals, success, fail) {
  await api.post(`/meal/input`, JSON.stringify(meals)).then(success).catch(fail)
}

async function listInput(flightNum, success, fail) {
  await api.get(`/meal/input/${flightNum}`).then(success).catch(fail)
}

async function detailMeal(mealNum, success, fail) {
  await api.get(`/meal/detail/${mealNum}`).then(success).catch(fail)
}

// user정보와 meal정보가 param에 담겨있음
async function choiceMeal(param, success, fail) {
  await api
    .post(`/meal/choice`, JSON.stringify(param))
    .then(success)
    .catch(fail)
}

export { listMeal, inputMeal, listInput, detailMeal, choiceMeal }
