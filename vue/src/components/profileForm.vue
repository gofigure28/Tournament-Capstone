<template>
  <div class="player-profile">
    <head>
      <h2>Player's Profile</h2>
    </head>

    <body class="profile">
      <header></header>

      <main id="main-grid">
        <h1 id="headline">xXENCOR3Xx</h1>

        <div class="profile-info">
          <img class="prof-pic" src="/assets/profile.png" alt="Profile Pic" />
          <div class="profile-details">
          <p>
            <strong>Contact Info</strong> <br />
            <strong>Name:</strong> Latrell Spenceer<br />
            <strong>Email:</strong> lspencer@usermail.com<br />
          </p>
        </div>
        
        </div>
        <div class="player-quote">
          <h4>Player Quote <br /></h4>
            <i
              >I needed to be broken. Because the moment when you’re broken is the moment when you can see what’s really happening.</i
            >
          
        </div>
        

        

        <div id="experience-grid">
          <div id="profile-teams">
            <h3><i class="teams"></i> Teams</h3>
            <div name="" id="">
              
              <button value="team1">Invisible Unicorns</button>
              <button value="team2">Cereal Killers</button>
              <button value="team3">Dad Jokes</button>
              <button value="team4">Definitely Not Drunk</button>
            </div>
          </div>
          <div id="profile-tourns">
            <h3><i class="tourns"></i> Tournaments</h3>
            <div name="" id="">
              
              <button value="tourn1">Top Golf Invitational</button>
              <button value="tourn2">Blackout 7s</button>
              <button value="tourn3">Pitch a Tent</button>
              <button value="tourn4">Buzzed Pool</button>
            </div>
          </div>
          <div id="profile-ranks">
            <h3><i class="rankings"></i> Rankings</h3>
            <div name="" id="">
              
              <button value="rank1">Golf - #56343463</button>
              <button value="rank2">Pool - #23345234</button>
              <button value="rank3">Basketball - #350584308</button>
            </div>
          </div>
          <div id="profile-matches">
            <h3><i class="matches"></i>Matches</h3>
            <div name="" id="">
              
              <button value="match1">Invisible Unicorns</button>
              <button value="match2">Cereal Killers</button>
              <button value="match3">Dad Jokes</button>
              <button value="match4">Definitely Not Drunk</button>
            </div>
          </div>
        </div>
      </main>
      <footer>
        <p></p>
      </footer>
    </body>
  </div>
</template>


<script>
export default {};
</script>

<style>

#experience-grid {
  min-height: 100%;
  display: flex;
  flex-wrap: wrap;
  flex-direction: row;
  justify-content: space-between;
  margin: 20px;
}
#experience-grid > div {
  display: flex; 
  flex-basis: calc(50% - 40px);  
  justify-content: center;
  flex-direction: column;
}
#experience-grid> div > div {
  display: flex;
  justify-content: space-between;
  flex-direction: row;
  padding: 10px;
  margin: 10px;
}

.profile-info{
  display: flex;
  flex-direction: row;
  padding: 20px;
}

.player-profile {
  display: flex;
  align-content: center;
  margin: auto;
  border-radius: 8px;
}
.prof-pic {
  border-radius: 12px;
  max-height: 220px;
  position: center;
}

.profile-details {
  display: flex;
  padding: 20px;
  line-height: 2em;
}
.player-quote {
  padding: 20px;
}

#main-grid {
  display:flex;
  flex-direction: column;
  padding: 10px 20px 10px 10px;
}
</style>