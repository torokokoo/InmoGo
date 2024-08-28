<template>
    <Navbar />
    <div class="heading text-center font-bold text-2xl m-5 text-gray-800">Crear publicacion</div>
    <form @submit.prevent="onSubmit">
  <div class="editor mx-auto w-10/12 flex flex-col text-gray-800 border border-gray-300 p-4 shadow-lg max-w-2xl">
    <input class="title bg-gray-100 border border-gray-300 p-2 mb-4 outline-none" v-model="title" spellcheck="false" placeholder="Titulo" type="text">
    <input class="title bg-gray-100 border border-gray-300 p-2 mb-4 outline-none" v-model="address" spellcheck="false" placeholder="Direccion" type="text">
    <input class="title bg-gray-100 border border-gray-300 p-2 mb-4 outline-none" v-model="district" spellcheck="false" placeholder="Barrio" type="text">
    <div class="flex">
      <input class="title bg-gray-100 border border-gray-300 p-2 mb-4 outline-none inline w-1/2" v-model="price" spellcheck="false" placeholder="Precio (en CLP)" type="number">
      <input class="title bg-gray-100 border border-gray-300 p-2 mb-4 outline-none inline w-1/2" v-model="squareMeters" spellcheck="false" placeholder="Metros cuadrados" type="number">
    </div>
    <div class="flex text-gray-800 items-center ps-4 mb-4 border border-gray-300 rounded bg-gray-100 outline-none">
      <input id="" type="checkbox" value="true" v-model="house" @click="() => apartment = !apartment" name="bordered-checkbox" class="w-4 h-4 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600">
        <label for="bordered-checkbox-1" class="w-full py-4 ms-2 text-sm font-medium text-gray-500">Casa</label>

        <input id="" type="checkbox" v-model="apartment" @click="() => house = !house" value="true" name="bordered-checkbox" class="w-4 h-4 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600">
        <label for="bordered-checkbox-1" class="w-full py-4 ms-2 text-sm font-medium text-gray-500">Departamento</label>
    </div>
    <input class="title bg-gray-100 border border-gray-300 p-2 mb-4 outline-none" v-model="image" spellcheck="false" placeholder="URL de la imagen" type="text">
    <textarea class="description bg-gray-100 sec p-3 h-60 border border-gray-300 outline-none" v-model="description" spellcheck="false" placeholder="Describe la vivienda, agrega todos los detalles que sean importantes!"></textarea>
    <textarea class="description bg-gray-100 sec p-3 mt-5 h-40 border border-gray-300 outline-none" v-model="sectorDescription" spellcheck="false" placeholder="Describe tu barrio, los alrededores, que pueden encontrar"></textarea>

    <!-- icons -->
    <div class="icons flex text-gray-500 m-2">
      <svg class="mr-2 cursor-pointer hover:text-gray-700 border rounded-full p-1 h-7" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor"><path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M17.657 16.657L13.414 20.9a1.998 1.998 0 01-2.827 0l-4.244-4.243a8 8 0 1111.314 0z" /><path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M15 11a3 3 0 11-6 0 3 3 0 016 0z" /></svg>
      <svg class="mr-2 cursor-pointer hover:text-gray-700 border rounded-full p-1 h-7" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor"><path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M14.828 14.828a4 4 0 01-5.656 0M9 10h.01M15 10h.01M21 12a9 9 0 11-18 0 9 9 0 0118 0z" /></svg>
      <svg class="mr-2 cursor-pointer hover:text-gray-700 border rounded-full p-1 h-7" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor"><path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M15.172 7l-6.586 6.586a2 2 0 102.828 2.828l6.414-6.586a4 4 0 00-5.656-5.656l-6.415 6.585a6 6 0 108.486 8.486L20.5 13" /></svg>
      <div class="count ml-auto text-gray-400 text-xs font-semibold">0/300</div>
    </div>
    <!-- Agendamiento -->
    <span class="mt-10 text-m text-center font-bold">Disponibilidad de horas</span>
    <span class="text-s text-center">Que dias puedes recibir gente para que conozcan la propiedad</span>
    <div class="flex w-12/12 mt-5">
      <div class="inline w-1/2"></div>
      <div class="inline w-1/2 text-center" v-for="day in days"> {{ day }} </div>
    </div>
    <div class="flex w-12/12" v-for="(hour, i) in hours">
      <div class="inline w-1/2">{{ hour }}</div>
      <div class="inline w-1/2 text-center" v-for="day in days">
      <div class="inline-flex items-center">
    <label class="relative flex items-center p-3 rounded-full cursor-pointer" htmlFor="purple">
      <input type="checkbox"
        class="before:content[''] peer relative h-5 w-5 cursor-pointer appearance-none rounded-md border border-blue-gray-200 transition-all before:absolute before:top-2/4 before:left-2/4 before:block before:h-12 before:w-12 before:-translate-y-2/4 before:-translate-x-2/4 before:rounded-full before:bg-blue-gray-500 before:opacity-0 before:transition-opacity checked:border-purple-500 checked:bg-purple-500 checked:before:bg-purple-500 hover:before:opacity-10"
        v-model="selectedHours[day][i]"
         />
      <span
        class="absolute text-white transition-opacity opacity-0 pointer-events-none top-2/4 left-2/4 -translate-y-2/4 -translate-x-2/4 peer-checked:opacity-100">
        <svg xmlns="http://www.w3.org/2000/svg" class="h-3.5 w-3.5" viewBox="0 0 20 20" fill="currentColor"
          stroke="currentColor" stroke-width="1">
          <path fill-rule="evenodd"
            d="M16.707 5.293a1 1 0 010 1.414l-8 8a1 1 0 01-1.414 0l-4-4a1 1 0 011.414-1.414L8 12.586l7.293-7.293a1 1 0 011.414 0z"
            clip-rule="evenodd"></path>
        </svg>
      </span>
    </label>
  </div>
      </div>

    </div>
    <!-- buttons -->
    <div class="buttons flex mt-5">
      <router-link to="/" class="btn border border-gray-300 p-1 px-4 font-semibold cursor-pointer text-gray-500 ml-auto">Cancel</router-link>
      <div class="btn border border-indigo-500 p-1 px-4 font-semibold cursor-pointer text-gray-200 ml-2 bg-indigo-500"><button type="submit">Post</button></div>
    </div>
  </div></form>
