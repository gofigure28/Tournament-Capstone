<template>
<div class="head">
    <h1>Browse all tournaments</h1>
    <tournament-list/>
</div>
  
</template>

<script>
import tournamentList from '../components/TournamentList';
export default {
    name: "tournament-list",
    data(){
        return{
            tournamentList: {
                name: '',
                
            }
            
        }
    },
    component: {
        tournamentList
    },

    methods: {
    }

}
</script>

<style>

</style>