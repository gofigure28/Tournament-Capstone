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
    <button class= "save" type='submit'>Save</button>
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

form.new-match-form {
  display: flex;
  flex-direction: column;
align-items: center;
  width: 100%;
  max-width: 1200px;
  padding: 8px 8px 8px 8px;
  border-radius: 8px;
  margin: 0 auto;
  color: #0072ce;
}
.new-match-form .sr-only{
  padding: 8px 0px 8px 0px;
  margin: auto;
}

form input{
  border: 1px solid black;
  border-radius: 8px;
  height: 40px;
  width: 60%;
  margin: auto;
}

button.save {
  padding: 10px 20px;
  max-width: 200px;
  margin-top:20px;
  margin-bottom: 20px;
  color: #fff;
  background-color: #0072ce;
  border-radius: 4px;
  font-size: 14px;
  cursor: pointer;
}

</style>