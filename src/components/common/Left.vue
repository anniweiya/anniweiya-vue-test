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
  import {mapGetters, mapActions, mapMutations} from 'vuex'
  import LeftResourceComponent from '@/components/common/LeftResource.vue'


  export default {
    props: {
      show: Boolean
    },
    components: {
      LeftResourceComponent
    },
    data() {
      return {}
    },
    methods: {
      ...mapActions({
        load: 'loadResourceList'
      })
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
  .left {
    overflow-x: hidden;
    overflow-y: auto;
    -webkit-overflow-scrolling: touch;
    -ms-overflow-style: none;
  }

</style>
