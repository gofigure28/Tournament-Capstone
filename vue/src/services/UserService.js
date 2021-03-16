import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:8080"
});

export default {

    getAllUsers(){
        return http.get("/all-users");
    },

}