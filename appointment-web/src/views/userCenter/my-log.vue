<template>
  <div>我的日志</div>
</template>
<script>
export default {
  data() {
    return {};
  },

  created() {
    this.getDailyList();
  },
  methods: {
    getDailyList() {
      let params = {
        userId: "12"
      };
      this.httpService.getDailyList(params).then((res) => {
        console.log(res);
      });
    },
  },
};
</script>