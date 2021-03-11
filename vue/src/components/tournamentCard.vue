<template>
    <div>
      <div class = "card">
          <center>
          <h2>title: {{tournament.name}}</h2>
          <h3>starting time: {{tournament.startTime}}</h3>
          </center>
     </div>
    </div>
</template>

<script>
export default {
    name: 'tournament-card',
    components: { },
    props: ["tournament"]

    }
</script>

<style scoped>
.card{
    font-family:Verdana, Geneva, Tahoma, sans-serif;
    display:flex;
    background-color: #d0f7ff;
    border-radius: 10px;
    margin-top: 10px;
    margin-bottom: 10px;
    vertical-align: middle;
    flex-direction: row;
    margin-left: auto;
    margin-right: auto;
}

h2{
    display:flex;

}

h1{
    background-color:lightblue;
}


</style>