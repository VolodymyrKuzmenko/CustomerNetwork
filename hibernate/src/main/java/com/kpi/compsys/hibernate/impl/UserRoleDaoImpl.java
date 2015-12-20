package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.UserRoleDao;
import com.kpi.compsys.model.UserRole;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
public class UserRoleDaoImpl extends AbstractDaoImpl<UserRole> implements UserRoleDao {
    private static final Logger logger = LogManager.getLogger(UserRoleDaoImpl.class);

    @Override
    public UserRole getById(Integer id) {
        UserRole entity = null;
        try {
            entity = (UserRole) util.getSesssion().load(UserRole.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return entity;
    }

    @Override
    public List<UserRole> getAll() {
        List<UserRole> list = null;
        try {
            list = util.getSesssion().createCriteria(UserRole.class).list();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return list;
    }

    @Override
    public void delete(Integer id) {
        UserRole userRole = null;
        try {
            userRole = (UserRole) util.getSesssion().load(UserRole.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        super.delete(userRole);
    }
}
