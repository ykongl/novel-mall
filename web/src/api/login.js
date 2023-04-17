import request from '../store/Interceptor'

export function Login(account,password){
    return request({
        url:'/login/in',
        method:'GET',
        params:{account,password}
    })
}

export function Register(data){
    return request({
        url:'/login/register',
        method:'POST',
        data
    })
}