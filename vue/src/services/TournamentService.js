import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:8080"
});

export default {

    getAll(){
        return http.get("/tournaments");
    },

    addTournament(tournament){
        return http.post("/createTournament", tournament);
    },

    getCards(){
        return http.get("/tournaments/");
    }


}