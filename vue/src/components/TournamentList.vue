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
            Tournament: {
                tournament_name: "",
                tournament_id: "",
                number_of_participants: ""
                
            }
            
        }
    },
 

}
</script>

<style>

</style>