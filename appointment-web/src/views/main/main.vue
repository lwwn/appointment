<template>
    <div class="wrap"> 
        <header >
            <div class="head"> 
                    <h3>一个人的生活</h3>
              <ul class="nav-right flex">
                <li v-if="!user.name" @click="goLogin" class="nav-item poiner"><span>登录</span></li>
                <li class="flex poiner" v-if="user.name">
                    <div @click="goUserCenter" class="head-img-box"><img class="head-img" :src="user.headImg" alt=""></div>
                    <div @click="goOut"><span>退出</span></div>
                </li>
            </ul>
            </div>
         
            <p class="describe">山有扶苏，隰有荷华。不见子都，乃见狂且。山有桥松，隰有游龙。不见子充，乃见狡童。</p>
        </header>
        <nav class="nav">
            <ul class="nav-left flex">
                <li class="nav-item poiner"><span>首页</span></li>
                <li class="nav-item poiner"><span>日志</span></li>
            </ul>
          
        </nav>
        <div>
             <router-view/>
        </div>
        <footer></footer>
    </div>
</template>
<script>
export default {
    
    data(){
        return {
            user:{}
        }
    },
    created(){
        this.user = JSON.parse(localStorage.user);
    },
    methods:{
        goLogin(){
            this.$router.push({name:'login'})
        },

        goOut(){

            localStorage.clear();
            this.$router.go(0)
        },
        goUserCenter(){
            this.$router.push({name:'user'})
        }
    }
}
</script>
<style scoped>
  .wrap{
      width: 1200px;
      margin: auto;

  }
  .head{
      display: flex;
      align-items: center;
      justify-content: space-between;
  }
  .head-img-box{
      width: 40px;
      height: 40px;
      margin-right: 20px;

  }
  .head-img{
      width: 100%;
      border-radius: 50%;
  }
  .describe{
      opacity: 0.8;
  }
  .flex{
      display: flex;
      align-items: center;
  }
  .nav{
      display: flex;
      align-items: center;
      justify-content: space-between;
       padding: 0;
       padding: 0;
      font-size: 18px;
      color: #999;
  }
  .nav-left{
    
  }
  .nav-item{
      padding-right: 30px;

  }
  .poiner{
      cursor: pointer;
  }
  .nav-right{
    font-weight: 600;
  }
  ul{
      padding: 0;
  }

</style>