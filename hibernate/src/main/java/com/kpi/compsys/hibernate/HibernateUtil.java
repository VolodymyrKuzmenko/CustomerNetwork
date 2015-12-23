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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class HibernateUtil {
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(HibernateUtil.class);

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private boolean dataBaseNotresponse = false;
    private ExponentialTimer backOffTimer = new ExponentialTimer();


    public HibernateUtil() {}


    public void shutdownSessionFactory() {
        sessionFactory.close();
        logger.info("Session factory has closed.");
    }

    public Session getSesssion() {

        if (dataBaseNotresponse) {

            backOffTimer.checkTimeBarrier();
            //if OK, try connect

            dataBaseNotresponse = false;

            session = sessionFactory.openSession();

        }

        if (session == null) {
            session = sessionFactory.openSession();
        } else {

            if (!session.isOpen()) {
                session = sessionFactory.openSession();
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