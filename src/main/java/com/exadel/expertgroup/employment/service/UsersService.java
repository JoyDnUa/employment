package com.exadel.expertgroup.employment.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exadel.expertgroup.employment.context.LoginListener;
import com.exadel.expertgroup.employment.model.User;
import com.exadel.expertgroup.employment.repo.UsersRepository;

@Service
public class UsersService {
	
	private static final Logger LOGGER = LoggerFactory
            .getLogger(LoginListener.class);
	
	@Autowired
	protected UsersRepository usersRepository;

	public void login(String username) {
		User user = usersRepository.findByUsername(username);
        if (user == null) {
            LOGGER.debug("Create new user {}.", username);
            user = User.create(username);
        }
        user = usersRepository.saveAndFlush(user);
	}
	
	public User findByUsername(String username) {
		return usersRepository.findByUsername(username);
    }

}
