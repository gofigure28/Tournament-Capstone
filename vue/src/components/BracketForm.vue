<template>
  <div>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="viewport" content="width=device-width,initial-scale=1.0" />
    <link
      href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
      rel="stylesheet"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Holtwood+One+SC"
      rel="stylesheet"
      type="text/css"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Kaushan+Script|Herr+Von+Muellerhoff"
      rel="stylesheet"
      type="text/css"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Abel"
      rel="stylesheet"
      type="text/css"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Istok+Web|Roboto+Condensed:700"
      rel="stylesheet"
      type="text/css"
    />

    <title>Tournament Bracket</title>

    <body>
      <header class="hero">
        <div class="hero-wrap">
          <center><h1 id="headline">The Winners Cup</h1></center>
        </div>
      </header>
      &nbsp;
      <div class="t-button-div">
        <div></div>
        &nbsp;
        <button class="t-button">
          <router-link
            class="t-routerlink"
            color="#0072ce"
            v-bind:to="{ name: 'createTeam' }"
          >
            <h4>Add Team To Bracket</h4>
          </router-link>
        </button>
      </div>
       &nbsp;
      <section id="bracket">
        <div class="container">
          <div class="split split-one">
            <div class="round round-one current">
              <div class="round-details">
                Round 1<br /><span class="date">3/17/2021</span>
              </div>
              <!-- First Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top">
                  {{ $store.state.teamName }} <span></span>
                </li>

                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team2Name }}
                </li>
              </ul>

              <!-- Second Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team3Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team4Name }} <span></span>
                </li>
              </ul>

              <!-- Third Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team5Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team6Name }} <span></span>
                </li>
              </ul>

              <!-- Fourth Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team7Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team8Name }} <span></span>
                </li>
              </ul>

              <!-- Fifth Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team9Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team10Name }} <span></span>
                </li>
              </ul>

              <!-- Sixth Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team11Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team12Name }} <span></span>
                </li>
              </ul>
              <!-- Seventh Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team13Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team14Name }} <span></span>
                </li>
              </ul>

              <!-- Eight Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team15Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team16Name }} <span></span>
                </li>
              </ul>
            </div>

            <!-- END ROUND ONE -->

            <div class="round round-two">
              <div class="round-details">
                Round 2<br /><span class="date">3/24/2021</span>
              </div>
              <ul class="matchup">
                <li class="team team-top">&nbsp;<span>&nbsp;</span></li>

                <li class="team team-bottom">&nbsp;<span>&nbsp;</span></li>
              </ul>
              <ul class="matchup">
                <li class="team team-top">&nbsp;<span>&nbsp;</span></li>
                <li class="team team-bottom">&nbsp;<span>&nbsp;</span></li>
              </ul>
              <ul class="matchup">
                <li class="team team-top">&nbsp;<span>&nbsp;</span></li>
                <li class="team team-bottom">&nbsp;<span>&nbsp;</span></li>
              </ul>
              <ul class="matchup">
                <li class="team team-top">&nbsp;<span>&nbsp;</span></li>
                <li class="team team-bottom">&nbsp;<span>&nbsp;</span></li>
              </ul>
            </div>
            <!-- END ROUND TWO -->

            <div class="round round-three">
              <div class="round-details">
                Round 3<br /><span class="date">3/31/2021</span>
              </div>
              <ul class="matchup">
                <li class="team team-top">&nbsp;<span>&nbsp;</span></li>
                <li class="team team-bottom">&nbsp;<span>&nbsp;</span></li>
              </ul>
              <ul class="matchup">
                <li class="team team-top">&nbsp;<span>&nbsp;</span></li>
                <li class="team team-bottom">&nbsp;<span>&nbsp;</span></li>
              </ul>
            </div>
            <!-- END ROUND THREE -->
          </div>

          <div class="champion">
            <div class="semis-l">
              <div class="round-details">
                WEST semifinals <br /><span class="date">4/1/2021</span>
              </div>
              <ul class="matchup championship">
                <li class="team team-top">
                  &nbsp;<span class="vote-count">&nbsp;</span>
                </li>
                <li class="team team-bottom">
                  &nbsp;<span class="vote-count">&nbsp;</span>
                </li>
              </ul>
            </div>

            <div class="final">
              <i class="fa fa-trophy"></i>
              <div class="round-details">
                WINNER'S CUP <br /><span class="date">4/8/2021</span>
              </div>

              <ul class="matchup championship">
                <li class="team team-top">
                  &nbsp;<span class="vote-count">&nbsp;</span>
                </li>
                <li class="team team-bottom">
                  &nbsp;<span class="vote-count">&nbsp;</span>
                </li>
              </ul>
            </div>
            <div class="semis-r">
              <div class="round-details">
                EAST semifinals <br /><span class="date">4/1/2021</span>
              </div>
              <ul class="matchup championship">
                <li class="team team-top">
                  &nbsp;<span class="vote-count">&nbsp;</span>
                </li>
                <li class="team team-bottom">
                  &nbsp;<span class="vote-count">&nbsp;</span>
                </li>
              </ul>
            </div>
          </div>

          <div class="split split-two">
            <div class="round round-three">
              <div class="round-details">
                Round 3<br /><span class="date">3/31/2021</span>
              </div>
              <ul class="matchup">
                <li class="team team-top">&nbsp;<span>&nbsp;</span></li>
                <li class="team team-bottom">&nbsp;<span>&nbsp;</span></li>
              </ul>
              <ul class="matchup">
                <li class="team team-top">&nbsp;<span>&nbsp;</span></li>
                <li class="team team-bottom">&nbsp;<span>&nbsp;</span></li>
              </ul>
            </div>
            <!-- END ROUND THREE -->

            <div class="round round-two">
              <div class="round-details">
                Round 2<br /><span class="date">3/24/2021</span>
              </div>
              <ul class="matchup">
                <li class="team team-top">&nbsp;<span>&nbsp;</span></li>
                <li class="team team-bottom">&nbsp;<span>&nbsp;</span></li>
              </ul>
              <ul class="matchup">
                <li class="team team-top">&nbsp;<span>&nbsp;</span></li>
                <li class="team team-bottom">&nbsp;<span>&nbsp;</span></li>
              </ul>
              <ul class="matchup">
                <li class="team team-top">&nbsp;<span>&nbsp;</span></li>
                <li class="team team-bottom">&nbsp;<span>&nbsp;</span></li>
              </ul>
              <ul class="matchup">
                <li class="team team-top">&nbsp;<span>&nbsp;</span></li>
                <li class="team team-bottom">&nbsp;<span>&nbsp;</span></li>
              </ul>
            </div>
            <!-- END ROUND TWO -->
            <div class="round round-one current">
              <div class="round-details">
                Round 1<br /><span class="date">3/17/2021</span>
              </div>
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team2Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team2Name }} <span></span>
                </li>
              </ul>

              <!-- Second Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team3Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team4Name }} <span></span>
                </li>
              </ul>

              <!-- Third Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team5Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team6Name }} <span></span>
                </li>
              </ul>

              <!-- Fourth Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team7Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team8Name }} <span></span>
                </li>
              </ul>

              <!-- Fifth Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team9Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team10Name }} <span></span>
                </li>
              </ul>

              <!-- Sixth Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team11Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team12Name }} <span></span>
                </li>
              </ul>
              <!-- Seventh Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top" v-on:click.prevent="send">
                  {{ game.team13Name }} <span></span>
                </li>
                <li class="team team-bottom" v-on:click.prevent="send">
                  {{ game.team14Name }} <span></span>
                </li>
              </ul>

              <!-- Eight Set of teams-->
              <ul
                class="matchup"
                v-for="game in games"
                v-bind:key="game.gameId"
              >
                <li class="team team-top">
                  {{ game.team15Name }} <span></span>
                </li>
                <li class="team team-bottom">
                  {{ game.team16Name }} <span></span>
                </li>
              </ul>
            </div>
            <!-- END ROUND ONE -->
          </div>
        </div>
      </section>
    </body>
  </div>
