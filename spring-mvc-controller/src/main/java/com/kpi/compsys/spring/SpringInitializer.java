package com.kpi.compsys.spring;

import com.kpi.compsys.spring.config.SpringAppConfig;
import com.kpi.compsys.spring.security.config.SpringSecurityConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.util.Log4jConfigListener;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Vova on 12/7/2015.
 */
public class SpringInitializer implements WebApplicationInitializer {
    private static final Logger logger = LogManager.getLogger(SpringInitializer.class);
    private static final String DISPATCHER_SERVLET_NAME = "dispatcher-servlet";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        logger.info("Start annotation config web application context");
        ctx.register(SpringAppConfig.class);
        logger.info("Register Spring App configuration");
        ctx.register(SpringSecurityConfig.class);
        logger.info("Register Spring Security configuration");
        servletContext.addListener(new ContextLoaderListener(ctx));
        servletContext.addListener(new Log4jConfigListener());
        ctx.setServletContext(servletContext);

        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER_SERVLET_NAME, new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        logger.info("Configure Dispatcher Servlet");
    }
}
