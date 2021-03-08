

<template>
<div>
    <div nav_tournaments>
    <router-link v-bind:to="{ name: 'Create a Tournament' }">Create Tournament</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'Browse Tournaments' }">Browse a Tournament</router-link>&nbsp;|&nbsp;
    </div>
</div>

</template>





<script>
import Tournament from '@/components/TournamentDetail';

export default {
    components: {
        TournamentDetail
    }
};
</script>










<style>
</style>