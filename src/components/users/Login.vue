<template>
  <el-form :model="form" :rules="rules2" ref="form" label-position="left" label-width="0px"
           class="demo-ruleForm card-box loginform">
    <el-form-item prop="username">
      <el-input type="text" v-model="form.username" auto-complete="off" placeholder="account"></el-input>
    </el-form-item>
    <el-form-item prop="password">
      <el-input type="text" v-model="form.password" auto-complete="off" placeholder="password"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" v-loading="loading" @click.native.prevent="clear()">clear </el-button>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" v-loading="loading" @click.native.prevent="handleSubmit('form')">submit
      </el-button>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" v-loading="loading" @click.native.prevent="getUser()">getUser</el-button>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" v-loading="loading" @click.native.prevent="testRole()">testRole
      </el-button>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" v-loading="loading" @click.native.prevent="testSysResource()">
        testSysResource
      </el-button>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" v-loading="loading" @click.native.prevent="testPermission1()">
        testPermission1
      </el-button>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" v-loading="loading" @click.native.prevent="testPermission2()">
        testPermission2
      </el-button>
    </el-form-item>
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
  import {mapGetters, mapActions, mapMutations} from 'vuex'


  export default {
    components: {},
    data() {
      return {
        title: '',
        loading: false,
        form: {
          username: '',
          password: '',
        },
        requireVerify: false,
        rules2: {
          username: [
            {required: true, message: '请输入账号', trigger: 'blur'}
          ],
          password: [
            {required: true, message: '请输入密码', trigger: 'blur'}
          ],
          verifyCode: [
            {required: false, message: '请输入验证码', trigger: 'blur'}
          ]
        },
        checked: false
      }
    },
    methods: {
      clear() {
        Lockr.set('token');
        this.emptyResource();
      },
      handleSubmit(form) {
        let data = {}
        data.username = this.form.username
        data.password = this.form.password
        this.apiPost(API_AUTH, data).then((res) => {
          bus.$message({message: res.token});
          Lockr.set('token', res.token)
          this.loadResource();
        });
      },
      ...mapActions({
        loadResource: 'loadResourceList',
        emptyResource: 'emptyResourceList'
      }),
      getUser() {
        this.apiPost(API_GETUSER, {}).then((res) => {
          bus.$message({message: res});
        })
      },
      testRole() {
        this.apiGet(API_TESTROLE, {}).then((res) => {
          bus.$message({message: res});
        })
      },
      testSysResource() {
        this.apiGet(API_TESTSYSRESOURCE, {}).then((res) => {
          bus.$message({message: res});
        })
      },
      testPermission1() {
        this.apiPost(API_TESTPERMISSION1, {hello: "hello"}).then((res) => {
          bus.$message({message: res});
        })
      },
      testPermission2() {
        this.apiPost(API_TESTPERMISSION2, {hello: "hello"}).then((res) => {
          bus.$message({message: res});
        })
      }

    },
    mixins: [http]
  }
</script>

<style>

</style>
