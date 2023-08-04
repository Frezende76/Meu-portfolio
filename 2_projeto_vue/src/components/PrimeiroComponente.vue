<template>
    <div>
        <h1>Ola Vue!</h1>
        <p> Meu nome é {{ nome }} e trabalho como {{ profissão }}</p>
        <multiplosEventos />
    </div>
</template>

<script>
    import MultiplosEventos from './MultiplosEventos.vue';

    export default {
        name: 'PrimeiroComponente',
        components: {
            MultiplosEventos
        },
        data() {
            return {
                nome: "Matheus" ,
                profissão: "Programador" 
            }
        }
    }
</script>