package com.techelevator.model;

public class TournamentTeam {
	
	private Integer teamID;
	private Integer tournamentID;
	
	
	public TournamentTeam(Integer teamID, Integer tournamentID) {
		this.teamID = teamID;
		this.tournamentID = tournamentID;
	}
	
	public TournamentTeam() {
		this.teamID = 0;
		this.tournamentID = 0;
	}

	public int getTeamID() {
		return teamID;
	}
	public void setTeamID(Integer teamID) {
		this.teamID = teamID;
	}
	public int getTournamentID() {
		return tournamentID;
	}
	public void setTournamentID(Integer tournamentID) {
		this.tournamentID = tournamentID;
	}

}
