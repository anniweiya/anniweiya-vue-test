import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeComponent from '@/components/common/Home.vue'
import Loginomponent from '@/components/users/Login.vue'
import UserAddComponent from '@/components/users/Add.vue'
import UserDeleteComponent from '@/components/users/Delete.vue'
Vue.use(VueRouter)

const routes = [
  { path: '/', component: HomeComponent, name: 'Home', children: [
    { path: '/login', component: Loginomponent, name: 'Login'},
    { path: '/system/user/add', component: UserAddComponent, name: 'UserAdd'},
    { path: '/system/user/delete', component: UserDeleteComponent, name: 'UserAdd'},
  ]}
]

const router = new VueRouter({
  routes
})


export default router
