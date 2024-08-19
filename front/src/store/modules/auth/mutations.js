export default {
    ['setUser'](state, value) {
        console.log('setUser')
        state.user = value;
    },
    setLoggedIn(state, value) {
       state.loggedIn = value; 
    },
    ['reset'](state) {
        console.log('reset')
        state.user = {};
        state.loggedIn = false;
    },
};