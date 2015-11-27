package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.UserRoleDao;
import com.kpi.compsys.model.UserRole;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
public class UserRoleDaoImpl  extends AbstractDaoImpl<UserRole> implements UserRoleDao {
    @Override
    public UserRole getById(Integer id) {
        UserRole entity = (UserRole) util.getSesssion().load(UserRole.class, id);
        return entity;
    }

    @Override
    public List<UserRole> getAll() {
        List<UserRole> list = util.getSesssion().createCriteria(UserRole.class).list();
        return list;
    }

    @Override
    public void delete(Integer id) {
        UserRole userRole = (UserRole) util.getSesssion().load(UserRole.class, id);
        super.delete(userRole);
    }
}
