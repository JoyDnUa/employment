package com.exadel.expertgroup.employment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exadel.expertgroup.employment.model.UserSkill;

public interface UsersSkillsRepository extends JpaRepository<UserSkill, Long> {

}
