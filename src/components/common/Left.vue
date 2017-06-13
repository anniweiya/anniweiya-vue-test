<template>
  <aside class="left" :class="{ slideInLeft: show, slideOutLeft: !show }">
    <el-menu>
      <template v-for="item in resourceList">
        <left-resource-component :param="item"></left-resource-component>
      </template>
    </el-menu>
  </aside>

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
      ...mapGetters([
        'resourceList'
      ])
    }
  }
</script>

<style>

  .slideInLeft {
    animation-duration: .377s;
    animation-name: slideInLeft;
  }

  .slideOutLeft {
    animation-duration: .377s;
    animation-name: slideOutLeft;
  }

  .left {
    min-height: 100%;
    width: 230px;
  }

</style>
