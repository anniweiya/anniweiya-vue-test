<template>
  <div style="height: 100%" v-if="resourceList && resourceList.length > 0">
    <el-menu class="el-menu-vertical" style="height: 100%" :default-active="onRoutes" router :collapse="isCollapse">
      <template v-for="item in resourceList">
        <left-resource-component :param="item"></left-resource-component>
      </template>
    </el-menu>
  </div>
</template>

<script>
  import {mapGetters, mapActions, mapMutations} from 'vuex'
  import LeftResourceComponent from '@/components/common/LeftResource.vue'
  import {getResource} from '@/service/getData'


  export default {
    props: {
      show: Boolean
    },
    components: {
      LeftResourceComponent
    },
    data() {
      return {
        isCollapse: false
      }
    },
    methods: {
      ...mapActions({
        load: 'loadResourceList'
      }),
    },
    created: function () {
      this.load();
    },
    computed: {
      onRoutes(){
        return this.$route.path;
      },
      ...mapGetters([
        'resourceList'
      ])
    }
  }
</script>

<style>
  /*.left {*/
    /*overflow-x: hidden;*/
    /*overflow-y: auto;*/
    /*-webkit-overflow-scrolling: touch;*/
    /*-ms-overflow-style: none;*/
  /*}*/
  .el-menu-vertical:not(.el-menu--collapse) {
    width: 200px;
    min-height: 400px;
  }
</style>
