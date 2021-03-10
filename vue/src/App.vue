<template>
  <div id="app">
    
    <div class="nav" id="nav">
      <button class="btn_icon">
      <router-link color="blue" v-bind:to="{ name: 'home' }">
        <img class="icon" src="/assets/home.png" alt="Home"/>
        </router-link>
      </button>
      <button class="btn_icon">
      <router-link color="blue"  v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">
        <img class="icon" src="/assets/logout.png" alt="Logout"/>
        </router-link>
        </button>
        <button class="btn_icon">
      <router-link color="blue" v-btn:to="{ name: 'createTournament' }">
        <img class="icon" src="/assets/calendar.png" alt="New Tournament"/>
      </router-link>
        </button>
        <button class="btn_icon">
      <router-link color="blue" v-bind:to="{ name: 'createMatch' }">
        <img class="icon" src="/assets/plus.png" alt="New Match"/>
        </router-link>
        </button>
        <button class="btn_icon">
      <router-link color="blue" v-bind:to="{ name: 'browseTournament' }">
        <img class="icon" src="/assets/bracket.png" alt="Browse"/>
      </router-link>
      </button>

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
  display: flex;
  flex-direction: row;
text-decoration: none;
}

.btn{
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 10px 10px;
  border: 1px solid #ddd;
  color: #333;
  background-color:#dcdcdc;
  border-radius: 4px;
  font-size: 14px;
  cursor: pointer;
  }
  .btn_icon{
  padding: 10px 10px;
  margin: 6px;
  border: 1px solid #0072ce;
  border-radius: 4px;
  background-color:#dcdcdc;

  }
  
  .logo{
    display: flex;
    justify-content: center;
    padding: 4rem;
  }
  .icon{
    max-width: 24px;
    margin: 10px;
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
