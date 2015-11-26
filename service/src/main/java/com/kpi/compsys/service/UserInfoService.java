package com.kpi.compsys.service;

import com.kpi.compsys.hibernate.impl.UserInfoDaoImpl;
import com.kpi.compsys.model.UserInfo;

import java.util.List;

/**
 * Created by Lilly_94 on 27.10.2015.
 */
public class UserInfoService {
    private UserInfoDaoImpl dao = (UserInfoDaoImpl) new UserInfoDaoImpl();
    public List<UserInfo> getAllUserInfo(){

        return dao.getAll();
    }

    public void createUser(UserInfo userInfo){
        dao.create(userInfo);
    }
}
