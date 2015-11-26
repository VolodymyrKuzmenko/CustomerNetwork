package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.UserDao;
import com.kpi.compsys.hibernate.HibernateUtil;
import com.kpi.compsys.model.User;

import java.util.List;

public class UserDaoImpl extends AbstractDaoImpl<User> implements UserDao<User>{


    @Override
    public List<User> getByFilter(String query) {
        return null;
    }

    @Override
    public User getById(Integer id) {
        return (User) HibernateUtil.getSessionFactory().openSession().load(User.class,id);
    }


    @Override
    public List<User> getAll() {
        return HibernateUtil.getSessionFactory().openSession().createCriteria(User.class).list();
    }
}
