import axios from 'axios'

function registUser(userData) {
    const API_BASE_URL = 'http://localhost:7070/api/';
    return axios.post(API_BASE_URL+'join', userData);
}

export {registUser};