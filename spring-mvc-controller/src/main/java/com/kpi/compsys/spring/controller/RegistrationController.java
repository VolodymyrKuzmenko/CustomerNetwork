package com.kpi.compsys.spring.controller;

import com.kpi.compsys.model.User;
import com.kpi.compsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Vova on 12/2/2015.
 */
@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/registration",method= RequestMethod.POST)
    public ModelAndView registration(HttpServletRequest request){
        Map<String, String[]> paramMap = request.getParameterMap();
        String usrEmail = paramMap.get("email")[0];
        String usrPass = paramMap.get("password")[0];
        String usrPassConfirm = paramMap.get("passwordConfirm")[0];
        ModelAndView model;

        if (usrEmail.isEmpty() || usrPass.isEmpty() || usrPassConfirm.isEmpty()) {
            System.out.println("Error registration!");
            return new ModelAndView("error_registration");
        }

        if (!usrPass.equals(usrPassConfirm)) {
            System.out.println("Error registration!");
                return new ModelAndView("error_registration");
        }

        for (User user : userService.getAll()) {
            if (usrEmail.equals(user.getEmail())) {
                System.out.println("Error registration!");
                return new ModelAndView("error_registration");
            }
        }

        User newUser = new User();
        newUser.setEmail(usrEmail);
        newUser.setPassword(usrPass);
        userService.add(newUser);
        //log new user was created
        model = new ModelAndView("index");
        model.addObject("userBean", new User());
        return model;

    }
}