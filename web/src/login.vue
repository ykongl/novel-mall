<template>
  <div>
      <el-card>
          <el-form :model="loginForm" label-width="0" class="login_form">
              <!-- 用户名 -->
              <el-form-item prop="workNo">
                  <el-input v-model="loginForm.account" placeholder="用戶账号"></el-input>
              </el-form-item>
              <!-- 密码 -->
              <el-form-item prop="password">
                  <el-input v-model="loginForm.password" show-password placeholder="密碼"></el-input>
              </el-form-item>
              <!-- 按钮 -->
              <el-form-item class="btns">
                  <el-button type="primary" @click="login()">登录</el-button>
                  <el-button type="success" @click="register()">注册</el-button>
                  <el-button type="success" @click="logout()">登出</el-button>
              </el-form-item>
          </el-form>
      </el-card>
  </div>

</template>

<script>
import {Login, Register} from './api/login'

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "login",
    data(){
        return{
            loginForm:{
                account:"",
                password:""
            },
            registerForm:{
                username:"用户1",
                account:"111111",
                password:"111111",
                phone:"123456789",
                email:"minjy@vastio.com",
                role:"2"
            }
        }
    },
    methods:{
        login(){
            Login(this.loginForm.account,this.loginForm.password).then(response =>{
                this.$message.success(response.data.data)
                window.localStorage.setItem("token",response.data.token)
                // this.$router.push({path:'/home'})
            }).catch(response =>{
                this.$message.error(response.message)
            })
        },
        register(){
          Register(this.registerForm).then(response =>{
              if(response.code === 200){
                  this.$message.success("添加成功")
              }
          })
        },
        logout(){
            window.localStorage.removeItem("token")
        }
    }
}
</script>

<style scoped>
.login_form{
    width: 40%;
}
</style>