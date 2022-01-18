<template>
<main>
  <div class="main-container">
    <table>
    <thead>
      <th>#</th>
      <th>서비스 분류</th>
      <th>제목</th>
      <th>작성 날짜</th>
    </thead>
    <tbody>
      <tr v-for="item in board" :key="item.idx">
        <td>{{item.idx}}</td>
        <td>{{item.boardType}}</td>
        <td>
          <a href="#">{{item.title}}</a>
        </td>
        <td>{{item.writeDate}}</td>
      </tr>
    </tbody>
  </table>
  </div>
</main>
</template>

<script>
import BoardService from '../Services/BoardService.js'

export default {
  name: 'Contents',
  data(){
    return {
      board : []
    }
  },
  methods: {
    getBoardList(){
      BoardService.getBoardList().then((response) => {
        this.board = response.data.content;
      });
    }
  },
  created() {
    this.getBoardList();
  }
}
</script>

<style>

* {margin : 0; padding : 0;}

main {
  margin:0 auto; padding: 0; width: 45%;
}

.main-container {
  width: 800px;
  height: 1000px;
}

.main-container table {
  width: 100%;
}

.main-container table tr{
  height: 50px;
}

.main-container table th{
  height: 100px;
}
</style>
