<template>
  <div>
    <div class="card">
      <img class="order-card-image" src="../static/logo.png" alt="" />
      <div class="card-body">
        <h5 class="card-title">Lorem</h5>
      </div>
    </div>

    <div class="card">
      <div class="card-header">My Card</div>
      <img src="images/card-image.png" alt="" />
      <div class="card-body">
        <h5 class="card-title">Lorem</h5>
        <p class="card-text">
          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam
          egestas sed sem ut malesuada.
        </p>
        <a href="#" class="btn btn-primary">More</a>
      </div>
    </div>
    <div class="card">
      <div class="card-header">My Card</div>
      <img src="images/card-image.png" alt="" />
      <div class="card-body">
        <h5 class="card-title">Lorem</h5>
        <p class="card-text">
          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam
          egestas sed sem ut malesuada.
        </p>
        <a href="#" class="btn btn-primary">More</a>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'OrdersCard',
}
</script>

<style>
.order-card-image {
  width: 50px;
  height: 50px;
}
</style>
