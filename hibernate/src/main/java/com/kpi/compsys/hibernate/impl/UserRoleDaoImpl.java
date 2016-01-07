package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.UserRoleDao;
import com.kpi.compsys.model.UserRole;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
@Repository("userRoleDao")
@Transactional(propagation = Propagation.REQUIRED)
public class UserRoleDaoImpl extends AbstractDaoImpl<UserRole> implements UserRoleDao {
    private static final Logger logger = LogManager.getLogger(UserRoleDaoImpl.class);

    @Override
    public UserRole getById(Integer id) {
        UserRole entity = null;
        try {
            entity = entityManager.find(UserRole.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return entity;
    }

    @Override
    public List<UserRole> getAll() {
        List<UserRole> list = null;
        try {
            list = entityManager.createNamedQuery("UserRole.getAll", UserRole.class).getResultList();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return list;
    }

    @Override
    public void delete(Integer id) {
        UserRole userRole = null;
        try {
            userRole = entityManager.find(UserRole.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        super.delete(userRole);
    }
}
