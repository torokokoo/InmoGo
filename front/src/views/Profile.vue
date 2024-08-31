

<template>
  <div>
    <Navbar />
    <div class="container mx-auto p-6">
      <div class="flex justify-center mb-8">
        <img src="https://picsum.photos/800/500" alt="Foto de Perfil" class="profile-pic">
      </div>
      <div class="heading text-center font-bold text-3xl mb-8 text-gray-800">Perfil de Usuario</div>
      <div class="menu-container items-start">
        <div class="menu-item" @click="goTo('chats')">Chats</div>
        <div class="menu-item" @click="goTo('notifications')">Notificaciones</div>
        <div class="menu-item" @click="goTo('visits')">Visitas Agendadas</div>
        <div class="menu-item" @click="goTo('account')">Datos de la cuenta</div>
        <div class="menu-item" @click="goTo('security')">Seguridad</div>
        <div class="menu-item" @click="goTo('payment-history')">Historial de pagos</div>
        <div class="menu-item" @click="goTo('forum')">Foro de consulta</div>
        <div class="menu-item" @click="goTo('support')">Soporte</div>
        <div class="menu-item logout" @click="logout">Cerrar Sesión</div>
      </div>
    </div>
  </div>
</template>




<script>
  import Navbar from '@/components/Navbar';
  import router from '@/router';

  export default {
    components: {
      Navbar,
    },
    methods: {
      goTo(page) {
        router.push({ name: page });
      },
      logout() {
        // Lógica para cerrar sesión
        this.$store.dispatch('auth/logout')
        router.push({ path: '/' });
      }
    },
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

.profile-pic {
  width: 228px;
  height: 228px;
  border-radius: 50%;
  border: 5px solid #5d136c;
}

.menu-container {
  width: 100%;
  max-width: 400px;
  margin: auto;
  border: 2px solid #d1d5db;
  border-radius: 8px;
  overflow: hidden;
}

.menu-item {
  padding: 15px 20px;
  border-bottom: 1px solid #d1d5db;
  cursor: pointer;
  transition: transform 0.3s, font-weight 0.3s;
}

.menu-item:last-child {
  border-bottom: none;
}

.menu-item:hover {
  transform: scale(1.05);
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
