export const state = () => ({
  goods: ['blanket', 'pillow', 'earplug', 'slipper'],
  selected_goods: null,
})

export const mutations = {
  SET_CHOICE_GOODS(state, choice) {
    for (let i = 0; i < state.goods.length; i++) {
      if (document.getElementById(state.goods[i]).checked)
        state.selected_goods.push(state.goods[i])
    }
  },
  CLEAR_CHOICE_GOODS(state) {
    state.selected_goods = []
  },
}

export const getters = {}

export const actions = {}
