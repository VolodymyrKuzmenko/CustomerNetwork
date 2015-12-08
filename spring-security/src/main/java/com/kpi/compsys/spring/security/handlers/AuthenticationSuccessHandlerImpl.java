package com.kpi.compsys.spring.security.handlers;

import com.kpi.compsys.model.SessionHistory;
import com.kpi.compsys.model.User;
import com.kpi.compsys.service.SessionHistoryService;
import com.kpi.compsys.spring.security.userdetails.SecurityUser;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Vova on 12/8/2015.
 */
@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

    @Autowired
    private SessionHistoryService sessionHistoryService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        User user = ((SecurityUser) authentication.getPrincipal()).getUser();
        request.getSession().setAttribute("user", user);
        rememberSession(user, request);

        httpServletResponse.sendRedirect("/user-dashboard");
    }


    private void rememberSession(User user, HttpServletRequest request){
        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
        SessionHistory sessionHistory = new SessionHistory();
        sessionHistory.setBrouserType(userAgent.getBrowser().getBrowserType().getName());
        sessionHistory.setIpAddres(request.getRemoteAddr());
        sessionHistory.setUser(user);
        Date date = new Date();
        date.setTime(System.currentTimeMillis());
        sessionHistory.setDate(date);
        sessionHistoryService.saveSuccsesAuthorizationInformation(sessionHistory);
        request.getSession().setAttribute("sessionHistory", sessionHistory);

    }


}
