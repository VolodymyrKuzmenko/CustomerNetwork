package com.kpi.compsys.service;

import com.kpi.compsys.dao.factory.DaoFactory;
import com.kpi.compsys.dao.impl.UserDaoImpl;
import com.kpi.compsys.model.User;

import java.util.List;

/**
 * Created by Vova on 10/13/2015.
 */
public class UserService {
    private UserDaoImpl dao = (UserDaoImpl) DaoFactory.genInstance().getUserDao();
    public List<User> getAllUsers(){

        return dao.getAll();
    }

    public void createUser(User user){
        dao.create(user);
    }
}
