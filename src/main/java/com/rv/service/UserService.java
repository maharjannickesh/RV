package com.rv.service;

import java.util.Set;

import com.rv.entity.UserEntity;

public interface UserService {

	public UserEntity getUserByFirstName(String FirstName);

	public UserEntity saveNewCityVisited(UserEntity userEntity);

	public Set<UserEntity> getAllCityUserVisitedByUserFirstName(String user);

	public UserEntity saveUser(UserEntity userEntity);

}
