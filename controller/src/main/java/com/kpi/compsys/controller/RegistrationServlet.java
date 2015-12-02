package com.kpi.compsys.controller;

import com.kpi.compsys.model.User;
import com.kpi.compsys.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Vova on 10/15/2015.
 *
 * Servlets is deprecated. Use MVC Controllers
 */
@Deprecated
@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    @Autowired
    private UserServiceImpl userService;

    private ApplicationContext context;
    @Override
    public void init(final ServletConfig config) throws ServletException {
        context = SpringContext.getContext();
        final AutowireCapableBeanFactory beanFactory = context.getAutowireCapableBeanFactory();
        beanFactory.autowireBean(this);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> paramMap = request.getParameterMap();
        String usrEmail = paramMap.get("email")[0];
        String usrPass = paramMap.get("password")[0];
        String usrPassConfirm = paramMap.get("passwordConfirm")[0];

        if (usrEmail.isEmpty() || usrPass.isEmpty() || usrPassConfirm.isEmpty()) {
            //ERROR Message

            System.out.println("Error registration!");
            request.getRequestDispatcher("/error_registration.jsp").forward(request, response);
            return;
        }

        if (!usrPass.equals(usrPassConfirm)) {

            System.out.println("Error registration!");
            request.getRequestDispatcher("/error_registration.jsp").forward(request, response);
            return;
        }

        for (User user : userService.getAll()) {
            if (usrEmail.equals(user.getEmail())) {

                System.out.println("Error registration!");
                request.getRequestDispatcher("/error_registration.jsp").forward(request, response);
                return;
            }
        }

            User newUser = new User();
            newUser.setEmail(usrEmail);
            newUser.setPassword(usrPass);
            userService.add(newUser);

            request.getRequestDispatcher("/index.jsp").forward(request, response);
        //log new user was created

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
