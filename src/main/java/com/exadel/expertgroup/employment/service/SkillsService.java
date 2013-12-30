package com.exadel.expertgroup.employment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exadel.expertgroup.employment.model.Skill;
import com.exadel.expertgroup.employment.repo.SkillsRepository;

@Service
public class SkillsService {
	
	@Autowired
	protected SkillsRepository skillsRepositroy;

	@Transactional(readOnly = true)
    public Skill findByName(String name){
    	return skillsRepositroy.findByName(name);
    }

	@Transactional(readOnly = true)
    public Skill findById(Long id){
    	return skillsRepositroy.findById(id);
    }

	@Transactional(readOnly = true)
    public List<Skill> findAll(){
    	return skillsRepositroy.findAll();
    }

}
