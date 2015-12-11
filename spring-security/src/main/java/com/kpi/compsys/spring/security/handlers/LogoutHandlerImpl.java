package com.kpi.compsys.spring.security.handlers;

import com.kpi.compsys.model.SessionHistory;
import com.kpi.compsys.model.User;
import com.kpi.compsys.service.SessionHistoryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by Vova on 12/8/2015.
 */
@Component
public class LogoutHandlerImpl implements LogoutHandler {
    private static final Logger logger = Logger.getLogger(LogoutHandlerImpl.class);
    @Autowired
    private SessionHistoryService sessionHistoryService;

    @Override
    public void logout(HttpServletRequest request, HttpServletResponse httpServletResponse, Authentication authentication) {

        SessionHistory sessionHistory = (SessionHistory) request.getSession().getAttribute("sessionHistory");
        User user = (User)  request.getSession().getAttribute("user");
        long timeSession = System.currentTimeMillis() - sessionHistory.getDate().getTime();
        sessionHistory.setDate(new Date(timeSession));
        sessionHistoryService.update(sessionHistory);
        clearAuthenticationAttributes(request);
        logger.info("User '"+user.getEmail()+"' has log out. Time session: "+ timeSession);
    }

    private void clearAuthenticationAttributes(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return;
        }
        session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
    }
}
