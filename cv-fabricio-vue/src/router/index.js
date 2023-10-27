import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'home',
    component: () => import(/* webpackChunkName: "home" */ '../views/Home.vue')

  },
  {
    path: '/experiencia',
    name: 'Experiencia',
    component: () => import(/* webpackChunkName: "experiencia" */ '../views/Experiencia.vue')
  },
  {
    path: '/historico',
    name: 'Historico',
    component: () => import(/* webpackChunkName: "historico" */ '../views/Historico.vue')
  },
  {
    path: '/especializacao',
    name: 'Especializacao',
    component: () => import(/* webpackChunkName: "especializacoes" */ '../views/Especializacoes.vue')
  },
  {
    path: '/idiomas',
    name: 'Idiomas',
    component: () => import(/* webpackChunkName: "idioma" */ '../views/Idiomas.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
