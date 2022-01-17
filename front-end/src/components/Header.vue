<template>
  <header>
      <h1>gram</h1>
      <a href="#" class="logo">
        <img alt="Vue logo" src="../assets/logo-gram.png" width="120">
      </a>
      <!-- 로고 영역 -->

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
          <button @click="$store.state.step2">회원가입</button><br>

          <!-- <input type="checkbox" id="keepLogin" name="keepLogin">
          <label for="keepLogin"><span>자동 로그인</span></label><br> -->
          <!-- 자동 로그인 기능은 추후에 기능 개발 예정입니다.ㅎ -->
        </span>
      </div>
      <!-- 로그인 영역 -->
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
    header{width:100%; text-align:center; position:relative; height:80px; border-bottom:1px solid #111}
    header h1{display:none;}
    header .logo {position: relative; display:inline-block; padding-top: 15px;}
    header .login{padding-top: 15px; padding-bottom: 15px; padding-right: 150px; float: right; width: "50";}
    button {font-size:5px; padding:1px}
</style>