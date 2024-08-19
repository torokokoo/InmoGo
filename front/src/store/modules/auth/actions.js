import axios from 'axios';
import { api } from '@/config'
import router from '@/router'

export default {
    async login({ commit }, payload) {
        const { data } = await axios.post(api + 'api/usuario/login', payload);
        commit('setUser', data);
        // localStorage.setItem('user', JSON.stringify(data));
        commit('setLoggedIn', true);
        router.push({ path: '/' });
    },
    async logout({ commit }) {
        console.log('logout action')
        commit('reset');
    }
}