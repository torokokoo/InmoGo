export default {
    ['setUser'](state, value) {
        state.user = value;
    },
    setLoggedIn(state, value) {
       state.loggedIn = value; 
    },
    reset(state) {
        state.user = {};
        state.loggedIn = false;
    },
};