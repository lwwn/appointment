<template>
  <div class="login-wrap">
         <div class="tab">
            <span @click="swhTab(1)" class="tab-btn" :class="{'active':tabIndex==1}">登录</span>
            <span @click="swhTab(2)"  class="tab-btn" :class="{'active':tabIndex==2}"> 注册</span>
        </div>
    <div class="flex_s_c">
     
      <el-form
      v-if="tabIndex == 1"
        :model="loginForm"
        :rules="validator"
        ref="loginForm"
        label-width="70px"
        class="login-form"
      >
        <el-form-item label="手机号" prop="phone">
          <el-input
            type="text"
            v-model="loginForm.phone"
            size="small"
            class="transparent"
          ></el-input>
        </el-form-item>

        <el-form-item label="密码" prop="password">
          <el-input
            type="password"
            v-model="loginForm.password"
            size="small"
            class="transparent"
          ></el-input>
        </el-form-item>

        <el-form-item>
          <el-button type="primary" @click="login('loginForm')" size="small">
            登录
          </el-button>
        </el-form-item>
      </el-form>

      <el-form
        v-if="tabIndex == 2"
        :model="regirstForm"
        ref="regirstForm"
        :rules="validator1"
        label-width="70px"
        class="login-form"
      >
        <el-form-item label="手机号" prop="phone">
          <el-input
            type="text"
            v-model="regirstForm.phone"
            size="small"
            class="transparent"
          ></el-input>
        </el-form-item>

        <el-form-item label="密码" prop="password">
          <el-input
            type="password"
            v-model="regirstForm.password"
            size="small"
            class="transparent"
          ></el-input>
        </el-form-item>

        <el-form-item>
          <el-button type="primary" @click="registerUser('regirstForm')" size="small">
            注册
          </el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
        tabIndex:1,
      loginForm: {
        phone: "",

        password: "",
      },
      regirstForm: {
        phone: "",
        password: "",
      },

      validator: {
        phone: [{ required: true, message: "请填写用户名", tigger: "blur" }],
        password: [{ required: true, message: "请填写密码", tigger: "blur" }],
      },
       validator1: {
        phone: [{ required: true, message: "请填写用户名", tigger: "blur" }],
        password: [{ required: true, message: "请填写密码", tigger: "blur" }],
      },
    };
  },
  created() {},
  methods: {
     // 切换
     swhTab(index){
        
        this.tabIndex = index;
     } ,

     registerUser(){

          this.httpService.registerUser(this.regirstForm).then((res) => {
        if (res.data.code == 0) {
        //   localStorage.user = JSON.stringify(res.data.data);
        //   this.$router.push({ name: "main" });
        this.$message.success(res.data.message)
        } else {
          this.$message({
            type: "error",
            message: res.data.message,
          });
        }
      });

     },

    login(loginForm) {
      console.log(loginForm, "loginForm");

      this.httpService.login(this.loginForm).then((res) => {
        if (res.data.code == 0) {
          localStorage.user = JSON.stringify(res.data.data);
          this.$router.push({ name: "main" });
        } else {
          this.$message({
            type: "error",
            message: res.data.message,
          });
        }
      });
    },
  },
};
</script>

<style lang="css" scoped>
.login-wrap {
  /* width: 1200px; */
  background: url("../assets/images/girl.jpg") no-repeat;
  background-size: cover;
}
.login-form {
  border: 1px solid #dddddd;
  border-radius: 5px;
  padding: 20px 40px 0 20px;
}
.flex_s_c {
  display: flex;
  align-items: center;
  justify-content: center;
  height: 100vh;
}
.tab{
    display: flex;
    align-items: center;
}
.tab-btn{
    display: inline-block;
    padding: 10px 15px ;
    border: 1px solid #dddddd;
    cursor: pointer;
}
.active{

    background: blue;
    color: #fff;
    border: 1px solid blue;
}
</style>