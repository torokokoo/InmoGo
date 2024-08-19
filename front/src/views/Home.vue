<template>
    <Navbar />
    <div class="flex h-screen flex-col items-center justify-center bg">
    <!--  -->
    <div>
      <!-- <img class="h-[89px] w-[273px]" src="https://ppc.co/wp-content/uploads/2021/01/Google.png" alt="google Logo" /> -->
      <h2 class="font-bold text-5xl text-center font-mono text-white">InmoGo</h2>
      <h4 class="font-medmium text-lg text-white text-center font-mono">Te ayudamos a encontrar tu nuevo hogar</h4>
    </div>
    <!--  -->
    <div class="md:w-[584px] mx-auto mt-7 flex w-[92%] items-center rounded-full border hover:shadow-md">
      <input type="text" class="w-full bg-white rounded-full py-[14px] pl-4 outline-none" placeholder="Ingresa el sector a buscar">
    </div>
    <!--  -->
    <div class="mt-3 flex space-x-12">
            <router-link to="/register"
              class="hidden select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-md font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button">
              <span>BUSCAR</span>
            </router-link>
    </div>
    <!--  -->
  </div>

</template>
<script>
  import Navbar from '@/components/Navbar'
  export default {
    data: () => ({

    }),
    components: {
        Navbar
    }
  }
</script>

<style scoped>
.bg {
	background: linear-gradient(-45deg, #ee7752, #e73c7e, #23a6d5, #23d5ab);
	background-size: 400% 400%;
	animation: gradient 15s ease infinite;
  height: 100vh;
}

@keyframes gradient {
	0% {
		background-position: 0% 50%;
	}
	50% {
		background-position: 100% 50%;
	}
	100% {
		background-position: 0% 50%;
	}
}
</style>