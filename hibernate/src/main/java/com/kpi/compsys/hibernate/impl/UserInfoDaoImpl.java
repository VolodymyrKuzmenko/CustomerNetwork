package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.UserInfoDao;
import com.kpi.compsys.model.UserInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Lilly_94 on 27.10.2015.
 */
@Component
public class UserInfoDaoImpl extends AbstractDaoImpl<UserInfo> implements UserInfoDao {

    @Override
    public void delete(Integer id){
        UserInfo userInfo = (UserInfo) util.getSesssion().load(UserInfo.class, id);
        super.delete(userInfo);
    }

    @Override
    public UserInfo getById(Integer id) {
        return (UserInfo) util.getSesssion().load(UserInfo.class, id);
    }

    @Override
    public List<UserInfo> getAll() {
        return util.getSesssion().createCriteria(UserInfo.class).list();
    }
}
