<template>
  <Navbar />
  <button @click="logout">Logout</button>
</template>
<script>
  import Navbar from '@/components/Navbar';
  import { mapActions } from 'vuex';
  import router from '@/router';

  export default {
    data: () => ({
      
    }),
    components: {
      Navbar,
    },
    methods: {
      ...mapActions(['auth/logout']),
      logout() {
          this.$store.dispatch('auth/logout')
          router.push({ path: '/' }) 
        }
    },
  }
</script>