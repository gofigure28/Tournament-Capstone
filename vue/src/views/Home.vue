<template>
  <div class="home">
    <div class ="logo">
      <img class="logo" src="/assets/winnerscup.png" alt="Winner's Cup"/>
    </div>
    <div id="slider">
      <figure>
        <img src="/assets/champ1.jpg"/>
         <img src="/assets/champ2.jpg"/>
          <img src="/assets/champ3.jpg"/>
      </figure>
    </div>

    <div class="textbox">
    <center> <h1>Welcome to the Tournament of Champions </h1> </center>
    </div>
    <div class="nav-buttons" >
      <button class="create-tourn">
        <router-link class="routerlink" color="#0072ce" v-bind:to="{ name: 'createTournament' }">
          <h4> Create a Tournament </h4>
        </router-link>
      </button>
      <button class="create-match">
        <router-link class="routerlink" color="#0072ce" v-bind:to="{ name: 'createMatch' }">
          <h4> Create a Match </h4>
        </router-link>
      </button>
      <button class="view-tourns">
        <router-link class="routerlink" color="#0072ce" v-bind:to="{ name: 'browseTournament' }">
          <h4>View All Tourneys</h4>  
        </router-link>      
      </button>
      <button class="view-matches">
        <router-link class="routerlink" color="#0072ce" v-bind:to="{ name: 'viewAllMatches' }">
          <h4>View All Matches</h4>
        </router-link>
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
#slider{
  overflow:hidden;
  margin: 10px 20px 10px 20px;
}

#slider figure{
  position:relative;
  width: 500%;
  margin:0;
  left:0;
  animation: 15s slider infinite;
}

#slider figure img{
  width: 33%;
  float:left;
}

@keyframes slider{
  0% {
    left: 0;
  }
  20% {
    left: 0;
  }
  25% {
    left: -100%;
  }
  45% {
    left: -100%;
  }
  50% {
    left: -200%;
  }
  70% {
    left: -200%;
  }

  75% {
    left: -300%;
  }
  95% {
    left: -300%;
  }
  100%{
    left:-400%;
  }
  

}


.textbox{
  margin-bottom: 50px;
  background-repeat:no-repeat;
  object-fit:contain;
}

.logo{
  margin-top:10px;
  max-width: 200px;
}

.home {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  max-width: 1400px;
  margin: 0 auto;
}

.routerlink{
  text-decoration: none;
  color: #0072ce;
  font-family:Avantgarde, TeX Gyre Adventor, URW Gothic L, sans-serif;
}

h1{
   font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif;
  font-size:35px;
  color:rgb(0, 0, 0);
  margin-bottom:20px;
  text-shadow:5px 5px 5px  rgb(150, 150, 150);
  font-style:italic;
}
h4{
  margin: auto;
  font-style: italic;
  display:flex;
  justify-content:center;;
}

h3{
  font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif;
}

button {
  display:inline-block;
  padding: 30px 20px;
  width: 100%;
  margin-bottom: 10px;
  color: #83c7ff;
  background-color: #d0f7ff;
  border-radius: 4px;
  height:50px;
  font-size: 14px;
  border-bottom:5px;
  cursor: pointer;
}

button:hover{
  background-color: #48a4f0;
}

button:focus{
  background:linear-gradient(#1a82d8, #48a4f0, #1a82d8 );
}

.nav-buttons {
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
  flex-wrap: wrap;
  height: auto;
  width: 100%;
  margin-bottom:50px;
}



</style>
