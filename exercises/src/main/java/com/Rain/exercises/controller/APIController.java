package com.Rain.exercises.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rain.exercises.service.APIService;

@RestController
@RequestMapping("/api")
public class APIController {
	
	@Autowired
	private APIService apis;
	
	@GetMapping("/data")
	public ResponseEntity<String> getData(){
		String data = apis.getData();
		return ResponseEntity.ok(data);
	}
}
