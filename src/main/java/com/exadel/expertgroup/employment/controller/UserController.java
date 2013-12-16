package com.exadel.expertgroup.employment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.exadel.expertgroup.employment.service.UsersService;

@Controller
public class UserController {

	@Autowired
	protected UsersService usersService;
}
