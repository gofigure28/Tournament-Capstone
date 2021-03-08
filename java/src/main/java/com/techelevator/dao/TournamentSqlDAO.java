package com.techelevator.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.model.Match;
import com.techelevator.model.Tournament;

public class TournamentSqlDAO implements TournamentDAO {

		private JdbcTemplate jdbcTemplate;
		
		private TournamentSqlDAO(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}
	@Override
	public Tournament makeTournament(String name, String gameID, String startTime) {
		String query = "insert into tournanments (name, game_ID, start_time) values(?, ?, ?)";
		
		return null;
	}

}
