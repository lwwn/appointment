<template>
     <div class="login-wrap">
         <div class="flex_s_c">
             <el-form  :model="loginForm" :rules="validator" ref="loginForm" label-width="70px" class="login-form">

                 <el-form-item label="手机号" prop="phone" >
                     <el-input type="text" v-model="loginForm.phone" size="small" class="transparent"></el-input>
                 </el-form-item>

                  <el-form-item label="密码" prop="password" >
                     <el-input type="password" v-model="loginForm.password" size="small" class="transparent"></el-input>
                 </el-form-item>

                 <el-form-item>
                     <el-button type="primary" @click="login('loginForm')" size="small">
                          登录
                     </el-button>
                 </el-form-item>
             </el-form >
         </div>
     </div>
</template>

<script>
export default {
    data(){
       
        return {
           loginForm :{

               phone:'',

               passWord:''
           },

           validator: {
               userName:[
                   {required: true, message: '请填写用户名', tigger: 'blur'}
               ],
               password:[
                   {required: true, message: '请填写密码', tigger:'blur'},
               ]
           }
        }
    },
    created(){
    },
     methods:{
         
        
        login(loginForm){
            console.log(loginForm,'loginForm')
            
           this.httpService.login(this.loginForm).then(res=>{

               if(res.data.code == 0) {

                  localStorage.user = JSON.stringify(res.data.data);
                  this.$router.push({name:'main'})
               }
               else{
                   this.$message({
                       type:'error',
                       message:res.data.message
                   })
               }
           })
        }
    }
    
}
</script>

<style lang="css" scoped>

.login-wrap{
    /* width: 1200px; */
    background: url("../assets/images/girl.jpg") no-repeat;
    background-size: cover;
    
}
.login-form{

    border: 1px solid #dddddd;
    border-radius: 5px;
    padding: 20px 40px 0 20px;

}
.flex_s_c{
    display: flex;
    align-items: center;
    justify-content: center;
    height: 100vh;
}


</style>