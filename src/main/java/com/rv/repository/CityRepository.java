package com.rv.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rv.entity.CityEntity;

/**
 * This class is a City Repositiry
 * 
 * @author maharjan.nickesh
 */
@Repository
public interface CityRepository extends JpaRepository<CityEntity, Integer> {

	List<CityEntity> findAllCityNameByStateEntityAbbreviation(String abb, Pageable pageable);

	CityEntity findOneByName(String cityName);

	List<CityEntity> findAllByName(String cityName);

	CityEntity findOneCityNameByUsersUsername(String user);

}
