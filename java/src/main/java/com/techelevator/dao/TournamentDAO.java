package com.techelevator.dao;

import com.techelevator.model.Tournament;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;

import com.techelevator.model.Match;

public interface TournamentDAO {
	
	List<Tournament> all();
	
	Tournament get(int id);

	Tournament create(String name, int matchID, Match match, LocalDateTime startTime, int numberOfPlayers)
			throws Exception;
	
	String getName(int id);
}
	
