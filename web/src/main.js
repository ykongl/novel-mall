import { createApp } from 'vue'
import App from './App.vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import './store/Interceptor'
import router from './router/index'

const app = createApp(App)


app.use(ElementPlus)
// app.config.globalProperties.$http = axios
app.use(router)

app.mount('#app')
