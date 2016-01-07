package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.UserDao;
import com.kpi.compsys.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Repository("userDao")
@Transactional(propagation = Propagation.REQUIRED)
public class UserDaoImpl extends AbstractDaoImpl<User> implements UserDao {
    private static final Logger logger = LogManager.getLogger(UserDaoImpl.class);

    @Override
    public void delete(Integer id) {
        User user = null;
        try {
            user = entityManager.find(User.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        super.delete(user);
    }

    @Override
    public User getById(Integer id) {
        User user = null;
        try {
            user = entityManager.find(User.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return user;
    }


    @Override
    public List<User> getAll() {
        List<User> list = null;
        try {
            list = entityManager.createNamedQuery("User.getAll", User.class).getResultList();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return list;
    }
}
