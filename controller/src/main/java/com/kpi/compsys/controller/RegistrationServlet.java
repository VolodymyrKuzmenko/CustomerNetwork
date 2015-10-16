package com.kpi.compsys.controller;

import com.kpi.compsys.model.User;
import com.kpi.compsys.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Vova on 10/15/2015.
 */
@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    private UserService userService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> paramMap = request.getParameterMap();
        String usrEmail = paramMap.get("email")[0];
        String usrPass = paramMap.get("password")[0];
        String usrPassConfirm = paramMap.get("passwordConfirm")[0];

        if (usrEmail.isEmpty() || usrPass.isEmpty() || usrPassConfirm.isEmpty()) {
            //ERROR Message
            System.out.println("Error if 1");
            return;
        }

        if (!usrPass.equals(usrPassConfirm)) {
            System.out.println("Error if 2");
            return;
        }

        for (User user : userService.getAllUsers()) {
            if (usrEmail.equals(user.getEmail())) {
                //error message
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                System.out.println("Error if 3");
                return;
            }
        }
        User newUser = new User();
        newUser.setEmail(usrEmail);
        newUser.setPassword(usrPass);
        newUser.setStatus(1);
        userService.createUser(newUser);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        //log new user was created

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}