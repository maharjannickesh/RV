package com.rv.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rv.entity.CityEntity;
import com.rv.entity.StateEntity;
import com.rv.repository.CityRepository;
import com.rv.repository.StateRepository;

@Service
@Transactional
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<String> getallCitiesByState(String state) {
		List<CityEntity> cities = cityRepository.findAllCityNameByStateEntityAbbreviation(state);
		List<String> cityNames = cities.stream().map(c -> c.getName()).collect(Collectors.toList());
		System.out.println(cityNames.size());
		return cityNames;
	}

	@Override
	public boolean verifyState(String state) {
		StateEntity stateEntity = stateRepository.findOneByAbbreviation(state);
		if (stateEntity != null){
			return true;
		}
		return false;
	}


}
