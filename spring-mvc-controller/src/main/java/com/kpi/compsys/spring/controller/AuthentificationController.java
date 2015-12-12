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
@RequestMapping
public class AuthentificationController {

    @RequestMapping(value = {"index", "/", "/index.jsp"})
    public String start(Model model){
        return "index";
    }

}
