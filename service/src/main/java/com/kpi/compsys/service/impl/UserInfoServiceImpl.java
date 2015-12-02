package com.kpi.compsys.service.impl;

import com.kpi.compsys.dao.UserInfoDao;
import com.kpi.compsys.hibernate.impl.UserInfoDaoImpl;
import com.kpi.compsys.model.UserInfo;
import com.kpi.compsys.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lilly_94 on 27.10.2015.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao dao;


    @Override
    public void add(UserInfo entity) {
        dao.create(entity);
    }

    @Override
    public void update(UserInfo entity) {

    }

    @Override
    public List<UserInfo> getAll() {
        return dao.getAll();
    }

    @Override
    public UserInfo getById(Integer id) {
        return null;
    }
}
