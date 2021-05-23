package com.security.basicauth.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.security.basicauth.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	Optional<User> findByUsername(String username);
	
}
