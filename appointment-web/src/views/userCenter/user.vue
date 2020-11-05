<template>
  <div class="wrap" id="user">
    <h3>个人信息</h3>
    <div class="center-left">
      <div>
        <el-avatar
          class="headImg"
          :size="80"
          :src="userForm.headImg"
        ></el-avatar>
      </div>
      <div class="log-tab">
        <span class="log-item" @click="entryLog">发日志</span>
        <span class="log-item" @click="myLog">我的日志</span>
      </div>
    </div>
    <el-form
      :model="userForm"
      status-icon
      :rules="validator"
      ref="userForm"
      label-width="100px"
      class="center-right"
    >
      <!-- <el-form-item label prop="headImg" label-width="0">
        
      </el-form-item> -->

      <el-form-item label="名称" prop="name">
        <el-input v-model="userForm.name"></el-input>
      </el-form-item>

      <el-form-item label="手机号" prop="phone">
        <el-input v-model="userForm.phone"></el-input>
      </el-form-item>

      <el-form-item label="QQ" prop="qq">
        <el-input v-model="userForm.qq"></el-input>
      </el-form-item>

      <el-form-item label="email" prop="email">
        <el-input v-model="userForm.email"></el-input>
      </el-form-item>

      <el-form-item label="密码" prop="password">
        <el-input
          type="password"
          v-model="userForm.password"
          autocomplete="off"
        ></el-input>
      </el-form-item>

      <el-form-item label="个人简介" prop="describe">
        <el-input
          type="textarea"
          placeholder="请输入内容"
          v-model="userForm.describe"
          maxlength="30"
          show-word-limit
        ></el-input>
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="updateUser()">更新</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
export default {
  data() {
    return {
      userForm: {
        id: "",
        name: "",
        qq: "",
        email: "",
        headImg: "",
        describe: "",
        phone: "",
        password: "",
      },
      validator: {
        name: [{ required: true, message: "请填写用户名", tigger: "blur" }],
        qq: [{ required: true, message: "不能为空", tigger: "blur" }],
        email: [{ required: true, message: "不能为空", tigger: "blur" }],
        describe: [{ required: true, message: "不能为空", tigger: "blur" }],
        phone: [{ required: true, message: "不能为空", tigger: "blur" }],
        password: [{ required: true, message: "请填写密码", tigger: "blur" }],
      },
    };
  },

  created() {
      let user = JSON.parse(localStorage.user);
      for (let k in user) {
        this.userForm[k] = user[k];
      }
  },
  methods: {
    // 更新用户信息
    updateUser() {
      this.$refs["userForm"].validate((valid) => {
        if (valid) {
          this.httpService.updateUser(this.userForm).then((res) => {
            if (res.data.code == 0) {
              this.$message.success("更新成功");
            }
          });
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },

    // 发日志
    entryLog(){
      this.$router.push({name:'entryLog'})
    },
    //我的日志
    myLog(){
     this.$router.push({name:'myLog'})
    }
  },
};
</script>
<style  scoped>
.wrap {
  width: 600px;
  margin: auto;
  text-align: center;
  border: 1px solid #ddd;
  border-radius: 5px;
  padding: 20px;
}
.headImg :hover {
  animation: headImg-animation 2s;
}
.log-tab{
    font-size: 15px;
    opacity: 0.8;
    font-weight: 600;
   
}
 .log-item{
   display: inline-block;
  width: 70px;
  line-height: 50px;
  cursor: pointer;

 }
 .log-item:hover{

   color: #409EFF;
 }
@keyframes headImg-animation {
  from {
    transform: rotate(0deg);
  }

  to {
    transform: rotate(360deg);
  }
}
</style>
<style >
#user .el-input__inner {
  border: none;
  border-bottom: 1px solid #409eff;
  border-radius: 0;
}
</style>