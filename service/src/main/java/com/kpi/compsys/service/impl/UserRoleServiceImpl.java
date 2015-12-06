package com.kpi.compsys.service.impl;

import com.kpi.compsys.dao.UserRoleDao;
import com.kpi.compsys.model.UserRole;
import com.kpi.compsys.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vova on 12/6/2015.
 */
@Service
public class UserRoleServiceImpl implements UserRoleService{
    //TODO add userRole cache
    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public void add(UserRole entity) {
        //
    }

    @Override
    public void update(UserRole entity) {
        //
    }

    @Override
    public List<UserRole> getAll() {
        return userRoleDao.getAll();
    }

    @Override
    public UserRole getById(Integer id) {
        return userRoleDao.getById(id);
    }

    @Override
    public UserRole getDefaultUserRole() {
        return userRoleDao.getById(1);
    }
}
