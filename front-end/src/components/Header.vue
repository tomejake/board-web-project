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
    <span>
      <label for="loginId"></label>
      <input type="email" id="loginId" name="loginId" placeholder="ID" size=10>
    </span><br>
    <span>
      <label for="loginPw"></label>
      <input type="password" id="loginPw" name="password" placeholder="Password" size=10>
    </span><br>
    <span class="button">
      <button type="submit"  disabled="disabled">로그인</button>&ensp;
      <button class="signup-btn" @click="$store.commit('setPageState', 'Signup')">회원가입</button><br>
      <!-- <input type="checkbox" id="keepLogin" name="keepLogin">
      <label for="keepLogin"><span>자동 로그인</span></label><br> -->
      <!-- 자동 로그인 기능은 추후에 기능 개발 예정입니다.ㅎ -->
    </span>
  </div>
  <!-- /로그인 영역 끝/ -->
  </header>
</template>

<script>
 
export default {
  name : 'Header',
  props : {
    
  },

  data() {
    return {
      message:'경고창'
    }
  },

  methods: {
    clickMessage: function () {
      alert(app.message)
    }
  },

  components:{
    
  }
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