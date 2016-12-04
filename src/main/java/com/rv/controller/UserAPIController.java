package com.rv.controller;

import java.security.Principal;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rv.dto.UserCityDTO;
import com.rv.entity.CityEntity;
import com.rv.entity.Role;
import com.rv.entity.UserEntity;
import com.rv.exception.DataNotFoundException;
import com.rv.service.UserService;

@RestController
@RequestMapping("/user")
public class UserAPIController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/{user}/visits", method = RequestMethod.GET)
	public List<String> visitedCity(@PathVariable("user") String user)  {
		List<String> visitedCity = userService.visitedCity(user);
		if (visitedCity.size() ==  0){
			throw new DataNotFoundException("Cities Not Founds for " +user);
		}
		return userService.visitedCity(user);
	}
	
	@RequestMapping(value = "/{user}/visits", method = RequestMethod.POST)
	public UserEntity insertVisitedCity(@RequestBody UserCityDTO userCityDTO, @PathVariable("user") String user) {

		return userService.insertVisitedCity(userCityDTO, user);

	}
	@RequestMapping(value = "/{user}/visits/states", method = RequestMethod.GET)
	public Set<String> visitedState(@PathVariable("user") String user) {

		return userService.visitedState(user);

	}

	@RequestMapping(value = "/{user}/visits/{visit}/{state}", method = RequestMethod.DELETE)
	public Set<CityEntity> deleteVisitedCity(@PathVariable("user") String user, @PathVariable("visit") String city,
			@PathVariable("state") String state, Principal principal) {
		UserEntity userEntity = userService.getUserByUsername(principal.getName());
		if (userEntity.getRole() == Role.ROLE_ADMIN || principal.getName().equals(user)){
		return userService.deleteVisitedCity(user, city, state);
		}
		return null;

	}

}
