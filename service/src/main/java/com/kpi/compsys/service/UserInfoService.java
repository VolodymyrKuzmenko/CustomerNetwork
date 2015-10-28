package com.kpi.compsys.service;

import com.kpi.compsys.dao.factory.DaoFactory;
import com.kpi.compsys.dao.impl.UserDaoImpl;
import com.kpi.compsys.dao.impl.UserInfoDaoImpl;
import com.kpi.compsys.model.User;
import com.kpi.compsys.model.UserInfo;

import java.util.List;

/**
 * Created by Lilly_94 on 27.10.2015.
 */
public class UserInfoService {
    private UserInfoDaoImpl dao = (UserInfoDaoImpl) DaoFactory.genInstance().getUserInfoDao();
    public List<UserInfo> getAllUserInfo(){

        return dao.getAll();
    }

    public void createUser(UserInfo userInfo){
        dao.create(userInfo);
    }
}
