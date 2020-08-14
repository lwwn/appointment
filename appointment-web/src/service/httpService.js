import adress from './api'
import axios from './axios'
// import Vue from 'vue'
// import VueAxios from 'vue-axios'

// Vue.use(VueAxios, axios);

const httpService = {

    login(params) {
        return axios.post(adress.login(), params);
    }
}

export default httpService;