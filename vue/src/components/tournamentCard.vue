<template>
    <div>
      <div class = "card"  v-on:click.prevent="send">
          <div class="content">
          <h2>title: {{tournament.name}}</h2>
          <h3>starting time: {{tournament.startTime}}</h3>
          </div>
     </div>
    </div>
</template>

<script>
export default {
    name: 'tournament-card',
    components: { },
    props: ["tournament"],
    methods: {
        send(){
            this.$router.push("/createTeam");
        }
    }
    }
</script>

<style scoped>
.content{
    margin-left:20px;
}

.card{
    font-family:Verdana, Geneva, Tahoma, sans-serif;
    display:flex;
    background-color: #d0f7ff;
    border-radius: 10px;
    margin-top: 10px;
    margin-bottom: 10px;
    vertical-align: middle;
    flex-direction: row;
}

h2{
    display:flex;

}

h1{
    background-color:lightblue;
}


</style>