package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.UserInfoDao;
import com.kpi.compsys.model.UserInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Lilly_94 on 27.10.2015.
 */
@Component
public class UserInfoDaoImpl extends AbstractDaoImpl<UserInfo> implements UserInfoDao {
    private static final Logger logger = LogManager.getLogger(UserInfoDaoImpl.class);

    @Override
    public void delete(Integer id) {
        UserInfo userInfo = null;
        try {
            userInfo = (UserInfo) util.getSesssion().load(UserInfo.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        super.delete(userInfo);
    }

    @Override
    public UserInfo getById(Integer id) {
        UserInfo userInfo = null;
        try {
            userInfo = (UserInfo) util.getSesssion().load(UserInfo.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return userInfo;
    }

    @Override
    public List<UserInfo> getAll() {
        List<UserInfo> list = null;
        try {
            list =  util.getSesssion().createCriteria(UserInfo.class).list();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return list;

    }
}
