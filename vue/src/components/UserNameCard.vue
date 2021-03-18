<template>
    <div>
        <div class ="card">
            <center>
                <h3>
                    {{username}}
                </h3>
            </center>
        </div>
    </div>
  
</template>

<script>
export default {
    name: 'name-card',
    components: {},
    props: ["username"]

}
</script>

<style>
.card{
    font-family:Verdana, Geneva, Tahoma, sans-serif;
    background-color: #73d5e9;
    margin:auto; 
    border-radius:6px;

}

h3{
      text-decoration: none;
  color: #0072ce;
    font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
  height:35px;
  font-size:20px;
  padding-top:5px;
}

</style>