<template>
<div class="head">
    <h1>Browse all tournaments</h1>
    <tournament-list/>
</div>
  
</template>

<script>

export default {
    name: "tournament-list",
    data(){
        return{
            Tournament=Detail: {
                tournament_name: "",
                tournament_id: "",
                number_of_participants: ""
                
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