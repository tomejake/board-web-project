import axios from 'axios';

const BOARD_API_BASE_URL = 'http://localhost:7070/api/list';

class BoardService{
    getBoardList(){
        return axios.get(BOARD_API_BASE_URL);
    }
}

export default new BoardService();