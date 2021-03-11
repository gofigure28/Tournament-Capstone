<template>
  <h1>{{this.title}}</h1>
</template>

<script>
import tournamentService from "../services/TournamentService";
export default {

    name:'tournament-card',
    data() {
        return{
            
        }
    },
    created() {
        tournamentService.getCards(this.$route.params.id).then((response) =>{
            this.title = response.data.name;
        });
    }

}
</script>

<style>

</style>S