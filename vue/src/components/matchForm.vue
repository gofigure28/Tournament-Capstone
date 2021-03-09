<template>
 <form class="new-match-form" v-on:submit.prevent="saveMatch">
    <label for="name-input" class="sr-only">Match Name</label>
    <input
      class="name-input"
      type="text"
      placeholder="Name"
      v-model="match.name"
    />
    <label for="starting-time-input" class="sr-only">Start Time</label>
    <input
      class="starting-time-input"
      type="time"
      placeholder="Starting Time"
      v-model="match.startingTime"
    />
   <label for="starting-date-input" class="sr-only">Start Date</label>
    <input
      class="starting-date-input"
      type="date"
      placeholder="Starting Date"
      v-model="match.startingDate"
    />
    <label for="numper-of-players-input" class="sr-only"># of Players</label>
    <input
      class="number-of-players-input"
      type="number"
      placeholder="Number of Players"
      v-model="match.numberOfPlayers"
    />
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
.new-match-form {
  display: flex;
  flex-direction: column;
  width: 100%;
  max-width: 1200px;
  padding: 8px 8px 8px 8px;
  margin: 0 auto;
  color: #0072ce;
}

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