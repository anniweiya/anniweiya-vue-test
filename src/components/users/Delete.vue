<template>
  <el-form :model="form" :rules="rules2" ref="form" label-position="left" label-width="0px"
           class="demo-ruleForm card-box loginform">

  </el-form>
</template>

<script>
  import http from '@/js/http/http'
  import {
    API_AUTH,
    API_GETUSER,
    API_TESTROLE,
    API_TESTSYSRESOURCE,
    API_TESTPERMISSION1,
    API_TESTPERMISSION2
  } from '@/js/http/api'
  export default {
    components: {},
    data(){
      return {

      }
    },
    methods: {

    },
    mixins: [http]
  }
</script>

<style>

</style>
