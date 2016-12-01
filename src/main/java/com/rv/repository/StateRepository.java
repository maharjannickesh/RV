package com.rv.repository;

import java.lang.Thread.State;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rv.entity.CityEntity;
import com.rv.entity.StateEntity;

@Repository
public interface StateRepository extends JpaRepository<StateEntity, Integer> {

	StateEntity findOneByAbbreviation(String state);

}
