<template>
  <Navbar />
  <div class="container mx-auto m-50 flex">
    <div class="columns-2">
        <img class="" width="700" src="https://picsum.photos/800/500" alt="Product Image">
      <h2 class="text-center align-center">{{ listing.title }}</h2>
      <p class="text-right">$ {{ listing.price}}</p>

      <p class=""> {{ listing.description }} </p>
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
    mounted() {
      this.getListing();
    },
    methods: {
      ...mapActions(['listings/getById']),
      async getListing() {
        const res = await this['listings/getById'](this.$route.params.id)
        this.listing = res;
        console.log(res);
    },
  }
}
</script>
