package com.exadel.expertgroup.employment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exadel.expertgroup.employment.service.UsersService;
import com.exadel.expertgroup.employment.web.ViewUtil;

@Controller
@RequestMapping(ViewUtil.USER)
public class UserController {

	@Autowired
	protected UsersService usersService;
}
