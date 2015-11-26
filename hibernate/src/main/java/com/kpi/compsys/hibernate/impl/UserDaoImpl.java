package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.UserDao;
import com.kpi.compsys.model.User;
import org.hibernate.Session;

import java.util.List;

public class UserDaoImpl extends AbstractDaoImpl<User> implements UserDao<User>{


    @Override
    public User fillSave(Session session, User entity) {
        session.save(entity);
        return null;
    }

    @Override
    public User fillUpdate(Session session, User entity) {
        session.update(entity);
        return null;
    }

    @Override
    public User loadEntity(Session session, int id) {
        session.load(User.class,id);
        return null;
    }

    @Override
    public List<User> fillListEntity(Session session) {
        List<User> responce;
        responce = session.createCriteria(User.class).list();
        return responce;
    }

    @Override
    public void fillDelete(Session session, User entity) {
        session.delete(entity);
    }

    @Override
    public List<User> getByFilter(String query) {
        return null;
    }
}
