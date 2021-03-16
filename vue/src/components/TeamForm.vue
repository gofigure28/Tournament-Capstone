
<template>
  <div class="dropdown">
    <input
      v-model.trim="inputValue"
      class="dropdown-input"
      type="text"
      placeholder="Select Player"
    />
    <div v-for="item in itemList" :key="item.name" class="dropdown-item">
  <img :src="item.flag class="dropdown-item-flag"/>
  {{ item.name }}
</div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  data () {
    return {
      inputValue: '',
      userList: [],
      apiLoaded: false,
      apiUrl: '../components/AllUsers'
    }
  },
  mounted () {
    this.getList()
  },
  methods: {
    getList () {
      axios.get(this.apiUrl).then( response => {
        this.userList = response.data
        this.apiLoaded = true
      })
    },
     createTeam() {
          {
              teamID: Number(this.$route.params.teamID);
              teamName: this.teamname.title;
              addPlayer() {
                this.$store.commit('SET_USER', this.user);
                this.userList = {
                  users: ''};
                this.$router.push({path: 'createTeam'})
                 
              }


              const newTeamID 
          = this.teamID;
          //create teamID
          //create team name

          //add current user to team
          //input & add other users
          

      };
     }

}
};

</script>

<style>
.dropdown {
  position: relative;
  width: 100%;
  max-width: 400px;
  margin: 0 auto;
}
.dropdown-input {
  width: 100%;
  padding: 10px 16px;
  border: 1px solid transparent;
  background: #edf2f7;
  line-height: 1.5em;
  outline: none;
  border-radius: 8px;
}
.dropdown-input:focus {
  background: #fff;
  border-color: #e2e8f0;
}
.dropdown-input::placeholder {
  opacity: 0.7;
}
</style>
