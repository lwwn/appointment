<template>
     <div class="login-wrap">
         <div class="flex_s_c">
             <el-form  :model="loginForm" :rules="validator" ref="ruleForm" label-width="100px" class="">

                 <el-form-item label="用户名" prop="userName" >
                     <el-input type="text" v-model="loginForm.userName" size="small"></el-input>
                 </el-form-item>

                  <el-form-item label="密码" prop="passWord" >
                     <el-input type="passWord" v-model="loginForm.passWord" size="small"></el-input>
                 </el-form-item>

                 <el-form-item>
                     <el-button type="primary" @click="login(loginForm)" size="small">
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

               userName:'',

               passWord:''
           },

           validator: {
               userName:[
                   {required: true, message: '请填写用户名', tigger: 'blur'}
               ],
               passWord:[
                   {required: true, message: '请填写密码', tigger:'blur'},
                   {type: String , min: 6, message: '密码长度最小不能少于6位', tigger: 'blur' }
               ]
           }
        }
    },
    created(){
         console.log(this.httpService,'+++++++++++++++++++++++')
    },
     methods:{
         
        
        login(loginForm){
           
           this.httpService.login(loginForm).then(res=>{

               console.log(res,'--------------------')
           })
        }
    }
}
</script>

<style lang="css" scoped>

.login-wrap{
    /* width: 1200px; */
    
}
.login-form{

}
.flex_s_c{
    display: flex;
    align-items: center;
    justify-content: center;
    height: 100vh;
}

</style>