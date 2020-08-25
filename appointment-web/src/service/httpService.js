import adress from './api'
import axios from './axios'
// import Vue from 'vue'
// import VueAxios from 'vue-axios'

// Vue.use(VueAxios, axios);

const httpService = {

    login(params) {
        return axios.post(adress.login(), serialize(params) );
    }
}

export default httpService;

function serialize(obj) {
    var query = '',
        name, value, subName, innerObj, i, p;

    for (name in obj) {
        value = obj[name];

        if (value instanceof Array) {
            for (i = 0; i < value.length; ++i) {
                if ((value[i] instanceof Object) || (value[i] instanceof Array)) {
                    innerObj = {};
                    innerObj[name + '[' + i + ']'] = value[i];
                    (p = serialize(innerObj)) && (query += p + '&');
                } else if (value[i] !== undefined && value[i] !== null) {
                    query += encodeURIComponent(name) + '=' + encodeURIComponent(value[i]) + '&';
                }

            }
        } else if (value instanceof Object) {
            for (subName in value) {
                innerObj = {};
                innerObj[name + '.' + subName] = value[subName];
                (p = serialize(innerObj)) && (query += p + '&');
            }
        } else if (value !== undefined && value !== null) {
            query += encodeURIComponent(name) + '=' + encodeURIComponent(value) + '&';
        }
    }

    return query.length ? query.substr(0, query.length - 1) : query;
}