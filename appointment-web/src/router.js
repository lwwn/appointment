import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routers = [

    {
    path: 'login',
    name: 'login',
    component: () =>
        import ('./views/login.vue'),
    },
    {
        path: '/',
        name: 'main',
        component: () =>
            import ('./views/main/main.vue'),
            children:[
                {
                    path: 'home',
                    name: 'home',
                    component: () =>
                        import ('./views/home/home.vue'),
                },
                {
                    path: 'user',
                    name: 'user',
                    component: () =>
                        import ('./views/userCenter/user.vue'),
                }
            ]
    },
   

]

const RouterConfig = {

    mode: 'history',
    routes: routers

}

const router = new VueRouter(RouterConfig);


export default router