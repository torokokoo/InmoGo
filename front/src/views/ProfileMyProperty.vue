
<template>
    <div>
      <Navbar />
      <MenuProfile />
      <div class="container mx-auto p-6">
        <div class="heading text-center font-bold text-3xl mb-8 text-gray-800">Mis propiedades</div>
        <div class="appointments-container">
          <!-- Genera un rectángulo por cada agendamiento -->
          <div v-for="listing in listings" :key="listing.id" class="visit-notification-box">
            <p class="text-black-500 font-bold"><router-link :to="'/listings/' + listing.id">{{ listing.house ? 'Casa' : 'Departamento' }} en {{ listing.address }}</router-link></p>
          </div>
        </div>
      </div>
    </div>
  </template>    
  
  
  <script>
  import MenuProfile from '@/components/MenuProfile.vue';
  import Navbar from '@/components/Navbar';
  import axios from 'axios'
  import { api } from '@/config';
  import router from '@/router';
  
  export default {
    name: 'ProfileMyProperty',
    data() {
      return {
        listings: [],
      };
    },
    components: {
      Navbar,
      MenuProfile,//Se hizo icono para poder crear los demas elementos, chat, notficaciones etc
    },
    mounted() {
      this.getMyListings();
    },
    methods: {
      async getMyListings () {
        const { data } = await axios.get(`${api}api/listing/all`);
        const ownerId = JSON.parse(localStorage.getItem('user')).id;
        // console.log(data)
        this.listings = data
          .filter(listing => listing.ownerId.id == ownerId)
      }
    },
  }
  </script>

<style scoped>
/* Contenedor de las notificaciones de visitas */
.appointments-container {
  display: flex;
  flex-direction: column; /* Alinea los elementos verticalmente */
  gap: 10px; /* Espacio entre los elementos */
  margin-left: 380px; /* Desplaza el contenedor para evitar superposición con el menú */
  margin-right: 30px; /* Se deja un borde de 10*/
}

/* Estilos para los rectángulos de notificación */
.visit-notification-box {
  border: 1.5px solid rgb(57, 175, 254); /* Borde azul */
  border-radius: 8px; /* Bordes redondeados */
  padding: 20px; /* Espaciado interno */
  background-color: white; /* Fondo blanco */
  transition: transform 0.1s, background-color 0.3s; /* Transición suave para el efecto hover */
}

/* Efecto hover */
.visit-notification-box:hover {
  transform: scale(1.02); /* Aumenta ligeramente el tamaño */
  background-color: #e9f6ff; /* Cambia el color de fondo */
}
</style>