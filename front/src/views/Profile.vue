<template>
    <h1>Profile</h1>
    <button @click="logout">Logout</button>
</template>
<script>
  import { mapActions } from 'vuex';
  import router from '@/router';

  export default {
    data: () => ({

    }),
    methods: {
      ...mapActions('auth', ['logout']),
      async logout() {
        await this['logout']
        console.log(await this['logout'])
        console.log('logout')
        router.push('/')
      }
    }
  }
</script>