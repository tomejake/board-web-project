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
            <a @click="$store.commit('setPageState', 'ReadComponent')" class="title-link">{{item.title}}</a>
          </td>
          <td>{{item.writeDate}}</td>
        </tr>
      </tbody>
    </table>
    <p class="write_btn">
      <button @click="$store.commit('setPageState', 'WriteComponent')">글쓰기</button>
    </p>
    <ul class="page">
      <li>&laquo;</li>
      <li @click="prePage">&lsaquo;</li>
      <li @click="getBoard(i+firstPage)" v-for="i in lastPage" :key="i">
          {{i+firstPage}}
      </li>
      <li @click="nextPage()">&rsaquo;</li>
      <li>&raquo;</li>
    </ul>
  </div>
</main>
</template>

<script>
import BoardService from '../Services/BoardService.js'

export default {
  name: 'Contents',
  data(){
    return {
      board : [],
      totalPages: 0,
      firstPage: 0,
      lastPage: 10,
      thisPage: 1
    }
  },
  methods: {
    getBoard(i) {
      BoardService.getBoard(i-1).then((response) => {
          this.board = response.data.content;
          this.totalPages = response.data.totalPages;
          this.thisPage = i;
      });
    },
    prePage(){
      if(this.firstPage != 0){
          this.firstPage -= 10;
      }
    },
    nextPage(){
      if(this.totalPages >= this.firstPage+11){
          this.firstPage += 10;
      }
    },
  },
  created() {
    this.getBoard(1);
  }
}
</script>

<style>

* {margin : 0; padding : 0;}

main {
  margin:0 auto; padding: 0; width: 25%;
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

.title-link {
  cursor: pointer;
}

.page li{
  list-style-type: none;
  float: left;
  margin: 10px 20px 10px 20px;
  cursor: pointer;
}

.write_btn {
  text-align: left;
}
</style>
