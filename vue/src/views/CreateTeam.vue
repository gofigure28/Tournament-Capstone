
<template>
  <div>
    <div class="top"></div>
    <TeamForm
      @on-item-selected="setPlayer"
      @on-item-reset="dropdownSelection = {}"
    />
    {{ dropdownSelection.name }}
    <div class="box">
      <input v-on:blur="saveName" type="text" placeholder="Team name" required />
    </div>
      <div v-for="member in teamList.members" :key="member.id">
        <user-name-card :username="member.username" />
     </div>
        <div class="bottom">
      Team Name: {{ teamList.name }}
    </div>
    <button type="button" v-on:click.prevent="commit">Create Team</button> 
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
.box {
  margin-top: 20px;
  height: 40px;
  display: flex;
  justify-content: center;
  background-color: rgb(174, 236, 255);
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