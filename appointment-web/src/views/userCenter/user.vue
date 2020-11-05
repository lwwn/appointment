<template>
  <div class="wrap" id="user">
    <h3>个人信息</h3>
    <el-form
      :model="userForm"
      status-icon
      :rules="validator"
      ref="userForm"
      label-width="100px"
      class="demo-ruleForm"
    >
      <el-form-item label prop="headImg" label-width="0">
        <el-avatar class="headImg" :size="80" :src="userForm.headImg"></el-avatar>
      </el-form-item>

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
        <el-input type="password" v-model="userForm.password" autocomplete="off"></el-input>
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
        id:'',
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
          this.httpService.updateUser(this.userForm).then(res=>{

            if(res.data.code == 0){
              this.$message.success('更新成功')
              this.getUserInfo();
            }
          })
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },

    // 获取用户信息
    getUserInfo(){
      let params = {
        id:this.userForm.id
      }
      this.httpService.getUserInfo(params).then(res=>{

        console.log(res,'----res');

        if(res.data.code == 0) {

          this.userForm = res.data.data;
          localStorage.user = JSON.stringify(res.data.data)
        }
      })
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