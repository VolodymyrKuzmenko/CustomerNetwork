package com.kpi.compsys.spring.controller;

import com.kpi.compsys.model.User;
import com.kpi.compsys.model.UserRole;
import com.kpi.compsys.service.UserRoleService;
import com.kpi.compsys.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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
@RequestMapping
public class RegistrationController {
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(RegistrationController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @RequestMapping(value = "/register")
    public String registerStart(){
        return "register";
    }

    @RequestMapping(value="/registration", method= RequestMethod.POST)
    public ModelAndView registration(HttpServletRequest request){
        Map<String, String[]> paramMap = request.getParameterMap();
        String usrEmail = paramMap.get("email")[0];
        String usrPass = paramMap.get("password")[0];
        String usrPassConfirm = paramMap.get("password_confirm")[0];
        ModelAndView model;

        if (usrEmail.isEmpty() || usrPass.isEmpty() || usrPassConfirm.isEmpty()) {
            logger.info("Error registraion, field is empty");
            return new ModelAndView("register");
        }

        if (!usrPass.equals(usrPassConfirm)) {
            logger.info("Error registration, passwords don't equal");
                return new ModelAndView("register");
        }


//        for (User user : userService.getAll()) {
//            if (usrEmail.equals(user.getEmail())) {
//                logger.info("Error registration, email"+usrEmail+"' has been registered in system");
//                return new ModelAndView("register");
//            }
//        }

        User newUser = new User();
        newUser.setEmail(usrEmail);
//        String pass=passwordEncoder.encode();
        newUser.setPassword(usrPass);
//        UserRole role=userRoleService.getDefaultUserRole();
//        logger.info(role);
//        newUser.setRole(role);
        userService.add(newUser);
        logger.info("New user with email '"+usrEmail+"' has registered");
        model = new ModelAndView("index");
        return model;

    }
}
