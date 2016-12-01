package com.rv.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rv.entity.StateEntity;

@Repository
public interface StateRepository extends JpaRepository<StateEntity, Integer> {

	StateEntity findOneByAbbreviation(String state);

}
