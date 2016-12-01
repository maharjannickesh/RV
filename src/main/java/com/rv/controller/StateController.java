package com.rv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StateController {
	
	@RequestMapping(value = "/test")
	private @ResponseBody String test(){
		System.out.println("hello Spring");
		return "Hello From Controller" ;
	}

}
