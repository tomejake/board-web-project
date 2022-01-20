import axios from 'axios';

const API_BASE_URL = 'http://localhost:7070/api/';

class BoardService{
    getBoardList(){
        return axios.get(API_BASE_URL+'list');
    }
}

export default new BoardService();