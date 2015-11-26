package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.UserInfoDao;
import com.kpi.compsys.hibernate.HibernateUtil;
import com.kpi.compsys.model.UserInfo;

import java.util.List;

/**
 * Created by Lilly_94 on 27.10.2015.
 */
public class UserInfoDaoImpl extends AbstractDaoImpl<UserInfo> implements UserInfoDao<UserInfo> {

    @Override
    public List<UserInfo> getByFilter(String query) {
        return null;
    }

    @Override
    public UserInfo getById(Integer id) {
        return (UserInfo) HibernateUtil.getSessionFactory().openSession().load(UserInfo.class, id);
    }

    @Override
    public List<UserInfo> getAll() {
        return HibernateUtil.getSessionFactory().openSession().createCriteria(UserInfo.class).list();
    }
}
