<template>
  <el-submenu v-if="item.children && item.children.length>0">
    <template slot="title">
      <i :class="item.icon">{{item.name}}</i>
    </template>
    <template>
      <sub-menu v-if="item.children && item.children.length" :param="child"></sub-menu>
      <el-menu-item v-else="">
        <i :class="child.icon">{{child.name}}</i>
      </el-menu-item>
    </template>
  </el-submenu>
  <el-menu-item v-else="">
    <i>{{item.name}}</i>
  </el-menu-item>
</template>

<script>
  import LeftResourceComponent from '@/components/common/LeftResource.vue'

  export default {
    name:'LeftResourceComponent',
    props: ['param'],
    components: {
      LeftResourceComponent
    },
    data() {
      return {
          item: this.param
      }
    },
    methods: {
    },
    computed: {
    }
  }
</script>

<style>


</style>
