package com.techelevator.controller;

import com.techelevator.model.Tournament;
import com.techelevator.dao.TournamentDAO;
import com.techelevator.model.Games;

import java.util.List;
import java.sql.Time;
import java.util.ArrayList;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpStatus;

@RestController
@CrossOrigin
public class TournamentController {

	public String authToken = "";
	
	private TournamentDAO tournamentDAO;
	
	private Games match;
	
	public TournamentController(TournamentDAO tournamentDAO) {
		this.tournamentDAO = tournamentDAO;
	}
	
	
	
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	
	private final RestTemplate restTemplate = new RestTemplate();
	
	
	@RequestMapping(value = "/tournaments", method = RequestMethod.GET)
	public List<Tournament> listAll() {
		return tournamentDAO.all();
	}
	
		
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value ="/createTournament", method = RequestMethod.POST)
	public Tournament makeTournament(@RequestBody Tournament newTournament) throws Exception {
		
		return tournamentDAO.create(
				newTournament.getName(), 
				newTournament.getMatchID(), 	
				newTournament.getMatch(),
				newTournament.getStartTime(),
				newTournament.getNumberOfPlayers());
	}
	
	@RequestMapping(value ="/tournaments/{id}", method = RequestMethod.GET)
	public String nameGet(@PathVariable int id) {
		return tournamentDAO.getName(id);
	}
	
	
	private HttpEntity makeAuthEntity() {	
		HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth(authToken);
		HttpEntity entity = new HttpEntity<>(headers);
		return entity;
	}
	

}

