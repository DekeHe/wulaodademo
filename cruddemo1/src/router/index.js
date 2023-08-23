import Vue from 'vue'
import VueRouter from 'vue-router'

import CrudView from '../views/CrudView.vue'

Vue.use(VueRouter)

const routes=[
  {
    path: '/',
    name: 'crud',
    component: CrudView
  },

  {
    path: '/about',
    name: 'about',
    component: () => import('../views/AboutView.vue')
  },

  {
    path:'/hdk',
    name:'hdk',
    component:()=>import('../views/HdkView.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
