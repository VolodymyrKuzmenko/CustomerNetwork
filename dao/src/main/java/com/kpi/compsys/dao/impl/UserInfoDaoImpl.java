package com.kpi.compsys.dao.impl;

import com.kpi.compsys.dao.UserInfoDao;
import com.kpi.compsys.model.UserInfo;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Lilly_94 on 27.10.2015.
 */
public class UserInfoDaoImpl extends AbstractDaoImpl<UserInfo> implements UserInfoDao<UserInfo> {
    @Override
    public UserInfo fillSave(Session session, UserInfo entity) {
        session.save(entity);
        return null;
    }

    @Override
    public UserInfo fillUpdate(Session session, UserInfo entity) {
        session.update(entity);
        return null;
    }

    @Override
    public UserInfo loadEntity(Session session, int id) {
        session.load(UserInfo.class,id);
        return null;
    }

    @Override
    public List<UserInfo> fillListEntity(Session session) {
        List<UserInfo> responce;
        responce = session.createCriteria(UserInfo.class).list();
        return responce;
    }

    @Override
    public void fillDelete(Session session, UserInfo entity) {
        session.delete(entity);
    }
}
