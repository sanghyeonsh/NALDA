<template>
  <div class="mypage-container">
    <div class="user-nav">
      <user-navs></user-navs>
    </div>
    <div class="user-page-wrap"></div>
  </div>
</template>

<script>
import UserNavs from '../../components/UserNavs.vue'
export default {
  name: 'MyPage',
  components: { UserNavs },
}
</script>

<style>
@font-face {
  font-family: 'twayfly';
  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_tway@1.0/twayfly.woff')
    format('woff');
  font-weight: normal;
  font-style: normal;
}

:root {
  --body-background-color: #f5f6f7;
  --font-color: #4e4e4e;
  --border-gray-color: #dadada;
  --nalda-blue-color: #206e95;
  --nalda-blue-border-color: #88c0c5;
}

* {
  margin: 0;
  padding: 0;
  font-family: 'twayfly';
}

.mypage-container {
  display: flex;
  flex-direction: row;
}

.user-page-wrap {
  height: 700px;
}
</style>