package com.rv.service;

import java.util.List;


public interface StateService {


	List<String> getallCitiesByState(String state);
	
	boolean verifyState(String state);
	


	

}
