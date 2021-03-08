package com.techelevator.controller;

import com.techelevator.model.Tournament;
import com.techelevator.dao.TournamentDAO;
import com.techelevator.model.Match;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;


@RestController
@CrossOrigin
public class TournamentController {

	public String authToken = "";
	
	private TournamentDAO tournamentDAO;
	
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	
	private final String BASE_URL = "http://localhost:8080/";
	private final RestTemplate restTemplate = new RestTemplate();
	
	
	@RequestMapping(value ="/tournaments", method = RequestMethod.POST)
	public Tournament makeTournament() {
		Tournament tournament = null;
		try {
			 tournament = restTemplate.exchange(BASE_URL + "tournaments", HttpMethod.POST, makeAuthEntity(), Tournament.class).getBody();
		} catch(RestClientResponseException ex) {
			
		}
		return tournament;
	}
	
	@RequestMapping(value ="/alltournaments", method = RequestMethod.GET)
	public Tournament getTournament() {
		Match fakeMatch = new Match(1, 2, "w", "o", "w", "w");
		return new Tournament(1, 2, fakeMatch, "fe", 3);
	}
	
	private HttpEntity makeAuthEntity() {	
		HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth(authToken);
		HttpEntity entity = new HttpEntity<>(headers);
		return entity;
	}
	

}

