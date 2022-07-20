<template>
  <div>
    <div class="snacknav-container">
      <ul class="snack-list">
        <li class="item mouse-effect stagger-item">
          <div class="left">
            <i class="fa-solid fa-user"></i>
            <div class="name">snacks</div>
          </div>
          <div class="right">
            <i class="fa-solid fa-chevron-right"></i>
          </div>
        </li>

        <li class="item mouse-effect stagger-item">
          <div class="left">
            <i class="fa-solid fa-suitcase-rolling"></i>
            <div class="name">no-alcohols</div>
          </div>
          <div class="right">
            <i class="fa-solid fa-chevron-right"></i>
          </div>
        </li>
        <li class="item mouse-effect stagger-item">
          <div class="left">
            <i class="fa-solid fa-bookmark"></i>
            <div class="name">alcohols</div>
          </div>
          <div class="right">
            <i class="fa-solid fa-chevron-right"></i>
          </div>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: 'SnackNavbar',
}
</script>

<style>
:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
  --nalda-background-blue-color: #45a9c8;
}

.snacknav-container {
  background-color: var(--nalda-blue-color);
  color: #ffe6cf;
  height: auto;
  width: auto;
  margin-left: 0;
}
.sncaks-wrap {
  padding: 80px 40px;
}

h2 {
  margin: 0;
  font-weight: 400;
  line-height: 1;
  font-size: 24px;
}

ul,
li {
  margin: 0;
  padding: 0;
}

li {
  list-style: none;
}

.usernav-container button {
  background-color: transparent;
  border: none;
  outline: none;
  color: #ffe6cf;
  font-size: 15px;
}

.mouse-effect {
  position: relative;
  overflow: hidden;
}

.mouse-effect:after {
  content: '';
  position: absolute;
  width: 100%;
  height: 100%;
  left: 0;
  top: 0;
  transition: 0.2s;
}

.mouse-effect:hover:after {
  background-color: rgba(0, 0, 0, 0.08);
}

.mouse-effect:active:after {
  background-color: rgba(0, 0, 0, 0.12);
  transition: 0s;
}

/* 헤더 */
header {
  text-align: center;
}

header .thumb {
  width: 92px;
  height: 92px;
  border-radius: 50%;
  box-shadow: 0 6px 12px 0 rgba(0, 0, 0, 0.1), 0 12px 24px 0 rgba(0, 0, 0, 0.24);
}

header .thumb-wrapper {
  position: relative;
  display: inline-block;
  margin-bottom: 36px;
}

header .greeting {
  margin-bottom: 10px;
}

header .modify {
  padding: 8px 22px 10px 22px;
  background-color: rgba(0, 0, 0, 0.05);
  display: inline-block;
  border-radius: 20px;
  box-shadow: inset 0 0 0 1px rgba(0, 0, 0, 0.08);
  margin-top: 18px;
  cursor: pointer;
}

/* 리스트 */
.snack-list {
  margin-top: 48px;
  padding-bottom: 30px;
}

.snack-list .item {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 1px solid rgba(0, 0, 0, 0.08);
  font-size: 15px;
  cursor: pointer;
}

.snack-list .item .left {
  display: flex;
  align-items: center;
}

.snack-list .item .left .name {
  margin-left: 6px;
}

.snack-list .item .right {
  opacity: 0.5;
}

/* 이부분 수정 필요 */
.snack-list .item i {
  padding: 20px 22px;
}

.snack-list .item .right img {
  padding-right: 14px;
}
</style>