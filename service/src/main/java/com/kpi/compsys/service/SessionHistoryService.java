package com.kpi.compsys.service;

import com.kpi.compsys.model.SessionHistory;
import com.kpi.compsys.model.User;
import com.sun.javafx.property.adapter.PropertyDescriptor;

import java.util.List;

/**
 * Created by Vova on 12/4/2015.
 */
public interface SessionHistoryService extends EntityService<SessionHistory> {

    void saveLogOutSessionInformation(SessionHistory entity);

    void saveSuccsesAuthorizationInformation(SessionHistory entity);

    void saveFailureAuthorisationInformation(SessionHistory entity);

    List<SessionHistory> getAllSessionHistory();

    List <SessionHistory> getUserSessionHistory(User user);

}
