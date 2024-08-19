import { createWebHistory, createRouter } from "vue-router";

import Login from "../views/Login.vue";
import Home from '@/views/Home'
import Profile from '@/views/Profile'

import store from '@/store/store.js';

const routes = [
  { 
    name: 'Login',
    path: "/login",
    component: Login
  },
  {
    name: 'Home',
    path: '/',
    component: Home,
  },
  {
    name: 'Profile',
    path: '/profile',
    component: Profile,
    meta: {
      requiresAuth: true,
    }
  }
];

const router = createRouter({
  history: createWebHistory(),
  routes,
})

router.beforeEach((to, from, next) => {
  if (to.meta.requiresAuth && !store.getters['auth/loggedIn']) {
    next({ path: '/login' });
  } else {
    next();
  }
})
export default router;