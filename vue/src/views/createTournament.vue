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
  font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif;
  margin: auto;
  text-shadow:5px 5px 5px  rgb(150, 150, 150);
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