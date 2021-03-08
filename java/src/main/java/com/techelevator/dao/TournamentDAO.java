package com.techelevator.dao;

import com.techelevator.model.Tournament;
import com.techelevator.model.Match;

public interface TournamentDAO {
	
	Tournament makeTournament(String name, String gameID, String startTime);
	
	
}
