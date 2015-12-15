package com.kpi.compsys.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
