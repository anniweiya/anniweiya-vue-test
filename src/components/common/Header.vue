<template>
  <header class="header">
    <el-menu theme="dark" mode="horizontal" class="menu" @select="handleSelect">
      <el-row  type="flex" justify="space-between">
        <el-col :xs="8" :sm="6" :md="3">
          <el-menu-item index=""> {{ username }} </el-menu-item>
        </el-col>
        <el-col >
          <el-menu-item index="/login"> hello </el-menu-item>
        </el-col>
        <el-col>
          <el-menu-item index="">quit</el-menu-item>
        </el-col>
      </el-row>
    </el-menu>
  </header>
</template>

<script>
  export default {
    components: {},
    data() {
      return {}
    },
    computed: {
      username(){
        return "anniweiya"
      }
    },
    methods: {
      handleSelect(key){
        console.info(key)
        this.$router.push({path: key});
      }
    }
  }
</script>

<style>
  .header {
    height: 4rem;
    background: #d3dce6;
  }

  .menu {
    position: fixed;
    z-index: 2;
    width: 100%;
    height: 4rem;
    top: 0;
    left: 0;
  }
</style>
