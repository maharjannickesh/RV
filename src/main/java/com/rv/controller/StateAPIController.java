package com.rv.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.rv.service.StateService;


/**
 * This class is a StateAPI controller
 * @author maharjan.nickesh
 */

@RestController
@RequestMapping("/state")
public class StateAPIController {
	
	@Autowired
	private StateService stateService;
	
	@RequestMapping(value="")
	@ResponseBody public String display(){
		return "Hellow Display";
	}
	
	@RequestMapping(value="/{stateabb}/cities/{pageno}")
	public List<String> getAllCitiesByState(@PathVariable("stateabb") String stateabb, @PathVariable("pageno") String pageno){
		stateabb = stateabb.toUpperCase();
		int page = Integer.parseInt(pageno);
		return stateService.getallCitiesByState(stateabb, page);
	}

}
