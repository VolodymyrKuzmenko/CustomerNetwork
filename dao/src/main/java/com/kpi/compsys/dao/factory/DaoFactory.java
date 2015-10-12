package com.kpi.compsys.dao.factory;

import com.kpi.compsys.dao.UserDao;
import com.kpi.compsys.dao.impl.UserDaoImpl;

/**
 * Created by Vova on 10/12/2015.
 */
public class DaoFactory {
    private static DaoFactory factory = null;

    private static UserDao userDao = null;

    public static DaoFactory genInstance(){
        if (factory==null){
            factory = new DaoFactory();
        }
        return factory;
    }
    public UserDao getUserDao(){
        if (userDao==null){
            userDao = new UserDaoImpl();
        }
        return userDao;
    }

    private DaoFactory(){}

}
