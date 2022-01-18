<template>
<main>
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
        <td>{{item.title}}</td>
        <td>{{item.createDate}}</td>
      </tr>
    </tbody>
  </table>
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
    getBoard(){
    BoardService.getBoard().then((response) => {
          this.board = response.data.content;
      });
    }
  },
  created() {
    this.getBoard();
  }
}
</script>

<style>

* {margin : 0; padding : 0;}

.test-container {
  margin:0 auto; padding: 0; width: 1200px;
}
.test {
  width: 100%;
  height: 1200px;
   background-color: blue;
}
</style>
