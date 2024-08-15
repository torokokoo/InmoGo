import axios from 'axios';
import { api } from '@/config'
import router from '@/router'

export default {
    async login({ commit }, payload) {
        const { data } = await axios.post(api + 'api/usuario/login', payload);
        commit('setUser', data.user);
        commit('loggedIn', true);
        router.push({ path: '/' });
    },
}