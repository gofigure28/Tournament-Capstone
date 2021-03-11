<template>
    <div>
    <h1>{{tournament.tournament_name}}</h1>;
    </div>
</template>

<script>
import tournamentService from "../services/TournamentService";
export default {
    name: 'tournament-card',
    components: { },
    data() {
        return{
        tournament: {
            tournament_name: "",
            tournament_id: 0,
            start_time: "",
            start_date: "",
            number_of_participants: "",
            team_id: 0,
            ranking_of_teams: "",
            match_id: 0
            }
        }

    },
    created() {
        tournamentService.getCards().then((response) =>{
            this.tournament = response.data;
        })
    }
}
</script>

<style scoped>

</style>