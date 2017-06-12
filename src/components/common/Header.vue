<template>
  <el-menu theme="dark" :default-active="activeIndex" class="el-menu-demo" mode="horizontal">
    <el-menu-item index="1" disabled="">anniweiya</el-menu-item>
  </el-menu>
</template>

<script>
  import ElMenu from "../../../node_modules/element-ui/packages/menu/src/menu";
  import ElMenuItem from "../../../node_modules/element-ui/packages/menu/src/menu-item";
  export default {
    components: {
      ElMenuItem,
      ElMenu
    },
    data() {
      return {
        activeIndex: '1',
      }
    },
    methods: {}
  }
</script>
