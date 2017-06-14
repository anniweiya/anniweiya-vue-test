<template>
  <div>
    <header-component></header-component>
    <div class="content">
      <el-row>
        <el-col :xs="8" :sm="6" :md="3">
          <left-component></left-component>
        </el-col>
        <el-col :xs="16" :sm="18" :md="21">
          <div class="route">
            <login-component></login-component>
          </div>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
  import HeaderComponent from '@/components/common/Header.vue'
  import LeftComponent from '@/components/common/Left.vue'
  import LoginComponent from '@/components/users/Login.vue'
  export default {
    components: {
      HeaderComponent,
      LeftComponent,
      LoginComponent
    },
    data() {
      return {}
    },
    methods: {}
  }
</script>

<style>
  .content {
    z-index: 1;
    overflow-x: hidden;
  }
  .route{
    padding: 1em;
  }
</style>
