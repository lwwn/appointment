<template>
  <div class="wrap" id="log">
    <el-form :model="logForm" :rules="validator" ref="logForm">
      <el-form-item label="标题" prop="title">
        <el-input v-model="logForm.title" maxlength="30"></el-input>
      </el-form-item>

      <el-form-item label="封面图" prop="coverUrl">
        <el-input
          v-model="logForm.coverUrl"
          placeholder="请输入封面图url"
        ></el-input>
      </el-form-item>

      <el-form-item label="内容" prop="content">
            <div>
                 <mavon-editor v-model="logForm.content"/>
            </div>
     </el-form-item>

      <el-form-item>
          <el-button type="">取消</el-button>
           <el-button type="primary" @click="save">提交</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
export default {
  data() {
    return {
      logForm: {
        title: "",
        coverUrl: "",
        content: "",
      },
      validator: {
        title: [{ required: true, message: "不能为空", tigger: "blur" }],
        coverUrl: [{ required: true, message: "不能为空", tigger: "blur" }],
        content: [{ required: true, message: "不能为空", tigger: "blur" }],
      },
    };
  },
  created() {},
  methods: {
      save(){

          console.log(this.logForm,'logForm');
      }
  },
};
</script>
<style scoped>
.wrap {
  border: 1px solid #ddd;
  border-radius: 5px;
  padding: 20px;
  margin-top: 50px;
}
</style>>


<style >
#log .el-input__inner {
  border: none;
  border-bottom: 1px solid #409eff;
  border-radius: 0;
}
</style>