<template>
  <form class="new-tournament-form" v-on:submit.prevent="saveTournament">
    <input
      class="name-input"
      type="text"
      placeholder="Name"
      v-model="tournament.name"
    />
    <input
      class="starting-time-input"
      type="time"
      placeholder="Starting Time"
      v-model="tournament.startingTime"
    />
    <input
      class="starting-date-input"
      type="date"
      placeholder="Starting Date"
      v-model="tournament.startingDate"
    />
    <input
      class="number-of-players-input"
      type="number"
      placeholder="Number of Players"
      v-model="tournament.numberOfPlayers"
    />
    <button class= "button" type='submit'>Save</button>
  </form>
</template>
<script>
export default {
  name: "tournament-form",
  data() {
    return {
      tournament: {
        name: "",
        startingTime: "",
        startingDate: "",
        numberOfPlayers: "",
      },
    };
  },
  methods: {
    saveTournament() {
      this.$store.commit("SAVE_TOURNAMENT", this.tournament);
      this.book = {
        name: "",
        startingTime: "",
        startingDate: "",
        numberOfPlayers: "",
      };
      this.$router.push({ path: "createTournament" });
    },
  },
};

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