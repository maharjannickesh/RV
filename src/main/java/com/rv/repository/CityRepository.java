package com.rv.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rv.entity.CityEntity;
import com.rv.entity.UserEntity;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Integer> {

	List<CityEntity> findAllCityNameByStateEntityAbbreviation(String abb);

	CityEntity findOneByName(String cityName);

	List<CityEntity> findAllByName(String cityName);
	
	
	
}
