package com.exadel.expertgroup.employment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exadel.expertgroup.employment.repo.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	protected UsersRepository usersRepository;

}
