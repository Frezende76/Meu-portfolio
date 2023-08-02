<template>
    <div>
        <h1>Ola Vue!</h1>
        <p> Meu nome é {{ nome }} e trabalho como {{ profissão }}</p>
    </div>
</template>

<script>
    export default {
        name: 'PrimeiroComponente',
        data() {
            return {
                nome: "Matheus" ,
                profissão: "Programador" 
            }
        }
    }
</script>