package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.UserInfoDao;
import com.kpi.compsys.model.UserInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Lilly_94 on 27.10.2015.
 */
@Component
@Repository("userInfoDao")
@Transactional(propagation = Propagation.REQUIRED)
public class UserInfoDaoImpl extends AbstractDaoImpl<UserInfo> implements UserInfoDao {
    private static final Logger logger = LogManager.getLogger(UserInfoDaoImpl.class);

    @Override
    public void delete(Integer id) {
        UserInfo userInfo = null;
        try {
            userInfo = entityManager.find(UserInfo.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        super.delete(userInfo);
    }

    @Override
    public UserInfo getById(Integer id) {
        UserInfo userInfo = null;
        try {
            userInfo = entityManager.find(UserInfo.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return userInfo;
    }

    @Override
    public List<UserInfo> getAll() {
        List<UserInfo> list = null;
        try {
            list = entityManager.createNamedQuery("UserInfo.getAll", UserInfo.class).getResultList();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return list;

    }
}
