import { createRouter, createWebHistory } from 'vue-router'
const routes = [
    {
        path:'/',
        name:'login',
        component: () => import('../login.vue')
    },
    {
        path:'/home',
        name:'home',
        component: () => import('../views/Home.vue')

    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router