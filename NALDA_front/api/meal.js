import { apiInstance } from '.'

const api = apiInstance()

// 기내식 part

async function listMeal(success, fail) {
  await api.get(`/meal`).then(success).catch(fail)
}

async function inputMeal(meals, success, fail) {
  await api.post(`/meal/input`, JSON.stringify(meals)).then(success).catch(fail)
}

async function listInput(flightNum, success, fail) {
  await api.get(`/meal/input/${flightNum}`).then(success).catch(fail)
}

async function selectMeal(mealId, success, fail) {
  await api.get(`/meal/select/${mealId}`).then(success).catch(fail)
}

async function detailMeal(mealId, success, fail) {
  await api.get(`/meal/detail/${mealId}`).then(success).catch(fail)
}

async function allergyMeal(mealId, success, fail) {
  await api.get(`/meal/allergy/${mealId}`).then(success).catch(fail)
}
// user정보와 meal정보가 param에 담겨있음
// async function choiceMeal(info, success, fail) {
//   console.log(info)
//   await api.post(`/meal/choice`, JSON.stringify(info)).then(success).catch(fail)
// }
async function choiceMeal(info, success, fail) {
  await api.post(`/meal/choice`, JSON.stringify(info)).then(success).catch(fail)
}

async function getSeatMeal(flightNum, success, fail) {
  await api.get(`/meal/choice/${flightNum}`).then(success).catch(fail)
}

export {
  listInput,
  detailMeal,
  allergyMeal,
  choiceMeal,
  listMeal,
  inputMeal,
  selectMeal,
  getSeatMeal,
}
