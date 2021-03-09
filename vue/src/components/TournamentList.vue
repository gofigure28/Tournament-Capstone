<template>
<div class="head">
    <h1>Browse all tournaments</h1>
</div>
  
</template>

<script>
import tournamentServices from '../services/TournamentService'
export default {
    name: "tournament-list",
    data(){
        return{
            tournamentList: {
                name: '',
                
            }
            
        }
    },

    methods: {
        getTournaments() {
            tournamentServices.addTournament(this.tournamentList)
            .then((response) => {
                if(response.status === 200) {
                    this.$store.commit("SAVE_TOURNAMENT" , response.data.tournament);
                }
            }) 


        }
    }

}
</script>

<style>

</style>