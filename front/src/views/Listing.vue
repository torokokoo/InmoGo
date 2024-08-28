<template>
  <Navbar />

  <div class="container mx-auto my-10 flex grid-cols-2 md:grid-cols-1">
      <img class="" width="700" src="https://picsum.photos/800/500" alt="Product Image">
      <div class="data text-right w-full my-5">
        <h2 class="text-center text-xl font-bold align-center">{{ listing.title }}</h2>
        <p class="text-sm text-gray-400 text-center">{{ listing.address }}, {{ listing.district}} </p>
        <hr class="my-5 mx-5">
        <p class="text-right">$ {{ listing.price}} CLP</p>
        <p> {{ listing.dimensions }} m<sup>2</sup></p>
        <p> {{ listing.house ? "Casa" : "Departamento" }} </p>
        <p> {{ listing.sale ? "Venta" : "Arriendo "}} </p>
        <hr class="my-5 mx-5">
        <p class="text-left ml-5"> {{ listing.description }} </p>

        <div class="">
          <button
        type="button"
        class="mb-2 block w-full rounded bg-primary mx-5 px-6 pb-2 pt-2.5 mt-10 text-xs font-medium uppercase leading-normal text-white shadow-primary-3 transition duration-150 ease-in-out hover:bg-primary-accent-300 hover:shadow-primary-2 focus:bg-primary-accent-300 focus:shadow-primary-2 focus:outline-none focus:ring-0 active:bg-primary-600 active:shadow-primary-2 motion-reduce:transition-none dark:shadow-black/30 dark:hover:shadow-dark-strong dark:focus:shadow-dark-strong dark:active:shadow-dark-strong">
            {{ listing.sale ? "Comprar" : "Arrendar" }}
          </button>
          <button
            type="button"
            class="mb-2 block w-full rounded border-2 border-primary mx-5 px-6 pb-[6px] pt-2 text-xs font-medium uppercase leading-normal text-primary transition duration-150 ease-in-out hover:border-primary-600 hover:bg-neutral-500 hover:bg-opacity-10 hover:text-primary-600 focus:border-primary-600 focus:text-primary-600 focus:outline-none focus:ring-0 active:border-primary-700 active:text-primary-700 motion-reduce:transition-none dark:hover:bg-neutral-100 dark:hover:bg-opacity-10"
            data-twe-ripple-init>
            Agendar visita
          </button>
        </div>
      </div>

  </div>
  <div class="mx-auto container">
    <h2 class="title text-lg font-bold"> Agenda tu visita! </h2>
    <h4 class="title text-md text-gray-400"> Selecciona el dia de la <span class="font-semibold">proxima semana</span> que te acomoda mas </h4>
    
    <div class="grid grid-cols-7 gap-4 mt-5">
      <div class="dia">
        <p class="text-sm text-gray-800 mx-auto">Lunes</p>
        <div class="my-2 align-middle" v-for="(hour, i) in listing.reservations[0]">
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              v-if="hour"
              @click="schedule('lunes', i)">
              <span>{{ 9 + i + ":00" }}</span>
            </button>
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              v-if="!hour"
              disabled
              >
              <span>{{ 9 + i + ":00" }}</span>
            </button>
        </div>
      </div>

        <!-- Martes -->
      <div class="dia">
        <p class="text-sm text-gray-800 mx-auto">MARTES</p>
        <div class="my-2 align-middle" v-for="(hour, i) in listing.reservations[1]">
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              @click="schedule('martes', i)"
              v-if="hour">
              <span>{{ 9 + i + ":00" }}</span>
            </button>
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              v-if="!hour"
              disabled
              >
              <span>{{ 9 + i + ":00" }}</span>
            </button>
        </div>
      </div>

      <div class="dia">
        <p class="text-sm text-gray-800 mx-auto">MIERCOLES</p>
        <div class="my-2 align-middle" v-for="(hour, i) in listing.reservations[2]">
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              @click="schedule('miercoles', i)"
              v-if="hour">
              <span>{{ 9 + i + ":00" }}</span>
            </button>
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              v-if="!hour"
              disabled
              >
              <span>{{ 9 + i + ":00" }}</span>
            </button>
        </div>
      </div>
      <div class="dia">
        <p class="text-sm text-gray-800 mx-auto">JUEVES</p>
        <div class="my-2 align-middle" v-for="(hour, i) in listing.reservations[3]">
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              @click="schedule('jueves', i)"
              v-if="hour">
              <span>{{ 9 + i + ":00" }}</span>
            </button>
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              v-if="!hour"
              disabled
              >
              <span>{{ 9 + i + ":00" }}</span>
            </button>
        </div>
      </div>
      <div class="dia">
        <p class="text-sm text-gray-800 mx-auto">VIERNES</p>
        <div class="my-2 align-middle" v-for="(hour, i) in listing.reservations[4]">
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              @click="schedule('viernes', i)"
              v-if="hour">
              <span>{{ 9 + i + ":00" }}</span>
            </button>
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              v-if="!hour"
              disabled
              >
              <span>{{ 9 + i + ":00" }}</span>
            </button>
        </div>
      </div>
      <div class="dia">
        <p class="text-sm text-gray-800 mx-auto">SABADO</p>
        <div class="my-2 align-middle" v-for="(hour, i) in listing.reservations[5]">
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              @click="schedule('sabado', i)"
              v-if="hour">
              <span>{{ 9 + i + ":00" }}</span>
            </button>
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              v-if="!hour"
              disabled
              >
              <span>{{ 9 + i + ":00" }}</span>
            </button>
        </div>
      </div>
      <div class="dia">
        <p class="text-sm text-gray-800 mx-auto">DOMINGO</p>
        <div class="my-2 align-middle" v-for="(hour, i) in listing.reservations[6]">
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              @click="schedule('domingo', i)"
              v-if="hour">
              <span>{{ 9 + i + ":00" }}</span>
            </button>
            <button
              class="hidden align-center select-none rounded-lg bg-gradient-to-tr from-gray-900 to-gray-800 py-2 px-4 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 active:opacity-[0.85] disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none lg:inline-block"
              type="button"
              v-if="!hour"
              disabled
              >
              <span>{{ 9 + i + ":00" }}</span>
            </button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { mapActions } from 'vuex'; 
import Navbar from '@/components/Navbar'
export default {
    data: () => ({
      listing: {},
    }),
    components: {
      Navbar,
    },
    created() {
      this.getListing();
    },
    methods: {
      ...mapActions(['listings/getById']),
      async getListing() {
        const res = await this['listings/getById'](this.$route.params.id)
        this.listing = res;
      },
      schedule: (dia, id) => {
        console.log(dia, 9 + id + ':00')
      }
    }
}
</script>
