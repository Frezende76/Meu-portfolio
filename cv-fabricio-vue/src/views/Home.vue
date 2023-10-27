<template>
  <div class="main-container">
    <header class="dados">
      <h1><strong>Fabricio Carlos Carvalho Couto de Rezende</strong></h1>
      <section>
        <picture class="foto">
          <img src="img/Fabricio.png" alt="imagem foto">
        </picture>
      </section>
      <br>
      <br>
      <h3><strong>Estudante Engenharia de Software / Analista Desenviolvedor Junior / Vue.js / jQuery / Javascript / Python / HTML / CSS / Scrum Foundation Professional Certificate (SFPC) / ITIL Foundation V3 / ISO/IEC 27002</strong></h3> 
      <address>
        <h3><strong>Rio de Janeiro - RJ</strong></h3>
        <h3><strong>Cel: 98537-1600</strong></h3>
        <h3 class="email"><strong>E-MAIL: <a href="mailto:f_rezende@yahoo.com" target="_blank">f_rezende@yahoo.com</a></strong></h3>
      </address>
      <br>
      <br>
    </header>  
    <main>
      <section class="sobre">
        <h2><strong><a>Sobre mim</a></strong></h2>
        <br>
        <br>
        <p>
        <aside class="recuo">
            Profissional da área de desenvolvimento, Bacharel em Analise de Sistemas, cursando Engenharia de Software e estudando Vue.js. Trabalhando com HTML, CSS, Bootstrap, Javascript, jQuery e Python. Uso o Ajax para conexão com as APIs desenvolvidas em Python, uso do Modal do Bootstrap, DataTables e o Select2, ambos do jQuery, para melhorar no layout da tela de acordo com as necessidades do cliente. Ampla experiência na gestão de serviços de Tecnologia da Informação, com domínio dos processos de atendimento presencial e suporte técnico especializado em empresas públicas como Petrobras e Eletrobrás.
        </aside>
        </p>
      </section>
    </main>
  </div>
</template>

<script>


export default {
  name: 'Home',
}
</script>

<style scoped>
  h1 {
    margin-top: 50px;
  }

  h3 {
    font-size: 16px;
    text-align: center;
  }
  .foto img{
    width: 15%;
    height: 15%;
    border-radius: 100%;
    margin-left: auto;
    margin-right: auto;
    display: block;
    transform: translateY(0%);
}   
.recuo{
    text-indent: 50px;
    text-align: justify;
    margin: 5px;
    padding: 5px;
    font-size: 22px;
}

h2 {
  text-align:center;
  font-size: 28px;
  text-decoration: underline;
}
@media (max-width: 768px) {
  .foto img {
    width: 40%;
    height: 40%;
  }
}

</style>