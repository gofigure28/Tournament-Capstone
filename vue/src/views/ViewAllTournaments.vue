<template>
  <div class="tournament-container">
   <h1> List of Tournaments </h1>
    <tournament-card v-for="tournament in $store.state.tournaments"
                     v-bind:key="tournament.tournamentID" 
                     v-bind:tournament="tournament"/>
    
  </div>
</template>





<script>
import tournamentCard from "../components/tournamentCard";
import tournamentService from "../services/TournamentService";
//import tournamentCard from '@/components/TournamentCard.vue';

export default {
  components: { tournamentCard },
  created() {
        tournamentService.getTournaments().then((response) =>{
            this.$store.commit('STORE_TOURNAMENTS', response.data);
        })
    }
  
  };

</script>





<style>
</style>


/*
<h1>View all Tournaments</h1>
    <p>Tournament 1</p>
    <select name="" id="">
      
      <option value="Tournament">Number of participants</option>
      <option value="Tournament">Teams</option>
      <option value="Tournament">something</option>
      <option value="Tournament">something</option>
    </select>

    <p>Tournament 2</p>
    <select name="" id="">
     
      <option value="Tournament">Number of participants</option>
      <option value="Tournament">Teams</option>
      <option value="Tournament">something</option>
      <option value="Tournament">something</option>
    </select>

<p>Tournament 3</p>
    <select name="" id="">
      
      <option value="Tournament">Number of participants</option>
      <option value="Tournament">Teams</option>
      <option value="Tournament">something</option>
      <option value="Tournament">something</option>
    </select>

<p>Tournament 4</p>
    <select name="" id="">
     
      <option value="Tournament">Number of participants</option>
      <option value="Tournament">Teams</option>
      <option value="Tournament">something</option>
      <option value="Tournament">something</option>
    </select>
    */
