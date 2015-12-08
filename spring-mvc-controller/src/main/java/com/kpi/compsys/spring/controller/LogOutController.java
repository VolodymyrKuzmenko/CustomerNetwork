package com.kpi.compsys.spring.controller;

import com.kpi.compsys.model.SessionHistory;
import com.kpi.compsys.model.User;
import com.kpi.compsys.service.SessionHistoryService;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Vova on 12/4/2015.
 */
@Controller
public class LogOutController {

    @Autowired
    private SessionHistoryService sessionHistoryService;

//    //TODO would use when work with handlers
//    @RequestMapping(value = "/success-logout")
//    public String processLogOut(HttpServletRequest request) {
////        System.out.println("logout in controller");
////        SessionHistory sessionHistory = (SessionHistory) request.getSession().getAttribute("sessionHistory");
////        User user = (User)  request.getSession().getAttribute("user");
////        long timeSession = System.currentTimeMillis() - sessionHistory.getDate().getTime();
////        sessionHistory.setDate(new Date(timeSession));
////        sessionHistoryService.update(sessionHistory);
////        request.getSession().invalidate();
//        return "index";
//    }
}
