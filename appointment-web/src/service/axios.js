import axios from 'axios'

axios.defaults.timeout = 5000;

axios.defaults.headers["Content-Type"] = "application/x-www-form-urlencoded";


axios.interceptors.request.use(
    config => {

        // 参数序列化

        if (config.method == 'post') {

            serialize(config.data);
        }
        console.log(config, 'configvconfigconfigconfigconfig')
        return config;

    },
    err => {
        return Promise.reject(err);
    }
)

axios.interceptors.response.use(response => {


    switch (response.data.status) {

        case '201':

            break;

        default:
            break;
    }

    return response;
})

export default axios;

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