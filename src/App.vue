<template>
  <div id="app">
    <header-component></header-component>
    <router-view></router-view>
  </div>
</template>

<script>
  import HeaderComponent from '@/components/common/Header.vue'

  export default {
    name: 'app',
    components: {
      'header-component': HeaderComponent
    }
  }
</script>
<style>

  body {
    margin: 0px;
    padding: 0px;
    background: white;
    font-family: Helvetica Neue, Helvetica, PingFang SC, Hiragino Sans GB, Microsoft YaHei, SimSun, sans-serif;
    font-weight: 400;
    -webkit-font-smoothing: antialiased;
  }

  #app {
    position: absolute;
    top: 0px;
    bottom: 0px;
    width: 100%;
  }
</style>
