import { createWebHistory, createRouter } from "vue-router";

import Login from "../views/Login.vue";
import Home from '@/views/Home'
import Profile from '@/views/Profile'
import Register from '@/views/Register'
import PostProperty from '@/views/PostProperty'
import Listings from '@/views/Listings'
import Owner from '@/views/Owner.vue'

const routes = [
  { 
    name: 'Login',
    path: "/login",
    component: Login
  },
  {
    name: 'Register',
    path: '/register',
    component: Register
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
  },
  {
    name: 'PostProperty',
    path: '/post',
    component: PostProperty,
    meta: {
      requiresAuth: true,
    }
  },
  {
    name: 'Listings',
    path: '/listings',
    component: Listings,
  },
  {
    name: 'Owner',
    path: '/owner',
    component: Owner,
  },
  {
    name: 'Admin',
    path: '/admin',
    component: Admin,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
})

router.beforeEach((to, from, next) => {
  const loggedIn = window.localStorage.getItem('loggedIn') || 'false'
  if (to.meta.requiresAuth && loggedIn === 'false') {
    next({ path: '/login' });
  } else {
    next();
  }
})
export default router;