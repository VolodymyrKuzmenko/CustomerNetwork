package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.AbstractDao;
import edu.emory.mathcs.backport.java.util.LinkedList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Vova on 10/12/2015.
 */
@Component
public abstract class AbstractDaoImpl<T> implements AbstractDao<T> {
    private static final Logger logger = LogManager.getLogger(AbstractDaoImpl.class);

    @PersistenceContext
    public EntityManager entityManager;

    //TODO dead code. Need work with prepare statement, may be sql injection.
    @Override
    public List<T> getByFilter(String queryStr) {
        List<T> list = new LinkedList();
        try {
            javax.persistence.Query query = entityManager.createQuery(queryStr);
            list = query.getResultList();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return list;
    }

    @Override
    public T create(T entity) {
        try {
            entityManager.persist(entity);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return entity;
    }


    public void delete(T entity) {
        try {
            entityManager.remove(entity);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
    }

    @Override
    public T update(T entity) {
        entityManager.merge(entity);
        return entity;
    }


    public abstract void delete(Integer id);

    @Override
    public abstract List<T> getAll();

    @Override
    public void close() {
        entityManager.close();
    }

}
