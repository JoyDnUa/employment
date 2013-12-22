package com.exadel.expertgroup.employment.controller;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exadel.expertgroup.employment.model.Skill;
import com.exadel.expertgroup.employment.service.UsersService;
import com.exadel.expertgroup.employment.service.UsersSkillService;
import com.exadel.expertgroup.employment.web.ViewUtil;
@Controller
@RequestMapping("/search")
public class SearchController {
	
	private static final Logger LOGGER = LoggerFactory
            .getLogger(UserController.class);

	@Autowired
	protected UsersSkillService usersSkillService;
	
	@Autowired
	protected UsersService usersService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String search() {
        return "/search";
    }
    

}
