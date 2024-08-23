import { createStore } from 'vuex';
// import VuexPersistence from 'vuex-persist';
import createPersistedState from 'vuex-persistedstate';
import auth from '@/store/modules/auth'
import listings from '@/store/modules/listings'

// const vuexLocal = new VuexPersistence({
//     storage: window.localStorage,
//     modules: ['auth']
// })

const dataPersist = createPersistedState({
    paths: ['auth'],
})

const store = createStore({
    modules: {
        auth,
        listings,
    },
    // plugins: [vuexLocal.plugin]
    plugins: [dataPersist],
});

export default store;

