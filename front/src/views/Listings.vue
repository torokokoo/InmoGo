<template>
  <Navbar />
  <!-- Jumbotron -->

<div class="flex w-3/3">
  <div class="max-w-md mx-auto w-1/3 rounded-md overflow-hidden shadow-md hover:shadow-lg">
      <div class="relative">
          <img class="w-full" src="https://images.unsplash.com/photo-1523275335684-37898b6baf30" alt="Product Image">
          <div class="absolute top-0 right-0 bg-red-500 text-white px-2 py-1 m-2 rounded-md text-sm font-medium">SALE
          </div>
      </div>
      <div class="p-4">
          <h3 class="text-lg font-medium mb-2">Product Title</h3>
          <p class="text-gray-600 text-sm mb-4">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vitae ante
              vel eros fermentum faucibus sit amet euismod lorem.</p>
          <div class="flex items-center justify-between">
              <span class="font-bold text-lg">$19.99</span>
              <button class="bg-blue-500 hover:bg-blue-600 text-white font-bold py-2 px-4 rounded">
          Buy Now
        </button>
          </div>
      </div>
  </div>

  <div class="max-w-md mx-auto w-1/3 rounded-md overflow-hidden shadow-md hover:shadow-lg">
      <div class="relative">
          <img class="w-full" src="https://images.unsplash.com/photo-1523275335684-37898b6baf30" alt="Product Image">
          <div class="absolute top-0 right-0 bg-red-500 text-white px-2 py-1 m-2 rounded-md text-sm font-medium">SALE
          </div>
      </div>
      <div class="p-4">
          <h3 class="text-lg font-medium mb-2">Product Title</h3>
          <p class="text-gray-600 text-sm mb-4">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vitae ante
              vel eros fermentum faucibus sit amet euismod lorem.</p>
          <div class="flex items-center justify-between">
              <span class="font-bold text-lg">$19.99</span>
              <button class="bg-blue-500 hover:bg-blue-600 text-white font-bold py-2 px-4 rounded">
          Buy Now
        </button>
          </div>
      </div>
  </div>

  <div class="max-w-md mx-auto w-1/3 rounded-md overflow-hidden shadow-md hover:shadow-lg">
      <div class="relative">
          <img class="w-full" src="https://images.unsplash.com/photo-1523275335684-37898b6baf30" alt="Product Image">
          <div class="absolute top-0 right-0 bg-red-500 text-white px-2 py-1 m-2 rounded-md text-sm font-medium">SALE
          </div>
      </div>
      <div class="p-4">
          <h3 class="text-lg font-medium mb-2">Product Title</h3>
          <p class="text-gray-600 text-sm mb-4">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vitae ante
              vel eros fermentum faucibus sit amet euismod lorem.</p>
          <div class="flex items-center justify-between">
              <span class="font-bold text-lg">$19.99</span>
              <button class="bg-blue-500 hover:bg-blue-600 text-white font-bold py-2 px-4 rounded">
          Buy Now
        </button>
          </div>
      </div>
  </div>
</div>

</template>
<script>
  import Navbar from '@/components/Navbar';
  import { mapActions } from 'vuex';
  import router from '@/router';

  export default {
    data: () => ({
      
    }),
    components: {
      Navbar,
    },
    methods: {
      ...mapActions(['auth/logout']),
      logout() {
          this.$store.dispatch('auth/logout')
          router.push({ path: '/' }) 
        }
    },
  }
</script>