
<template>
  <div>
    <Navbar />
    <MenuProfile />
    <div class="container mx-auto p-6">
      <div class="heading text-center font-bold text-3xl mb-8 text-gray-800">Datos de la cuenta</div>
    </div>
  </div>
</template>    


<script>
import MenuProfile from '@/components/MenuProfile.vue';
import Navbar from '@/components/Navbar';
import router from '@/router';

export default {
  name: 'Profile',
  components: {
    Navbar,
    MenuProfile,//Se hizo icono para poder crear los demas elementos, chat, notficaciones etc
  },
  methods: {
  },
}
</script>