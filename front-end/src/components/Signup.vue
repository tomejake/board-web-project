<template>
<form name="signUp" class="frm" @submit.prevent="submitForm">
  <h1>회원가입</h1>
  <label for="userid"> 아이디</label>
    <input class="signup-input" type="text" name="userid" id="userid" v-model="userid" placeholder="Enter User ID"/>
  <label for="password">비밀번호 </label>
    <input class="signup-input" type="password" name="password" id="password" v-model="password" placeholder="Enter User Password"/>
  <label for="checkPassword">비밀번호 확인 </label> 
    <input class="signup-input" type="password" name="checkPassword" id="checkPassword" placeholder="Enter Password again">
  <input type="submit" id="submit" value="확 인" />
</form>
</template>

<script>
export default {
  name : 'Signup',
  data() {
    return {
      userid: '',
      password: ''
    }
  },
  methods: {
    submitForm(){
      console.log('123');
    }
  },
}
</script>

<style>

.frm {
    width : 300px; margin : 50px auto ; border : 1px solid #ccc;
}

.frm h1 {
    display : block; font-size : 30px; text-align: center; margin : 15px 0;
}

.frm label {
    font-size : 20px; margin : 1px 0; padding: 0 10px; 
    color : #555; text-align: left;
}

.frm .signup-input {
    width : 100%; height : 35px; padding : 0 15px; 
    box-sizing : border-box; border : 1px solid #ddd;
}

.frm #submit {
    margin-top : 20px; display : block; width: 100%; height : 35px;
    background : #444; color : white; border : none; cursor: pointer;
}

.frm #submit:hover {
    background: #999;
}
</style>
