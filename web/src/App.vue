<template>
    <div>
        <el-button type="primary" @click="def">按 钮</el-button>
        {{ test }}
    </div>
</template>

<script>
import {Login} from "@/api/login";

export default {
      data(){
          return{
              test:"",
          }
      },
      methods:{
         async def(){
             await Login().then(response =>{
                 this.test = response.data
             })
          }
      }
  }

</script>

<style>
</style>