</template>

<script>
export default {
  data() {
    return {
      teamList: ["team 1"],
    };
  },
  props: ["teamName"],
  methods: {
    send(){
      this.$router.push("/createTeam");
    }
  },

  computed: {
    games: function () {
      return [
        {
          team1Name: "",
          team2Name: "ADD TEAM",
          gameId1: 7,

          team3Name: "ADD TEAM",
          team4Name: "ADD TEAM",
          gameId2: 8,

          team5Name: "ADD TEAM",
          team6Name: "ADD TEAM",
          gameId3: 9,

          team7Name: "ADD TEAM",
          team8Name: "ADD TEAM",
          gameId4: 10,

          team9Name: "ADD TEAM",
          team10Name: "ADD TEAM",
          gameId5: 11,

          team11Name: "ADD TEAM",
          team12Name: "ADD TEAM",
          gameId6: 15,

          team13Name: "ADD TEAM",
          team14Name: "ADD TEAM",
          gameId7: 3,

          team15Name: "ADD TEAM",
          team16Name: "ADD TEAM",
          gameId8: 5,
        },
      ];
    },
  },
};
</script>

<style scoped>
body {
  font-family: "Istok Web", sans-serif;
  background: url("http://picjumbo.com/wp-content/uploads/HNCK2189-1300x866.jpg")
    no-repeat;
  background-size: cover;
  min-height: 100%;
  margin: 0;
}

