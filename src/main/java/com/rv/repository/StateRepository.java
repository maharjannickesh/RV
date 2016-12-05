package com.rv.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rv.entity.StateEntity;

/**
 * This class is a State Repository
 * @author maharjan.nickesh
 */

@Repository
public interface StateRepository extends JpaRepository<StateEntity, Integer> {

	StateEntity findOneByAbbreviation(String state);

}
