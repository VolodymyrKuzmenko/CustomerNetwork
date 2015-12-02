package com.kpi.compsys.spring.controller;

import com.kpi.compsys.model.User;
import com.kpi.compsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Vova on 12/2/2015.
 */
@Controller
public class AuthentificationController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/index",method=RequestMethod.GET)
    public ModelAndView displayLogin() {
        ModelAndView model = new ModelAndView("index");
        User user = new User();
        model.addObject("userBean", user);

        return model;

    }


    @RequestMapping(value="/login",method=RequestMethod.POST)
    public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("userBean")User loginBean)
    {
        ModelAndView model= null;
        User currentUser = null;
        System.out.println("Start search user");
        for (User user : userService.getAll()){
            System.out.print(user.getEmail());
            if (user.getEmail().equals(loginBean.getEmail())&& user.getPassword().equals(loginBean.getPassword())){
                currentUser = user;
                break;
            }
        }

        if (currentUser==null){
            model = new ModelAndView("error_auth");
        }else {
            model = new ModelAndView("home");
        }
        return model;
    }
}
