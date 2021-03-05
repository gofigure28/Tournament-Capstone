BEGIN TRANSACTION;

DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS seq_user_id;

CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;


CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE tournaments(
        tournament_id           serial          NOT NULL,
        start_time              time            NOT NULL,
        start_date              date            NOT NULL,
        number_of_participants  int             NOT NULL,
        team_id                 varchar(32)     NOT NULL,
        ranking_of_teams        int             NOT NULL,
        match_id                int             NOT NULL
);

CREATE TABLE games(
        game_id                 serial          NOT NULL,
        start_time              time            NOT NULL,
        start_date              date            NOT NULL,
        organizer               varchar(32)     NOT NULL,
        number_of_players       int             NOT NULL
);

CREATE TABLE matches(
        tournament_id           serial          NOT NULL,
        game_id                 serial          NOT NULL,
        start_time              time            NOT NULL,
        start_date              date            NOT NULL,
        game_title              varchar(64)     NOT NULL,
        team_id                 varchar(32)     NOT NULL,
        number_of_players       int             NOT NULL
);

CREATE TABLE teams(
        tournament_id           serial          NOT NULL,
        game_id                 serial          NOT NULL,
        team_name               varchar(64)     NOT NULL,
        list_of_players         varchar(64)     NOT NULL

);









INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');



CONSTRAINTS   ()                  ; 

ROLLBACK;
--COMMIT TRANSACTION;
