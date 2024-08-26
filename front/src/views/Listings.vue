<template>
  <Navbar />
  <!-- Jumbotron -->

<div class="flex w-3/3">
  <div class="max-w-md mx-auto rounded-md overflow-hidden shadow-md hover:shadow-lg" v-for="listing in listings">
      <div class="relative">
          <img class="w-full" src="https://picsum.photos/800/500" alt="Product Image">
          <div class="absolute top-0 right-0 bg-red-500 text-white px-2 py-1 m-2 rounded-md text-sm font-medium">SALE
          </div>
      </div>
      <div class="p-4">
          <h3 class="text-lg font-medium mb-2">{{ listing.name }}</h3>
          <p class="text-gray-600 text-sm mb-4">{{ listing.description }}</p>
          <div class="flex items-center justify-between">
              <span class="font-bold text-lg">$19.99</span>
              <button class="bg-blue-500 hover:bg-blue-600 text-white font-bold py-2 px-4 rounded">
          Ver mas
        </button>
          </div>
      </div>
  </div>

</div>

</template>
<script>
  import Navbar from '@/components/Navbar';
  import { mapActions } from 'vuex';

  export default {
    data: () => ({
      listings: [],
    }),
    components: {
      Navbar,
    },
    mounted() {
      this.getAllListings()
    },
    methods: {
      ...mapActions(['listings/getAll']),
      async getAllListings() {
          const res = await this['listings/getAll']()
          console.log(res)
          this.listings = res
      }
    },
  }
</script>