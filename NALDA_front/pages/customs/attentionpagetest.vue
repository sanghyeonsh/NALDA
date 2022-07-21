<template>
  <div class="overflow-auto">
    <div>
      <b-pagination v-model="currentPage" pills :total-rows="rows" size="sm">
      </b-pagination>

    </div>
  </div>
</template>

<script>
export default {
    name: 'AttentionTest',
    components: {},
    data() {
        return {
            rows: 2,
            currentPage: 1
        }
    },
    methods: {
        paging() {

        }
    }
}
</script>

<style>

</style>