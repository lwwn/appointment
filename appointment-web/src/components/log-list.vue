<template>
    <div class="daily">
        <div ><img class="coverUrl" :src="obj.coverUrl" alt=""></div>
        <div class="title"><span>{{obj.title}}</span></div>
    </div>
</template>
<script>
export default {
     props:{
         obj:{
             type: Object,
             default: null
         }
     }
}
</script>

<style scoped>
  .daily{
     width: 900px;
     height: 300px;
     position: relative;
     visibility: hidden;
  }
  .coverUrl{
      width: 100%;
  }
  .title{
      position: absolute;
      bottom: 0;
  }

</style>