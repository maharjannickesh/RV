package com.rv.service;

import java.util.List;
import java.util.Set;

import com.rv.dto.UserCityDTO;
import com.rv.entity.CityEntity;
import com.rv.entity.UserEntity;

public interface UserService {

	public UserEntity getUserByFirstName(String FirstName);

	public UserEntity saveNewCityVisited(UserEntity userEntity);

	public UserEntity saveUser(UserEntity userEntity);

	public UserEntity insertVisitedCity(UserCityDTO userCityDTO, String user);

	public List<String> visitedCity(String user);

	public Set<String> visitedState(String user);

	public Set<CityEntity> deleteVisitedCity(String user, String city, String state);

}
