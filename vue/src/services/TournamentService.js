import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

    getAll(){
        return http.get("/all-tournaments");
    },

    addTournament(tournament){
        return http.post("/all-tournaments", tournament);
    }


}