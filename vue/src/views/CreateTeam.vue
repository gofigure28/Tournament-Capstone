
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
      <div>
        {{ teamList.members.username }}
     </div>
    <AddTeamForm />
        <div>
      Team Name: {{ teamList.name }}
    </div>
  </div>
</template>

<script>
import TeamForm from "@/components/TeamForm.vue";
import AddTeamForm from "../components/AddTeamForm.vue";
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
    AddTeamForm,
  },
  methods: {
    saveName(event) {
      this.teamName = event.target.value;
      this.teamList.name = event.target.value;
    },
    saveMembers(members) {
      this.teamList.members.push(members.target);
    },
    commit(team) {
      this.$store.commit("STORE_INVITED", team);
    },
    setPlayer(event) {
      this.teamList.members.push(event);
    },
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