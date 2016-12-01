package com.rv.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rv.entity.CityEntity;
import com.rv.entity.StateEntity;

public interface StateService {


	List<String> getallCitiesByState(String state);
	
	boolean verifyState(String state);
	


	

}
