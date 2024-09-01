<template>
  <div class="flex">
    <div class="menu-container">
      <div class="profile-pic-container">
        <img src="https://picsum.photos/800/500" alt="Foto de Perfil" class="profile-pic">
      </div>

      <div class="menu-item" @click="goTo('account')">Datos de la cuenta</div>
        <div class="menu-item" @click="goTo('notifications')">Notificaciones</div>
        <div class="menu-item Appoinment" @click="profileAppointment">Visitas Agendadas</div>
        <div class="menu-item" @click="goTo('properties')">Ver mis propiedades</div>
        <div class="menu-item" @click="goTo('properties')">Aprobar propiedades</div>
        <div class="menu-item" @click="goTo('pay-publications')">Pagar publicidad</div>
        <div class="menu-item" @click="goTo('payment-history')">Historial de pagos</div>
        <div class="menu-item chats" @click="chats">Chats</div>
        <div class="menu-item" @click="goTo('forum')">Pregunta frecuentes</div>
        <div class="menu-item" @click="goTo('contact-agency')">Contactar con agencia</div>
        <div class="menu-item" @click="goTo('support')">Soporte</div>
        <div class="menu-item logout" @click="logout">Cerrar Sesión</div>
    </div>
  </div>
</template>

<script>
import router from '@/router';

export default {
  name: 'MenuProfile',
  methods: {
    goTo(page) {
      router.push({ name: page });
    },
    
    chats() {
      router.push({ path: '/profile-chat' });//Redirije
    },

    profileAppointment() {
      router.push({ path: '/profile-appointment' });//Redirije
    },

    logout() {
      this.$store.dispatch('auth/logout');
      router.push({ path: '/' });
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
  overflow: hidden;
  position: fixed;
  top: 0;
  left: 0;
  height: 100%;
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
