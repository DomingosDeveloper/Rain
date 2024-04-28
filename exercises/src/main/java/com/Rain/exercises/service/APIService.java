package com.Rain.exercises.service;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class APIService {
	

	private RestTemplate restTemplate = new RestTemplate();
	
	public String getData() {
		String apiJs = "https://raw.githubusercontent.com/chuva-inc/exercicios-2023/master/dart/assets/activities.json";
		try {
			ResponseEntity<String> apiOut = restTemplate.getForEntity(apiJs, String.class);
			String responseBody = apiOut.getBody();
			return responseBody;
		} catch (HttpClientErrorException e) {
			throw new RuntimeException("ERROR: " + e.getMessage());
		}
	}
}
