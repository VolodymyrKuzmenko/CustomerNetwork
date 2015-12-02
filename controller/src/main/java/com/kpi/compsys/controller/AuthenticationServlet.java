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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Vova on 10/15/2015.
 *
 * Servlets is deprecated. Use MVC Controllers
 */
@Deprecated
@WebServlet("/login")
public class AuthenticationServlet extends HttpServlet {
    @Autowired
    private UserServiceImpl userService;

    private ApplicationContext context;
    @Override
    public void init(final ServletConfig config) throws ServletException {
        context = SpringContext.getContext();
        final AutowireCapableBeanFactory beanFactory = context.getAutowireCapableBeanFactory();
        beanFactory.autowireBean(this);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> paramMap = req.getParameterMap();
        String email = paramMap.get("email")[0];
        String password = paramMap.get("password")[0];
        System.out.println("strt");
        User currentUser = null;
        System.out.println("Start search user");
        for (User user : userService.getAll()){
            System.out.print(user.getEmail());
            if (user.getEmail().equals(email)&& user.getPassword().equals(password)){
                currentUser = user;
                break;
            }
        }

        if (currentUser==null){
            //USer mot found message
            System.out.println("ERROR!!!");
            req.getRequestDispatcher("/error_auth.jsp").forward(req, resp);
            return;
        }else {
            HttpSession session = req.getSession();
            session.setAttribute("user", currentUser);
            req.getRequestDispatcher("/home.jsp").forward(req, resp);
            return;
        }

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
