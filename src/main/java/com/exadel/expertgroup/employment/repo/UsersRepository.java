package com.exadel.expertgroup.employment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.exadel.expertgroup.employment.model.User;


public interface UsersRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
	User saveAndFlush(User user);

}
