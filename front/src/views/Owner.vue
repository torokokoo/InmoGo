<template>
    
</template>

<script>
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
        
    }
</script>