</template>
<script>
  import Navbar from '@/components/Navbar'
  import { mapActions } from 'vuex'
import router from '@/router'

  export default {
    data: () => ({
      title: '',
      house: true,
      apartment: false,
      address: '',
      price: '',
      squareMeters: '',
      image: '',
      sectorDescription: '',
      description: '',
      district: '',
      selectedHours: {
        lunes: [false, false, false, false, false, false, false, false, false, false, false, false],
        martes: [false, false, false, false, false, false, false, false, false, false, false, false],
        miercoles: [false, false, false, false, false, false, false, false, false, false, false, false],
        jueves: [false, false, false, false, false, false, false, false, false, false, false, false],
        viernes: [false, false, false, false, false, false, false, false, false, false, false, false],
        sabado: [false, false, false, false, false, false, false, false, false, false, false, false],
        domingo: [false, false, false, false, false, false, false, false, false, false, false, false],
      },
      days: ['lunes', 'martes', 'miercoles', 'jueves', 'viernes', 'sabado', 'domingo'],
      hours: ['09:00', '10:00', '11:00', '12:00', '13:00', '14:00', '15:00', '16:00', '17:00', '18:00', '19:00', '20:00', '21:00'],
    }),
    components: {
        Navbar
    },
    methods: {
      ...mapActions(['listings/create']),
      async onSubmit() {
        // this.v$.$touch();
        // let valido = await this.v$.$validate();
        // if (valido) {
        //     const payload = {
        //       email: this.email,
        //       password: this.password,
        //       rut: this.rut,
        //       name: this.name
        //     }
        const payload = {
          sale: false,
          house: this.house,
          title: this.title,
          address: this.address,
          district: this.district,
          description: this.description,
          sectorDescription: this.sectorDescription,
          images: [this.image],
          dimensions: parseInt(this.squareMeters),
          reservations: [this.selectedHours.lunes, this.selectedHours.martes, this.selectedHours.miercoles, this.selectedHours.jueves, this.selectedHours.viernes, this.selectedHours.sabado, this.selectedHours.domingo],
          price: this.price,
        }

        await this['listings/create'](payload)
        router.push({ path: '/listings' })
        //     await this['register'](payload);
      },
    }
  }
</script>
