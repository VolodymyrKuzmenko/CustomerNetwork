package com.kpi.compsys.service.impl;

import com.kpi.compsys.dao.UserDao;
import com.kpi.compsys.model.User;
import com.kpi.compsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vova on 10/13/2015.
 */
@Service()
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;


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
        return dao.getById(id);
    }

    //TODO govnocode. Need using prepare statement and JDBC Template
    //WARNING SQL must'n use in this class
    @Override
    public List<User> getByEmail(String email) {
        return dao.getByFilter("FROM User WHERE email = '" + email + "'");
    }

}
