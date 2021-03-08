<template>
  <form class="new-tournament-form" v-on:submit.prevent="saveTournament">
    <input class="name-input" type="text" placeholder="Name" v-model="tournament.name" />
    <input class="starting-time-input" type="text" placeholder="Starting Time" v-model="tournament.startingTime" />
    <input class="number-of-players-input" type="number" placeholder="Number of Players" v-model="tournament.numberOfPlayers" />
    <button>Save</button>
  </form>
</template>
<script>
export default {
    name: "tournament-form",
    data() {
        return {
            tournament: {
                name: '',
                match: '',
                startingTime: '',
                numberOfPlayers: ''
            }
        }
    },
    methods: {
        saveTournament() {
            this.$store.commit('SAVE_TOURNAMENT', this.tournament);
            this.book = {
                name: '',
                match: '',
                startingTime: '',
                numberOfPlayers: ''
            };
            this.$router.push({path: 'createTournament'})
        },
    }
}
</script>
<style>

</style>