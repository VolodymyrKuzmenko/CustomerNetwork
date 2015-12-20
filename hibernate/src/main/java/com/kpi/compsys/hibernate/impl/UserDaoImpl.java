package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.UserDao;
import com.kpi.compsys.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl extends AbstractDaoImpl<User> implements UserDao {
    private static final Logger logger = LogManager.getLogger(UserDaoImpl.class);

    @Override
    public void delete(Integer id) {
        User user = null;
        try {
            user = (User) util.getSesssion().load(User.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        super.delete(user);
    }

    @Override
    public User getById(Integer id) {
        User user = null;
        try {
            user = (User) util.getSesssion().load(User.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return user;
    }


    @Override
    public List<User> getAll() {
        List<User> list = null;
        try {
            list = util.getSesssion().createCriteria(User.class).list();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return list;
    }
}
