package com.swiggy.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class SwiggyController {
	
	//@Autowired
	//private SwiggyServiceInterface ss;
	
	@GetMapping("viewallorder")
	public void viewAll(){
		
		String baseUrl = "http://localhost:10000/springbootfirstproject/showAll";
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> response=null;
		try{
		response=restTemplate.exchange(baseUrl,	HttpMethod.GET, getHeaders(),String.class);
		}catch (Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println(response.getBody());
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		return new HttpEntity(headers);
	}
}





