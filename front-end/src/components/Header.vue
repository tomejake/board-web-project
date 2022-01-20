<template>
<header>
  <!-- 로고 영역 -->
  <div class="logo">
    <h1>gram</h1>
    <img alt="Vue logo" src="../assets/logo-gram.png" width="120" @click="$store.commit('setPageState', 'Contents')">
  </div>
  <!-- /로고 영역 끝/ -->
  <div class="block"></div>
  <!-- 로그인 영역 -->
  <div class="login">
    <form name="loginForm" @submit.prevent="loginForm">
      <span>
        <label for="userid"></label>
        <input type="text" id="userid" name="userid" v-model="userid" placeholder="ID" size=10>
      </span><br>
      <span>
        <label for="password"></label>
        <input type="password" id="password" name="password" v-model="password" placeholder="Password" size=10>
      </span><br>
      <span class="button">
        <input type="submit" class="signup-btn" value="로그인" /> &ensp;
        <a class="signup-btn" @click="$store.commit('setPageState', 'Signup')">회원가입</a>
        <!-- <input type="checkbox" id="keepLogin" name="keepLogin">
        <label for="keepLogin"><span>자동 로그인</span></label><br> -->
        <!-- 자동 로그인 기능은 추후에 기능 개발 예정입니다. -->
      </span>
    </form>
  </div>
  <!-- /로그인 영역 끝/ -->
  </header>
</template>

<script>
import UserService from '../Services/UserService.js'

export default {
  name : 'Header',
  data() {
    return {
      userid: '',
      password: '',
      result: []
    }
  },

  methods: {
    async loginForm() {
      console.log(this);
      const userData = {
        userid: this.userid,
        password: this.password
      };
      await UserService.loginUser(userData).then(res => {
        console.log("값 전달 성공");
        UserService.getLoginResult().then((response) => {
          this.result = response.data;
        });
      }).catch(err => {
        console.log("값 전달 실패");
      });
    }
  },
}
</script>

<style scoped>
  * {margin: 0; padding: 0;}
  header{width:100%; height:80px; border-bottom:1px solid #111; padding-bottom: 30px;}
  header h1{display:none;}
  header .logo {display: inline-block; width: 20%; height: 100%; cursor: pointer;}
  header .block{display: inline-block; width: 20%; height: 100%;}
  header .login{display: inline-block; width: 20%; height: 100%; margin-top: 20px;}
  header .login .signup-btn {cursor: pointer; margin-top: 5px;}
  button {font-size:5px; padding:1px}
</style>