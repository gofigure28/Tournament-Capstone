BEGIN TRANSACTION;

DROP TABLE IF EXISTS team_games, tournament_games, tournament_teams, team_player, invited_players;

DROP TABLE IF EXISTS users , tournaments , games , matches , teams;
DROP SEQUENCE IF EXISTS seq_user_id;

CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;


                                                                        --TABLE CREATION 
CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE tournaments(
        tournament_name         varchar(64)     NOT NULL,
        tournament_id           serial          NOT NULL,
        start_date              timestamp               ,
        number_of_participants  int             NOT NULL,
        team_id                 serial                  ,
        ranking_of_teams        int                     ,
        match_id                int             NOT NULL,
        
CONSTRAINT       PK_tournament_id     PRIMARY KEY (tournament_id)              
);

CREATE TABLE teams(
        team_name               varchar(64)     NOT NULL,
        team_id                 serial          ,
        
CONSTRAINT       PK_team_id_id     PRIMARY KEY (team_id)  
);


CREATE TABLE games(
        game_name               varchar(32)     NOT NULL,
        game_id                 serial          NOT NULL,
        start_time              timestamp       NOT NULL,
        organizer               varchar(32)     NOT NULL,
        number_of_players       int             NOT NULL,
        winning_team            int                     ,
        
CONSTRAINT       FK_winning_team        FOREIGN KEY (winning_team) REFERENCES teams(team_id),
CONSTRAINT       PK_game_id             PRIMARY KEY (game_id)              
);

CREATE TABLE team_games(
        team_id                 int,
        game_id                 int,
        round_number            int,
        
        
CONSTRAINT      PK_team_id_game_id_round_number PRIMARY KEY (team_id, game_id, round_number),  
CONSTRAINT      FK_team_id_id         FOREIGN KEY (team_id)    REFERENCES teams(team_id),
CONSTRAINT      FK_game_id            FOREIGN KEY (game_Id)    REFERENCES games(game_id)
   
);

CREATE TABLE team_player(
        user_id         int,
        team_id         int,

CONSTRAINT PK_user_id_team_id PRIMARY KEY (team_id, user_id),  
CONSTRAINT FK_user_id   FOREIGN KEY (user_id) REFERENCES users(user_id),
CONSTRAINT FK_team_id   FOREIGN KEY (team_id) REFERENCES teams(team_id)
);

CREATE TABLE tournament_games(
        tournament_id           int,
        game_id                 int,

CONSTRAINT      pk_tournament_id_game_id PRIMARY KEY (tournament_id, game_id),  
CONSTRAINT      FK_tournament_id_id      FOREIGN KEY (tournament_id)    REFERENCES tournaments(tournament_id),
CONSTRAINT      FK_game_id_i             FOREIGN KEY (game_Id)          REFERENCES games(game_id)
);

CREATE TABLE tournament_teams(
        team_id                 int,
        tournament_id           int,

CONSTRAINT      PK_team_id_tournament_id PRIMARY KEY (team_id, tournament_id),        
CONSTRAINT      FK_team_id_id            FOREIGN KEY (team_id)          REFERENCES teams(team_id),
CONSTRAINT      FK_tournament_id         FOREIGN KEY (tournament_id)    REFERENCES tournaments(tournament_id)
);

CREATE TABLE invited_players(
        invite_id               serial,
        inviter_id              int,
        invited_id              int,
        isHost                  boolean DEFAULT false,
CONSTRAINT      PK_invite_id_id         PRIMARY KEY (invite_id),
CONSTRAINT      FK_inviter_id_id        FOREIGN KEY (inviter_id)        REFERENCES users(user_id),
CONSTRAINT      FK_invited_id_id        FOREIGN KEY (invited_id)        REFERENCES users(user_id)
        );

                                                                -- INSERT STATEMENTS
INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');
INSERT INTO tournaments (tournament_name, tournament_id, start_date, number_of_participants, team_id, ranking_of_teams, match_id) 
        VALUES ('curling', 1, '2021-03-11T10:43:00', 3, 2, 1, 3);
INSERT INTO tournaments (tournament_name, tournament_id, start_date, number_of_participants, team_id, ranking_of_teams, match_id) 
        VALUES ('ironing', 2, '2021-03-11T10:43:00', 3, 2, 1, 3);
                                                                -- SELECT STATEMENTS

SELECT * FROM users;
SELECT * FROM tournaments;
SELECT * FROM games;
SELECT * FROM team;

INSERT INTO invited_players(inviter_id, invited_id) (
        SELECT
              (SELECT user_id FROM users WHERE user_id = 1),
              (SELECT user_id FROM users WHERE user_id = 2)      
);


CREATE USER final_capstone_owner
WITH PASSWORD 'finalcapstone';

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO final_capstone_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO final_capstone_owner;

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO final_capstone_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO final_capstone_appuser;


                                                                        --MAY NEED 
--ALTER TABLE 
--      constraint  name                constraint-type         columns  value        
--ADD CONSTRAINT pk_person_address    PRIMARY KEY             (person_id,address_id);
COMMIT TRANSACTION;
