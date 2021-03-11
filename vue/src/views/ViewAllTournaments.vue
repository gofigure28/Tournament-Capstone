<template>
  <div class="tournament-container">
    <tournament-card v-bind:tournament="tournament in $store.state.tournaments" v-bind:key="tournament_id" />
    
  </div>
</template>





<script>
import tournamentCard from './tournamentCard.vue';
//import tournamentCard from '@/components/TournamentCard.vue';

export default {
  components: { tournamentCard },};

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