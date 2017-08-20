<template>
  <header class="header">
    <el-menu theme="dark" mode="horizontal" class="menu" @select="handleSelect">
      <el-row  type="flex" justify="space-between">
        <el-col :xs="8" :sm="6" :md="3">
          <el-menu-item index="" disabled="" route=""> {{ username }} </el-menu-item>
        </el-col>
        <el-col >
          <el-menu-item index="/login" disabled="" route=""> hello </el-menu-item>
        </el-col>
        <el-col>
          <el-menu-item v-on:click="quit" index="" disabled="" route="">quit</el-menu-item>
        </el-col>
      </el-row>
    </el-menu>
  </header>
</template>

<script>
  import {mapGetters, mapActions, mapMutations} from 'vuex'

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
        this.$router.push({path: key});
      },
      quit() {
        this.clear();
      },
      clear() {
        Lockr.set('token');
        this.emptyResource();
      },
      ...mapActions({
        emptyResource: 'emptyResourceList'
      }),
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
