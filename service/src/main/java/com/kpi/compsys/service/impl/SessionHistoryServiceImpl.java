package com.kpi.compsys.service.impl;

import com.kpi.compsys.dao.SessionHistoryDao;
import com.kpi.compsys.model.SessionHistory;
import com.kpi.compsys.model.User;
import com.kpi.compsys.service.SessionHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vova on 12/4/2015.
 */
@Service
public class SessionHistoryServiceImpl implements SessionHistoryService {

    @Autowired
    private SessionHistoryDao sessionHistoryDao;

    @Override
    public void saveLogOutSessionInformation(SessionHistory entity) {
        this.add(entity);
    }

    @Override
    public void saveSuccsesAuthorizationInformation(SessionHistory entity) {
        this.add(entity);
    }

    @Override
    public void saveFailureAuthorisationInformation(SessionHistory entity) {
        this.add(entity);
    }

    @Override
    public List<SessionHistory> getAllSessionHistory() {
        return this.getAll();
    }

    @Override
    public List<SessionHistory> getUserSessionHistory(User user) {
        return null;
    }

    @Override
    public void add(SessionHistory entity) {
        sessionHistoryDao.create(entity);
    }

    @Override
    public void update(SessionHistory entity) {
        sessionHistoryDao.update(entity);
    }

    @Override
    public List<SessionHistory> getAll() {
        return sessionHistoryDao.getAll();

    }

    @Override
    public SessionHistory getById(Integer id) {
        return null;
    }
}
