import axios from 'axios'

const API_BASE_URL = 'http://localhost:7070/api/';

class UserService {
    registUser(userData) {
        return axios.post(API_BASE_URL+'join', userData);
    }

    loginUser(userData) {
        return axios.post(API_BASE_URL+'login', userData);
    }

    getLoginResult(){
        return axios.get(API_BASE_URL+'loginResult');
    }
}

export default new UserService();