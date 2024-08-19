import axios from 'axios';
import { api } from '@/config'
import router from '@/router'

export default {
    async login({ commit }, payload) {
        const { data } = await axios.post(api + 'api/user/login', payload);
        commit('setUser', data);
        localStorage.setItem('user', JSON.stringify(data));
        localStorage.setItem('loggedIn', true);
        commit('setLoggedIn', true);
        router.push({ path: '/profile' });
    },
    async register({ commit }, payload) {
        const { data } = await axios.post(api + 'api/user/register', payload);
        commit('setUser', data);
        localStorage.setItem('user', JSON.stringify(data));
        localStorage.setItem('loggedIn', true);
        commit('setLoggedIn', true);
        router.push({ path: '/profile' });
    },
    logout({ commit }) {
        console.log('logout action')
        localStorage.setItem('user', JSON.stringify({}));
        localStorage.setItem('loggedIn', false);
        commit('reset');
    }
}