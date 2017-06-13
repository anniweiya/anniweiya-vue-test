<template>
  <div class="header">
    <div class="logo">manage system</div>
    <div class="user-info">
      <el-dropdown trigger="click" @command="handleCommand">
                <span class="el-dropdown-link">
                    {{username}}
                </span>
        <el-dropdown-menu slot="dropdown">
          <el-dropdown-item command="loginout">退出</el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>
    </div>
  </div>

</template>

<script>
  export default {
    components: {},
    data() {
      return {}
    },
    computed:{
      username(){
          return "anniweiya"
      }
    },
    methods: {
      handleCommand(){

      }
    }
  }
</script>

<style>
  .header {
    background-color: #EFF2F7;
    position: relative;
    box-sizing: border-box;
    width: 100%;
    height: 70px;
    font-size: 22px;
    line-height: 70px;
  }

  .header .logo{
    float: left;
    width:250px;
    text-align: center;
  }
</style>
