<template>
  <div class="loginPage">
    <div class="title">
      <h3 style="color:burlywood; font-size: 30px ;font-weight: bold">湘莲集市</h3>
    </div>
    <div class="container">
      <el-space :fill="false">
      </el-space>
    </div>
  </div>
</template>
<script setup>
</script>

<style lang="css">
.loginPage {
  background: url("https://img.zcool.cn/community/018e1962b445b20002c313f7c1b05b.jpg");
  background-size: cover;
  width: 100%;
  height: 100vh;
  .title{
    display: flex;
    align-items: center;
    justify-content: center;
  }
  .container {
    display: flex;
    margin-top: 10%;
    justify-content: center;
  }
  .login-input {
    margin-right: 5%;
    margin-left: 5%;
    height: 40px
  }
  .el-card {
    border-radius: 30px;
    height: 600px;
    display: inherit;
    box-shadow: 0 5px 20px 2px rgba(255, 255, 255, 0.1);
    .right_box {
      width: 344px;
      padding: 20px;
      position: relative;
    }
    .button-box {
      display: flex;
      justify-content: space-evenly;
      align-items: center;
      width: 100%;
      height: 100%;
    }
    .code-box{
      display: flex;
      justify-content: space-evenly;
      align-items: center;
      width: 100%;
      height: 100%;
    }
    .form-box{
      margin-top: 40px;
    }
  }
  @media (min-height: 840px){
    .container{
      margin-top: 20%;
      margin-left: 20%;
      margin-right: 20%;
      text-align: center;
    }
    .el-card {
      border-radius: 30px;
      height: 500px;
      box-shadow: 0 5px 20px 2px rgba(255, 255, 255, 0.1);
      .right_box {
        width: 244px;
        padding: 20px;
        position: relative;
      }
      .button-box {
        display: flex;
        justify-content: space-evenly;
        align-items: center;
        width: 100%;
        height: 100%;
      }
      .code-box{
        display: flex;
        justify-content: space-evenly;
        align-items: center;
        width: 100%;
        height: 100%;
      }
      .form-box{
        margin-top: 40px;
      }
    }

  }

}
</style>
