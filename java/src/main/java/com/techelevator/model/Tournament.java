package com.techelevator.model;

import java.sql.Time;

public class Tournament {

	private int tournamentID;
	private int matchID;
	private Match match;
	private Time startTime;
	private int numberOfPlayers;
	private String name;
	
	public Tournament(String name, int tournamentID, int matchID, Match match, Time startTime, int numberOfPlayers) {
		this.tournamentID = tournamentID;
		this.matchID = matchID;
		this.match = match;
		this.startTime = startTime;
		this.numberOfPlayers = numberOfPlayers;
		this.name = name;
	}
	
	public Tournament() {
		
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTournamentID() {
		return tournamentID;
	}
	public void setTournamentID(int tournamentID) {
		this.tournamentID = tournamentID;
	}
	public int getMatchID() {
		return matchID;
	}
	public void setMatchID(int matchID) {
		this.matchID = matchID;
	}
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time time) {
		this.startTime = time;
	}
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	
	
	
}
