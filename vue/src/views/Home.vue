<template>
  <div class="home" style="background-color: white">
    <center> <h1>Welcome to the Tournament of Champions </h1> </center>
    <center> <h2> Compliments of team:</h2><h2 style="color: blue">"internal server error!" </h2></center>
    <center><h3>Please select from the options above...</h3></center>
 
  </div>
</template>

<script>
export default {
  name: "home"
};
</script>

<style scoped>
.home {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  max-width: 1400px;
  padding: 8px 8px 8px 8px;
  margin: 0 auto;
  color: #0072ce;
}

h2{
  color:#282828;
}

h3{
  color: #282828;
}

</style>