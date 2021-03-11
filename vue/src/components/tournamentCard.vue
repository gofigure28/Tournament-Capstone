<template>
<<<<<<< HEAD
  <h1>{{this.title}}</h1>
</template>

<script>
import tournamentService from "../services/TournamentService";
export default {

    name:'tournament-card',
    data() {
        return{
            
        }
    },
    created() {
        tournamentService.getCards(this.$route.params.id).then((response) =>{
            this.title = response.data.name;
        });
    }

}
</script>

<style>

</style>S
=======
    
</template>

<script>
export default {
    name: 'tournament-card',
    components: { },
    data() {
        return{
        tournament: {
            tournament_name: "",
            tournament_id: "",
            start_time: "",
            start_date: "",
            number_of_participants: "",
            team_id: "",
            ranking_of_teams: "",
            match_id: ""
            }
        }

    methods: {
    }
}
</script>

<style scoped>

</style>
>>>>>>> fc37f6f4b3d926040b29b7e7acf7e382f64b2508
