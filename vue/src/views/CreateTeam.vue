
<template>
  <div class="main">
    <div class="top">
      <h2> Create a team </h2>
    </div>
    <label for="name-input" class="sr-only">Search users</label>
    <TeamForm
      @on-item-selected="setPlayer"
      @on-item-reset="dropdownSelection = {}"
    />
    {{ dropdownSelection.name }}
    <label for="name-input" class="sr-only">Team name</label>
    <div class="box">
      <input class="inputbox" v-on:blur="saveName" type="text" required />
    </div>
    <div class="head">
      <h2> Selected Users </h2>
    </div>
      <div v-for="member in teamList.members" :key="member.id">
        <user-name-card :username="member.username" />
     </div>
        <div class="bottom">
    </div>
    <div class="create" v-on:click.prevent="commit">
    <button type="button">
      <p>Create Team</p>
    </button> 
    </div>
  </div>
</template>

<script>
import TeamForm from "@/components/TeamForm.vue";
import TeamService from "@/services/TeamService.js";
//import AddTeamForm from "../components/AddTeamForm.vue";
import UserNameCard from '../components/UserNameCard.vue';
export default {
  data() {
    return {
      dropdownSelection: {},
      teamList: {
        members: [],
        name: "",
      },
      teamName: "",
    };
  },

  components: {
    TeamForm,
    //AddTeamForm,
    UserNameCard,
  },
  methods: {
    saveName(event) {
      this.teamName = event.target.value;
      this.teamList.name = event.target.value;
    },
    saveMembers(members) {
      this.teamList.members.push(members.target);
    },
    commit() {
      this.$store.commit("STORE_INVITED", this.teamList.members);
      this.$store.commit("NEW_TEAM", this.teamList.name);
      this.$router.push("/bracketPage");
    },
    setPlayer(event) {
      this.teamList.members.push(event);
    },
        joinTournament() {
      TeamService.sendUserList().then((response) =>{
      if(response === 201){
      this.$router.push("/bracketPage");
      }
      }).catch(error =>{
      console.log(error);
      this.$router.push("/bracketPage");
      })
    }
  },
};
</script>

<style>
.head{
     display:flex;
  padding: 10px 20px;
  width: 100%;
  margin-bottom: 10px;
  color: #0072ce;
  background-color: #d0f7ff;
  border-radius: 4px;
  justify-content:center;
  font-size: 18px;
  cursor: pointer;
  margin-top:100px;
  margin-bottom:20px;
  border-radius: 8px;
}

h2{
  text-align:center;
  font-size: 16px;
}

.main{
  padding:8px 8px 8px 8px;
}

.inputbox{
  padding: 20px 20px 20px 20px;
}

.dropdown{
  z-index:+1;
}

label{
    display: flex;
  flex-direction: column;
  align-items: center;  
  width: 100%;
  max-width: 1200px;
  padding: 8px 8px 8px 8px;
  border-radius: 80px;
  margin: 0 auto;
  color: #0072CE;
}
.create{
    display:flex;
  padding: 10px 20px;
  width: 100%;
  margin-bottom: 10px;
  color: #0072ce;
  background-color: #d0f7ff;
  border-radius: 4px;
  justify-content:center;
  font-size: 18px;
  cursor: pointer;
  margin-top:100px;
  margin-bottom:100px;
  border-radius: 8px;

}

.create:hover{
  background-color: #a9d6ff;
}

.inputbox{
    position: relative;
  width: 100%;
  max-width: 400px;
  margin: 0 auto;
  border:none;
  height: 100%;
}

.box {
  margin-top: 5px;
  height: 50px;
  display: flex;
  justify-content: center;
  background-color: #eff9ff;
  box-shadow: none;
}

center {
  height: 100;
}

.bottom {
  display: flex;
}

.top {
  height: 50px;
}
</style>