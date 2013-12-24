package com.exadel.expertgroup.employment.controller;

import java.security.Principal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exadel.expertgroup.employment.model.Skill;
import com.exadel.expertgroup.employment.model.User;
import com.exadel.expertgroup.employment.model.UserSkill;
import com.exadel.expertgroup.employment.repo.UsersSkillsRepository;
import com.exadel.expertgroup.employment.service.SkillsService;
import com.exadel.expertgroup.employment.service.UsersService;
import com.exadel.expertgroup.employment.service.UsersSkillService;
import com.exadel.expertgroup.employment.web.ViewUtil;
@Controller
@RequestMapping("/search")
public class SearchController {
	
	private static final Logger LOGGER = LoggerFactory
            .getLogger(UserController.class);

	@Autowired
	protected SkillsService skillsService;
	
	@Autowired
	protected UsersService usersService;
	
	@Autowired
	protected UsersSkillService usersSkillService;
	
	@ModelAttribute(ViewUtil.CURRENT_USER_ATTR)
    public User currentUser(Principal principal) {
		LOGGER.debug("Name in spring {}.", principal.getName());
		return usersService.findByUsername(principal.getName());
    }
	
	@ModelAttribute("skills")
    public List<Skill> skillsList() {
		return skillsService.findAll();
    }
	
	@RequestMapping(method = RequestMethod.GET)
    public String search() {
        return "/search";
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public String searchUserbySkills(HttpServletRequest request) {
		String skills = request.getParameter("Skills");
		LOGGER.debug("Skills list {}.", skills);
		if(skills!=null){
			Skill skill = skillsService.findById(new Long(skills));
			LOGGER.debug("Skills {}.", skill.toString());
			List<UserSkill> userskill = usersSkillService.findBySkill(skill);
			if(userskill!=null){
				LOGGER.debug("Skills list {}.", userskill.toString());
			}
		}
		return "/search";
    }
    

}
