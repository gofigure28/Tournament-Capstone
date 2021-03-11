<template>
    <div>
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
            tournament_id: "",
            start_time: "",
            start_date: "",
            number_of_participants: "",
            team_id: "",
            ranking_of_teams: "",
            match_id: ""
            }
        }

    },
    created() {
        tournamentService.getCards(this.$route.params.id).then((response) =>{
            this.tournament = response.data.tournament;
        })
    }
}
</script>

<style scoped>

</style>