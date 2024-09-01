<template>
    <div>
      <!-- Componente de la barra de navegación -->
      <Navbar />
      <!-- Componente del perfil del menú -->
      <MenuProfile />
      <div class="container mx-auto p-6">
        <!-- Título de la sección -->
        <div class="heading text-center font-bold text-3xl mb-8 text-gray-800">Chats</div>
        <!-- Contenedor de los chats -->
        <div class="chats-container">
          <!-- Genera un rectángulo por cada chat -->
          <div v-for="chat in chats" :key="chat.id" class="chat-box">
            <img src="https://picsum.photos/50" alt="Foto de Perfil" class="profile-pic">
            <p class="text-black-500 font-bold">{{ chat.message }}</p>
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
    name: 'ProfileChat',
    components: {
      Navbar,
      MenuProfile,
    },
    data() {
      return {
        // Lista de chats
        chats: [
          { id: 1, message: 'Tienes un nuevo mensaje' },
          { id: 2, message: 'Tienes otro mensaje' },
          // Agrega más chats según sea necesario
        ],
      };
    },
    methods: {
    },
  }
  </script>
  
  <style scoped>
  /* Contenedor de los chats */
  .chats-container {
    display: flex;
    flex-direction: column; /* Alinea los elementos verticalmente */
    gap: 10px; /* Espacio entre los elementos */
    margin-left: 350px; /* Desplaza el contenedor para evitar superposición con el menú */
  }
  
  /* Estilos para los rectángulos de chat */
  .chat-box {
    display: flex;
    align-items: center; /* Alinea los elementos verticalmente centrados */
    gap: 10px; /* Espacio entre la imagen y el texto */
    border: 1px solid blue; /* Borde azul */
    border-radius: 8px; /* Bordes redondeados */
    padding: 20px; /* Espaciado interno */
    background-color: white; /* Fondo blanco */
    transition: transform 0.3s, background-color 0.3s; /* Transición suave para el efecto hover */
  }
  
  /* Efecto hover */
  .chat-box:hover {
    transform: scale(1.05); /* Aumenta ligeramente el tamaño */
    background-color: #e0f7fa; /* Cambia el color de fondo */
  }
  
  /* Estilos para la foto de perfil */
  .profile-pic {
    width: 50px; /* Ajusta el tamaño según sea necesario */
    height: 50px; /* Ajusta el tamaño según sea necesario */
    border-radius: 50%; /* Hace la imagen circular */
  }
  </style>
  
  