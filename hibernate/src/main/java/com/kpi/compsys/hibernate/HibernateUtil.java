package com.kpi.compsys.hibernate;

/**
 * Created by Vova on 10/12/2015.
 */
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        try {
            //creates the session factory from hibernate.cfg.xml
            sessionFactory = new Configuration().configure().buildSessionFactory();
            System.out.print("Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}