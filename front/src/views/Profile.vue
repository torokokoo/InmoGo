
<template>
  <div>
    <Navbar />
    <MenuProfile />
    <div class="container mx-auto p-6">
      <div class="heading text-center font-bold text-3xl mb-8 text-gray-800">Datos de la cuenta</div>
      <p class="text-center"><span class="font-bold">Nombre:</span>{{ user.name }}</p>
      <p class="text-center"><span class="font-bold">Rol:</span>{{ role }}</p>
      <p class="text-center"><span class="font-bold">Email:</span>{{ user.email }}</p>
    </div>
  </div>
</template>    


<script>
import MenuProfile from '@/components/MenuProfile.vue';
import Navbar from '@/components/Navbar';

export default {
  name: 'Profile',
  components: {
    Navbar,
    MenuProfile,//Se hizo icono para poder crear los demas elementos, chat, notficaciones etc
  },
  data() {
    return {
      user: {},
      role: '',
    };
  },
  mounted() {
    this.user = JSON.parse(localStorage.getItem('user'))
    switch (this.user.role) {
      case 1:
        this.role = 'Administrador' 
      case 2:
        this.role = 'Mantenedor'
      case 3:
        this.role = 'Propietario'
      case 4:
        this.role = 'Adquiriente'
      default:
        break;
    }
  },
  methods: {
  },
}
</script>