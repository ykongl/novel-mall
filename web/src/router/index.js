import { createRouter, createWebHistory } from 'vue-router'
const routes = [
    {
        path:'/',
        home:'about',
        component: () => import('../about.vue')
    },
    {
        path:'/login',
        home:'login',
        component: () => import('../views/login.vue')
    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router