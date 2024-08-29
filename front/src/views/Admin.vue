<template>
    <Navbar />

    <div>
        <h2>Publicaciones Pendientes</h2>
        
        <div v-for="listing in notVerified(listings)">
            {{  listing }}
        </div>
    </div>
</template>

<script>
    import Navbar from '@/components/Navbar';
    import { mapActions } from 'vuex';

    export default{
        data: ()=>({
            listings: [],
        }),
        components: {
            Navbar,
        },
        mounted: {
            this:getAllListings()
        },
        methods:{
            ...mapActions(['listings/getAll']),
            async getAllListings() {
                const res = await this['listings/getAll']()
                console.log(res)
                this.listings = res
            },
            notVerified: function(listings){
                return listings.filter(function (listing){
                    return listing.verified == false
                })
            }
        }
    }
</script>