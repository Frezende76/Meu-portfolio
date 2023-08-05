<template>
    <div>
        <Reutilizacao />
        <h1>Ola Vue!</h1>
        <Reutilizacao />
        <p> Meu nome é {{ nome }} e trabalho como {{ profissão }}</p>
        <multiplosEventos />
        <Reutilizacao />
        <Reutilizacao />
        <Reutilizacao />
        <Reutilizacao />
        <Reutilizacao />
        <Reutilizacao />

    </div>
</template>

<script>
    import MultiplosEventos from './MultiplosEventos.vue';
    import Reutilizacao from './Reutilizacao.vue';

    export default {
        name: 'PrimeiroComponente',
        components: {
            MultiplosEventos,
            Reutilizacao
        },
        data() {
            return {
                nome: "Matheus" ,
                profissão: "Programador" 
            }
        }
    }
</script>