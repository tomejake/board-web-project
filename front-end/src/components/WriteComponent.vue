<template>
  <form class="writeForm" @submit.prevent="writeForm">
      <div class="board-container">
            <table class="board-table">
                <tbody>
                    <tr>
                        <td class="category-area">
                            <select type="text" class="category" v-model="boardType">
                                <option value>탭</option>
                                <option value="free">자유게시판</option>
                                <option value="notice">공지사항</option>
                            </select>
                        </td>
                        <td class="title-area">
                            <label for="title"></label>
                            <input type="text" class="title" id="title" placeholder="제목" maxlength="90" autocomplete="off" v-model="title">
                        </td>
                    </tr>
                </tbody>
            </table>
            <div class="editor">
                    <p><textarea v-model="content"></textarea></p>
                    <p><input type="submit" class="write-sumbit"></p>
            </div>
      </div>
  </form>
  {{log}}
</template>

<script>
import BoardService from '../Services/BoardService.js'

export default {
    name: "WriteComponent",
    data() {
        return {
            boardType: '',
            title: '',
            content: '',
            log: ''
        }
    },
    methods: {
        async writeForm(){
            const boardData = {
                boardType: this.boardType,
                title: this.title,
                content: this.content,
            };
            await BoardService.postBoard(boardData);
        }
    },
}
</script>

<style>
.writeForm {
    margin: 0px auto;
    padding: 10px;
    width: 60%;
    position: relative;
    height: 1000px;
}

.board-table {
    width: 100%;
}

.category-area {
    width: 20%;
}

.category-area .category {
    width: 100%;
    height: 40px;
    font-size: 20px;
}

.title-area .title {
    width: 100%;
    height: 40px;
    font-size: 20px;
}

.editor textarea{
    position: relative;
    width: 100%;
    height: 800px;
    box-sizing: border-box;
    border: solid 2px #1E90FF;
    border-radius: 5px;
    font-size: 16px;
    resize: both;
}

.editor .write-sumbit{
    font-size: 16px;
    width: 60px;
    height: 30px;
}
</style>
