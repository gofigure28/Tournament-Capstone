
<template>
  <div>
    <div class="top">
    </div>
    <TeamForm @on-item-selected="dropdownSelection = $event" @on-item-reset="dropdownSelection = {}" />
    
    <!-- The selected country name will be visible below, when selected -->
    {{ dropdownSelection.name }} 
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

    AddTeamForm<style>

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