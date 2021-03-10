<template>
  <div class="home" style="background-color: white">
    <center> <h1>Welcome to the Tournament of Champions </h1> </center>
    <center> <h4> Compliments of team:</h4><h4>"Internal Server Error!" </h4></center>
    <center><h3>Please select from the options below...</h3></center>
    <div class="nav-buttons" >
      <button class="create-tourn">
        <router-link class="routerlink" color="white" v-bind:to="{ name: 'createTournament' }">Create a Tournament</router-link>
      </button>
      <button class="create-match">
        <router-link class="routerlink" color="white" v-bind:to="{ name: 'createMatch' }">Create a Match</router-link>
      </button>
      <button class="view-tourns">
        <router-link class="routerlink" color="white" v-bind:to="{ name: 'viewAllTournaments' }">View All Tourneys</router-link>
      </button>
      <button class="view-matches">
        <router-link class="routerlink" color="white" v-bind:to="{ name: 'viewAllMatches' }">View All Matches</router-link>
      </button>
      </div>
 
  </div>
</template>

<script>
export default {
  name: "home"
};
</script>

<style scoped>
.home {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  max-width: 1400px;
  padding: 8px 8px 8px 8px;
  margin: 0 auto;
  color: #0072ce;
}

.routerlink{
  text-decoration: none;
  color: white;
}

h4{
  color:#282828;
  margin: auto;
}

h3{
  color: ##0072ce;
}

button {
  padding: 10px 20px;
  margin: auto;
  max-width: 200px;
  border: 1px solid #ddd;
  color: #fff;
  background-color: #0072ce;
  border-radius: 4px;
  font-size: 14px;
  cursor: pointer;
}

.nav-buttons {
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
  flex-wrap: wrap;
  height: auto;
  width: 200px;

}

</style>
