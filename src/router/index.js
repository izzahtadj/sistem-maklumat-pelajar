import Vue from 'vue'
import VueRouter from 'vue-router'
import Dashboard from '../views/Dashboard.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Dashboard',
    component: Dashboard
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/timetable',
    name: 'Timetable',
    component: () => import('../views/Timetable.vue')
  },
  {
    path: '/courseresult',
    name: 'CourseResult',
    component: () => import('../views/CourseResult.vue')
  },
  {
    path: '/useraccount',
    name: 'UserAccount',
    component: () => import('../views/UserAccount.vue')
  },
  {
    path: '/assignment',
    name: 'Assignment',
    component: () => import('../views/Assignment.vue')
  },
  {
    path: '/courselist',
    name: 'CourseList',
    component: () => import('../views/CourseList.vue')
  },
  {
    path: '/financial',
    name: 'Financial',
    component: () => import('../views/Financial.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
