package com.exadel.expertgroup.employment.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exadel.expertgroup.employment.web.ViewUtil;

@Controller
@RequestMapping(ViewUtil.LOGIN)
public class LoginController {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(LoginController.class);

    /**
     * User attempts to login.
     */
    @RequestMapping(method = RequestMethod.GET)
    public String login() {
        return ViewUtil.LOGIN;
    }

    /**
     * User attempts to login after error.
     */
    @RequestMapping(params = "retry", method = RequestMethod.GET)
    public String loginFailed(Model model) {
        LOGGER.debug("Login failed.");

        model.addAttribute("lastLoginFailed", Boolean.TRUE);
        return ViewUtil.LOGIN;
    }

}