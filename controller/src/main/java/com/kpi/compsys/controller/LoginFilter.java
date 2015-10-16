package com.kpi.compsys.controller;

import com.kpi.compsys.model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vova on 10/16/2015.
 */
@WebFilter(filterName = "loginFilter")
public class LoginFilter implements Filter {

    private List<String> allowedUrls = new ArrayList<String>();
    private FilterConfig config ;
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        allowedUrls.add("/index.jsp");
        allowedUrls.add("/registration.jsp");
        allowedUrls.add("/");
        allowedUrls.add("/registration");
        allowedUrls.add("/login");
        allowedUrls.add("/home");


        boolean authorized = false;
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String uri = req.getRequestURI();

        System.out.println(uri);

        HttpSession session = req.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("user");

            if (user != null) {
                authorized = true;
            }
        }
        if (!authorized &&!allowedUrls.contains(uri)){
            System.out.println("Unauthorized access request");
            res.sendRedirect("/index.jsp");
        } else
            chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {
        this.config = config;
    }

}
