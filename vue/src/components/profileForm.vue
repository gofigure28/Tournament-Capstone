<template>
  <div>
    <center><h2>Player's Profile</h2></center>
    <head>
      <meta charset="UTF-8" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <meta http-equiv="X-UA-Compatible" content="ie=edge" />
      <title>Player's Profile</title>
      <link
        rel="stylesheet"
        href="https://use.fontawesome.com/releases/v5.4.1/css/all.css"
        integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz"
        crossorigin="anonymous"
      />
      <link
        href="https://fonts.googleapis.com/css?family=Roboto+Slab"
        rel="stylesheet"
      />
      <link rel="stylesheet" href="style.css" />
      <link rel="stylesheet" href="grid.css" />
    </head>

    <body>
      <header>
     
      </header>

      <main id="main-grid">
        <h1 id="headline">xXENCOR3Xx</h1>

        <div id="student-picture">
          <img src="/assets/profile.png" alt="Student Image" />
        </div>
        <div id="student-quote" class="student-gray">
          <h2>
           <i>Repersenting Team internal server error, I pride myself in taking down the best of the best. COME GET YOU SOME!!!!</i>
          </h2>
        </div>

    

        <div id="student-contact" class="student-gray italic-text">
            
          <p>
            Contact Info <br>
            Get You Some | Charlotte,NC<br />
            teamInternalServerError@gamermail.com<br />
            Dial 1-900-MIX-A-LOT
          </p>
        </div>

        <div id="experience-grid">
          <div id="experience-code">
            <h3><i class="fas fa-code"></i> Teams</h3>
            <select name="" id="">Teams</select>
      
          </div>
          <div id="experience-database">
            <h3><i class="fas fa-database"></i> Tournaments</h3>
            <select name="" id=""> Tournaments</select>
          </div>
          <div id="experience-web">
            <h3><i class="fas fa-info"></i> Rankings</h3>
            <select name="" id=""> Rankings</select>
          </div>
          <div id="experience-design">
            <h3><i class="fas fa-palette"></i> Matches</h3>
             <select name="" id=""> Rankings</select>
          </div>
        </div>
      </main>
      <footer>
        <p>Copyright: teamInternalServerError, 2021 &copy;</p>
      </footer>
    </body>
  </div>
</template>


<script>
export default {};
</script>

<style>
.student-picture{
  border-radius:8px;
}
</style>