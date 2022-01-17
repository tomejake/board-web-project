<template>

  <div v-if= $store.state.step1 >
    <button @click="$store.state.step1 = $store.state.step2">^~^</button>
  </div>

  <div v-if= $store.state.step2>
    <form class="sign-up" name="signUp">
    <h1 class="join-h1">회원가입</h1>

      <label class="join-form"> 아이디
        <input class="join" type="id"  id="userId" placeholder="Enter User ID"/>
      </label>

      <label class="join-form"> 비밀번호
        <input class="join" type="password" id="userPassword" placeholder="Enter User Password"/>
      </label>

      <label class="join-form"> 비밀번호 확인
        <input class="join" type="password" id="checkPassword" placeholder="Enter Password again">
      </label>
  
    <button id="submit" @click="$store.state.step2 = $store.state.step1">Submit</button>

    </form>
  </div>

</template>

<script>
export default {
name : 'Contents',
  props : {
    
  },
}
</script>

<style>

* {margin : 0; padding : 0;}


.sign-up {
    width : 300px; margin : 50px auto ; border : 1px solid #ccc;
}

.join-h1 {
    display : block; font-size : 30px; text-align: center; margin : 15px 0;
}

.join-form {
    font-size : 20px; margin : 1px 0; padding: 0 10px; 
    color : #555; text-align: left;
}

.join {
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
