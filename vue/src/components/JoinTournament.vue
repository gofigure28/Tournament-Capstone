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

          <create-team/>
          <tournament-list/>
 </div>
</template>

<script>
import TournamentList from "../components/TournamentList";
import JoinTournamentService from "../services/JoinTournamentService";
import CreateTeam from "../components/CreateTeam";


export default {
  data() {
    return {
      tournament: {
        name: "",
        teamID: "",
      },
    };
  },
  components: {
      CreateTeam,
      TournamentList,
        },

  methods: {
     
    joinTournament() {
        const teamID = parseInt(this.receivingTournament);
        if( tournament_status != "Active") {
            this.errorMsg = "Please select an active tournament";
        } else if (
            confirm("Join this tournament?")
            this.createTeam;
        ){
            this.tournamentCard(this.tournamentID, teamID).then() => {
                JoinTournamentService
                .joinTournament(this.tournamentID)
                .then((response) => {
                    if (response.status === 200) {
                        alert("You've successfully joined this tournament!");
                         this.$store.commit("SAVE_BOARD", this.tournamentID);
                        this.$router.push("/");
              }
            })
            .catch((error) => {
              if (error.response) {
                this.errorMsg = `Error joining this tournament. Response recieved was "${error.response.statusText}".`;
              } else if (error.request) {
                this.errorMsg =
                  "Error joining this tournament. Server could not be reached.";
              } else {
                this.errorMsg =
                  "Error joining this tournament. Request could not be made.";
              }
            });
        };
      }
    },
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