package com.exadel.expertgroup.employment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.exadel.expertgroup.employment.model.Skill;

public interface SkillsRepository extends JpaRepository<Skill, Long> {
	
	Skill findByName(String name);
	Skill findById(Long id);
	List<Skill> findAll();

}