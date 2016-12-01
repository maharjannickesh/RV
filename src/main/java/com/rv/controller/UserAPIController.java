package com.rv.controller;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rv.dto.UserCityDTO;
import com.rv.entity.CityEntity;
import com.rv.entity.UserEntity;
import com.rv.service.CityService;
import com.rv.service.StateService;
import com.rv.service.UserService;

@RestController
@RequestMapping("/user")
public class UserAPIController {

	@Autowired
	private UserService userService;

	@Autowired
	private CityService cityService;

	@Autowired
	private StateService stateService;

	@RequestMapping(value = "/{user}/visits", method = RequestMethod.POST)
	public UserEntity insertVisitedCity(@RequestBody UserCityDTO userCityDTO, @PathVariable("user") String user) {

		if (cityService.validateCity(userCityDTO.getCity()) && stateService.verifyState(userCityDTO.getState())
				&& cityService.validateCityAndState(userCityDTO.getCity(), userCityDTO.getState())) {
			UserEntity userEntity = userService.getUserByFirstName(user);
			CityEntity cityEntity = cityService.getCityByNameAndState(userCityDTO.getCity(), userCityDTO.getState());

			Set<CityEntity> userCities = userEntity.getCities();
			userCities.add(cityEntity);
			userEntity.setCities(userCities);

			return userService.saveNewCityVisited(userEntity);

		}

		return null;
	}

	@RequestMapping(value = "/{user}/visits", method = RequestMethod.GET)
	public List<String> visitedCity(@PathVariable("user") String user) {
		UserEntity userEntity = userService.getUserByFirstName(user);
		Set<CityEntity> userCities = userEntity.getCities();
		List<String> cities = userCities.stream().map(c -> c.getName()).collect(Collectors.toList());
		return cities;

	}

	@RequestMapping(value = "/{user}/visits/states")
	public Set<String> visitedState(@PathVariable("user") String user) {
		UserEntity userEntity = userService.getUserByFirstName(user);
		Set<CityEntity> userCities = userEntity.getCities();
		Set<String> state = userCities.stream().map(c -> c.getStateEntity().getName()).collect(Collectors.toSet());
		return state;
	}
	

}
