<template>

  <div>
    <center><h2>Player's Profile</h2></center>
    <head>
      <meta charset="UTF-8" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <meta http-equiv="X-UA-Compatible" content="ie=edge" />
      <title>Student Profile</title>
      
      <link class = "student_picture"
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
          <img src="/assets/profile.png" alt="Profile Pic" />
        </div>
        <div id="player-quote" class="player-quote">
          <h2>
           <i>Repersenting Team internal server error, I pride myself in taking down the best of the best. COME GET YOU SOME!!!!</i>
          </h2>
        </div>

    

        <div id="player-contact" class="profile-details">
            
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
        <p>Copyright: team InternalServerError, 2021 &copy;</p>
      </footer>
    </body>
  </div>
</template>


<script>
export default {};
</script>

<style>
.student_picture{
  border-radius:25px;
  position: center;
}

.profile-details{
  display: flex;
  padding: 20px;
  line-height: 2em;
}


</style>


/*

thought a form made sense, but this just broke the page 
<form class="ui form" @submit.prevent="updateProfile">
          <div class="field" :class="{ error: errors.has('name') }">
            <label>Full Name</label>
            <input type="text" name="name" v-model="name" v-validate="'required'">
            <span v-show="errors.has('name')" class="is-danger">{{ errors.first('name') }}</span>
          </div>

          <div class="field" :class="{ error: errors.has('name') }">
            <label>Username</label>
            <input type="text" name="username" v-model="username" v-validate="'required'">
            <span v-show="errors.has('username')" class="is-danger">{{ errors.first('username') }}</span>
          </div>

          <div class="field" :class="{ error: errors.has('email') }">
            <label>Email</label>
            <input type="email" name="email" v-model="email" v-validate="'required|email'" placeholder="Email">
            <span v-show="errors.has('email')" class="is-danger">{{ errors.first('email') }}</span>
          </div>

          <div class="field">
            <label>Bio</label>
            <textarea v-model="bio" rows="5" placeholder="A breif bio of you"></textarea>
          </div>

          <div class="field">
            <label>Location</label>
            <input type="text" v-model="location" placeholder="Your location">
          </div>

          <div class="field">
            <label>Website URL</label>
            <input type="url" v-model="websiteUrl" placeholder="Website URL">
          </div>

          <button class="ui button primary">Update profile</button>
        </form>*/


