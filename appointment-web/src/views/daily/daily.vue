//  发日志
<template>
    <div>
         <el-form 
         :model="dailyParams"
         :rules="dailyParamsRules"
         ref="daily"
         >

         <el-form-item label="标题">
              <el-input></el-input>
         </el-form-item>

          <el-form-item label="封面图">
             <el-upload>

             </el-upload>
         </el-form-item>

         <el-form-item label="内容">
              
         </el-form-item>

         </el-form>
    </div>
</template>
<script>
export default {
    
}
</script>