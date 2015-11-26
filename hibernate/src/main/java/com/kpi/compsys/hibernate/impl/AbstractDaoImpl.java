package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.AbstractDao;
import com.kpi.compsys.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionException;

import java.util.List;

/**
 * Created by Vova on 10/12/2015.
 */
public abstract class AbstractDaoImpl<T> implements AbstractDao<T> {


    @Override
    public T create(T entity) {
        Session session = null;
        T result = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            session.merge(entity);
        } catch (SessionException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return entity;
    }

    @Override
    public void delete(T entity) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            session.delete(entity);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public T update(T entity) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            session.merge(entity);

        } catch (SessionException e) {
            e.printStackTrace();

          //  logger.error("Exeption in update method");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return entity;
    }


    @Override
    public abstract List<T> getAll();




}
