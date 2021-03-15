<template>
  <div class="active-tournaments">
    <h1>Join a Tournament</h1>
    <tournament-card
      v-for="tournament in $store.state.tournaments"
      v-bind:key="tournament.tournamentID"
      v-bind:tournament="tournament"
    />
  
  <label for="joinTournament" class="sr-only">Join Tournament</label>
      <router-link :to="{ name: 'joinTournament' }">joinTournament</router-link>
      <button class="btn" type="submit">
 </div>
</template>

<script>
import TournamentList from "../components/TournamentList";
import JoinTournamentService from "../services/JoinTournamentService";

export default {
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
    saveTournament(){
     this.$store.commit("SAVE_TOURNAMENT", this.tournament).then((response) =>{
      this.tournament= response.data;
      });
      this.tournament= {
        tournament_name: "",
        startTime: "",
        numberOfPlayers: "",
        teamID: "this.teamID"
      }
},
computed: {
    active() {
      return this.$store.state.tournamentCard.filter(
        (tournament) => tournament.status === "Active"
      );
    },
    
  };

</script>

<style scoped>
</style>