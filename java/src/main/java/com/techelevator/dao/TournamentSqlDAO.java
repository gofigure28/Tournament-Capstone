package com.techelevator.dao;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.model.Match;
import com.techelevator.model.Tournament;

import java.sql.Time;



public class TournamentSqlDAO implements TournamentDAO {

	private JdbcTemplate jdbcTemplate;

	private TournamentSqlDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Tournament create(String name, int matchID, int tournamentID, Match match, Time startTime, int numberOfPlayers) {
		try {
			String query = "insert into tournanments "
					+ "(name, match_id, tournament_id, start_time, number_of_participants, )"
					+ " values(?, ?, ?)";
		jdbcTemplate.update(query, name, matchID, tournamentID, startTime, numberOfPlayers);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
		return null;
	}

	@Override
	public List<Tournament> all() {
		String query = "SELECT * FROM tournaments";
		List<Tournament> allTournaments = new ArrayList<>();
		SqlRowSet result = jdbcTemplate.queryForRowSet(query);
		while(result.next()) {
			Tournament tournament = mapRow(result);
			allTournaments.add(tournament);
			
		}
		return null;
	}

	@Override
	public Tournament get(int id) {
		String query = "SELECT * FROM tournaments WHERE tournament_id = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(query);
		return null;
	}

	private Tournament mapRow(SqlRowSet rw) {
	  
	  Tournament tournament = new Tournament();
	  tournament.setMatchID(rw.getInt("match_id"));
	  tournament.setName(rw.getString("name"));
	  tournament.setNumberOfPlayers(rw.getInt("number_of_participants"));
	  tournament.setStartTime(rw.getTime("start_time"));
	  tournament.setTournamentID(rw.getInt("tournament_id"));
	  return tournament;
	  
	 }


}
