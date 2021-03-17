<template>
  <form class="new-tournament-form" v-on:submit.prevent="saveTournament">
    <label for="name-input" class="sr-only">Tournament Name</label>
    <input
      class="form-control"
      type="text"
      placeholder="Name"
      v-model="tournament.name"
    />
    <label for="starting-time-input" class="sr-only">Start Time</label>
    <input
      class="form-control"
      type="datetime-local"
      placeholder="Starting Time"
      v-model="tournament.startTime"
    />
    <label for="numper-of-players-input" class="sr-only"># of Players</label>
    <input
      class="form-control"
      type="number"
      placeholder="Number of Teams"
      v-model="tournament.numberOfPlayers"
    />
    <button class="save" type="submit">Save</button>
  </form>
</template>
<script>
import tournamentServices from '../services/TournamentService';
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
    saveTournament(){
     /* this.$store.commit("SAVE_TOURNAMENT", this.tournament).then((response) =>{
      this.tournament= response.data;
      });
      this.tournament= {
        tournament_name: "",
        startTime: "",
        numberOfPlayers: "",
      }; */
      tournamentServices.addTournament(this.tournament).then((response) =>{
      if(response === 201){
      this.$router.push("/createTeam");
      }
      }).catch(error =>{
      console.log(error);
      this.$router.push("/createTeam");
      })
  }
},
};
</script>
<style>
form input {
  border: 0px !important;
}
form.new-tournament-form {
  display: flex;
  flex-direction: column;
  align-items: center;  
  width: 100%;
  max-width: 1200px;
  padding: 8px 8px 8px 8px;
  border-radius: 80px;
  margin: 0 auto;
  color: #0072CE;
}
.new-tournament-form .sr-only{
  padding: 8px 0px 8px 0px;
  border: 0px;
  border-radius: 8px;
  height: 20;
  margin: auto;
}
.new-tournament-form .form-control{
  border: 1px solid rgb(196, 196, 196);
  border-radius: 8px;
  height: 40px;
  width: 60%;
  margin: auto;
}

</style>