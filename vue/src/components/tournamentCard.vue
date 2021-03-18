<template>
    <div>
      <div class = "card"  v-on:click.prevent="send">
          <div class="content">
          <h2>{{tournament.name}}</h2>
          <h3> {{tournament.startTime}}</h3>
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
    display:flex;
    justify-content:space-between;
    margin-right:20px;
    font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
    margin-top:15px;

}

.card{
    font-family:Verdana, Geneva, Tahoma, sans-serif;
    display:flex;
    background-color: #d0f7ff;
    border-radius: 6px;
    margin-top: 10px;
    margin-bottom: 10px;
    vertical-align: middle;
    flex-direction: column;
    margin-left: 10px;
    margin-right: 10px;
}

h2{
    display:flex;
    font-size:15px;

}

h3{
    font-size:13px;
    text-align:center;
}

h1{
    background-color:lightblue;
}


</style>