package com.exadel.expertgroup.employment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exadel.expertgroup.employment.web.ViewUtil;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return ViewUtil.LOGIN;
    }	
	
}
