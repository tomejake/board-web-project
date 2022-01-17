<template>
<form name="signUp">
  <h1>회원가입</h1>
  <label> 아이디
    <input class="signup-input" type="id"  id="userId" placeholder="Enter User ID"/>
  </label>
  <label> 비밀번호
    <input class="signup-input" type="password" id="userPassword" placeholder="Enter User Password"/>
  </label>
  <label> 비밀번호 확인
    <input class="signup-input" type="password" id="checkPassword" placeholder="Enter Password again">
  </label>
  <input type="submit" name="submit" id="submit" value="확인" />
</form>
</template>

<script>
export default {
  name : 'Signup'
}
</script>

<style>

* {margin : 0; padding : 0;}

form {
    width : 300px; margin : 50px auto ; border : 1px solid #ccc;
}

h1 {
    display : block; font-size : 30px; text-align: center; margin : 15px 0;
}

label {
    font-size : 20px; margin : 1px 0; padding: 0 10px; 
    color : #555; text-align: left;
}

.signup-input {
    width : 100%; height : 35px; padding : 0 15px; 
    box-sizing : border-box; border : 1px solid #ddd;
}

#submit {
    margin-top : 20px; display : block; width: 100%; height : 35px;
    background : #444; color : white; border : none; cursor : pointer;
}

#submit:hover {
    background: #999;
}
</style>
