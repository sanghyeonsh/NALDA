<template>
  <div>
    <nav>
      <div id="nav-tab" class="nav nav-tabs" role="tablist">
        <a
          id="nav-home-tab"
          class="nav-item nav-link active"
          data-toggle="tab"
          href="#nav-home"
          role="tab"
          aria-controls="nav-home"
          aria-selected="true"
          >snack</a
        >
        <a
          id="nav-profile-tab"
          class="nav-item nav-link"
          data-toggle="tab"
          href="#nav-profile"
          role="tab"
          aria-controls="nav-profile"
          aria-selected="false"
          >non-alcohol</a
        >
        <a
          id="nav-contact-tab"
          class="nav-item nav-link"
          data-toggle="tab"
          href="#nav-contact"
          role="tab"
          aria-controls="nav-contact"
          aria-selected="false"
          >alcohol</a
        >
      </div>
    </nav>
  </div>
</template>

<script>
export default {
  name: 'ServiceNavbar',
  components: {},
}
</script>

<style></style>
