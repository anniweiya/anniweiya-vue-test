<template>
  <div class="left">
    <el-menu :default-active="onRoutes" router>
      <template v-for="item in resourceList">
        <left-resource-component :param="item"></left-resource-component>
      </template>
    </el-menu>
  </div>

</template>

<script>
//  import {mapGetters, mapActions, mapMutations} from 'vuex'
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
        resourceList:[]
      }
    },
    methods: {
//      ...mapActions({
//        load: 'loadResourceList'
//      })
      async load(){
        console.info("load");
        let res = await getResource();
        this.resourceList = res;
        console.info("getResource result:" + res);
      }
    },
    created: function () {
      this.load();
    },
    computed: {
      onRoutes(){
        return this.$route.path;
      },
//      ...mapGetters([
//        'resourceList'
//      ])
    }
  }
</script>

<style>
  .left {
    overflow-x: hidden;
    overflow-y: auto;
    -webkit-overflow-scrolling: touch;
    -ms-overflow-style: none;
  }

</style>
