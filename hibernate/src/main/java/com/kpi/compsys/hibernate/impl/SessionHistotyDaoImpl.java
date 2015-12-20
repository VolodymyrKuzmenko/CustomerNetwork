package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.SessionHistoryDao;
import com.kpi.compsys.model.SessionHistory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
public class SessionHistotyDaoImpl extends AbstractDaoImpl<SessionHistory> implements SessionHistoryDao {
    private static final Logger logger = LogManager.getLogger(SessionHistotyDaoImpl.class);

    @Override
    public SessionHistory getById(Integer id) {
        SessionHistory entity = null;
        try {
            entity = (SessionHistory) util.getSesssion().load(SessionHistory.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return entity;
    }

    @Override
    public void delete(Integer id) {
        SessionHistory sessionHistory = null;
        try {
            sessionHistory = (SessionHistory) util.getSesssion().load(SessionHistory.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        super.delete(sessionHistory);
    }

    @Override
    public List<SessionHistory> getAll() {
        List<SessionHistory> list = null;
        try {
            list = util.getSesssion().createCriteria(SessionHistory.class).list();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return list;
    }

}
