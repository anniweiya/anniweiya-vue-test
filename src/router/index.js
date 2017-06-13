import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '@/components/common/Home.vue'
Vue.use(VueRouter)

const routes = [
  { path: '/', component: Home, name: 'Home'}
]

const router = new VueRouter({
  routes
})


export default router
