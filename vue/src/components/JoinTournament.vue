<template>
  <div class="active-tournaments">
    <h1>Join a Tournament</h1>
    <tournament-card
      v-for="tournament in $store.state.tournaments"
      v-bind:key="tournament.tournamentID"
      v-bind:tournament="tournament"
    />
  </div>
</template>

<script>
import TournamentList from "../components/TournamentList";
import JoinTournamentService from "../services/JoinTournamentService";

export default {
  
  name: "tournament-form",
  data() {
    return {
      tournament: {
        name: "",
        startTime: "",
        numberOfPlayers: "",
      },
    };
  },
  methods: {
    addTournamentTeam(){
      joinTournamentService.addTournamentTeam(this.tournament).then((response) =>{
      if(response === 201){
      this.$router.push("/viewAllTournaments");
      }
      }).catch(error =>{
      console.log(error);
      this.$router.push("/viewAllTournaments");
      })
  }
},
};
</script>

<style scoped>
</style>