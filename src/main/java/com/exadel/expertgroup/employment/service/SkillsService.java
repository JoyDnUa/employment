package com.exadel.expertgroup.employment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exadel.expertgroup.employment.model.Skill;
import com.exadel.expertgroup.employment.repo.SkillsRepository;

@Service
public class SkillsService {
	
	@Autowired
	protected SkillsRepository skillsRepositroy;
	
    public Skill findByName(String name){
    	return skillsRepositroy.findByName(name);
    }
    
    public Skill findById(Long id){
    	return skillsRepositroy.findById(id);
    }
    
    public List<Skill> findAll(){
    	return skillsRepositroy.findAll();
    }

}
