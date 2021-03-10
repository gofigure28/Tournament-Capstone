<template>
  <div>
      <center><h1>View All Tournaments</h1></center>
      <tournament-list/>
  </div>
</template>


<script>
import TournamentList from '../components/TournamentList'

export default{
    components: {TournamentList},

    methods: {

    },
};

</script>
<style>

h1{
  padding: 12px;
  margin: auto;
}
</style>