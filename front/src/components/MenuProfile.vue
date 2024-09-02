<template>
  <div class="flex">
    <div class="menu-container">
      <div class="profile-pic-container">
        <img src="https://picsum.photos/500" alt="Foto de Perfil" class="profile-pic">
      </div>
      <!-- Botones del menú con lógica para mostrar u ocultar según el rol del usuario -->
      <div class="menu-item" @click="profile">Datos de la cuenta </div>
      <div class="menu-item" @click="goTo('notifications')">Notificaciones </div>
      <div v-if="userRole === 3 || userRole === 4" class="menu-item appoinment" @click="appointment">Visitas Agendadas </div>
      <div v-if="userRole === 3" class="menu-item property" @click="myProperty">Ver mis propiedades </div>
      <div v-if="userRole === 1" class="menu-item" @click="accept">Aprobar propiedades </div>
      <div v-if="userRole === 3" class="menu-item" @click="goTo('pay-publications')">Pagar publicidad </div>
      <div v-if="userRole === 3 || userRole === 4" class="menu-item" @click="goTo('payment-history')">Historial de pagos </div>
      <div class="menu-item chats" @click="chats">Chats </div>
      <div class="menu-item" @click="goTo('forum')">Pregunta frecuentes </div>
      <div v-if="userRole === 3" class="menu-item" @click="goTo('contact-agency')">Contactar con agencia </div>
      <div class="menu-item" @click="goTo('support')">Soporte </div>
      <div class="menu-item logout" @click="logout">Cerrar Sesión </div>
    </div>
  </div>
</template>


<script>
import axios from 'axios'; // Importamos axios para hacer solicitudes HTTP
import router from '@/router'; // Importamos el router para la navegación

export default {
  name: 'MenuProfile', // Nombre del componente
  data() {
    return {
      userRole: 0 // Inicializamos userRole como null
    };
  },
  created() {
    // Cuando el componente se crea, obtenemos el ID del usuario desde localStorage
    this.userRole = JSON.parse(localStorage.getItem('user')).role;
    // this.getUserRole(userId); // Llamamos al método para obtener el rol del usuario
  },
  methods: {
    // Método para obtener el rol del usuario desde el backend
    async getUserRole(userId) {
      try {
        // Hacemos una solicitud GET al endpoint /api/users/role con el ID del usuario
        const response = await axios.get(`/api/users/role?id=${userId}`);
        this.userRole = response.data; // Asignamos el rol del usuario a userRole
      } catch (error) {
        console.error('Error al obtener el rol del usuario:', error); // Manejo de errores
      }
    },
    // Método para navegar a una página específica
    goTo(page) {
      router.push({ name: page });
    },
    // Métodos para navegar a diferentes rutas
    profile() {
      router.push({ path: '/profile' });
    },
    chats() {
      router.push({ path: '/profile-chat' });
    },
    appointment() {
      router.push({ path: '/profile-appointment' });
    },
    myProperty() {
      router.push({ path: '/profile-property' });
    },
    accept() {
      router.push({ path: '/profile-accept' });
    },
    // Método para cerrar sesión
    logout() {
      this.$store.dispatch('auth/logout'); // Despachamos la acción de logout en Vuex
      router.push({ path: '/' }); // Redirigimos a la página de inicio
    },
  }
}
</script>


<style scoped>
.container {
  max-width: 1200px;
  margin: auto;
  padding: 20px;
}

.heading {
  text-align: center;
  font-size: 2em;
  margin-bottom: 20px;
  color: #4a4a4a;
}

.profile-pic-container {
  display: flex;
  justify-content: center;
  margin-bottom: 10px;
}

.profile-pic {
  width: 228px;
  height: 228px;
  border-radius: 50%;
  border: 5px solid #5d136c;
}

.menu-container {
  width: 350px;
  border: 2px solid #d1d5db;
  border-radius: 8px;
  /* overflow: hidden; */
  position: fixed;
  top: 0;
  left: 0;
  min-height: 100%;
  background-color: white;
  padding-top: 100px;
}

.menu-item {
  padding: 15px 20px;
  border-bottom: 1px solid #d1d5db;
  cursor: pointer;
  transition: transform 0.1s, font-weight 0.1s;
}

.menu-item:last-child {
  border-bottom: none;
}

.menu-item:hover {
  transform: scale(1.03);
  font-weight: bold;
}

.logout {
  background-color: #e53e3e;
  color: white;
}

.logout:hover {
  background-color: #c53030;
}
</style>
