import axios from 'axios';

const BOARD_API_BASE_URL = 'http://localhost:7070/api/';

class BoardService{
    getBoard(i){
        return axios.get(BOARD_API_BASE_URL+'list', {
            params:{
                pageNum: i,
            }
        });
    }

    postBoard(boardData){
        return axios.post(BOARD_API_BASE_URL+'write', boardData)
    }
}

export default new BoardService();