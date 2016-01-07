package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.SessionHistoryDao;
import com.kpi.compsys.model.SessionHistory;
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
@Repository("sessionHistoryDao")
@Transactional(propagation = Propagation.REQUIRED)
public class SessionHistotyDaoImpl extends AbstractDaoImpl<SessionHistory> implements SessionHistoryDao {
    private static final Logger logger = LogManager.getLogger(SessionHistotyDaoImpl.class);

    @Override
    public SessionHistory getById(Integer id) {
        SessionHistory entity = null;
        try {
            entity = entityManager.find(SessionHistory.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return entity;
    }

    @Override
    public void delete(Integer id) {
        SessionHistory sessionHistory = null;
        try {
            sessionHistory = entityManager.find(SessionHistory.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        super.delete(sessionHistory);
    }

    @Override
    public List<SessionHistory> getAll() {
        List<SessionHistory> list = null;
        try {
            list = entityManager.createNamedQuery("Project.getAll", SessionHistory.class).getResultList();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return list;
    }

}
