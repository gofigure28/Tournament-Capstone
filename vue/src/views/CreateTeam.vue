
<template>
  <div>
    <div class="top">
    </div>
    <TeamForm @on-item-selected="dropdownSelection = $event" @on-item-reset="dropdownSelection = {}" />
    
    <!-- The selected country name will be visible below, when selected -->
    {{ dropdownSelection.name }} 
    <div class="box">
      <input type="text" placeholder = "Team name"/>
      
    </div>
    <AddTeamForm/>
  </div>

</template>

<script>
import TeamForm from '@/components/TeamForm.vue'
import AddTeamForm from '../components/AddTeamForm.vue'
export default {
  data () {
    return {
      dropdownSelection: {}
    }
  },
  components: {
    TeamForm,
    AddTeamForm
  }
}
</script>

<style>
.box{
  margin-top: 20px;
  height: 40px;
  display:flex;
  justify-content: center;
  background-color:ivory;
  box-shadow:none;
}

center{
  height:100
}

.bottom{
  display:flex;
}

.top{
  height:50px;
}

</style>