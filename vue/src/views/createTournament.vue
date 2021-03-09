
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

  methods: {},
};

</script>
<style>
tournament-form {
  display: flex;
  flex-direction: column;
  width: 100%;
  max-width: 1200px;
  padding: 8px 8px 8px 8px;
  margin: 0 auto;
  color: #0072ce;
}
h1{
  padding: 12px;
  margin: auto;
}
</style>