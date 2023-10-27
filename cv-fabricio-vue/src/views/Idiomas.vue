<template>
    <div class="main-container">
        <section class="empresa">
            <h3 class="idiomas"><strong>Proficiência em idiomas</strong></h3>
            <div class="conteudo">
                <ul class="lista">
                    <li class="item">Inglês intermediário pelo Brasas English Course.</li>
                    <li class="item">Espanhol Avançado pela Alcance Idiomas.</li>    
                </ul>
            </div>
            <h3 class="certificacoes"><strong>Certificações</strong></h3>
            <div class="conteudo">
                <ul class="lista">
                    <li class="item">Scrum Foundation Professional Certificate (SFPC);</li>
                    <li class="item">ITIL Foundation V3;</li>
                    <li class="item">ISO/IEC 27002.</li>
                </ul>
            </div>
      </section>
    </div>
  </template>

<script>


export default {
  name: 'Idiomas',
}
</script>

<style scoped>
  h1 {
    margin-top: 50px;
  }
  .empresa h3{
    text-align: center;
    font-size: 22px;
  }

  .conteudo{
    padding-bottom: 40px;
    padding-top: 40px;
}

  .item {
    list-style: none;
    font-size: 18px;
    text-align: justify;
    margin-left: 40%;
}
  .item::before {
        content: "★ ";
        font-size: 18px;
    }

@media (max-width: 768px) {
    .item {
        margin-left: 10%;
    }

}
</style>