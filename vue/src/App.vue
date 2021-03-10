<template>
  <div id="app">
    
    <div class="nav" id="nav">
      <router-link color="blue" v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;
      <router-link color="blue"  v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>&nbsp;|&nbsp;
      <router-link color="blue" v-bind:to="{ name: 'createTournament' }">Create a Tournament</router-link>&nbsp;|&nbsp;
      <router-link color="blue" v-bind:to="{ name: 'createMatch' }">Create a Match</router-link> <br>
      <router-link color="blue" v-bind:to="{ name: 'browseTournament' }">Browse Tournaments</router-link>

    </div>
    <img class="logo" src="/assets/logo.png" alt="Party Up Logo"/>
    <router-view />
  </div>
</template>


<script>

export default {

}
</script>

<style scoped>

/* Global styles */

.app{
  background-color:aquamarine;
}

.nav{
text-decoration: none;
}

.btn{
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 10px 20px;
  border: 1px solid #ddd;
  color: #333;
  background-color:#dcdcdc;
  border-radius: 4px;
  font-size: 14px;
  cursor: pointer;
  }
  
  .logo{
    display: flex;
    justify-content: center;
    padding: 4rem;
  }

#app {
  background: #fff;
  margin: 2rem 0 4rem 0;
  padding: 1rem;
  padding-top: 0;
  position: relative;
  box-shadow: 0 2px 4px 0 rgba(0, 0, 0, 0.2), 0 2.5rem 5rem 0 rgba(0, 0, 0, 0.1);
}
@media screen and (min-width: 550px) {
  #app {
    padding: 4rem;
  }
}
#app > * {
  max-width: 50rem;
  margin-left: auto;
  margin-right: auto;
}
#app > form {
  max-width: 100%;
}
#app h1 {
  display: block;
  min-width: 100%;
  width: 100%;
  text-align: center;
  margin: 0;
  margin-bottom: 1rem;
}
</style>
