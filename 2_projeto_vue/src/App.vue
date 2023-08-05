<!-- Essa tag para usar o componente criado -->
<template>
  <div>
    <Header :esta_logado="true" />
    <PrimeiroComponente />
    <p>O dado do app é: {{ testando }}</p>
    <LifeCycle />
    <Pessoa />
  </div>
</template>

<script>

// Tenho que importar os meus componentes para meu arquivo app.vue entenda que ele existe
import Header from './components/Header'
import PrimeiroComponente from './components/PrimeiroComponente.vue'
import LifeCycle from './components/LifeCycle.vue'
import Pessoa from './components/Pessoa.vue'

// Para o Vue saber que eu estou exportando o componente App

  export default {
    name: "App",
    data(){
      return{
        testando:  'teste'
      }
    },
    // Tenho que explicitar para o vue que teremos components e colocar o nome do componente criado para que ele possa ficar pronto para utilização
    components: {
      PrimeiroComponente,
      LifeCycle,
      Pessoa,
      Header
    }
  }
</script>

<style>
  body {
    background-color: #333;
    color: #fff;
  }

  /* a {
    color: red;
  } */

  
</style>
