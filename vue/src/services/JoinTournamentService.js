import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});


export default {

    getTournaments(){
        return http.get("/tournaments/");
    },

    joinTournament(){
        return http.post("/tournaments/{id}")
    }


}