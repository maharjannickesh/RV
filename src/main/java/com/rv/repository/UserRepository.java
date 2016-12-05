package com.rv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rv.entity.UserEntity;

/**
 * This class is a User Repository
 * 
 * @author maharjan.nickesh
 */

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	UserEntity findOneByFirstName(String firstName);

	UserEntity findOneByUsername(String name);

}
