package com.kpi.compsys.dao.factory;

import com.kpi.compsys.dao.UserDao;

/**
 * Created by Vova on 10/12/2015.
 */
public class DaoFactory {
    private static DaoFactory factory = null;

    private static UserDao userDao = null;

    private static DaoFactory genInstance(){
        if (factory==null){
            factory = new DaoFactory();
        }
        return factory;
    }
    private UserDao getUserDao(){
        if (userDao==null){

        }
        return userDao;
    }

    private DaoFactory(){}

}
