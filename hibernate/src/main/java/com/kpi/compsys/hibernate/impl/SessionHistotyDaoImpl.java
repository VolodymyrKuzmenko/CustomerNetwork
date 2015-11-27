package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.SessionHistoryDao;
import com.kpi.compsys.model.SessionHistory;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
public class SessionHistotyDaoImpl  extends AbstractDaoImpl<SessionHistory> implements SessionHistoryDao {
    @Override
    public SessionHistory getById(Integer id) {
        SessionHistory entity = (SessionHistory) util.getSesssion().load(SessionHistory.class, id);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        SessionHistory sessionHistory = (SessionHistory) util.getSesssion().load(SessionHistory.class, id);
        super.delete(sessionHistory);
    }

    @Override
    public List<SessionHistory> getAll() {
        List<SessionHistory> list = util.getSesssion().createCriteria(SessionHistory.class).list();
        return list;
    }

}
