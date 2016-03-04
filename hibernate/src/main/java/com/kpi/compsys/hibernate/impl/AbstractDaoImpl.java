package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.AbstractDao;
import com.kpi.compsys.hibernate.HibernateUtil;
import edu.emory.mathcs.backport.java.util.LinkedList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vova on 10/12/2015.
 */
@Component
public abstract class AbstractDaoImpl<T> implements AbstractDao<T> {
    private static final Logger logger = LogManager.getLogger(AbstractDaoImpl.class);
    @Autowired
    protected HibernateUtil util;

    //TODO dead code. Need work with prepare statement, may be sql injection.
    @Override
    public List<T> getByFilter(String queryStr) {
        List<T> list = new LinkedList();
        try {
            Query query = util.getSesssion().createQuery(queryStr);
            list = query.list();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return list;
    }

    @Override
    public T create(T entity) {
        try {
//            util.getSesssion().beginTransaction();
            util.getSesssion().save(entity);
//            util.getSesssion().getTransaction().commit();

            logger.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return entity;
    }


    public void delete(T entity) {
        try {
            util.getSesssion().delete(entity);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
    }

    @Override
    public T update(T entity) {
        util.getSesssion().merge(entity);
        return entity;
    }


    public abstract void delete(Integer id);

    @Override
    public abstract List<T> getAll();

    @Override
    public void close() {
        util.shutdownSession();
    }

}
