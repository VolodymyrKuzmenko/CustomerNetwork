package com.kpi.compsys.dao.impl;

import com.kpi.compsys.HibernateUtil;
import com.kpi.compsys.dao.AbstractDao;
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
            session.beginTransaction();
            fillSave(session, entity);
            session.getTransaction().commit();
        } catch (SessionException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return null;
    }

    @Override
    public void delete(T entity) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            fillDelete(session,entity);
            session.getTransaction().commit();
        } catch (Exception e) {

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public T update(T entity) {
        Session session = null;
        T result = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            result = fillUpdate(session, entity);
            session.getTransaction().commit();
        } catch (SessionException e) {
          //  logger.error("Exeption in update method");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return result;
    }

    @Override
    public T getById(int id) {
        Session session = null;
        T entity = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            entity = loadEntity(session, id);
        } catch (Exception e) {
         //   logger.error("Exeption in getById method");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return entity;
    }

    @Override
    public List<T> getAll() {
        Session session = null;
        List<T> enityes = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            enityes = fillListEntity(session);
        } catch (Exception e) {

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return enityes;
    }

    public abstract T fillSave(Session session, T entity);

    public abstract T fillUpdate(Session session, T entity);

    public abstract T loadEntity(Session session, int id);

    public abstract List<T> fillListEntity(Session session);

    public abstract void fillDelete(Session session, T entity);


}
