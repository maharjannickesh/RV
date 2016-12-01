package com.rv.service;

import com.rv.entity.CityEntity;

public interface CityService {

	public boolean validateCity(String cityName);
	
	public boolean validateCityAndState(String city, String State);

	public CityEntity getCityByNameAndState(String city, String state);
}
