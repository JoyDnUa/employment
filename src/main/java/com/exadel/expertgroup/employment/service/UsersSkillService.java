package com.exadel.expertgroup.employment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exadel.expertgroup.employment.repo.UsersSkillsRepository;

@Service
public class UsersSkillService {

	@Autowired
	protected UsersSkillsRepository usersSkillsRepository;
}
