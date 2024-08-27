<template>
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
    import { mapActions } from 'vuex';
    export default{
        data: ()=>({
            listings: ["Casa en la Playa", "Edificio Centrico", "Casa arrendada"],
            selectedHours: {
                lunes: [],
                martes: [],
                miercoles: [],
                jueves: [],
                viernes: [],
                sabado: [],
                domingo: []},
        }),
        
    }
</script>
