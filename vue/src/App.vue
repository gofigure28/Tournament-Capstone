<template>
  <div id="app">
       <router-view />
    <div class="nav" id="nav">
      <button class="btn_icon"  v-if="$store.state.token != ''">
      <router-link color="blue" v-bind:to="{ name: 'home' }">
        <img class="icon" src="/assets/home.png" alt="Home"/>
        </router-link>
      </button>
      <button class="btn_icon" v-if="$store.state.token != ''">
        <router-link color="blue" v-bind:to="{ name: 'logout' }">
          <img class="icon" src="/assets/logout.png" alt="Logout" />
        </router-link>
      </button>
      <button class="btn_icon" v-if="$store.state.token != ''">
        <router-link color="blue" v-bind:to="{ name: 'createTournament' }">
        </router-link>
        <img class="icon" src="/assets/calendar.png" alt="New Tournament" />
      </button>
      <button class="btn_icon" v-if="$store.state.token != ''">
        <router-link color="blue" v-bind:to="{ name: 'createMatch' }">
          <img class="icon" src="/assets/plus.png" alt="New Match" />
        </router-link>
      </button>
      <button class="btn_icon" v-if="$store.state.token != ''">
        <router-link color="blue" v-bind:to="{ name: 'browseTournament' }">
          <img class="icon" src="/assets/bracket.png" alt="Browse" />
        </router-link>
      </button>
       <button class="btn_icon" v-if="$store.state.token != ''">
        <router-link color="blue" v-bind:to="{ name: 'playerProfile' }">
          <img class="icon" src="/assets/user.png" alt="Profile" />
        </router-link>
      </button>
    </div>
  </div>
</template>
<script>
export default {};
</script>
<style scoped>
/* Global styles */
.nav {
  display: flex;
  justify-content: center;
  width: 100%;
  border-radius: 8px;
  flex-direction: row;
  background-color: #b1e9ff;
  text-decoration: none;
  background-size: 400% 400%;
  position: relative;
}

.bubbels {
  position: absolute;
  width: 100%;
  height: 100%;
  z-index: -1;
  overflow: hidden;
  top: 0;
  left: 0;
}

.bubble {
  position: absolute;
  bottom: 0;
  background: #b1e9ff;
  border-radius: 50%;
  opacity: 0.5;
  animation: flying 10s infinite ease-in;
}

.bubble:nth-child(1) {
  width: 40px;
  height: 40px;
  left: 1.5%;
  animation-duration: 8s;
}
.bubble:nth-child(2) {
  width: 20px;
  height: 20px;
  left: 2%;
  animation-duration: 5s;
  animation-delay: 1s;
}
.bubble:nth-child(3) {
  width: 50px;
  height: 50px;
  left: 1%;
  animation-duration: 7s;
  animation-delay: 1s;
}

@keyframes flying {
  0% {
    bottom: -100px;
    transform: translateX(0);
  }
  50% {
    transform: translateX(100px);
  }
  100% {
    bottom: 1080px;
    transform: translateX(-200px);
  }
}

@keyframes change {
  0% {
    background-position: 0 50%;
  }
  50% {
    background-position: 100% 50%;
  }
  100% {
    background-position: 0 50%;
  }
}

.btn {
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 10px 10px;

  color: #333;
  background-color: #dcdcdc;
  border-radius: 4px;
  font-size: 14px;
  cursor: pointer;
}
.btn_icon {
  background: #d0f7ff;
  width: inherit;
}
.btn_icon:hover {
  background-color: #48a4f0;
}
.logo {
  display: flex;
  justify-content: center;
  padding: 4rem;
}
.icon {
  max-width: 24px;
  margin: 10px;
}
#app {
  margin: 2rem 0 4rem 0;
  padding: 0;
  background-color: #ffffff;
  border-radius: 8px;
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
  max-width: 100%;
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





