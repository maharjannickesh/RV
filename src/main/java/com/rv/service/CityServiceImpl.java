package com.rv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rv.entity.CityEntity;
import com.rv.repository.CityRepository;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public boolean validateCity(String cityName) {
		List<CityEntity> cities = cityRepository.findAllByName(cityName);
		if (cities.size() >= 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validateCityAndState(String city, String state) {
		List<CityEntity> cities = cityRepository.findAllByName(city);
		if (cities.size() >= 1) {
			for (CityEntity c : cities) {
				if (c.getStateEntity().getAbbreviation().equals(state)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public CityEntity getCityByNameAndState(String city, String state) {
		List<CityEntity> cities = cityRepository.findAllByName(city);
		for (CityEntity c : cities) {
			if (c.getStateEntity().getAbbreviation().equals(state)) {
				return c;
			}
		}
		return null;
	}

}
