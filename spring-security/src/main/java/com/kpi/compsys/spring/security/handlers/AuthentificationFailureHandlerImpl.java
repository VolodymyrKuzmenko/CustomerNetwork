package com.kpi.compsys.spring.security.handlers;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Vova on 12/8/2015.
 */
@Component
public class AuthentificationFailureHandlerImpl implements AuthenticationFailureHandler {
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(AuthentificationFailureHandlerImpl.class);
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        //TODO set message into index.jsp about failure login/password
        logger.info("Failure login");
        httpServletResponse.sendRedirect("/index.jsp");
    }


}
