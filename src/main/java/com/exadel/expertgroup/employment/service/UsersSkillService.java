package com.exadel.expertgroup.employment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exadel.expertgroup.employment.model.Skill;
import com.exadel.expertgroup.employment.model.User;
import com.exadel.expertgroup.employment.model.UserSkill;
import com.exadel.expertgroup.employment.repo.UsersSkillsRepository;

@Service
public class UsersSkillService {

	@Autowired
	protected UsersSkillsRepository usersSkillsRepository;
	
    /**
     * Finds all books which are used by user.
     */
    public List<UserSkill> findByUser(User user) {
        return usersSkillsRepository.findByUser(user);
    }
   
    public List<UserSkill> findBySkill(Skill skill) {
        return usersSkillsRepository.findBySkill(skill);
    }
}
