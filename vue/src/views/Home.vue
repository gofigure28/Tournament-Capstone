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
  color: #ffffff;
}

.routerlink{
  text-decoration: none;
  color: white;
}

h1{
   font-family: 'Optima';
  font-size:35px;
  color:black;
  font-style:italic;
}

h4{
  color:#282828;
  margin: auto;
  font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif;
}

h3{
  color: ##0072ce;
  font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif;
}

button {
  display:flexbox;
  padding: 10px 20px;
  width: 100%;
  margin-bottom: 10px;
  border: 3px solid rgb(255, 255, 255);
  color: #fff;
  background-color: #0072ce;
  border-radius: 4px;
  font-size: 14px;
  cursor: pointer;
   background:repeating-linear-gradient(45deg, #6495ff, #23A6D5, #23D5AB);  
}

button:hover{
  background-color: #000;
  /*  Making button bigger on hover  */
  padding: 15px 35px;
  transform: scale(1.1);
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
