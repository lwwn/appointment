<template>
  <div>
    <h3>个人信息</h3>
    <div>
      <el-form
        :model="userForm"
        status-icon
        :rules="rules"
        ref="userForm"
        label-width="100px"
        class="demo-ruleForm"
      >  

       <el-form-item label="头像" prop="headImg">
        </el-form-item>

        <el-form-item label="名称" prop="name">
          <el-input type="text" v-model="ruleForm.name" autocomplete="off"></el-input>
        </el-form-item>
        
        <el-form-item label="密码" prop="pass">
          <el-input type="password" v-model="ruleForm.pass" autocomplete="off"></el-input>
        </el-form-item>

        <el-form-item label="确认密码" prop="checkPass">
          <el-input type="password" v-model="ruleForm.checkPass" autocomplete="off"></el-input>
        </el-form-item>

        <el-form-item label="年龄" prop="age">
          <el-input v-model.number="ruleForm.age"></el-input>
        </el-form-item>

        <el-form-item>
          <el-button type="primary" @click="submitForm('userForm')">更新信息</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>
<script>
export default {
     data(){

          return {
               userForm:{
                    name:''
               }
          }
     },
     created(){

     },
     methods:{

     }
};
</script>
<style  scoped>

</style>