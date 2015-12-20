package com.kpi.compsys.hibernate;

/**
 * Created by Vova on 10/12/2015.
 */

import com.kpi.compsys.dao.exceptions.DatabaseNotResponseException;
import org.apache.logging.log4j.LogManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class HibernateUtil {
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(HibernateUtil.class);
    private static SessionFactory sessionFactory = null;
    private static Session session;
    private static boolean dataBaseNotresponse = false;


    private ExponentialTimer backOffTimer = new ExponentialTimer();


    public HibernateUtil() {
        session = buildSessionFactory().openSession();
        logger.info("Init session has open.");
    }

    private SessionFactory buildSessionFactory() {
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
            backOffTimer.calcNextTime();
            backOffTimer.throwDatabaseNotResponceException();
        }
        return sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = buildSessionFactory();
        }
        return sessionFactory;
    }

    public void shutdownSessionFactory() {
        getSessionFactory().close();
        logger.info("Session factory has closed.");
    }

    public Session getSesssion() {

        if (dataBaseNotresponse) {

            backOffTimer.checkTimeBarrier();
            //if OK, try connect

            dataBaseNotresponse = false;

            session = getSessionFactory().openSession();

        }

        if (session == null) {
            session = getSessionFactory().openSession();
        } else {

            if (!session.isOpen()) {
                session = getSessionFactory().openSession();
                //if connect OK, reset timer
                backOffTimer.reset();
                logger.info("Hibernate Session is open. ");

            }


        }
        return session;
    }

    public void shutdownSession() {
        session.close();
        logger.info("Hibernate session is closed.");
    }

    public void dataBaseNotResponse() {

        if (!dataBaseNotresponse) {
            dataBaseNotresponse = true;
            backOffTimer.start();
            throw new DatabaseNotResponseException("Database connection is lost.");
        }

    }
}