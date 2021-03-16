package com.techelevator.dao;

import com.techelevator.model.Teams;
import com.techelevator.model.User;

import java.util.List;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class TeamsSqlDAO implements TeamsDAO {
	
	private JdbcTemplate jdbcTemplate;

	private TeamsSqlDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Teams createTeam(String teamName) throws Exception {
		try{ 
			String query = "INSERT INTO teams (team_name) VALUES (?)";
		jdbcTemplate.update(query, teamName);
		return null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
