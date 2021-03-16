
<template>
  <div>
    <div class="top">
    </div>
    <TeamForm @on-item-selected="dropdownSelection = $event" @on-item-reset="dropdownSelection = {}" />
    
    <!-- The selected country name will be visible below, when selected -->
    {{ dropdownSelection.name }} 
      <div class="bottom">
  </div>
    
  </div>

</template>

<script>
import TeamForm from '@/components/TeamForm.vue'
export default {
  data () {
    return {
      dropdownSelection: {}
    }
  },
  components: {
    TeamForm
  }
}
</script>
<style>

center{
  height:100
}

.bottom{
  height:500px;
}

.top{
  height:5rem;
}

</style>