<template>
  <div>
    <!-- Componente de la barra de navegación -->
    <Navbar />
    <!-- Componente del perfil del menú -->
    <MenuProfile />
    <div class="title">
      <!-- Título de la sección -->
      <div class="heading text-center font-bold text-3xl mb-8 text-gray-800">Visitas agendadas</div>
      <!-- Contenedor de las notificaciones de visitas -->
      <div class="appointments-container">
        <!-- Genera un rectángulo por cada agendamiento -->
        <div v-for="appointment in appointments" :key="appointment.id" class="visit-notification-box">
          <p class="text-black-500 font-bold">{{ appointment.message }}</p>
        </div>
      </div>
    </div>
  </div>
</template>    

<script>
import MenuProfile from '@/components/MenuProfile.vue';
import Navbar from '@/components/Navbar';
import router from '@/router';

export default {
  components: {
    Navbar,
    MenuProfile,
  },
  data() {
    return {
      // Lista de agendamientos
      //Aca va la logica para conectar con los agendamientos existentes
      appointments: [
        { id: 1, message: 'Tienes una visita agendada:' },
        { id: 2, message: 'Tienes otra visita agendada:' },
        // Agrega más agendamientos según sea necesario
      ],
    };
  },
  methods: {
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





