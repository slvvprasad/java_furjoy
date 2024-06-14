package com.furjoy.authentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.furjoy.authentication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
	List<User> findAll();
	//User findByFirstName(String firstName);
	void deleteById(Long id);
}