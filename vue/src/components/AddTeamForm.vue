<template>
<div>
    <div class ="head">
                  Selected Users
    </div> 
    <div class= "actual">
        <NameCard 
            v-for="user in $store.state.users"
            v-bind:key="user.username"
            v-bind:user="user"/>
    </div>

 
</div>
</template>

<script>
import userService from "../services/UserService.js";
import NameCard from '@/components/UserNameCard'
export default {
    components: {
        NameCard
    },
    name: "add-team-form",
    created() {
        userService.getAllUsers().then((resp) => {
        this.$store.commit('STORE_USERS', resp.data);
        })
    },
    props: ["username"]

}
</script>

<style>
.box{
    display:flex;
    height:200px;
    margin: 200px 25px 40px 25px;
    background-color:rgb(139, 189, 255);
    box-shadow: 7px 7px #9e9e9e;
}

.head{
    margin-top: 200px;
    width:100%;
    height: 3rem;
    background-color:#b1e9ff;
    align-items:center;
}

.text{
    font-family:'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
    font-size: 17px;
    display:flex;
    margin-left: 10px;
    height: 3rem;
}

.button {
    display: flex;
    background-color:rgb(174, 236, 255);
    margin: auto;
    margin-bottom: 20px;
    margin-top: 20px;
    width: 8rem;
    justify-content:center;
    font-size:12px;
    height: 20px;
}
</style>