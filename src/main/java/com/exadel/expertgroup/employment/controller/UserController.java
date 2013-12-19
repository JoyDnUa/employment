package com.exadel.expertgroup.employment.controller;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.exadel.expertgroup.employment.model.User;
import com.exadel.expertgroup.employment.model.UserSkill;
import com.exadel.expertgroup.employment.service.UsersService;
import com.exadel.expertgroup.employment.service.UsersSkillService;
import com.exadel.expertgroup.employment.web.ViewUtil;

@Controller
@RequestMapping(ViewUtil.USER)
@SessionAttributes(ViewUtil.CURRENT_USER_ATTR)
public class UserController {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(UserController.class);

	@Autowired
	protected UsersSkillService usersSkillService;
	
	@Autowired
	protected UsersService usersService;
	
	@ModelAttribute(ViewUtil.CURRENT_USER_ATTR)
    public User currentUser(Principal principal) {
		LOGGER.debug("Name in spring {}.", principal.getName());
		User user = usersService.findByUsername(principal.getName());
		if(user == null){
//			user = User.create(principal.getName());
			LOGGER.debug("User {} not found.", principal.getName());
		}
		//LOGGER.debug("Name from DB {}.", usersService.findByUsername(principal.getName()).getUsername());
        return user;
    }
	
    @RequestMapping(method = RequestMethod.GET)
    public String getUserDetails(@ModelAttribute(ViewUtil.CURRENT_USER_ATTR) User user,
            Model model) {
        LOGGER.debug("Get details about user {}.", user.getId());

        List<UserSkill> userSkills = usersSkillService.findByUser(user);
        LOGGER.debug("{} have {} skills.", user.getUsername(), userSkills.size());
        model.addAttribute("userSkills", userSkills);

        return ViewUtil.USER;
    }

}
