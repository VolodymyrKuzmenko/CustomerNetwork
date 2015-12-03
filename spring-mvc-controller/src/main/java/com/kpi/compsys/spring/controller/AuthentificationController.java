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
import java.util.Map;

/**
 * Created by Vova on 12/2/2015.
 */
@Controller
public class AuthentificationController {

    @Autowired
    private UserService userService;


    @RequestMapping(value="/login", method=RequestMethod.POST)
    public ModelAndView executeLogin(HttpServletRequest request)
    {
        Map<String, String[]> paramMap = request.getParameterMap();
        User loginBean = new User();
        loginBean.setEmail(paramMap.get("email")[0]);
        loginBean.setPassword(paramMap.get("password")[0]);
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
            model = new ModelAndView("index");
        }else {
            model = new ModelAndView("user-dashboard");
        }
        return model;
    }
}
