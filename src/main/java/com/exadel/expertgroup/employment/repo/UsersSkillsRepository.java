package com.exadel.expertgroup.employment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exadel.expertgroup.employment.model.Skill;
import com.exadel.expertgroup.employment.model.User;
import com.exadel.expertgroup.employment.model.UserSkill;

public interface UsersSkillsRepository extends JpaRepository<UserSkill, Long> {

    /**
     * Finds all user's skills.
     */
    List<UserSkill> findByUser(User user);
    List<UserSkill> findBySkill(Skill skill);

}
