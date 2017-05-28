<template>
  <div>
    <el-form :model="form" :rules="rules2" ref="form" label-position="left" label-width="0px"
             class="demo-ruleForm card-box loginform">
      <h3 class="titie">{{systemName}}</h3>
      <el-form-item prop="username">
        <el-input type="text" v-model="form.username" auto-complete="off" placeholder="account"></el-input>
      </el-form-item>
      <el-form-item prop="password">
        <el-input type="text" v-model="form.password" auto-complete="off" placeholder="password"></el-input>
      </el-form-item>
      <el-form-item style="...">
        <el-button type="primary" style="..." v-loading="loading" @click.native.prevent="handleSubmit('form')">submit
        </el-button>
      </el-form-item>
      <el-form-item style="...">
        <el-button type="primary" style="..." v-loading="loading" @click.native.prevent="getUser()">getUser</el-button>
      </el-form-item>
      <el-form-item style="...">
        <el-button type="primary" style="..." v-loading="loading" @click.native.prevent="testRole()">testRole</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
  import http from '../../assets/js/http'
  import ElForm from "../../../node_modules/element-ui/packages/form/src/form";
  import ElFormItem from "../../../node_modules/element-ui/packages/form/src/form-item";
  import ElInput from "../../../node_modules/element-ui/packages/input/src/input";
  export default {
    components: {
      ElInput,
      ElFormItem,
      ElForm
    },
    data(){
      return {
        title: '',
        systemName: 'anniweiya',
        loading: false,
        form: {
          username: '',
          password: '',
          verifyCode: ''
        },
        requireVerify: false,
        verifyUrl: '',
        verifyImg: window.HOST + 'admin/verify',
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
      handleSubmit(form){
        let data = {}
        data.username = this.form.username
        data.password = this.form.password
        this.apiPost('/auth/', data).then((res) => {
          bus.$message({message: res.token});
          Lockr.set('token', res.token)
        })
      },
      getUser(){
        this.apiPost('/user', {}).then((res) => {
          bus.$message({message: res});
        })
      },
      testRole(){
        this.apiGet('/protected', {}).then((res) => {
          bus.$message({message: res});
        })
      }
    },
    mixins: [http]
  }
</script>

<style>

</style>
