<template>
  <!--children-->
  <el-submenu :index="item.routeUrl" v-if="item.children && item.children.length>0">
    <template slot="title">
      <i :class="item.icon"></i>
      <span>{{item.name}}</span>
    </template>
    <template v-for="child in item.children">
      <left-resource-component v-if="child.children && child.children.length>0" :param="child" style="width: 200px">
      </left-resource-component>
      <el-menu-item :index="child.routeUrl" v-else disabled="" route="">
        <i :class="item.icon"></i>
        <span>{{child.name}}</span>
      </el-menu-item>
    </template>
  </el-submenu>


  <el-menu-item :index="item.routeUrl" v-else disabled="" route="">
    <i :class="item.icon"></i>
    <span>{{item.name}}</span>
  </el-menu-item>
</template>

<script>
  import LeftResourceComponent from '@/components/common/LeftResource.vue'

  export default {
    name: 'LeftResourceComponent',
    props: ['param'],
    components: {
      LeftResourceComponent
    },
    data() {
      return {
        item: this.param
      }
    },
    methods: {},
    computed: {}
  }
</script>

<style>


</style>
