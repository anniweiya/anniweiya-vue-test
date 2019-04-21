<template>
  <div style="height: 100%; overflow: hidden">
    <header-component></header-component>
    <div class="content">
      <div style="display: inline-block; vertical-align: top; height: 100%">
        <left-component></left-component>
      </div>
      <div style="display: inline-block; padding: 2em">
        <router-view></router-view>
      </div>
    </div>
  </div>
</template>

<script>
  import {mapGetters, mapActions, mapMutations} from 'vuex'
  import HeaderComponent from '@/components/common/Header.vue'
  import LeftComponent from '@/components/common/Left.vue'


  export default {
    components: {
      HeaderComponent,
      LeftComponent
    },
    data() {
      return {}
    },
    methods: {
      ...mapGetters([
        'resourceList'
      ])
    }
  }
</script>

<style>
  .content {
    z-index: 1;
    overflow-y: hidden;
    height: 100%;
  }
</style>
