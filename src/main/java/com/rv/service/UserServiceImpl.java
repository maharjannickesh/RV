package com.rv.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rv.entity.CityEntity;
import com.rv.entity.UserEntity;
import com.rv.repository.CityRepository;
import com.rv.repository.StateRepository;
import com.rv.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private StateRepository stateRepository;

	@Override
	public UserEntity getUserByFirstName(String firstName) {
		return userRepository.findOneByFirstName(firstName);
	}

	@Override
	public UserEntity saveNewCityVisited(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}

	@Override
	public Set<UserEntity> getAllCityUserVisitedByUserFirstName(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity saveUser(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}
	

	

}
