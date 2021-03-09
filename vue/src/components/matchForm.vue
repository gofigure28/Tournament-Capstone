<template>
  <form class="new-match-form" v-on:submit.prevent="saveTournament">
    <input class="name-input" type="text" placeholder="Name" v-model="match.name" />
    <input class="starting-time-input" type="text" placeholder="Starting Time" v-model="match.startingTime" />
    <input class="number-of-players-input" type="number" placeholder="Number of Players" v-model="match.numberOfPlayers" />
    <button>Save</button>
  </form>
</template>
<script>
export default {
    name: "match-form",
    data() {
        return {
            match: {
                name: '',
                match: '',
                startingTime: '',
                numberOfPlayers: ''
            }
        }
    },
    methods: {
        saveMatch() {
            this.$store.commit('SAVE_MATCH', this.match);
            this.book = {
                name: '',
                match: '',
                startingTime: '',
                numberOfPlayers: ''
            };
            this.$router.push({path: 'createMatch'})
        },
    }
}
</script>
<style>
button {
  padding: 10px 20px;
  border: 1px solid #ddd;
  color: #fff;
  background-color: #0072ce;
  border-radius: 4px;
  font-size: 14px;
  cursor: pointer;
}

input {
  display: flex;
  justify-content: center;
  align-items: center;
  border: 1px solid black;
  border-radius: 8px;
  height: 40px;
  margin: 20px;
}

</style>