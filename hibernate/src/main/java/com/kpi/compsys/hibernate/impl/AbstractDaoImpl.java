package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.AbstractDao;
import com.kpi.compsys.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vova on 10/12/2015.
 */
@Component
public abstract class AbstractDaoImpl<T> implements AbstractDao<T> {

    @Autowired
    protected HibernateUtil util;

    //TODO dead code. Need work with prepare statement, may be sql injection.
    @Override
    public List<T> getByFilter(String queryStr) {
        Query query = util.getSesssion().createQuery(queryStr);
        List<T> list = query.list();
        return list;
    }

    @Override
    public T create(T entity) {
//        util.getSesssion().merge(entity);
        util.getSesssion().save(entity);
        return entity;
    }


    public void delete(T entity) {
        util.getSesssion().delete(entity);
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
