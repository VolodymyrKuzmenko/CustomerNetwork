package com.kpi.compsys.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vova on 12/2/2015.
 *
 * Servlets is deprecated. Use MVC Controllers
 */
@Deprecated
public class SpringContext {
    private static ApplicationContext context = null;

    public static ApplicationContext getContext() {
        if (context == null) {
            return context = new ClassPathXmlApplicationContext("/spring-context.xml");
        } else return context;
    }
}
