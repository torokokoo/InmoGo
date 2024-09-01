<template>
    <div>
      <Navbar />
      <MenuProfile />
      <div class="container m-menu mx-auto inline-block p-6 font-normal">
        <div class="heading text-center font-bold text-3xl mb-8 text-gray-800">Publicaciones para aprobar</div>
        <div class="table w-3/4 my-5 font-normal" v-if="unverifiedListings.length > 0">
          <thead>
            <tr>
              <th class="px-5">Titulo</th>
              <th>Direccion</th>
              <th>ownerID</th>
              <th></th>
              <th></th>
            </tr>
          </thead>
          <tbody class="">
            <tr v-for="listing in unverifiedListings">
              <th class="font-normal">{{ listing.title }}</th>
              <th class="font-normal">{{ listing.address }}</th>
              <th class="font-normal">{{ listing.ownerId.name }}</th>
              <th>
                <button class="bg-blue-500 hover:bg-blue-600 text-white font-bold py-2 px-4 rounded">
                  <router-link :to="/listings/ + listing.id">
                  Ver mas
                  </router-link>
                </button>
              </th>
              <th>
                <button class="bg-green-500 hover:bg-green-600 text-white font-bold py-2 px-4 rounded" @click="approve(listing.id)">
                  Aprobar
                </button>
              </th>
            </tr>
          </tbody>
        </div>
        <p v-if="unverifiedListings.length == 0">No hay publicaciones por aprobar!</p>
      </div>
    </div>
  </template>    
  
  
  <script>
  import MenuProfile from '@/components/MenuProfile.vue';
  import Navbar from '@/components/Navbar';
  import { mapActions } from 'vuex';
  import axios from 'axios';
  import { api } from '@/config';
  import router from '@/router';
  
  export default {
    name: 'ProfileAccept',
    data: () => ({
      unverifiedListings: [],
    }),
    components: {
      Navbar,
      MenuProfile,//Se hizo icono para poder crear los demas elementos, chat, notficaciones etc
    },
    mounted() {
      this.getAllListings()
    },
    methods: {
      ...mapActions(['listings/getAll']),
      async getAllListings() {
          const res = await this['listings/getAll']()
          if (res.length > 0) {
            this.unverifiedListings = res.filter(listing => !listing.verified)
          }
      },
      approve: async function(id) {
        await axios.post(`${api}api/listing/approve/${id}`);
        alert("Publicacion aprobado")
      },
    },
  }
  </script>

<style scoped>

  .m-menu {
    margin-left: 360px;
  }

</style>