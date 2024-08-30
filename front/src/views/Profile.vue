<template>
  <div>
    <Navbar />
    <div class="container mx-auto p-6">
      <div class="heading text-center font-bold text-3xl mb-8 text-gray-800">Perfil de Usuario</div>
      <div class="flex justify-around mb-8">
        <button class="btn bg-indigo-500 text-white hover:bg-teal-500">Visitas Agendadas</button>
        <button class="btn bg-indigo-500 text-white hover:bg-teal-500">Chat de Mensajería</button>
        <button class="btn bg-indigo-500 text-white hover:bg-teal-500">Contactar Soporte</button>
        <button class="btn bg-red-500 text-white hover:bg-red-600">Logout</button>
      </div>
    </div>
  </div>
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