#headline {
  color: white;
  font-size: 40px;
  -webkit-text-stroke-width: 2px;
  -webkit-text-stroke-color: black;
  height: 50%;
  width: 50%;
}



.hero h1 {
  font-family: "Holtwood One SC", serif;
  font-weight: normal;
  font-size: 5.4em;
  margin: 0 0 20px;
  text-shadow: 0 0 12px rgba(0, 0, 0, 0.5);
  text-transform: uppercase;
  letter-spacing: -1px;
}

.hero p {
  font-family: "Abel", sans-serif;
  text-transform: uppercase;
  letter-spacing: 6px;
  text-shadow: 0 0 12px rgba(0, 0, 0, 0.5);
  font-size: 1.2em;
}

.hero-wrap {
  padding: 3.5em 10px;
}

.hero p.intro {
  font-family: "Holtwood One SC", serif;
  text-transform: uppercase;
  letter-spacing: 1px;
  font-size: 3em;
  margin-bottom: -40px;
}

.hero p.year {
  color: #fff;
  letter-spacing: 20px;
  font-size: 34px;
  margin: -25px 0 25px;
}

.hero p.year i {
  font-size: 14px;
  vertical-align: middle;
}

#bracket {
  overflow: hidden;
  background-color: #e1e1e1;
  background-color: rgba(225, 225, 225, 0.9);
  padding-top: 20px;
  font-size: 10px;
  padding: 40px 0;
}

.container {
  max-width: 1100px;
  margin: 0 auto;
  display: block;
  display: -webkit-box;
  display: -moz-box;
  display: -ms-flexbox;
  display: -webkit-flex;
  display: -webkit-flex;
  display: flex;
  -webkit-flex-direction: row;
  flex-direction: row;
}

.split {
  display: block;
  float: left;
  display: -webkit-box;
  display: -moz-box;
  display: -ms-flexbox;
  display: -webkit-flex;
  display: flex;
  width: 42%;
  -webkit-flex-direction: row;
  -moz-flex-direction: row;
  flex-direction: row;
}

.champion {
  float: left;
  display: block;
  width: 16%;
  -webkit-flex-direction: row;
  flex-direction: row;
  -webkit-align-self: center;
  align-self: center;
  margin-top: -15px;
  text-align: center;
  padding: 230px 0\9;
}

.champion i {
  color: #a0a6a8;
  font-size: 45px;
  padding: 10px 0;
}

.round {
  display: block;
  float: left;
  display: -webkit-box;
  display: -moz-box;
  display: -ms-flexbox;
  display: -webkit-flex;
  display: flex;
  -webkit-flex-direction: column;
  flex-direction: column;
  width: 95%;
  width: 30.8333%\9;
}

.split-one .round {
  margin: 0 2.5% 0 0;
}

.split-two .round {
  margin: 0 0 0 2.5%;
}

.matchup {
  margin: 0;
  width: 100%;
  padding: 10px 0;
  height: 60px;
  -webkit-transition: all 0.2s;
  transition: all 0.2s;
}

.team {
  padding: 0 5px;
  margin: 3px 0;
  height: 25px;
  line-height: 25px;
  white-space: nowrap;
  overflow: hidden;
  position: relative;
}

.round-two .matchup {
  margin: 0;
  height: 60px;
  padding: 50px 0;
}

.round-three .matchup {
  margin: 0;
  height: 60px;
  padding: 130px 0;
}

.round-details {
  font-family: "Roboto Condensed", sans-serif;
  font-size: 13px;
  color: #007cee;
  text-transform: uppercase;
  text-align: center;
  height: 40px;
}

