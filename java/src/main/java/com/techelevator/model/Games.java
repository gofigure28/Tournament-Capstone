package com.techelevator.model;

import java.sql.Time;
import java.time.LocalDateTime;

public class Games {
	private String gameName;
	private int gameID;
	private LocalDateTime startTimeDate;
	private String team;
	private int numberOfPlayers;
	private String winner;
	
	public Games(String gameName, int gameID, LocalDateTime startTimeDate, String team, int numberOfPlayers, String winner) {
		this.gameName = gameName;
		this.gameID = gameID;
		this.startTimeDate = startTimeDate;
		this.team = team;
		this.numberOfPlayers = numberOfPlayers;
		this.winner = winner;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getGameID() {
		return gameID;
	}

	public void setGameID(int gameID) {
		this.gameID = gameID;
	}

	public LocalDateTime getStartTimeDate() {
		return startTimeDate;
	}

	public void setStartTimeDate(LocalDateTime startTimeDate) {
		this.startTimeDate = startTimeDate;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
	
}
