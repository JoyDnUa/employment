package com.exadel.expertgroup.employment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exadel.expertgroup.employment.model.User;


public interface UsersRepository extends JpaRepository<User, Long> {

}
