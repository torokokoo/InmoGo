import './assets/main.css'
import { createApp } from 'vue'

// Components
import App from './App.vue'

// Config
import router from '@/router'
import store from '@/store/store'

createApp(App)
    .use(router)
    .use(store)
    .mount('#app')
