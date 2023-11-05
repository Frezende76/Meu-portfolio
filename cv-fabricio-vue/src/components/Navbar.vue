<template>
    <div id="bar">
        <div class="hamburger" @click="toggleMenu">
            <div class="bar"></div>
            <div class="bar"></div>
            <div class="bar"></div>
        </div>
        <div class="menu-items" :class="{ active: showMenu }">
            <router-link to="/">Quem sou eu</router-link> 
            <router-link to="/experiencia">Experiência Profissional</router-link>
            <router-link to="/historico">Histórico & Formação</router-link>
            <router-link to="/especializacao">Especializações</router-link>
            <router-link to="/idiomas">Idiomas & Certificações</router-link>
        </div>
    </div>
</template>

<script>
    export default {
        name:"Navbar",
        // props: ["logo", "alt"],
        data() {
            return {
                showMenu: false
            };
        },
        methods: {
            toggleMenu() {
                this.showMenu = !this.showMenu;
            }
        }
    }
</script>

<style scoped>
   #bar {
        background-color: #222;
        border-bottom: 4px solid #111;
        padding: 15px 50px;
        display: flex;
        justify-content: flex-end;
        align-items: center;
    }

    .hamburger {
        display: none; /* Inicialmente oculto em telas maiores */
        cursor: pointer;
    }

    .hamburger .bar {
        height: 2px;
        width: 25px;
        background-color: #FCBA03;
        margin: 6px 0;
        transition: 0.5s;
    }

    .menu-items {
        display: flex;
        /* flex-direction: column; */
    }

    .menu-items.active {
        display: flex;
    }

    #bar a {
    color: #FCBA03;
    text-decoration: none;
    margin: 12px;
    transition: 0.5s;
    }

    #bar a:hover {
    color: #fff;
    }

@media (max-width: 768px) {

  #bar {
    display: inherit;
  }
  .hamburger {
    display: block; /* Mostrar o hamburger em telas menores */
  }

  .menu-items {
    display: none; /* Ocultar o menu em telas menores */
    flex-direction: column;
  }

  .menu-items.active {
    display: flex;
  }

}
</style>