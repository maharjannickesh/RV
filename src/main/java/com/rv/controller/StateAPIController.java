package com.rv.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.rv.entity.CityEntity;
import com.rv.service.StateService;

@RestController
@RequestMapping("/state")
public class StateAPIController {
	
	@Autowired
	private StateService stateService;
	
	@RequestMapping(value="")
	@ResponseBody public String display(){
		return "Hellow Display";
	}
	
	@RequestMapping(value="/{stateabb}/cities")
	public List<String> getAllCitiesByState(@PathVariable("stateabb") String stateabb){
		stateabb = stateabb.toUpperCase();
		return stateService.getallCitiesByState(stateabb);
	}

}
