import { createRouter, createWebHistory } from 'vue-router'
import PostContatosForm from '../components/PostContatosForm.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: () => import("../views/Home.vue"),
  },
  {
    path: '/contatos/:id',
    component: PostContatosForm
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
