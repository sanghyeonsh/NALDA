<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div>
    <header-component></header-component>
    <div>주 메뉴 선택</div>
    <div>
      <img src="../../static/meal/chicken-steak.jpg" alt="치킨 스테이크" />
      <img src="../../static/meal/nakji-deopbap.jpg" alt="낙지 덮밥" />
    </div>
    <div class="form-check form-check-inline">
      <input
        id="inlineRadio1"
        class="form-check-input"
        type="radio"
        name="inlineRadioOptions"
        value="option1"
      />
      <label class="form-check-label" for="inlineRadio1">1</label>
    </div>
    <div class="form-check form-check-inline">
      <input
        id="inlineRadio2"
        class="form-check-input"
        type="radio"
        name="inlineRadioOptions"
        value="option2"
      />
      <label class="form-check-label" for="inlineRadio2">2</label>
    </div>
    <button></button>
  </div>
</template>

<script>
import HeaderComponent from '../../components/HeaderComponent.vue'
export default {
  components: {
    HeaderComponent,
  },
}
</script>

<style></style>
