package com.techelevator.model;

import java.sql.Time;

public class Match {
	private int tournamentID;
	private int matchID;
	private Time startTime;
	private String teamA;
	private String teamB;
	private String winner;
	
	public Match(int tournamentID, int matchID, Time startTime, String teamA, String teamB, String winner) {
		this.tournamentID = tournamentID;
		this.matchID = matchID;
		this.startTime = startTime;
		this.teamA = teamA;
		this.teamB = teamB;
		this.winner = winner;
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
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public String getTeamA() {
		return teamA;
	}
	public void setTeamA(String teamA) {
		this.teamA = teamA;
	}
	public String getTeamB() {
		return teamB;
	}
	public void setTeamB(String teamB) {
		this.teamB = teamB;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
}
