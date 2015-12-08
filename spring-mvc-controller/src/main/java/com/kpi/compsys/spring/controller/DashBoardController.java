package com.kpi.compsys.spring.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Vova on 12/8/2015.
 */
@Controller
public class DashBoardController {

    @RequestMapping(value = "/user-dashboard")
    public String startUserDashBoard(){
          return "user-dashboard";
    }
}
