package com.kpi.compsys.spring;

import com.kpi.compsys.spring.config.SpringAppConfig;
import com.kpi.compsys.spring.security.config.SpringSecurityConfig;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
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

    private static final String DISPATCHER_SERVLET_NAME = "dispatcher-servlet";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        ctx.register(SpringAppConfig.class);
        ctx.register(SpringSecurityConfig.class);
        servletContext.addListener(new ContextLoaderListener(ctx));




        ctx.setServletContext(servletContext);

        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER_SERVLET_NAME, new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);


//        final AutowireCapableBeanFactory beanFactory = ctx.getAutowireCapableBeanFactory();
//        beanFactory.autowireBean(this);
    }
}
