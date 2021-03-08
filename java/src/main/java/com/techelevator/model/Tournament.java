package com.techelevator.model;

public class Tournament {

	private int tournamentID;
	private int matchID;
	private Match match;
	private String startTime;
	private int numberOfPlayers;
	private String name;
	
	public Tournament(String name, int tournamentID, int matchID, Match match, String startTime, int numberOfPlayers) {
		this.tournamentID = tournamentID;
		this.matchID = matchID;
		this.match = match;
		this.startTime = startTime;
		this.numberOfPlayers = numberOfPlayers;
		this.name = name;
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
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	
	
	
}
