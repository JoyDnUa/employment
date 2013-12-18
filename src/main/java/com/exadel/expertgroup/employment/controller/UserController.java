package com.exadel.expertgroup.employment.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.exadel.expertgroup.employment.service.UsersService;
import com.exadel.expertgroup.employment.web.ViewUtil;

@Controller
@RequestMapping(ViewUtil.USER)
@SessionAttributes("currentUser")
public class UserController {

	@Autowired
	protected UsersService usersService;
	
	@ModelAttribute("currentUser")
    public String currentUser(Principal principal){
        return principal.getName();
    }
	
	@RequestMapping(method = RequestMethod.GET)
    public String user() {
        return ViewUtil.USER;
    }
}
