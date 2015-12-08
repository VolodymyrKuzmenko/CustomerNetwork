package com.kpi.compsys.spring.controller;

import com.kpi.compsys.model.SessionHistory;
import com.kpi.compsys.model.User;
import com.kpi.compsys.service.SessionHistoryService;
import com.kpi.compsys.service.UserService;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * Created by Vova on 12/2/2015.
 */
@Controller
public class AuthentificationController {

    @Autowired
    private UserService userService;

    @Autowired
    private SessionHistoryService sessionHistoryService;


//    @RequestMapping(value = {"index", "/"}, method = RequestMethod.GET)
//    public ModelAndView start(Model model){
//        System.out.println("start method controller");
//        ModelAndView loginModeAndView = new ModelAndView("index");
//        return loginModeAndView;
//    }


//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public ModelAndView executeLogin(HttpServletRequest request) {
//        Map<String, String[]> paramMap = request.getParameterMap();
//        User loginBean = new User();
//        loginBean.setEmail(paramMap.get("email")[0]);
//        loginBean.setPassword(paramMap.get("password")[0]);
//        User currentUser = null;
//        for (User user : userService.getAll()) {
//            if (user.getEmail().equals(loginBean.getEmail()) && user.getPassword().equals(loginBean.getPassword())) {
//                currentUser = user;
//                break;
//            }
//        }
//
//        if (currentUser == null) {
//            return new ModelAndView("index");
//        } else {
//            request.getSession().setAttribute("user", currentUser);
//            rememberSessionHistory(currentUser, request);
//
//            return new ModelAndView("user-dashboard");
//        }
//
//    }


//    private void rememberSessionHistory(User user, HttpServletRequest request) {
//        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
//        SessionHistory sessionHistory = new SessionHistory();
//        sessionHistory.setBrouserType(userAgent.getBrowser().getBrowserType().getName());
//        sessionHistory.setIpAddres(request.getRemoteAddr());
//        sessionHistory.setUser(user);
//        Date date = new Date();
//        date.setTime(System.currentTimeMillis());
//        sessionHistory.setDate(date);
//        sessionHistoryService.saveSuccsesAuthorizationInformation(sessionHistory);
//        request.getSession().setAttribute("sessionHistory", sessionHistory);
//        System.out.println(((SessionHistory) request.getSession().getAttribute("sessionHistory")).getIpAddres());
//
//    }
}
