<!-- Essa tag para usar o componente criado -->
<template>
   <PrimeiroComponente />
</template>

<script>

// Tenho que importar o arquivo PrimeiroComponente para meu arquivo app.vue entenda que ele existe
import PrimeiroComponente from './components/PrimeiroComponente.vue'

// Para o Vue saber que eu estou exportando o componente App

  export default {
    name: "App",

    // Tenho que explicitar para o vue que teremos components e colocar o nome do componente criado para que ele possa ficar pronto para utilização
    components: {
      PrimeiroComponente
    }
  }
</script>

