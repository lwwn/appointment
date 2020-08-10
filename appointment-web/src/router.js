import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routers = [{
    path: '',
    name: '登录',
    component: () =>
        import ('./views/login.vue'),
}]

const RouterConfig = {

    mode: 'history',
    routes: routers

}

const router = new VueRouter(RouterConfig);


export default router