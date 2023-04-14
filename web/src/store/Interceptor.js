import axios from "axios";//原生的axios
//用来拦截用的
axios.defaults.headers.post["Content-Type"] = "application/json;charset=utf-8";
//创建一个单例
const http= axios.create({
    baseURL:'http://localhost:9002',
    timeout:5000,//响应时间
    // headers:{"Content-Type":"application/json;charset=utf-8"},
})

//拦截器  -请求拦截
http.interceptors.request.use(config=>{
    //部分接口需要token
    let token=localStorage.getItem('token');
    if(token){
        config.headers.token=token;
        // config.headers ={
        // 'token':token
        // }
    }
    return config;
},err=>{
    return Promise.reject(err)
})

//拦截器  -响应拦截
http.interceptors.response.use(res=>{
    if(res.data.code===200){
        return Promise.resolve(res.data)
        //可以根据服务器返回的数据去自行修改
    }else{
        return Promise.reject(res.data)
    }
},err=>{
    return Promise.reject(err)
});

//整体导出
export default http;
