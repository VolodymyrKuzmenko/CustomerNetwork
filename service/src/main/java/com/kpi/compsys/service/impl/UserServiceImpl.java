package com.kpi.compsys.service.impl;

import com.kpi.compsys.dao.UserDao;
import com.kpi.compsys.hibernate.impl.UserDaoImpl;
import com.kpi.compsys.model.User;
import com.kpi.compsys.service.UserService;

import java.util.List;

/**
 * Created by Vova on 10/13/2015.
 */
public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();


    @Override
    public void add(User entity) {
        dao.create(entity);
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public List<User> getAll() {
        return dao.getAll();
    }

    @Override
    public User getById(Integer id) {
        return null;
    }
}
