package com.kpi.compsys.hibernate;

/**
 * Created by Vova on 10/12/2015.
 */

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class HibernateUtil {
    private static final Logger logger = Logger.getLogger(HibernateUtil.class);
    private static SessionFactory sessionFactory = null;
    private static Session session;

    public HibernateUtil() {
        session = buildSessionFactory().openSession();
        logger.info("Init session has open.");
    }

    private static SessionFactory buildSessionFactory() {
        SessionFactory sessionFactory = null;
        try {
            Configuration configuration = new Configuration()
                    .configure();
            logger.info("Hibernate configuration created.");
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());
            logger.info("Session Factory has build.");

        } catch (Exception e) {
            logger.error("Initial SessionFactory creation failed.\n" + e.getMessage());
        }
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = buildSessionFactory();
        }
        return sessionFactory;
    }

    public static void shutdownSessionFactory() {
        getSessionFactory().close();
        logger.info("Session factory has closed.");
    }

    public Session getSesssion() {
        if (session == null) {
            session = getSessionFactory().openSession();
        } else {
            if (!session.isOpen()) {
                session = getSessionFactory().openSession();
                logger.info("Hibernate Session is open. ");
            }
        }
        return session;
    }

    public void shutdownSession() {
        session.close();
        logger.info("Hibernate session is closed.");
    }
}