import axios from 'axios'

const API_BASE_URL = 'http://localhost:7070/api/';

class UserService {
    registUser(userData) {
        return axios.post(API_BASE_URL+'join', userData);
    }

    loginUser(userData) {
        return axios.post(API_BASE_URL+'login', userData);
    }
}

export default new UserService();