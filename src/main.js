// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import axios from 'axios'
import Lockr from 'lockr'
import Cookies from 'js-cookie'
import _ from 'lodash'
import store from './vuex/store'
import moment from 'moment'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-default/index.css'
// import _g from './assets/js/global'
import router from './router'
axios.defaults.baseURL = HOST
axios.defaults.timeout = 1000 * 15
axios.defaults.headers['Authorization'] = Lockr.get('token')
axios.defaults.headers['Content-Type'] = 'application/json'



Vue.use(ElementUI)

Vue.config.productionTip = false
global.router = router
global.store = store
global.HOST = HOST
global.axios = axios
global._ = _
global.moment = moment
global.Lockr = Lockr
global.Cookies = Cookies
// global._g = _g
global.pageSize = 15

const bus = new Vue()
global.bus = bus

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  template: '<App/>',
  components: {App}
}).$mount('#app')
