import Vue from 'vue'
import App from './App.vue'
import router from './router'
import ElementUI from 'element-ui';
import httpService from './service/httpService'
import 'element-ui/lib/theme-chalk/index.css';

Vue.config.productionTip = false

Vue.use(ElementUI)

Vue.prototype.httpService = httpService

new Vue({
    router,
    render: h => h(App),
}).$mount('#app')