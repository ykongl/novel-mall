import request from '../store/Interceptor'

export function Login(){
    return request({
        url:'/login/info',
        method:'GET'
    })
}