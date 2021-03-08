package com.techelevator.dao;

import com.techelevator.model.Tournament;

import java.sql.Time;
import java.util.List;

import com.techelevator.model.Match;

public interface TournamentDAO {
	
	List<Tournament> all();
	
	Tournament get(int id);

	Tournament create(String name, int matchID, Match match, Time startTime, int numberOfPlayers)
			throws Exception;
}
	
