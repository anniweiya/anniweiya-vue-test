import Vue from 'vue'
import VueRouter from 'vue-router'
import NProgress from 'nprogress'
import store from '@/vuex/store'
import Login from '@/components/users/Login'
Vue.use(VueRouter)

const routes = [
  { path: '/', component: Login, name: 'Login'}
]

const router = new VueRouter({
  routes // （缩写）相当于 routes: routes
})


router.beforeEach((to, from, next) => {
  console.log("to:" + to)
  console.log("from:" + from)
  const hideLeft = to.meta.hideLeft
  store.dispatch('showLeftMenu', hideLeft)
  store.dispatch('showLoading', true)
  NProgress.start()
  next()
})
router.afterEach(transition => {
  NProgress.done()
})
export default router
