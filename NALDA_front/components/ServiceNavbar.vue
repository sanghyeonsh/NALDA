<template>
  <div>
    <nav>
      <div id="nav-tab" class="nav nav-tabs" role="tablist">
        <a
          id="nav-home-tab"
          class="nav-item nav-link active"
          data-toggle="tab"
          role="tab"
          aria-controls="nav-home"
          aria-selected="true"
          @click="clickFirst"
          >snack</a
        >
        <a
          id="nav-profile-tab"
          class="nav-item nav-link"
          data-toggle="tab"
          role="tab"
          aria-controls="nav-profile"
          aria-selected="false"
          @click="clickSecond"
          >non-alcohol</a
        >
        <a
          id="nav-contact-tab"
          class="nav-item nav-link"
          data-toggle="tab"
          role="tab"
          aria-controls="nav-contact"
          aria-selected="false"
          @click="clickThird"
          >alcohol</a
        >
        <div>{{ active }}</div>
      </div>
    </nav>
  </div>
</template>

<script>
export default {
  name: 'ServiceNavbar',
  components: {},
  // eslint-disable-next-line vue/require-prop-types
  props: ['active'],
  methods: {
    clickFirst() {
      this.$props.active = 1
    },
    clickSecond() {
      this.$props.active = 2
    },
    clickThird() {
      this.$props.active = 3
    },
    updateActive() {
      // eslint-disable-next-line prefer-const
      let newActive = {
        active: this.$props.active,
      }
      this.$emit('activeChange', newActive)
    },
  },
}
</script>

<style></style>
