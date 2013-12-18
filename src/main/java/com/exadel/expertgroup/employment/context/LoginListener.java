package com.exadel.expertgroup.employment.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;

import com.exadel.expertgroup.employment.service.UsersService;

/**
 * Performs login of authenticated user.
 */
public class LoginListener implements
        ApplicationListener<AuthenticationSuccessEvent> {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(LoginListener.class);

    @Autowired
    protected UsersService usersService;

    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
        Authentication auth = event.getAuthentication();
        String username = auth.getName();
        LOGGER.debug("User {} is authenticated.", username);

        try {
        	usersService.login(username);
            LOGGER.debug("User {} is logged in.", username);
        } catch (Exception exception) {
            LOGGER.debug("User {} is not logged in", username);
            LOGGER.debug("Exception is {} ", exception.toString());
        }
    }
}
