package com.techelevator.controller;

import com.techelevator.model.Tournament;
import com.techelevator.model.Match;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

public class TournamentServices {

	public String authToken = "";
	
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	
	private final String BASE_URL = "http://localhost:8080/";
	private final RestTemplate restTemplate = new RestTemplate();
	
	public Tournament makeTournament() {
		Tournament tournament = null;
		try {
			 tournament = restTemplate.exchange(BASE_URL + "tournaments", HttpMethod.POST, makeAuthEntity(), Tournament.class).getBody();
		} catch(RestClientResponseException ex) {
			
		}
		return tournament;
	}
	
	private HttpEntity makeAuthEntity() {
		HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth(authToken);
		HttpEntity entity = new HttpEntity<>(headers);
		return entity;
	}
	

}

