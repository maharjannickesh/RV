package com.rv.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;


/**
 * This class is a class for returning template required to consume rest service
 * 
 * @author maharjan.nickesh
 */


public class RemoteAPI {

	private RestTemplate restTemplate;

	public RemoteAPI() {
		restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
	}

	public HttpHeaders getHttpHeaders() {
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(MediaType.APPLICATION_JSON);
		return requestHeaders;
	}

	public HttpEntity<?> getHttpEntity() {
		return new HttpEntity<>(getHttpHeaders());
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

}
