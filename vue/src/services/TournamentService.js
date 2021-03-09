import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

    getAll(){
        return http.get("/tournaments");
    },

    addTournament(tournament){
        return http.post("/tournaments", tournament);
    }


}