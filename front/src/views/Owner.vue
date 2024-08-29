<template>
    <Navbar />
    
    <div>
        <h2>Propiedades</h2>
        <br>
        <ul>
            <li v-for="(listings, index) in listings" :key="index">
                {{  listings }}
            </li>
        </ul>
    </div>
</template>

<script>
    import Navbar from '@/components/Navbar';
    import { mapActions } from 'vuex';

    export default{
        data: ()=>({
            listings: [],
            selectedHours: {
                lunes: [],
                martes: [],
                miercoles: [],
                jueves: [],
                viernes: [],
                sabado: [],
                domingo: []},
        }),
        components:{
            Navbar,
        },
        
        
    }
</script>
