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
    background-color: #d0f7ff;
    margin:auto;

}

h3{
      text-decoration: none;
  color: #0072ce;
  font-family:Avantgarde, TeX Gyre Adventor, URW Gothic L, sans-serif;
  margin-left:20px;
  height:35px;
  font-size:20px;
}

</style>