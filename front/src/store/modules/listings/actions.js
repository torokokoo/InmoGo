import axios from 'axios';
import { api } from '@/config'
import router from '@/router'

export default {
    async getAll({ commit }) {
        const { data } = await axios.get(api + 'api/property/all');
        return data;
    },
    async create({ commit }, payload) {
        const { data } = await axios.post(api + 'api/property/create', payload);
        return data;
    }
}