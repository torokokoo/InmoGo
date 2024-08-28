import axios from 'axios';
import { api } from '@/config'
import router from '@/router'

export default {
    async getAll({ commit }) {
        const { data } = await axios.get(api + 'api/listing/all');
        return data;
    },
    async getById({ commit }, id) {
        const { data } = await axios.get(api + 'api/listing/' + id);
        return data;
    },
    async create({ commit }, payload) {
        console.log(payload)
        const { data } = await axios.post(api + 'api/listing/create', payload);
        return data;
    },
}
