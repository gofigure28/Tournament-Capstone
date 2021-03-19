<template>
  <div id="app">
    <div class="navTop" id="nav">
      <button class="btn_top" name="top" v-if="$store.state.token != ''">
        <router-link color="blue" v-bind:to="{ name: 'home' }">
          <img class="icon" src="/assets/search.png" alt="Search" />
        </router-link>
      </button>
    </div>
    <transition name="fade" mode="out-in">
      <router-view />
    </transition>
    <div class="nav" id="nav">
      <button class="btn_icon" v-if="$store.state.token != ''">
        <router-link color="blue" class="router-link-active" v-bind:to="{ name: 'home' }">
          <img class="icon" src="/assets/home.png" alt="Home" />
        </router-link>
      </button>
      <button class="btn_icon" v-if="$store.state.token != ''">
        <router-link color="blue" class="router-link-active" v-bind:to="{ name: 'logout' }">
          <img class="icon" src="/assets/logout.png" alt="Logout" />
        </router-link>
      </button>
      <button class="btn_icon" v-if="$store.state.token != ''">
        <router-link class="router-link-active" v-bind:to="{ name: 'createTournament' }">
                  <img class="icon" src="/assets/calendar.png" alt="New Tournament" />
        </router-link>
      </button>
      <button class="btn_icon" v-if="$store.state.token != ''">
        <router-link color="blue" class="router-link-active" v-bind:to="{ name: 'createMatch' }">
          <img class="icon" src="/assets/plus.png" alt="New Match" />
        </router-link>
      </button>
      <button class="btn_icon" v-if="$store.state.token != ''">
        <router-link color="blue" class="router-link-active" v-bind:to="{ name: 'browseTournament' }">
          <img class="icon" src="/assets/bracket.png" alt="Browse" />
        </router-link>
      </button>
      <button class="btn_icon" v-if="$store.state.token != ''">
        <router-link color="blue" class="router-link-active" v-bind:to="{ name: 'playerProfile' }">
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
.router-link-active{
  display:inline-block;
  width:100%;
}

/* Global styles */
.fade-enter,
.fade-leave-to {
  opacity: 0;
  transform: translateX(2em);
}

.fade-enter-active,
.fade-leave-active {
  transition: all 0.3s ease;
}

.navTop {
  display: flex;
  justify-content: center;
  width: 100%;
  flex-direction: row;
  background-color: #d0f7ff;
  text-decoration: none;
  background-size: 400% 400%;
  position: fixed;
  z-index:100;
}


.nav {
  display: flex;
  justify-content: center;
  width: 100%;
  border-radius: 8px;
  flex-direction: row;
  background-color: #b1e9ff;
  text-decoration: none;
  background-size: 500%;
  position: fixed;
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
  background-color: #43a9fc;
  padding: 0px !important;
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
  margin: 4rem 0 4rem 0;
  padding: 0;
  background-color: #eff9ff;
  padding-top: 0;
  position: relative;
  box-shadow: 0 2px 4px 0 rgba(0, 0, 0, 0.2), 0 2.5rem 5rem 0 rgba(0, 0, 0, 0.1);
  /*background-image:url('/assets/design.png');*/
  background-size: 150%;
  background-repeat: no-repeat;
  width: 100%;
  height: auto;
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