.champion li,
.round li {
  max-width: fixed;
  background-color: #fff;
  box-shadow: none;
  opacity: 0.45;
}

.current li {
  opacity: 1;
}

.current li.team {
  background-color: #fff;
  box-shadow: 0 1px 4px rgba(0, 0, 0, 0.1);
  opacity: 1;
}

.vote-options {
  display: block;
  height: 52px;
}

.share .container {
  margin: 0 auto;
  text-align: center;
}

.share-icon {
  font-size: 24px;
  color: #fff;
  padding: 25px;
}

.share-wrap {
  max-width: 1100px;
  text-align: center;
  margin: 60px auto;
}

.final {
  margin: 4.5em 0;
}

@-webkit-keyframes pulse {
  0% {
    -webkit-transform: scale(1);
    transform: scale(1);
  }

  50% {
    -webkit-transform: scale(1.3);
    transform: scale(1.3);
  }

  100% {
    -webkit-transform: scale(1);
    transform: scale(1);
  }
}

@keyframes pulse {
  0% {
    -webkit-transform: scale(1);
    -ms-transform: scale(1);
    transform: scale(1);
  }

  50% {
    -webkit-transform: scale(1.3);
    -ms-transform: scale(1.3);
    transform: scale(1.3);
  }

  100% {
    -webkit-transform: scale(1);
    -ms-transform: scale(1);
    transform: scale(1);
  }
}

.share-icon {
  color: #fff;
  opacity: 0.35;
}

.share-icon:hover {
  opacity: 1;
  -webkit-animation: pulse 0.5s;
  animation: pulse 0.5s;
}

.date {
  font-size: 10px;
  letter-spacing: 2px;
  font-family: "Istok Web", sans-serif;
  color: #3f915f;
}
.t-routerlink {
  text-decoration: none;
  color: #0072ce;
  font-family: Avantgarde, TeX Gyre Adventor, URW Gothic L, sans-serif;
}

.t-button {
  display: flexbox;
  padding: none;
  width: 50%;
  color: #d0f7ff;
  background-color: #d0f7ff;
  border-radius: 4px;
  font-size: 14px;
  cursor: pointer;
}

.t-button-div {
  display: flex;
  justify-content: center;
}
button:hover {
  background-color: #48a4f0;
  padding: 15px 35px;
  transform: scale(1.1);
}

.hero {
  background-image: url("/assets/trophy.png");
  background-repeat: no-repeat;
  background-position: center;
  padding: 0 0 180px 0;
  position: relative;
  text-align: center;
  overflow: hidden;
  color: #0072ce;
}

@media screen and (min-width: 981px) and (max-width: 1099px) {
  .container {
    margin: 0 1%;
  }

  .champion {
    width: 14%;
  }

  .split {
    width: 43%;
  }

  .split-one .vote-box {
    margin-left: 138px;
  }

  .hero p.intro {
    font-size: 28px;
  }

  .hero p.year {
    margin: 5px 0 10px;
  }
}

@media screen and (max-width: 980px) {
  .container {
    -webkit-flex-direction: column;
    -moz-flex-direction: column;
    flex-direction: column;
  }

  .split,
  .champion {
    width: 90%;
    margin: 35px 5%;
  }

  .champion {
    -webkit-box-ordinal-group: 3;
    -moz-box-ordinal-group: 3;
    -ms-flex-order: 3;
    -webkit-order: 3;
    order: 3;
  }

  .split {
    border-bottom: 1px solid #b6b6b6;
    padding-bottom: 20px;
  }

  .hero p.intro {
    font-size: 24px;
  }

  .hero h1 {
    font-size: 3em;
    margin: 15px 0;
  }

  .hero p {
    font-size: 1em;
  }
}

@media screen and (max-width: 400px) {
  .split {
    width: 95%;
    margin: 25px 2.5%;
  }

  .round {
    width: 21%;
  }

  .current {
    -webkit-flex-grow: 1;
    -moz-flex-grow: 1;
    flex-grow: 1;
  }

  .hero h1 {
    font-size: 2.15em;
    letter-spacing: 0;
    margin: 0;
  }

  .hero p.intro {
    font-size: 1.15em;
    margin-bottom: -10px;
  }

  .round-details {
    font-size: 90%;
  }

  .hero-wrap {
    padding: 2.5em;
  }

  .hero p.year {
    margin: 5px 0 10px;
    font-size: 18px;
  }
}
</style>