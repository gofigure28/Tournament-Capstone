package com.techelevator.dao;

import com.techelevator.model.Tournament;

import java.sql.Time;
import java.util.List;

import com.techelevator.model.Match;

public interface TournamentDAO {
	
	Tournament create(String name, int gameID, String startTime);
	
	List<Tournament> all();
	
	Tournament get(int id);

	Tournament create(String name, int matchID, Time startTime) throws Exception;
	
	
}
