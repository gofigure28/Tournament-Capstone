package com.techelevator.dao;

import java.util.List;

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
	public Tournament create(String name, int gameID, String startTime) {
		String query = "insert into tournanments (name, game_ID, start_time) values(?, ?, ?)";
		jdbcTemplate.update(query, name, gameID, startTime);
		return null;
	}

	@Override
	public List<Tournament> all() {
		String query = "SELECT * FROM tournaments";
		SqlRowSet result = jdbcTemplate.queryForRowSet(query);
		return null;
	}

	@Override
	public Tournament get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * private Tournament mapRow(SqlRowSet rw) {
	 * 
	 * Tournament tournament = new Tournament();
	 * 
	 * }
	 */

}
