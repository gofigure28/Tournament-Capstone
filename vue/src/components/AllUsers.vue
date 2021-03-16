
<template>
  <div>
    <DropdownList @on-item-selected="dropdownSelection = $event" @on-item-reset="dropdownSelection = {}" />
    
    <!-- The selected player name will be visible below, when selected -->
    {{ dropdownSelection.name }} 
    
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
