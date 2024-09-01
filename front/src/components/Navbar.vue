<template>
  <div class="grid w-full place-items-center overflow-x-scroll rounded-lg p-6 lg:overflow-visible">
    <div class="-m-6 max-h-[768px] w-[calc(100%+48px)] overflow-scroll">
      <nav class="sticky top-0 z-10 block w-full max-w-full px-4 py-2 text-white bg-white border rounded-none shadow-md h-max border-white/80 bg-opacity-80 backdrop-blur-2xl backdrop-saturate-200 lg:px-8 lg:py-4">
        <div class="flex items-center justify-between text-black">
          <router-link to="/" class="mr-4 block cursor-pointer py-1.5 font-sans text-base font-bold leading-relaxed text-inherit antialiased nav-link">
            InmoGo
          </router-link>

          <!-- Opciones Globales -->
          <div class="flex items-center gap-4">
            <div class="hidden mr-4 lg:block">
              <ul class="flex flex-col gap-2 mt-2 mb-4 lg:mb-0 lg:mt-0 lg:flex-row lg:items-center lg:gap-6">
                <li class="block p-1 font-sans text-sm antialiased font-normal leading-normal text-blue-gray-900">
                  <router-link to="/" class="flex items-center nav-link">
                    Inicio
                  </router-link>
                </li>
                <li class="block p-1 font-sans text-sm antialiased font-normal leading-normal text-blue-gray-900">
                  <router-link to="/listings" class="flex items-center nav-link">
                    Propiedades
                  </router-link>
                </li>
                <li class="block p-1 font-sans text-sm antialiased font-normal leading-normal text-blue-gray-900">
                  <router-link to="/listings" class="flex items-center nav-link">
                    Soporte
                  </router-link>
                </li>
                <li class="block p-1 font-sans text-sm antialiased font-normal leading-normal text-blue-gray-900" v-if="isLoggedIn">
                  <router-link to="/post" class="flex items-center nav-link">
                    Crear publicacion
                  </router-link>
                </li>
              </ul>
            </div>

            <!-- Opciones si el usuario esta logeado -->
            <div class="flex items-center gap-x-1" v-if="isLoggedIn">
              <router-link to="/profile"
                class="hidden select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block nav-link"
                type="button">
                <span>Mi perfil</span>
              </router-link>
            </div>

            <!-- Opciones si el usuario no esta logeado -->
            <div class="flex items-center gap-x-1" v-if="!isLoggedIn">
              <router-link to="/login"
                class="hidden px-4 py-2 font-sans text-xs font-bold text-center text-gray-900 uppercase align-middle transition-all rounded-lg select-none hover:bg-gray-900/10 active:bg-gray-900/20 disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block nav-link"
                type="button">
                <span>Inicia Sesion</span>
              </router-link>
              <router-link to="/register"
                class="hidden select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block nav-link"
                type="button">
                <span>Registrate</span>
              </router-link>
            </div>
          </div>
        </div>
      </nav>
    </div>
  </div>
</template>


<script>
export default {
  name: 'navbar',
  data() {
    return {
      isLoggedIn: false,
      role: '',
    }
  },
  mounted() {
    this.isLoggedIn = localStorage.getItem('loggedIn') == 'true'
    this.role = localStorage.getItem('user').role
  },
  methods: {
  }
}
</script>

<style scoped>
.nav-link {
  transition: transform 0.15s, font-weight 0.15s;
}

.nav-link:hover {
  transform: scale(1.1);
  font-weight: bold;
}
</style>
