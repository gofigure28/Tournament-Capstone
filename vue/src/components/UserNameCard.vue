<template>
    <div>
        <div class ="card">
            <center>
                <h3>
                    {{users.username}}
                </h3>
            </center>
        </div>
    </div>
  
</template>

<script>
export default {
    name: 'name-card',
    components: {},
    props: ["users"]

}
</script>

<style>
.card{
    font-family:Verdana, Geneva, Tahoma, sans-serif;
    background-color: #d0f7ff;
    margin:auto;

}

</style>