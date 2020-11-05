import Vue from 'vue'
import App from './App.vue'
import router from './router'

// element
import ElementUI from 'element-ui';

// 富文本 https://github.com/hinesboy/mavonEditor
import mavonEditor from 'mavon-editor'

// 请求服务
import httpService from './service/httpService'

// element style
import 'element-ui/lib/theme-chalk/index.css';

// editor style
import 'mavon-editor/dist/css/index.css'


Vue.config.productionTip = false

Vue.use(ElementUI)

Vue.use(mavonEditor)

Vue.prototype.httpService = httpService

new Vue({
    router,
    render: h => h(App),
}).$mount('#app')