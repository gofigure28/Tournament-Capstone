
<template>
  <div>
   <center><h1>Create A New Tournament</h1></center> 
 <tournament-form/>

     
  </div>
</template>
 


<script>
import tournamentForm from '../components/tournamentForm'

export default {
  components: {tournamentForm},

  methods: {
    
  },
};

</script>
<style>

h1{
  padding: 12px;
  margin: auto;
}
</style>